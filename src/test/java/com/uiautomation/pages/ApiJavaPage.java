package com.uiautomation.pages;

 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
public class ApiJavaPage
{

 

   /**
    * @param
    * @return : void
    * @throws IOException
    * @exception :
    * @Created_by : Raghuram
    * 
    * 
    * 
    * 
    * 
    */

 

   public static void GetApiDetails(String filePath, String fileName, String sheetName, String UpdatesheetName) throws IOException
   {
      String responseBody = null;
      String openId = null ;
      Map<String, Object[]> data = null;
      int Key = 1;
     
      
      
      
      // Specify the base URL to the RESTful web service
      RestAssured.baseURI = "https://servicecloudwechatifyapi.azurewebsites.net/api/SalesforceContact";

 

      // Get the RequestSpecification of the request that you want to sent
      // to the server. The server is specified by the BaseURI that we have
      // specified in the above step.
      RequestSpecification httpRequest = RestAssured.given();
      

 

      // Make a request to the server by specifying the method Type and the method URL.
      // This will return the Response from the server. Store the response in a variable.
      Sheet PageSheet = CommonUtils.readExcel(filePath, fileName, sheetName);
      Sheet PageSheet1 = CommonUtils.readExcel(filePath, fileName, UpdatesheetName);
      
      
      
      
      
      FileInputStream inputStream = new FileInputStream("ContanctIdUpdate.xlsx");
      //Blank workbook
      XSSFWorkbook workbook = new XSSFWorkbook(inputStream); 
       
      //Create a blank sheet
      //XSSFSheet sheet = workbook.createSheet("EmployeeData1");
      
      
      XSSFSheet sheet = workbook.getSheet("ContanctIdUpdate");
      Log.info(sheet);
     

 

      int rowCount = PageSheet.getLastRowNum();

 

      // Create a loop over all the rows of excel file to read it
      for (int i = 0; i < rowCount + 1; i++)
      {
         Row row = PageSheet.getRow(i);

 

         // Create a loop to print cell values in a row
         for (int j = 0; j < 1; j++)
         {
            openId = row.getCell(j).getStringCellValue();
            Response response = httpRequest.request(Method.GET, "/"+openId+"/622");

 

            // Now let us print the body of the message to see what response
            // we have recieved from the server
            responseBody = response.getBody().asString();
            System.out.println("Response Body is =>  " + responseBody);
         
            Gson gson = new Gson();             
          
            Jsonrsp objResponse 
              = gson.fromJson(responseBody,Jsonrsp.class);
            
            String aa = gson.toJson(responseBody);
            
            System.out.println("aa"  + aa);
            
            
            System.out.println("errorcode for "+openId+" is => " + objResponse.errorcode);
            System.out.println("status    for "+openId+" is => " + objResponse.status);
            System.out.println("contactid for "+openId+" is => " + objResponse.data.contactid);
            
            //data = new TreeMap<String, Object[]>();
            
            String Key1 = Integer.toString(Key);
           
            
            data = new TreeMap<String, Object[]>(); 
            data.put(Key1, new Object[] {objResponse.errorcode, openId, objResponse.data.contactid});
           
            Key++;
            
            Log.info("After" ,+Key);
         
         
        
            Set<String> keyset = data.keySet();
            int rownum = 0;
            for (String key : keyset)
            {
                Row row1 = PageSheet1.createRow(rownum++);
                Object [] objArr = data.get(key);
                int cellnum = 0;
                for (Object obj : objArr)
                {
                   Cell cell = row1.createCell(cellnum++);
                   if(obj instanceof String)
                        cell.setCellValue((String)obj);
                    else if(obj instanceof Integer)
                        cell.setCellValue((Integer)obj);
                }
            }
            
            try
            {
                //Write the workbook in file system
                FileOutputStream out = new FileOutputStream("ContanctIdUpdate.xlsx");
                workbook.write(out);
                out.close();
                System.out.println("ContanctIdUpdate.xlsx written successfully on disk.");
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
         }   
      }
   }

 

   /*
    * public static void readingExcel() throws IOException { Sheet PageSheet = CommonUtils.readExcel(filePath, fileName, sheetName); }
    */

 

   public static void main(String[] args) throws IOException
   {
      // TODO Auto-generated method stub
      // readingExcel();
      String filePath = CommonUtils.getAbsolutePathPath(Constants.EXCEL_SHEET_DATA_FAQ_PATH);
      String fileName = "api.xlsx";
      String sheetName = "Sheet1";
      
      String UpdatesheetName = "ContactId";
      GetApiDetails(filePath, fileName, sheetName, UpdatesheetName);

 

   }

 

}