/**
 * 
 */
package com.uiautomation.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.uiautomation.utils.CommonUtils;
import com.wechatify.utils.Constants;

import jline.internal.Log;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;

/**
 * 
 * @version $Id$
 */
public class TemplatePage extends CommonPage
{

   private static final int WebElement = 0;
   private static final int List = 0;
   
   String AfterDataSplit;
   String TemplateMessageNameSave;
   int DynamictemplateFieldsNumber;

   @FindBy(xpath = "/html/body/section/section/div[3]/div[1]/div/div[2]/div[1]/a")
   private WebElement templateAddBtn;

   @FindBy(xpath = "//*[@id=\"btnPullTemp\"]")
   private WebElement pullTemplateBtn;

   @FindBy(xpath = "//div[@class=\"item-holder sub grid-item selectedCard ng-scope\"]//div[@class=\"img-tit clearfix\"]//div[@class=\"col-sm-12 text-center\"]")
   private WebElement selectingTemplateMasterCardRandom;

   @FindBy(xpath = "//*[@id=\"MessageName\"]")
   private WebElement TemplateMessageName;

   @FindBy(xpath = "//*[@id=\"jumppage\"]")
   private WebElement templateJumpPageCheckBox;

   @FindBy(xpath = "//*[@id=\"appcontent\"]")
   private WebElement templateContentCheckBox;

   @FindBy(xpath = "//*[@id=\"miniappdata\"]")
   private WebElement templateMiniappCheckbox;

   @FindBy(xpath = "//*[@id=\"RedirectionUrl\"]")
   private WebElement ExternalLinkField;

   @FindBy(css = "div.body-mask")
   private WebElement contentDescriptionField;

   @FindBy(xpath = "//*[@id=\"ueditor_0\"]")
   private WebElement ContentEditorTemplate;

   @FindBy(xpath = "//*[@id=\"miniAppName\"]")
   private WebElement MiniAppNameField;

   @FindBy(xpath = "//*[@id=\"miniAppPathName\"]")
   private WebElement MiniAppPagePathField;

   @FindBy(xpath = "//*[@id=\"miniAppAppIdName\"]")
   private WebElement MiniAppId;

   @FindBy(xpath = "//*[@id=\"origSetImage\"]")
   private WebElement templateImagebtn;

   @FindBy(xpath = "//*[@id=\"origSetVideo\"]")
   private WebElement templateVideoBtn;

   @FindBy(xpath = "//*[@id=\"VideoUrl\"]")
   private WebElement templateVideoUrlField;

   @FindBy(xpath = "//*[@id=\"ImgModal\"]/div/div/div[3]/button[1]")
   private WebElement templateUploadBtn;

   @FindBy(css = "#VideoUrlModal > div > div > div.modal-footer > button.VideoUploadOK.Okbutton.pull-right")
   private WebElement VideoUrlOkBtn;

   @FindBy(css = "#VideoUrlModal > div > div > div.modal-footer > button.btn.btn-default.closePopupBtn.pull-right")
   private WebElement VideoUrlCloseBtn;

   @FindBy(xpath = "//*[@id=\"journeyDiv\"]/div")
   private WebElement TemplateActivityOnOff;

   @FindBy(xpath = "//*[@id=\"journeyDiv\"]/div/div")
   private WebElement TemplateActivityONOffCheckelement;

   @FindBy(xpath = "//*[@id=\"btnCreate\"]")
   private WebElement TemplateCreate;

   @FindBy(xpath = "//div[@class=\"form-group text-right\"]//input[@value=\"Save\"]")
   private WebElement TemplateSave;

   @FindBy(xpath = "//div[@class=\"form-group text-right\"]//input[@value=\"Save & Close\"]")
   private WebElement TemplateSaveAndClose;

   @FindBy(xpath = "//*[@id=\"TemplateCreateForm\"]/div/div/div[2]/div[1]/div/a")
   private WebElement TemplateBackTolist;

   @FindBy(xpath = "//*[@id=\"FolderName\"]")
   private WebElement TemplateFolderField;

   @FindBy(css = "#folderSubmitbtn")
   private WebElement TemplateSubmitFolderBtn;

   @FindBy(css = "#FolderID_chosen > a > span")
   private WebElement TemplateFoldercheckBoxClick;

   @FindBy(css = "#FolderID_chosen > div > div > input")
   private WebElement TemplatefolderSearchClick;

   @FindBy(css = "#FolderID_chosen > div > ul")
   private WebElement TemplateFolderSearchResult;

   @FindBy(css = "#GroupSelect_chosen > ul")
   private WebElement TemplateGroupFolderSelectClick;

   @FindBy(css = "#GroupSelect_chosen > ul > li > input")
   private WebElement TemplateGroupFolderSelectSearchField;

   @FindBy(css = "#GroupSelect_chosen > div > ul")
   private WebElement TemplateGroupFolderSelectResult;

   @FindBy(xpath = "//*[@id=\"TemplateEdit\"]/div[2]/div[2]/div[1]/input[2]")
   private WebElement templateCreatePageSave;

   @FindBy(xpath = "//*[@id=\"saveClose\"]")
   private WebElement templateCreatePageSaveAndClose;

   @FindBy(xpath = "//*[@id=\"copyTemp\"]")
   private WebElement templateCreatePageCopyBtn;

   @FindBy(xpath = "//*[@id=\"tempSchedule\"]")
   private WebElement templateScheduleBtn;

   @FindBy(xpath = "//*[@id=\"saveTime\"]")
   private WebElement templateSendForApprovalBtn;

   @FindBy(xpath = "//*[@id=\"btnApprove\"]")
   private WebElement templateApproveBtn;

   @FindBy(xpath = "//*[@id=\"form0\"]/div[2]/div/div[1]/a")
   private WebElement TemplateSchCancelBtn;

   @FindBy(xpath = "//*[@id='datetimepicker12']/div/div/div[2]/div[1]/table/tr[1]/td[3]/a/span")
   private WebElement MinuteIncreamentBtn;

   @FindBy(xpath = "//*[@id='datetimepicker12']/div/div/div[2]/div[1]/table/tr[1]/td[1]/a/span")
   private WebElement HourIncreamentBtn;

   @FindBy(xpath = "//*[@id='datetimepicker12']/div/div/div[2]/div[1]/table/tr[3]/td[3]/a/span")
   private WebElement MinuteDecreamentBtn;

   @FindBy(xpath = "//*[@id='datetimepicker12']/div/div/div[2]/div[1]/table/tr[3]/td[1]/a/span")
   private WebElement HourDecreamentBtn;

   @FindBy(xpath = "//ul[@id=\"TemplateSubId\"]//li[@class=\"BroadcastSchedule active\"]//a")
   private WebElement TemplateSubIdElement;

   @FindBy(css = ".containerTabs p.content")
   private WebElement TemplateContentSubInnerHeader;

   @FindBy(xpath = "//*[@id=\"txtContentGroup\"]/div[3]/ul/li[3]")
   private WebElement TemplateStaticQrCode;

   @FindBy(xpath = "//*[@id=\"btnApproveOk\"]")
   private WebElement CardCancelTemplateOkBtn;

   @FindBy(xpath = "//div[@class=\"modal-footer\"]//a[@id=\"DeleteCancelButtonUrl\"]")
   private WebElement CardCancelTemplateCancelBtn;

   @FindBy(xpath = "//span[@class=\"timepicker-hour\"]")
   private WebElement TemplateCalenderHourGetText;

   @FindBy(xpath = "//span[@class=\"timepicker-minute\"]")
   private WebElement TemplateCalenderMinGetText;

   @FindBy(xpath = "//button[@data-action=\"togglePeriod\"]/text()")
   private WebElement TemplateCalenderAMorPmGetText;

   @FindBy(xpath = "//*[@id=\"TemplatesWrap\"]/div[5]/div/div/div/input[1]")
   private WebElement TemplateDeleteOkBtn;

   @FindBy(xpath = "//p[@id=\"PopMessageFormDisplayIdDel\"]//following-sibling::a[@id=\"DeleteCancelButtonUrl\"]")
   private WebElement TemplateDeleteCancelBtn;

   @FindBy(xpath = "//*[@id=\"TagSelect_chosen\"]/ul")
   private WebElement TemplateTagSelectingFolderLocation;

   @FindBy(xpath = "//*[@id=\"TagSelect_chosen\"]/ul")
   private WebElement TemplateTagClickFolderField;

   @FindBy(xpath = "//*[@id=\"TagSelect_chosen\"]/ul/li/input")
   private WebElement TemplateTagSelectingFolderSearchField;

   @FindBy(xpath = "//*[@id=\"TagSelect_chosen\"]/div/ul")
   private WebElement TemplateTagSelectingFolderSearchedResult;

   @FindBy(xpath = "//*[@id='copyTemp']")
   private WebElement TemplateCopyBtnClick;

   @FindBy(xpath = "//div[@class=\"modal-footer\"]//input[@id=\"btnApproveOk\"]")
   private WebElement TemplateCopyMessageOkBtn;

   @FindBy(xpath = "//div[@class=\"modal-footer\"]//a[@id=\"DeleteCancelButtonUrl\"]")
   private WebElement TemplateCopyMessageCancelBtn;

   @FindBy(xpath = "//span[@id=\"MessageName-error\"]")
   private WebElement TemplateTitleValidationErrorText;

   @FindBy(css = "#msgNameErr")
   private WebElement TemplateTitleMaximumcharErrorText;

   @FindBy(xpath = "//*[@id='menu2']")
   private WebElement TemplateApproveReassign;

   @FindBy(xpath = "//*[@id='btnReassign']")
   private WebElement TemplateApproveReassignToCreate;

   @FindBy(xpath = "//*[@id=\"btnValidateMiniApp\"]")
   private WebElement CheckValidMiniProgramCheckBtn;

   @FindBy(xpath = "//div[@class=\"col-md-5 col-md-offset-7\"]//input")
   private WebElement ValidminiAppSearchField;

   @FindBy(xpath = "//div[@class=\"col-md-5 col-md-offset-7\"]//span//button")
   private WebElement ValidMiniAppSearchBtn;

   @FindBy(xpath = "//div[@id=\"followerData\"]//table[@class=\"table tableCenter table-hover\"]//input")
   private WebElement ValidMiniAppCheckBoxBtn;

   @FindBy(xpath = "//div[@id=\"followerData\"]//table[@class=\"table tableCenter table-hover\"]//input//following::td[@class=\"ng-binding\"]")
   private WebElement ValidMiniAppCheckBoxFollowingFollowerName;

   @FindBy(xpath = "//div[@class=\"modal-footer\"]//button[1][@ng-click=\"sendMiniAppPreview(followers)\"]")
   private WebElement MiniAppPreviewOkBtn;

   @FindBy(xpath = "//div[@class=\"modal-footer\"]//button[3][@ng-click=\"clearData()\"]")
   private WebElement MiniAppPreviewCloseBtn;

   @FindBy(xpath = "//*[@id=\"ScheduledatePickerId\"]/div/div/div[2]/div[1]/table/tr[1]/td[1]/a/span")
   private WebElement RescheduleTemplateHourIncreament;

   @FindBy(xpath = "//*[@id=\"ScheduledatePickerId\"]/div/div/div[2]/div[1]/table/tr[3]/td[1]/a/span")
   private WebElement RescheduleTemplateHourDecreament;

   @FindBy(xpath = "//*[@id=\"ScheduledatePickerId\"]/div/div/div[2]/div[1]/table/tr[1]/td[3]/a/span")
   private WebElement RescheduleTemplateMinIncreament;

   @FindBy(xpath = "//*[@id=\"ScheduledatePickerId\"]/div/div/div[2]/div[1]/table/tr[3]/td[3]/a/span")
   private WebElement RescheduleTemplateMinDecreament;

   @FindBy(xpath = "//div[@id=\"Alert\"]//div[@id=\"AlertInfo\"]")
   private WebElement TemplateAlertElement;

   @FindBy(xpath = "//div[@class=\"form-group text-right\"]//div//button[@data-toggle=\"dropdown\"]")
   private WebElement TemplateMainPreview;

   @FindBy(xpath = "//li[@role=\"presentation\"]//a[text()='WeChat']")
   private WebElement TemplatePreviewWechat;

   @FindBy(xpath = "//li[@role=\"presentation\"]//a[text()='Mobile']")
   private WebElement TemplatePreviewMobile;

   @FindBy(xpath = "//li[@role='presentation']//a[text()='Reassign to create']")
   private WebElement TemplateReassignToCreate;

   @FindBy(xpath = "//*[@id=\"btnPreview\"]")
   private WebElement TemplatePreviewToFollowerOkBtn;

   @FindBy(xpath = "//button[@ng-click=\"clearData()\"][contains(text(),'Close')]")
   private WebElement TemplatePreviewTofollowerCloseBtn;

   @FindBy(xpath = "//div[@data-ng-repeat=\"res in TemplateRecords\"]//div//div//a[@title=\"Journey Builder On/Activity Response On\"]/../../..//div//h3")
   private List<WebElement> TemplateActivityResponseOnCards;

   @FindBy(xpath = "//div[@data-ng-repeat=\"res in TemplateRecords\"]//div//div//a[@title=\"Journey Builder Off/Activity Response Off\"]/../../..//div//h3")
   private List<WebElement> TemplateActivityREsponseOffCards;

   @FindBy(xpath = "//div[@data-ng-repeat=\"res in TemplateRecords\"]")
   private List<WebElement> TemplateCardsAvailable;

   @FindBy(xpath = "//span[@data-ng-bind=\"pagination.last\"]")
   private WebElement TemplatePaginationLastPageNumber;

   @FindBy(xpath = "//*[@id=\"PaginationDivID\"]/ul/li[6]/span")
   private WebElement PaginationNextButton;

   @FindBy(xpath = "//*[@id=\"jumpllink\"]")
   private WebElement TemplateJumpageValidatonText;

   @FindBy(xpath = "//*[@id=\"cntdesc_err\"]")
   private WebElement TemplateContentValidationText;

   @FindBy(xpath = "//*[@id=\"error\"]")
   private WebElement TemplateMiniAppNameFieldValidationText;

   @FindBy(xpath = "//*[@id=\"error1\"]")
   private WebElement TemplateMiniAppPagePAthFieldValidationText;

   @FindBy(xpath = "//*[@id=\"error2\"]")
   private WebElement TemplateMiniAppAppIdFieldValidationText;

   @FindBy(xpath = "//div[@class=\"form-group text-right\"]//input[@value=\"Save\"]")
   private WebElement TemplateEditSave123Btn;

   @FindBy(xpath = "//*[contains(.,.)]")
   private List<WebElement> TotalPageContains;

   @FindBy(xpath = "//div")
   private List<WebElement> getTextFlowRandomvaribale;

   @FindBy(xpath = "/html/body/section/section/div[1]/div/div/div")
   private WebElement LanguageMain;

   @FindBy(xpath = "/html/body/section/section/div[1]/div/div/ul/li[2]")
   private WebElement LanguageChinese;

   @FindBy(xpath = "/html/body/section/section/div[1]/div/div/ul/li[1]/a")
   private WebElement LanguageEnglish;

   @FindBy(xpath = "//span[contains(text(),'Demo')]")
   private WebElement demoCatalog;

   @FindBy(xpath = "(//div[@id='TemplatesWrap']/div/div[3])[1]/div/div[2]//h3")
   private List<WebElement> templateMessageName;

   @FindBy(xpath = "(//div[@id='TemplatesWrap']/div/div[3])[1]/div/div[2]//p/span")
   private List<WebElement> templateScheduleTime;

   @FindBy(id = "TemplateQueue")
   private WebElement templateQueue;

   @FindBy(id = "TemplateLog")
   private WebElement templateLog;

   @FindBy(css = "[data-ng-model=\"TMName\"]")
   private WebElement enterTemplateMsg;

   @FindBy(css = "[ng-click=\"SearchTemplateMessage()\"]")
   private WebElement searchBtn;

   @FindBy(xpath = "(//table[contains(@class,'table table-bordered')]//tr)[2]/td")
   private List<WebElement> verifyTemplateFields;

   @FindBy(css = ".BroadcastCardHold p")
   private WebElement verifyMessageInQueueTab;

   /**
    *
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : bavithiranpc
    */

   public void TemplateBroadcastSubTabs(String TemplateSubTabs)
   {
      WebElement TemplateSubTabclicks = getDriver().findElement(By.xpath("//ul[@id=\"TemplateSubId\"]//a[text()='" + TemplateSubTabs + "']"));
      TemplateSubTabclicks.click();
      CommonUtils.waitForSeconds(5);
   }

   public void TemplateCardsAvailable()
   {

      int TemplateActivityOnSize = 0;
      int CountUpdate = 0;
      int TemplatePaginationLastNumber = Integer.parseInt(TemplatePaginationLastPageNumber.getText());

      for (int i = 1; i <= TemplatePaginationLastNumber; i++)
      {
         TemplateActivityOnSize = TemplateActivityResponseOnCards.size();
         Log.info("TemplateCOunt = ", +TemplateActivityOnSize);
         CountUpdate = CountUpdate + TemplateActivityOnSize;
         Log.info("Count Update = ", +CountUpdate);

         if (i < TemplatePaginationLastNumber)
         {

            PaginationNextButton.click();// *[@id="PaginationDivID"]/ul/li[6]/span
         }

      }
      // CountUpdate = CountUpdate + TemplateActivityOnSize;
      Log.info(CountUpdate);

   }

   public void ClickAddTemplateBtnPage()
   {

      // TemplateCardsAvailable();

      waitFor(templateAddBtn);
      templateAddBtn.click();
      CommonUtils.waitForSeconds(10);
   }

   public void ClickPullTemplatePage()
   {
      waitFor(pullTemplateBtn);
      pullTemplateBtn.click();
      CommonUtils.waitForSeconds(10);
   }

   public void selectingRandomMasterTemplatePage()
   {
      try
      {
         waitFor(selectingTemplateMasterCardRandom);
         System.out.println(" Template Master card is available");
         selectingTemplateMasterCardRandom.click();
         CommonUtils.waitForSeconds(5);

      }
      catch (Exception e)
      {
         System.out.println(" Template Master card is not available");
      }
   }

   public void TemplateReviewFormOptionPage(String TemplateReviewFormOption)
   {
      WebElement ReviewFormOption = getDriver()
         // .findElement(By.xpath("//div[@class=\"reviewsForm\"]//div[@class = \"col-sm-6\"]//a[contains(text(),'" + TemplateReviewFormOption + "')]"));
         .findElement(By.xpath("//div[@class=\"reviewsForm\"]//div[@class = \"col-sm-6\"]//a[@class]"));
      ReviewFormOption.click();
   }

   public void TemplateMessagePage(String MessageName, String ClearOrSend)

   {
      if (ClearOrSend.equalsIgnoreCase("Send"))
      {
         TemplateMessageName.clear();
         TemplateMessageName.sendKeys(MessageName);
         CommonUtils.waitForSeconds(6);
      }
      else if (ClearOrSend.equalsIgnoreCase("Clear"))
      {
         TemplateMessageName.clear();
      }

      TemplateMessageNameSave = MessageName;
   }

   public void selectingTemplatecheckboxPages(String TemplateCheckBox)
   {
      if (TemplateCheckBox.equalsIgnoreCase("JumpPage"))
      {
         waitFor(templateJumpPageCheckBox);
         templateJumpPageCheckBox.click();
      }
      else if (TemplateCheckBox.equalsIgnoreCase("Content"))
      {
         waitFor(templateContentCheckBox);
         templateContentCheckBox.click();
         CommonUtils.waitForSeconds(5);
      }
      else if (TemplateCheckBox.equalsIgnoreCase("MiniApp"))
      {
         waitFor(templateMiniappCheckbox);
         templateMiniappCheckbox.click();

      }
      else if (TemplateCheckBox.equalsIgnoreCase("No"))
      {
         Log.info("No Template Types Are Selected");
      }

   }

   public void EnteringInfoInTemplatePage(
      String TemplateCheckBoxChoosedOption,
      String jumpExtLinkData,
      String ContentDesFieldData,
      String ImageName,
      String TemplateVideoUrl,
      String TemplateStaticQr,
      String MiniappNameData,
      String MiniappPagePathData,
      String MiniAppidData,
      String OkOrClose)
   {
      if (TemplateCheckBoxChoosedOption.equalsIgnoreCase("JumpPage"))
      {
         waitFor(ExternalLinkField);
         ExternalLinkField.sendKeys(jumpExtLinkData);
      }
      else if (TemplateCheckBoxChoosedOption.equalsIgnoreCase("Content"))
      {

         templateImagebtn.click();
         CommonUtils.waitForSeconds(3);
         templateUploadBtn.click();
         CommonUtils.waitForSeconds(3);

         // String Name = "Valid.png";

         String path = Constants.TEST_DATA_PATH + ImageName;
         CommonUtils.uploadFile(path);
         CommonUtils.waitForSeconds(5);

         templateVideoBtn.click();
         CommonUtils.waitForSeconds(2);
         // templateVideoUrlField.sendKeys("https://v.qq.com/x/page/d0542aie69t.html");
         templateVideoUrlField.sendKeys(TemplateVideoUrl);
         CommonUtils.waitForSeconds(2);

         if (OkOrClose.equalsIgnoreCase("OK"))
         {
            VideoUrlOkBtn.click();

         }
         else if (OkOrClose.equalsIgnoreCase("Close"))
         {
            VideoUrlCloseBtn.click();
         }

         CommonUtils.waitForSeconds(5);

      }
      else if (TemplateCheckBoxChoosedOption.equalsIgnoreCase("MiniApp"))
      {
         waitFor(MiniAppNameField);
         MiniAppNameField.sendKeys(MiniappNameData);
         waitFor(MiniAppPagePathField);
         MiniAppPagePathField.sendKeys(MiniappPagePathData);
         waitFor(MiniAppId);
         MiniAppId.sendKeys(MiniAppidData);
      }
   }

   public void TemplateFieldDataPage()
   {
      List<WebElement> totalTemplateFields = getDriver()
         .findElements(By.xpath("//div[@class=\"panel-body\"]//div[contains(@class,\"form-group dynamic_data\")]"));
      int totalTemplateFieldsCount = totalTemplateFields.size();
      CommonUtils.waitForSeconds(2);
      // Random rand = new Random();
      // int Template_number = rand.nextInt(totalTemplateFieldsCount);

      for (int templateFields = 0; templateFields < totalTemplateFieldsCount; templateFields++)
      {
         String OriginalFieldId = getTemplateIdByFiield(templateFields);

         CommonUtils.waitForSeconds(1);
         WebElement DynamicFieldPreview = getDriver().findElement(
            By.xpath(
               "//div[@id=\"TemplateMessageFields\"]//div[contains(@class,\"form-group\")]//label//following-sibling::div//label[@id='label_" + OriginalFieldId
                  + "']"));

         String getTextFormDynamicFieldPreview = DynamicFieldPreview.getText();
         // Log.info("Dynamic field Name given = " , TemplateMessageNameSave);
         // Log.info(" Getting Text From the TemplateFieldPreview Page = ", getTextFormDynamicFieldPreview);
         Log.info(
            "Comparing GivenData '" + TemplateMessageNameSave + "' and Data in PreviewField '" + getTextFormDynamicFieldPreview + "' : "
               + TemplateMessageNameSave.equals(getTextFormDynamicFieldPreview));

         assertThat("Verifying the TemplateDynamic Field", TemplateMessageNameSave, equalTo(getTextFormDynamicFieldPreview));

      }
   }

   /**
    * @Description:
    * @param
    * @return : String
    * @exception :
    * @Created_by : Bavithiran
    */
   private String getTemplateIdByFiield(int fieldIndex)
   {
      CommonUtils.waitForSeconds(1);
      WebElement TemplateFieldDyanmic = getDriver().findElement(
         By.xpath(
            "//div[@class=\"panel-body\"]//div[contains(@class,\"form-group dynamic_data\")]//input[contains(@class,\"form-control tempInput text-box single-line\")][@name=\"TemplateMessageFields["
               + fieldIndex + "].FieldValue\"]"));

      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", TemplateFieldDyanmic);
      TemplateFieldDyanmic.sendKeys(TemplateMessageNameSave);

      CommonUtils.waitForSeconds(1);

      String AttributeOfTemplateDynamicField = TemplateFieldDyanmic.getAttribute("id");
      String[] SeparateTemplateFieldId = AttributeOfTemplateDynamicField.split("field_");

      for (String a : SeparateTemplateFieldId)
      {
         if (a.length() != 0)
         {
            AfterDataSplit = a;
            // Log.info(" After data split = ", AfterDataSplit);
         }
      }

      String OriginalFieldId = AfterDataSplit;
      Log.info(" getting Template Field Id = ", OriginalFieldId);
      return OriginalFieldId;
   }

   /**
    * @Description:
    * @param
    * @return : Object
    * @exception :
    * @Created_by : Bavithiran
    */

   public void TemplateActivitySwitchBtn()
   {
      String GetClassBeforeActivityClick = TemplateActivityONOffCheckelement.getAttribute("class");

      // Log.info(" State of Activity Toggole before Click ", GetClassBeforeActivityClick);

      if (GetClassBeforeActivityClick.contains("off"))
      {
         Log.info(" Before Click -- Activity is in Off State");
      }
      else if (GetClassBeforeActivityClick.contains("on"))
      {
         Log.info(" Before Click -- Activity is in ON State");
      }
      else
      {
         Log.info(" Before No Check DOne");
      }

      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", TemplateActivityOnOff);
      TemplateActivityOnOff.click();
      CommonUtils.waitForSeconds(2);

      String GetClassAfterActivityClick = TemplateActivityONOffCheckelement.getAttribute("class");

      // Log.info(" State of Activity Toggole After Click ", GetClassAfterActivityClick);

      if (GetClassAfterActivityClick.contains("off"))
      {
         Log.info(" After Click -- Activity is in Off State");
      }
      else if (GetClassAfterActivityClick.contains("on"))
      {
         Log.info(" After Click -- Activity is in ON State");
      }
   }

   public void TemplateCreateOrBackTolist(String Option)
   {

      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", TemplateCreate);

      if (Option.equalsIgnoreCase("Create"))
      {
         TemplateCreate.click();
      }
      else if (Option.equalsIgnoreCase("BackToList"))
      {
         TemplateBackTolist.click();
      }
      CommonUtils.waitForSeconds(8);
      // Log.info(" Alert Message after the Create button is clicked " , "'" + getAlertMessage() + "'");
   }

   public void ClickTemplateCreatedFolderAction(String AddNewFolder)
   {
      getDriver().findElement(By.xpath("//span[text()='" + AddNewFolder + "']")).click();
      CommonUtils.waitForSeconds(2);

   }

   public void EnterTemplateFolderNamePage(String FolderName) // Enter Folder Name
   {
      TemplateFolderField.clear();
      TemplateFolderField.sendKeys(FolderName);
      CommonUtils.waitForSeconds(2);
      // String CreatedFolderName = FolderName;
   }

   public void clickTemplateFolderSubmitPages() // Clicking Submit button in the Folder name Creation Popup.
   {
      TemplateSubmitFolderBtn.click();
      CommonUtils.waitForSeconds(5);
   }

   public void selectTemplateFolderByName(String selectFolderName) // folder selection in card creation
   {
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", TemplateCreate);
      TemplateFoldercheckBoxClick.click();
      CommonUtils.waitForSeconds(3);

      TemplatefolderSearchClick.sendKeys(selectFolderName);
      CommonUtils.waitForSeconds(2);

      TemplateFolderSearchResult.click();
      CommonUtils.waitForSeconds(1);

   }

   public void selectTemplateGroupFromFolder(String GroupName)
   {
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", TemplateGroupFolderSelectClick);
      TemplateGroupFolderSelectClick.click();
      CommonUtils.waitForSeconds(3);

      TemplateGroupFolderSelectSearchField.sendKeys(GroupName);
      CommonUtils.waitForSeconds(2);

      TemplateGroupFolderSelectResult.click();
      CommonUtils.waitForSeconds(1);

   }

   public void selectTemplateTagFromFolder(String TagName)
   {
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", TemplateTagSelectingFolderLocation);
      TemplateTagClickFolderField.click();
      CommonUtils.waitForSeconds(3);

      TemplateTagSelectingFolderSearchField.sendKeys(TagName);
      CommonUtils.waitForSeconds(2);

      TemplateTagSelectingFolderSearchedResult.click();
      CommonUtils.waitForSeconds(1);

   }

   public void TemplateEditFunc(String TemplateMessageName, String EditOrViewOrCancel)
   {
      if (EditOrViewOrCancel.equalsIgnoreCase("Edit"))
      {
         WebElement TemplateEdit = getDriver().findElement(
            By.xpath(
               "//div[@data-ng-repeat=\"res in TemplateRecords\"]//h3[text()='" + TemplateMessageName
                  + "']/./../../following-sibling::div[1]//a[@title='Edit Message']"));
         TemplateEdit.click();
         CommonUtils.waitForSeconds(5);
      }
      else if (EditOrViewOrCancel.equalsIgnoreCase("View"))
      {
         WebElement TemplateView = getDriver().findElement(
            By.xpath(
               "//div[@data-ng-repeat=\"res in TemplateRecords\"]//h3[text()='" + TemplateMessageName
                  + "']/./../../following-sibling::div[1]//a[@title='View']"));
         TemplateView.click();
         CommonUtils.waitForSeconds(5);
      }
      else if (EditOrViewOrCancel.equalsIgnoreCase("Cancel"))
      {
         WebElement TemplateCancel = getDriver().findElement(
            By.xpath(
               "//div[@data-ng-repeat=\"res in TemplateRecords\"]//h3[text()='" + TemplateMessageName
                  + "']/./../../following-sibling::div[1]//a[@title='Cancel']"));
         TemplateCancel.click();
         CommonUtils.waitForSeconds(5);
      }
      else if (EditOrViewOrCancel.equalsIgnoreCase("Delete"))
      {

         WebElement TemplateDelete = getDriver().findElement(
            By.xpath(
               "//div[@data-ng-repeat=\"res in TemplateRecords\"]//h3[text()='" + TemplateMessageName
                  + "']/./../../following-sibling::div[1]//a[@title='Delete']"));
         TemplateDelete.click();
         CommonUtils.waitForSeconds(5);

      }
      else if (EditOrViewOrCancel.equalsIgnoreCase("ReSchedule"))
      {

         WebElement TemplateReSchedule = getDriver().findElement(
            By.xpath(
               "//div[@data-ng-repeat=\"res in TemplateRecords\"]//h3[text()='" + TemplateMessageName
                  + "']/./../../following-sibling::div//div[@id=\"ScheduledatePickerId\"]//span//span"));
         TemplateReSchedule.click();
         CommonUtils.waitForSeconds(5);

      }
   }

   public void TemplateRescheduleOpt(String Options)
   {
      WebElement TemplateReSchedule = getDriver().findElement(By.xpath("//div[contains(@class,\"bootstrap\")]//a[contains(text(),'" + Options + "')]"));
      TemplateReSchedule.click();
      CommonUtils.waitForSeconds(4);
   }

   public void CardCancelTemplateOkOrClose(String CancelOrOk)
   {
      if (CancelOrOk.equalsIgnoreCase("OK"))
      {
         CardCancelTemplateOkBtn.click();
         CommonUtils.waitForSeconds(5);
      }
      else if (CancelOrOk.equalsIgnoreCase("Cancel"))
      {
         CardCancelTemplateCancelBtn.click();
         CommonUtils.waitForSeconds(5);
      }
   }

   public void TemplateDeleteOkOrCancelBtn(String TemplateOkOrCancel)
   {

      if (TemplateOkOrCancel.equalsIgnoreCase("Ok"))
      {
         TemplateDeleteOkBtn.click();
         CommonUtils.waitForSeconds(5);
      }
      else if (TemplateOkOrCancel.equalsIgnoreCase("Cancel"))
      {
         TemplateDeleteCancelBtn.click();
         CommonUtils.waitForSeconds(5);
      }

      // Log.info("Alert Message The Card is Deleted = ", "" + getAlertMessage() + "");
   }

   public void TemplateSaveOrSaveAndClose(String SaveOrSaveAndClose)
   {
      switch (SaveOrSaveAndClose)
      {

      case "Save":

         CommonUtils.waitForSeconds(3);
         templateCreatePageSave.click();
         CommonUtils.waitForSeconds(3);
         break;

      case "SaveAndClose":

         CommonUtils.waitForSeconds(3);
         templateCreatePageSaveAndClose.click();
         CommonUtils.waitForSeconds(3);
         break;

      }

   }

   public String getTemplatesubContentInnerPageHeader()
   {

      waitFor(TemplateContentSubInnerHeader);
      return TemplateContentSubInnerHeader.getText();

   }

   public boolean isTemplateSubTabActive(String subTemplateTabName)
   {
      try
      {
         CommonUtils.waitForSeconds(3);
         WebElement TemplateSubTabElement = getDriver().findElement(By.xpath("//ul[@id='TemplateSubId']/li/a[text()='" + subTemplateTabName + "']/.."));
         Log.info("Class attribute: " + subTemplateTabName + TemplateSubTabElement.getAttribute("class"));
         return TemplateSubTabElement.getAttribute("class").contains("active");

      }
      catch (Exception e)
      {
         return false;
      }
   }

   public void TemplateReassignCheckWithTemplateNameCard(String TemplateSelectedFolderName, String TemplateMessageName)
   {
      try
      {

         WebElement TemplateFolderActiveCheck = getDriver()
            .findElement(By.xpath("//li[@class=\"fdr-active\"]//a//span[text()='" + TemplateSelectedFolderName + "']"));
         Log.info(" the Following folder is active");

         try
         {
            WebElement TemplateReassignIconWithCard = getDriver().findElement(
               By.xpath(
                  "//div[@class=\"draft-rev grid col-sm-9\"]//div[@data-ng-repeat=\"res in TemplateRecords\"]//div[1]//span[@title=\"Reassigned\"]//following::div[@class=\"row\"]//div//h3[text()='"
                     + TemplateMessageName + "']"));
            Log.info(TemplateMessageName, " The following Card is Available with Reassign Icon ");
            CommonUtils.waitForSeconds(1);
         }
         catch (Exception e)
         {
            Log.info(TemplateMessageName, " The following Card with Reassign Icon is not Available");
         }
      }
      catch (Exception e)
      {
         Log.info(" The following folder is not in Active ");
      }
   }

   public void TemplateTransferBtnPage(String TransferBtn)
   {
      switch (TransferBtn)
      {
      case "Schedule":
         CommonUtils.waitForSeconds(2);
         templateScheduleBtn.click();
         CommonUtils.waitForSeconds(5);
         break;

      case "SendForApproval":
         CommonUtils.waitForSeconds(2);
         templateSendForApprovalBtn.click();
         CommonUtils.waitForSeconds(5);
         break;

      case "Approve":
         CommonUtils.waitForSeconds(2);
         templateApproveBtn.click();
         CommonUtils.waitForSeconds(5);
         break;

      }
      CommonUtils.waitForSeconds(5);
   }

   public void TemplateCopyMessageClick()
   {
      waitFor(TemplateCopyBtnClick);
      TemplateCopyBtnClick.click();
      CommonUtils.waitForSeconds(3);
   }

   public String getCreateTemplateDisabledOrNOt()
   {
      String CreateBtnDisabledTrueCheck = TemplateCreate.getAttribute("disabled");
      Log.info(CreateBtnDisabledTrueCheck);
      return CreateBtnDisabledTrueCheck;
   }

   public String getSaveTemplateDisabledOrNot()
   {
      String SaveBtnDisabledTrueCheck = TemplateCreate.getAttribute("disabled");
      Log.info(SaveBtnDisabledTrueCheck);
      return SaveBtnDisabledTrueCheck;
   }

   public String getSaveAndCloseTemplateDisabledOrNot()
   {
      String SaveAndCloseBtnDisabledTrueCheck = TemplateCreate.getAttribute("disabled");
      Log.info(SaveAndCloseBtnDisabledTrueCheck);
      return SaveAndCloseBtnDisabledTrueCheck;
   }

   public void ValidMiniappPrograncheck(String Followername, String PreviewOrClose)
   {
      sendingPreviewTofollowerValidMiniApp(Followername, PreviewOrClose);
      CommonUtils.waitForSeconds(2);

      // if (getCreateTemplateDisabledOrNOt().equalsIgnoreCase("true") && getSaveTemplateDisabledOrNot().equalsIgnoreCase("true")
      // && getSaveAndCloseTemplateDisabledOrNot().equalsIgnoreCase("true"))

      try
      {
         TemplateCreate.click();
      }
      catch (Exception e)
      {
         Log.info(" Template's Create button is in disabled state , So Invalid AppId Or It Is a Invalid template ");
      }

      // else
      // {
      // CommonUtils.waitForSeconds(2);
      // TemplateCreate.click();
      // CommonUtils.waitForSeconds(2);
      // String AlertText = TemplateAlertElement.getText();
      // Log.info(AlertText);

      // }

   }

   public String getTemplateMiniAppNAmeFieldValidationText()
   {
      waitFor(TemplateMiniAppNameFieldValidationText);
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", TemplateMiniAppNameFieldValidationText);
      return TemplateMiniAppNameFieldValidationText.getText();
   }

   public String getTemplateMiniAppPagePathValidationText()
   {
      waitFor(TemplateMiniAppPagePAthFieldValidationText);
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true)", TemplateMiniAppPagePAthFieldValidationText);
      return TemplateMiniAppPagePAthFieldValidationText.getText();
   }

   public String getTemplateMiniAppAppIdValidationText()
   {
      waitFor(TemplateMiniAppAppIdFieldValidationText);
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", TemplateMiniAppAppIdFieldValidationText);
      return TemplateMiniAppAppIdFieldValidationText.getText();
   }

   public void CheckMiniAppBtnClick()
   {
      CheckValidMiniProgramCheckBtn.click();
      CommonUtils.waitForSeconds(2);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Bavithiran
    */
   private void sendingPreviewTofollowerValidMiniApp(String Followername, String PreviewOrClose)
   {
      // if (getCreateTemplateDisabledOrNOt().equalsIgnoreCase("true") && getSaveTemplateDisabledOrNot().equalsIgnoreCase("true"))

      CheckValidMiniProgramCheckBtn.click();
      CommonUtils.waitForSeconds(2);
      ValidminiAppSearchField.sendKeys(Followername);
      CommonUtils.waitForSeconds(2);
      ValidMiniAppSearchBtn.click();
      CommonUtils.waitForSeconds(2);

      ValidMiniAppCheckBoxBtn.click();
      CommonUtils.waitForSeconds(2);

      String getFollowerName = ValidMiniAppCheckBoxFollowingFollowerName.getText();
      Log.info("TheFollower Name Which has been Checked = ", getFollowerName);

      if (PreviewOrClose.equalsIgnoreCase("Preview"))
      {
         MiniAppPreviewOkBtn.click();
         CommonUtils.waitForSeconds(2);
         // Log.info(" Alert Message After Click = = ",getAlertMessage());

      }
      else if (PreviewOrClose.equalsIgnoreCase("Close"))
      {
         MiniAppPreviewCloseBtn.click();
      }

      if (getAlertMessage().contains("invalid appid hint"))
      {
         Log.info("Alert Message = ", getAlertMessage());
      }

   }

   public String getAlertMessage()
   {
      return TemplateAlertElement.getText();

   }

   public void ValidMiniAppPreviewBtnOrClose(String PreviewOrClose)
   {

      if (PreviewOrClose.equalsIgnoreCase("Preview"))
      {
         MiniAppPreviewOkBtn.click();
      }
      else if (PreviewOrClose.equalsIgnoreCase("Close"))
      {
         MiniAppPreviewCloseBtn.click();
      }

   }

   public void TemplateCopyMessageOkorCancel(String CopyOkOrCancel)
   {

      if (CopyOkOrCancel.equalsIgnoreCase("Ok"))
      {
         waitFor(TemplateCopyBtnClick);
         TemplateCopyBtnClick.click();
         CommonUtils.waitForSeconds(1);

         CommonUtils.waitForSeconds(2);
         TemplateCopyMessageOkBtn.click();
         CommonUtils.waitForSeconds(4);
      }
      else if (CopyOkOrCancel.equalsIgnoreCase("Cancel"))
      {
         waitFor(TemplateCopyBtnClick);
         TemplateCopyBtnClick.click();
         CommonUtils.waitForSeconds(1);

         CommonUtils.waitForSeconds(2);
         TemplateCopyMessageCancelBtn.click();
         CommonUtils.waitForSeconds(2);
      }

      // Log.info(" Alert Message After TemplateCopy Function = ", "" + getAlertMessage() + "");

   }

   public void TemplateReassignPages()
   {
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", TemplateApproveReassign);
      CommonUtils.waitForSeconds(5);

      // Actions action = new Actions(getDriver());
      // action.moveToElement(TemplateApproveReassign).moveToElement(TemplateApproveReassignToCreate).click().build().perform();

      TemplateApproveReassign.click();
      TemplateApproveReassign.click();
      if (CommonUtils.isElementDisplayed(TemplateReassignToCreate))
      {
         TemplateReassignToCreate.click();
      }

      CommonUtils.waitForSeconds(1);

   }

   public void TemplatePreviewToFollower(String followerName, String PreviewOrClose)
   {
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", TemplateMainPreview);
      CommonUtils.waitForSeconds(2);

      TemplateMainPreview.click();
      TemplateMainPreview.click();
      if (CommonUtils.isElementDisplayed(TemplatePreviewWechat))
      {
         TemplatePreviewWechat.click();
      }
      else
      {
         TemplatePreviewMobile.click();
      }

      // Actions PreviewAction = new Actions(getDriver());
      // PreviewAction.moveToElement(TemplateMainPreview).moveToElement(TemplatePreviewWechat).click().build().perform();
      CommonUtils.waitForSeconds(2);

      ValidminiAppSearchField.sendKeys(followerName);
      CommonUtils.waitForSeconds(1);
      ValidMiniAppSearchBtn.click();
      CommonUtils.waitForSeconds(1);
      Log.info(ValidMiniAppCheckBoxFollowingFollowerName.getText());
      ValidMiniAppCheckBoxBtn.click();
      CommonUtils.waitForSeconds(1);

      if (PreviewOrClose.equalsIgnoreCase("Preview"))
      {
         TemplatePreviewToFollowerOkBtn.click();
         CommonUtils.waitForSeconds(2);
      }
      else if (PreviewOrClose.equalsIgnoreCase("Close"))
      {
         TemplatePreviewTofollowerCloseBtn.click();
         CommonUtils.waitForSeconds(2);
      }

      Log.info(" Alert Message After Preview To follower Sent :: ", getAlertMessage());
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Bavithiran
    */

   public void TemplateFolderSelectingByName(String FolderToselect)
   {
      WebElement TemplateFolderSelect = getDriver().findElement(By.xpath("//span[@class=\"fdr-name\"][text()='" + FolderToselect + "']"));
      TemplateFolderSelect.click();
      CommonUtils.waitForSeconds(2);
   }

   public void SelectingDateAndTimeInTemplatePage(String MinOrHour, int UpdateMinFeat)
   {
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", TemplateSchCancelBtn);

      // TemplateSchCancelBtn.click();

      int UpdateTime = UpdateMinFeat;

      // For calculating current Time
      String CurrentYearMonthDate = CommonUtils.getCurrentDateAsUniqueString();
      System.out.println(CurrentYearMonthDate);
      int CurrentHour = Integer.parseInt(CommonUtils.getCurrentHourASUniqueString());
      int CurrentMin = Integer.parseInt(CommonUtils.getCurrentMinutesAsUniqueString());

      // String TemplateBeforeselectAmOrPm = TemplateCalenderAMorPmGetText.getText();
      // .info(TemplateBeforeselectAmOrPm);

      if (MinOrHour.equalsIgnoreCase("Min"))
      {
         templateScheduleMethodForMin(UpdateTime, CurrentYearMonthDate);
      }
      else if (MinOrHour.equalsIgnoreCase("Hour"))
      {
         templateScheduleMethodByHour(UpdateTime, CurrentYearMonthDate);
         // System.out.println(Integer.compare(IntCurrentTemplateBeforeSelectHourUpdate,IntCurrentTemplateAfterSelectHour));
      }
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Bavithiran
    */
   private void templateScheduleMethodForMin(int UpdateTime, String CurrentYearMonthDate)
   {
      WebElement SelectCalenderdate = getDriver()
         .findElement(By.xpath("//td[contains(@class,\"fc-day-top\")][@data-date='" + CurrentYearMonthDate + "']//span"));

      SelectCalenderdate.click();

      String CurrentTemplateBeforeSelectHour = TemplateCalenderHourGetText.getText();
      int IntCurrentTemplateBeforeSelectHour = Integer.parseInt(CurrentTemplateBeforeSelectHour);
      Log.info(IntCurrentTemplateBeforeSelectHour);

      String CurrentTemplateBeforeSelectMin = TemplateCalenderMinGetText.getText();
      int IntCurrentTemplateBeforeSelectMin = Integer.parseInt(CurrentTemplateBeforeSelectMin);
      Log.info(IntCurrentTemplateBeforeSelectMin);

      IntCurrentTemplateBeforeSelectMin = IntCurrentTemplateBeforeSelectMin + UpdateTime;
      Log.info(IntCurrentTemplateBeforeSelectMin);

      CommonUtils.waitForSeconds(5);

      for (int i = 1; i <= UpdateTime; i++)
      {
         MinuteIncreamentBtn.click();
      }
      CommonUtils.waitForSeconds(2);

      hourFlowComparingBeforeToAfterTime(CurrentTemplateBeforeSelectHour, IntCurrentTemplateBeforeSelectHour, IntCurrentTemplateBeforeSelectMin);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Bavithiran
    */
   private
      void
      hourFlowComparingBeforeToAfterTime(String CurrentTemplateBeforeSelectHour, int IntCurrentTemplateBeforeSelectHour, int IntCurrentTemplateBeforeSelectMin)
   {
      Integer beforehour;
      Integer beforeMin;
      if (IntCurrentTemplateBeforeSelectMin >= 60)
      {
         beforehour = new Integer(IntCurrentTemplateBeforeSelectHour + IntCurrentTemplateBeforeSelectMin / 60);
         beforeMin = new Integer(IntCurrentTemplateBeforeSelectMin % 60);

      }
      else
      {
         beforehour = new Integer(IntCurrentTemplateBeforeSelectHour);
         beforeMin = new Integer(CurrentTemplateBeforeSelectHour);
      }

      String CurrentTemplateAfterSelectHour = TemplateCalenderHourGetText.getText();
      int IntCurrentTemplateAfterSelectHour = Integer.parseInt(CurrentTemplateAfterSelectHour);
      // System.out.println(IntTemplateBeforeSelectHour);
      Log.info(IntCurrentTemplateAfterSelectHour);
      Integer Afterhour = new Integer(IntCurrentTemplateAfterSelectHour);

      String CurrentTemplateAfterSelectMin = TemplateCalenderMinGetText.getText();
      int IntCurrentTemplateAfterSelectMin = Integer.parseInt(CurrentTemplateAfterSelectMin);
      Log.info(IntCurrentTemplateAfterSelectMin);
      Integer AfterMin = new Integer(IntCurrentTemplateAfterSelectMin);

      minComapringBeforeToAfterMinAndHour(beforehour, beforeMin, Afterhour, AfterMin);

      /**
       * Integer BeforeMinCheck = new Integer(IntCurrentTemplateBeforeSelectHour); Integer BeforeHourCheck = new Integer(CurrentTemplateBeforeSelectHour);
       * 
       * String CurrentTemplateAfterSelectHour = TemplateCalenderHourGetText.getText(); int IntCurrentTemplateAfterSelectHour =
       * Integer.parseInt(CurrentTemplateAfterSelectHour); // System.out.println(IntTemplateBeforeSelectHour); Log.info(IntCurrentTemplateAfterSelectHour);
       * Integer AfterHour = new Integer(IntCurrentTemplateAfterSelectHour);
       * 
       * String CurrentTemplateAfterSelectMin = TemplateCalenderMinGetText.getText(); int IntCurrentTemplateAfterSelectMin =
       * Integer.parseInt(CurrentTemplateAfterSelectMin); Log.info(IntCurrentTemplateAfterSelectMin); Integer AfterMin = new
       * Integer(IntCurrentTemplateAfterSelectMin);
       * 
       * minComapringBeforeToAfterMinAndHour(BeforeHourCheck, BeforeMinCheck, AfterHour, AfterMin);
       **/

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Bavithiran
    */
   private void minComapringBeforeToAfterMinAndHour(Integer beforehour, Integer beforeMin, Integer Afterhour, Integer AfterMin)
   {
      int HourCheck = beforehour.compareTo(Afterhour);

      switch (HourCheck)
      {
      case 0:
         Log.info(" Hour is modified correctly ", HourCheck);
         break;

      case 1:
         Log.info(" Hour is not modified correctly ", HourCheck);
         break;

      case -1:
         Log.info(" Hour is not modified correctly ", HourCheck);
         break;
      }

      int MinCheck = beforeMin.compareTo(AfterMin);

      switch (MinCheck)
      {
      case 0:
         Log.info(" Minute is modified correctly ", MinCheck);
         break;

      case 1:
         Log.info(" Minute is not  modified correctly ", MinCheck);
         break;

      case -1:
         Log.info(" Minute is not  modified correctly ", MinCheck);
         break;
      }
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Bavithiran
    */
   private void templateScheduleMethodByHour(int UpdateTime, String CurrentYearMonthDate)
   {
      WebElement SelectCalenderdate = getDriver()
         .findElement(By.xpath("//td[contains(@class,\"fc-day-top\")][@data-date='" + CurrentYearMonthDate + "']//span"));

      SelectCalenderdate.click();

      String CurrentTemplateBeforeSelectHour = TemplateCalenderHourGetText.getText();
      int IntCurrentTemplateBeforeSelectHour = Integer.parseInt(CurrentTemplateBeforeSelectHour);
      Log.info(IntCurrentTemplateBeforeSelectHour);

      String CurrentTemplateBeforeSelectMin = TemplateCalenderMinGetText.getText();
      int IntCurrentTemplateBeforeSelectMin = Integer.parseInt(CurrentTemplateBeforeSelectMin);
      Log.info(IntCurrentTemplateBeforeSelectMin);

      CommonUtils.waitForSeconds(5);

      int IntCurrentTemplateBeforeSelectHourUpdate = IntCurrentTemplateBeforeSelectHour + UpdateTime;
      Log.info(IntCurrentTemplateBeforeSelectHourUpdate);

      for (int i = 1; i <= UpdateTime; i++)
      {
         HourIncreamentBtn.click();
      }
      CommonUtils.waitForSeconds(2);

      String CurrentTemplateAfterSelectHour = TemplateCalenderHourGetText.getText();
      int IntCurrentTemplateAfterSelectHour = Integer.parseInt(CurrentTemplateAfterSelectHour);
      // System.out.println(IntTemplateBeforeSelectHour);
      Log.info(IntCurrentTemplateAfterSelectHour);

      String CurrentTemplateAfterSelectMin = TemplateCalenderMinGetText.getText();
      int IntCurrentTemplateAfterSelectMin = Integer.parseInt(CurrentTemplateAfterSelectMin);
      Log.info(IntCurrentTemplateAfterSelectMin);

      hourComparingBeforeToAfterTime(
         IntCurrentTemplateBeforeSelectMin,
         IntCurrentTemplateBeforeSelectHourUpdate,
         IntCurrentTemplateAfterSelectHour,
         IntCurrentTemplateAfterSelectMin);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Bavithiran
    */
   private void hourComparingBeforeToAfterTime(
      int IntCurrentTemplateBeforeSelectMin,
      int IntCurrentTemplateBeforeSelectHourUpdate,
      int IntCurrentTemplateAfterSelectHour,
      int IntCurrentTemplateAfterSelectMin)
   {
      Integer Value1 = new Integer(IntCurrentTemplateBeforeSelectHourUpdate);
      Integer Value2 = new Integer(IntCurrentTemplateAfterSelectHour);
      int check = Value1.compareTo(Value2);

      switch (check)
      {

      case 0:
         Log.info(" Template Schedule hour is Modified correctly ", check);
         break;

      case -1:
         Log.info(" Template Schedule hour is not modified correctly ", check);
         break;

      case 1:
         Log.info(" Template Schedule hour is not modified correctly ", check);
         break;

      }

      Integer ValueOne = new Integer(IntCurrentTemplateBeforeSelectMin);
      Integer ValueTwo = new Integer(IntCurrentTemplateAfterSelectMin);
      int check1 = ValueOne.compareTo(ValueTwo);

      switch (check1)
      {

      case 0:
         Log.info(" Template Schedule Min is Modified correctly ", check1);
         break;

      case -1:
         Log.info(" Template Schedule Min is not modified correctly ", check1);
         break;

      case 1:
         Log.info(" Template Schedule Min is not modified correctly ", check1);
         break;

      }
   }

   public void SelectingRescheduleDateAndTimeInTemplatePage(String MinOrHour, int UpdateMinFeat)
   {

      String RescheduleCurrentYearMonthDate = CommonUtils.getCurrentDateRescheduleAsUniqueString();

      WebElement SelectCalenderdate = getDriver().findElement(
         By.xpath(
            "//div[contains(@class,\"bootstrap-datetimepicker\")]//div//div//div//table//tbody//tr//td[@data-day='" + RescheduleCurrentYearMonthDate + "']"));
      SelectCalenderdate.click();

      String CurrentTemplateBeforeSelectHour = TemplateCalenderHourGetText.getText();
      int IntCurrentTemplateBeforeSelectHour = Integer.parseInt(CurrentTemplateBeforeSelectHour);
      Log.info(IntCurrentTemplateBeforeSelectHour);

      String CurrentTemplateBeforeSelectMin = TemplateCalenderMinGetText.getText();
      int IntCurrentTemplateBeforeSelectMin = Integer.parseInt(CurrentTemplateBeforeSelectMin);
      Log.info(IntCurrentTemplateBeforeSelectMin);

      IntCurrentTemplateBeforeSelectMin = IntCurrentTemplateBeforeSelectMin + UpdateMinFeat;
      Log.info(IntCurrentTemplateBeforeSelectMin);

      if (MinOrHour.equalsIgnoreCase("Min"))
      {
         for (int i = 1; i <= UpdateMinFeat; i++)
         {
            RescheduleTemplateMinIncreament.click();
         }

         hourFlowComparingBeforeToAfterTime(CurrentTemplateBeforeSelectHour, IntCurrentTemplateBeforeSelectHour, IntCurrentTemplateBeforeSelectMin);
      }
      else if (MinOrHour.equalsIgnoreCase("Hour"))
      {
         for (int i = 1; i <= UpdateMinFeat; i++)
         {
            RescheduleTemplateHourIncreament.click();
         }

         hourFlowComparingBeforeToAfterTime(CurrentTemplateBeforeSelectHour, IntCurrentTemplateBeforeSelectHour, IntCurrentTemplateBeforeSelectMin);
      }
   }

   public String getTemplateTitleValidationText()
   {
      waitFor(TemplateTitleValidationErrorText);
      return TemplateTitleValidationErrorText.getText();
   }

   public String getTemplateTitleMaximumcharValidationText()
   {
      waitFor(TemplateTitleMaximumcharErrorText);
      return TemplateTitleMaximumcharErrorText.getText();

   }

   public String getTemplateJumpPageRequiredValidationText()
   {
      waitFor(TemplateJumpageValidatonText);
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", TemplateJumpageValidatonText);
      return TemplateJumpageValidatonText.getText();
   }

   public String getTemplateContentValidationtext()
   {
      waitFor(TemplateContentValidationText);
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", TemplateContentValidationText);
      return TemplateContentValidationText.getText();
   }

   public int NumberTemplateDynamicField()
   {
      List<WebElement> totalTemplateFields = getDriver()
         .findElements(By.xpath("//div[@class=\"panel-body\"]//div[contains(@class,\"form-group dynamic_data\")]"));
      DynamictemplateFieldsNumber = totalTemplateFields.size();
      CommonUtils.waitForSeconds(2);
      return DynamictemplateFieldsNumber;

   }

   public String getTemplateDynamicField(int DynamicRoot)
   {
      WebElement TemplateDynmaicField = getDriver().findElement(
         By.xpath(
            "//div[@class=\"panel-body\"]//div[contains(@class,\"form-group dynamic_data\")]//input[contains(@class,\"form-control tempInput text-box single-line\")][@name=\"TemplateMessageFields["
               + DynamicRoot + "].FieldValue\"]//following-sibling::span//span"));
      CommonUtils.waitForSeconds(2);
      Log.info(" Error for the dynamic field to be Verfied  ", TemplateDynmaicField.getText(), -DynamicRoot);
      return TemplateDynmaicField.getText();

   }

   public void TemplateAlertCheck()
   {
      Alert alert = getDriver().switchTo().alert();
   }


   public WebElement getVerifyMessageInQueueTab()
   {
      return verifyMessageInQueueTab;
   }

   public WebElement getDemoCatalog()
   {
      return demoCatalog;
   }

   public List<WebElement> getTemplateMessageName()
   {
      return templateMessageName;
   }

   public List<WebElement> getTemplateScheduleTime()
   {
      return templateScheduleTime;
   }

   public void clickTemplatelogTab()
   {
       templateLog.click();
   }

   public WebElement getEnterTemplateMsg()
   {
      return enterTemplateMsg;
   }

   public WebElement getSearchBtn()
   {
      return searchBtn;
   }
   
   public void searchMsgInLogByName(String msgName) {
      enterTemplateMsg.clear();
      enterTemplateMsg.sendKeys(msgName);
      CommonUtils.waitForSeconds(2);
      searchBtn.click();  
   }

   public List<WebElement> getVerifyTemplateFields()
   {
      return verifyTemplateFields;
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
   */
   public void clickQueueTab()
   {
     templateQueue.click();
      
   }

}
