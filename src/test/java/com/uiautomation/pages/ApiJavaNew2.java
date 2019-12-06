/**
 * 
 */
package com.uiautomation.pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.gson.Gson;
import com.uiautomation.utils.CommonUtils;
import com.wechatify.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import jline.internal.Log;

/**
 * 
 * @version $Id$
 */
public class ApiJavaNew2
{

   /**
    * @Description:
    * @param
    * @return : void
    * @throws IOException
    * @exception :
    * @Created_by : Bavithiran
    */
   public static void main(String[] args) throws IOException
   {
      // TODO Auto-generated method stub

      String filePath = CommonUtils.getAbsolutePathPath(Constants.EXCEL_SHEET_DATA_FAQ_PATH);
      String fileName = "api.xlsx";
      String sheetName = "Sheet1";

      String UpdatesheetName = "ContactId";
      GetApiDetails(filePath, fileName, sheetName, UpdatesheetName);

   }

   public static String getSaltString()
   {
      String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
      StringBuilder salt = new StringBuilder();
      Random rnd = new Random();
      while (salt.length() < 18)
      { // length of the random string.
         int index = (int) (rnd.nextFloat() * SALTCHARS.length());
         salt.append(SALTCHARS.charAt(index));
      }
      String saltStr = salt.toString();
      return saltStr;

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @throws IOException
    * @exception :
    * @Created_by : Bavithiran
    */
   private static void GetApiDetails(String filePath, String fileName, String sheetName, String updatesheetName) throws IOException
   {

      String responseBody = null;
      String openId = null;
      Map<String, Object[]> data = null;
      int Key = 0;
      int rownum = 0;
      String StringKey = null;
      String Number = "S.no";
      String Heading = "Heading";
      // int cellnum = 0;

      FileInputStream inputStream = new FileInputStream("WriteSheet.xlsx");
      // Blank workbook
      XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

      // Create a blank sheet
      // XSSFSheet sheet = workbook.createSheet("EmployeeData1");

      String WriteSheetName = getSaltString() + "-" + CommonUtils.getCurrentDateAsUniqueString();

      Log.info("WriteSheetName" + WriteSheetName);

      XSSFSheet sheet = workbook.createSheet(WriteSheetName);

      // TODO Auto-generated method stub

      // Specify the base URL to the RESTful web service
      RestAssured.baseURI = "https://servicecloudwechatifyapi.azurewebsites.net/api/SalesforceContact";

      // Get the RequestSpecification of the request that you want to sent
      // to the server. The server is specified by the BaseURI that we have
      // specified in the above step.
      RequestSpecification httpRequest = RestAssured.given();

      // Make a request to the server by specifying the method Type and the method URL.
      // This will return the Response from the server. Store the response in a variable.
      Sheet PageSheet = CommonUtils.readExcel(filePath, fileName, sheetName);

      int rowCount = PageSheet.getLastRowNum();

      // Create a loop over all the rows of excel file to read it
      for (int i = 0; i < rowCount + 1; i++)
      {
         Row row = PageSheet.getRow(i);

         // Create a loop to print cell values in a row
         for (int j = 0; j < 1; j++)
         {
            
            StringKey = String.valueOf(Key);
            Log.info(StringKey);
            
            data = new HashMap<String, Object[]>();
            
            if (Key == 0)
            {
               data.put("Heading", new Object[] { Number, "openId", "errorcode", "Status", "contactid" });
               Key++;
            }

            

            openId = row.getCell(j).getStringCellValue();
            Response response = httpRequest.request(Method.GET, "/" + openId + "/622");

            // Now let us print the body of the message to see what response
            // we have recieved from the server
            responseBody = response.getBody().asString();
            System.out.println("Response Body is =>  " + responseBody);

            Gson gson = new Gson();

            Jsonrsp objResponse = gson.fromJson(responseBody, Jsonrsp.class);
            
            String aa = gson.toJson(responseBody);
            
            //System.out.println("aa"  + aa);

            if (objResponse.message.equalsIgnoreCase("No records found."))
            {
               System.out.println("message for " + openId + " is => " + objResponse.message);
               data.put(StringKey, new Object[] { Key, openId, " - ", " - ", objResponse.message });
               Key++;
            }

            // data.put(StringKey, new Object[] { "errorcode", "openId", "contactid" });
            if (objResponse.status != null)
            {
               System.out.println("errorcode for " + openId + " is => " + objResponse.errorcode);
               System.out.println("status    for " + openId + " is => " + objResponse.status);
               System.out.println("contactid for " + openId + " is => " + objResponse.data.contactid);

               // data.put("7", new Object[] {"errorcode", "Openid", "ContactId"});
               // System.out.println("Original Map" +data.values());

               data.put(StringKey, new Object[] { Key, openId, objResponse.errorcode, objResponse.status, objResponse.data.contactid });
               Key++;

            }

            Set<String> keyset = data.keySet();
            // int rownum = 0;
            for (String key : keyset)
            {
               Row row1 = sheet.createRow(rownum++);
               System.out.println("Row Print" + rownum);
               Object[] objArr = data.get(key);
               int cellnum = 0;
               for (Object obj : objArr)
               {
                  Cell cell = row1.createCell(cellnum++);
                  System.out.println("cell Print" + rownum);
                  if (obj instanceof String)
                     cell.setCellValue((String) obj);
                  else if (obj instanceof Integer)
                     cell.setCellValue((Integer) obj);
               }
            }

            // Key++;

         }

      }

      try
      {
         // Write the workbook in file system
         FileOutputStream out = new FileOutputStream("WriteSheet.xlsx");
         workbook.write(out);
         out.close();
         System.out.println("WriteSheet.xlsx written successfully on disk.");
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }

   }
}
