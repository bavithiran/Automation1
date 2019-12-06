/**
 * 
 */
package com.uiautomation.pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * @version $Id$
 */
public class NewWriteFile 
{
    public static void main(String[] args) throws IOException 
    {
       
       FileInputStream inputStream = new FileInputStream("howtodoinjava_demo.xlsx");
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream); 
         
        //Create a blank sheet
        //XSSFSheet sheet = workbook.createSheet("EmployeeData1");
        
        XSSFSheet sheet = workbook.getSheet("EmployeeData");
        
          
        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
        data.put("2", new Object[] {1, "Amit", "Shuk"});
        data.put("3", new Object[] {2, "Lokesh", "Gup"});
        data.put("4", new Object[] {3, "John", "Adwar"});
        data.put("5", new Object[] {4, "Brian", "Schu"});
          
        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset)
        {
            Row row = sheet.createRow(rownum++);
            System.out.println("Row Print" +rownum);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
               Cell cell = row.createCell(cellnum++);
               System.out.println("Cell Print" +cellnum);
               if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        try
        {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream("howtodoinjava_demo.xlsx");
            workbook.write(out);
            out.close();
            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
