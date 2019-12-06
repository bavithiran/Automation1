package com.uiautomation.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.uiautomation.utils.CommonUtils;
import com.wechatify.utils.Constants;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

public class EventMagPage extends CommonPage
{

    @FindBy(xpath = "//html/body/section/section/div[3]/div[1]/div/div[2]/div[1]/a")
    private WebElement AddEventClick;

    @FindBy(xpath = "//div[@class=\"col-sm-3 control\"]//input[@id=\"name\"]")
    private WebElement EventNameFilter;

    @FindBy(xpath = "//*[@id=\"SubmitSearch\"]")
    private WebElement EventSearchClick;

    public void eventMagementModuleSelection(String EventModuleName)
    {
        WebElement EventModuleSelecstion = getDriver()
            .findElement(By.xpath("//ul[@id=\"WechatifyNavigation\"]//li//a//span[contains(text(),'" + EventModuleName + "')]//..//em"));
        EventModuleSelecstion.click();
        CommonUtils.waitForSeconds(6);
        // eventManageEventNameFilter();
        // CommonUtils.waitForSeconds(5);
        // EventGridPageSearchClick();

    }

    public void eventManageEventNameFilter()
    {
        EventNameFilter.sendKeys("Stg");
    }

    public void EventGridPageSearchClick()
    {
        EventSearchClick.click();
        CommonUtils.waitForSeconds(5);
    }

    public void eventAddClick()
    {
        AddEventClick.click();
        CommonUtils.waitForSeconds(5);
    }

    public void eventReadExcelData(String filePath, String fileName, String sheetName) throws IOException, InvalidFormatException
    {
        Sheet PageSheet = readExcel(filePath, fileName, sheetName);

        // Find number of rows in excel file
        // int rowCount = faQSheet.getLastRowNum()-faQSheet.getFirstRowNum();
        int rowCount = PageSheet.getLastRowNum();

        int i = 0;
        int j = 1;

        Row row = PageSheet.getRow(i);

        EventNameFilter.clear();
        EventNameFilter.sendKeys(row.getCell(j).getStringCellValue());

        // for (int i = 0; i < rowCount; i++)
        // {
        // Row row = PageSheet.getRow(i);

        // for (int j = 0; j < row.getLastCellNum(); j++)
        // {
        // EventNameFilter.clear();
        // EventNameFilter.sendKeys(row.getCell(j).getStringCellValue());
        // }
        // }
        CommonUtils.waitForSeconds(2);
        EventGridPageSearchClick();
        CommonUtils.waitForSeconds(2);

    }

    public static Sheet readExcel(String filePath, String fileName, String sheetName) throws IOException, InvalidFormatException
    {
        // Get ExcelSheet File Path
        // File exCelSheet = excelFilePathObj(filePath, fileName);

        EventTestExample();

        System.out.println("ExampleExcelCreationdone");

        // Create an object of FileInputStream class to read excel file
        // FileInputStream inputStream = new FileInputStream(new File(Constants.EXCEL_SHEET_DATA_FAQ_PATH + "\\" + fileName));

        // File extension Validation
        // Workbook excelWorkorkBook = excelExtensionsCheck(new FileInputStream(new File(Constants.EXCEL_SHEET_DATA_FAQ_PATH + "\\" + fileName)), fileName);

        // excelWorkorkBook = new XSSFWorkbook(new FileInputStream(new File(Constants.EXCEL_SHEET_DATA_FAQ_PATH + "\\" + fileName)));

        Sheet PageSheet = new XSSFWorkbook(new FileInputStream(new File(Constants.EXCEL_SHEET_DATA_FAQ_PATH + "\\" + fileName))).getSheet(sheetName);

        // Read sheet inside the workbook by its name
        // Sheet PageSheet = excelWorkorkBook.getSheet(sheetName);

        return PageSheet;
    }

    public static void EventTestExample() throws IOException, InvalidFormatException
   {
       FileInputStream fis = new FileInputStream(new File("C:\\Users\\Bavithiran\\Desktop\\Testxlsx\\test.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook (fis);
        XSSFWorkbook wb = (XSSFWorkbook) WorkbookFactory.create(new File("myFile.xlsx"));
		XSSFSheet sheet =  wb.getSheetAt(0);
		//Create First Row
		XSSFRow row1 = sheet.createRow(0);
		XSSFCell r1c1 = row1.createCell(0);
		r1c1.setCellValue("Emd Id");
		XSSFCell r1c2 = row1.createCell(1);
		r1c2.setCellValue("NAME");
		XSSFCell r1c3 = row1.createCell(2);
		r1c3.setCellValue("AGE");
		//Create Second Row
		XSSFRow row2 = sheet.createRow(1);
		XSSFCell r2c1 = row2.createCell(0);
		r2c1.setCellValue("1");
		XSSFCell r2c2 = row2.createCell(1);
		r2c2.setCellValue("Ram");
		XSSFCell r2c3 = row2.createCell(2);
		r2c3.setCellValue("20");		
		//Create Third Row
		XSSFRow row3 = sheet.createRow(2);
		XSSFCell r3c1 = row3.createCell(0);
		r3c1.setCellValue("2");
		XSSFCell r3c2 = row3.createCell(1);
		r3c2.setCellValue("Shyam");
		XSSFCell r3c3 = row3.createCell(2);
		r3c3.setCellValue("25");
		fis.close();
		FileOutputStream fos =new FileOutputStream(new File("myFile.xlsx"));
	        workbook.write(fos);
	        fos.close();
		System.out.println("Done");
   }

   public static File excelFilePathObj(String filePath, String fileName)
   {
      // Create an object of File class to open xlsx file
       File excelSheet = new File(Constants.EXCEL_SHEET_DATA_FAQ_PATH + "\\" + fileName);

      //   File excelSheet = new File(filePath + "\\" + fileName);

      //File excelSheet = new File("Event-automation.xlsx");
      System.out.println(excelSheet);
      return excelSheet;
   }

   public static Workbook excelExtensionsCheck(FileInputStream inputStream, String fileName) throws IOException
   {
      Workbook excelWorkorkBook = null;

      // Find the file extension by splitting file name in substring and getting only
      // extension name
      String fileExtensionName = fileName.substring(fileName.indexOf("."));

      System.out.println("IndexOf ex :"+fileExtensionName);

      // Check condition if the file is xlsx file
      if (fileExtensionName.equals(".xlsx"))
      {
         // If it is xlsx file then create object of XSSFWorkbook class
         excelWorkorkBook = new XSSFWorkbook(inputStream);
      }
      // Check condition if the file is xls file
      else if (fileExtensionName.equals(".xls"))
      {
         // If it is xls file then create object of HSSFWorkbook class
         excelWorkorkBook = new HSSFWorkbook(inputStream);
      }
      return excelWorkorkBook;
   }

}