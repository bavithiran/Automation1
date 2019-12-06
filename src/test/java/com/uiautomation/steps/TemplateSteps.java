/**
 * 
 */
package com.uiautomation.steps;

import java.io.IOException;

import com.uiautomation.actions.TemplateActions;
import com.uiautomation.pages.TemplatePage;
import com.uiautomation.utils.CommonUtils;
import com.uiautomation.utils.JsonUtils;
import com.wechatify.enums.Template;
import com.wechatify.models.MessageDetails;
import com.wechatify.utils.Constants;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * 
 * @version $Id$
 */
public class TemplateSteps
{

   String templateCheckBoxChoosedOption;
   String templateMessageName;
   String templateSelectedFolderName;
   String templateCreatedFolderName;

   @Steps
   TemplateActions templateActions;
   TemplatePage templatePages;

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : bavithiranpc
    */

   @When("^User Clicks on Add button in Template module for create Template$")
   public void User_clicks_on_Add_button_in_Template_module()
   {
      templateActions.clickAddTemplateBtn();
   }

   @Then("^User clicks on Pull template button$")
   public void User_clicks_on_Pull_template_button()
   {
      templateActions.pullTemplateMasteraction();
   }

   @Then("^Selecting a Random Template Master Card$")
   public void selecting_a_Random_Template_master_cards()
   {
      templateActions.selecingRandomTemplateMasterAction();
   }

   @When("^Valiation Error Should get displayed for the Template Title Field Mandatory \"([^\"]*)\"$")
   public void Validation_Error_check_for_Template_field_Field_mandatory(String TemplateMandatoryTitleError)
   {
      templateActions.VerifyTemplateTitleValidationError(TemplateMandatoryTitleError);
   }

   @When("^Maximum char Validation Error should get displayed for the Template title \"([^\"]*)\"$")
   public void Maximum_Validation_Error_should_get_displayed(String TemplateTitleMaximumValidationTitleError)
   {
      templateActions.VerifyTemplateTitleMaximumcharValidationError(TemplateTitleMaximumValidationTitleError);
   }

   @When("^Template JumpPage Validation Check \"([^\"]*)\"$")
   public void Template_JumpPage_validation_check(String TemplateJumpPageValidationError)
   {
      templateActions.VerifyTemplateJumpPageInvalidUrlValidation(TemplateJumpPageValidationError);
   }

   @Then("User Clicks on Templae CheckMiniApp Button Click")
   public void User_Clicks_on_MiniApp_button_Template()
   {
      templateActions.CheckMiniAppBtnClickAction();
   }

   @Then("^Template Content Validation Check \"([^\"]*)\"$")
   public void Template_content_Validaton_check(String TemplateContentValidationError)
   {
      templateActions.VerifyTemplateContentValidation(TemplateContentValidationError);
   }

   @Then("^Verify Template dynamic field Mandatory validation check \"([^\"]*)\"$")
   public void Veriyf_Template_dynamic_field_Mandatory_calidation_check(String DynmaicTemplateFieldTitleMandatoryErrorMsg)
   {
      templateActions.VerifyTemplateDynamicFieldValidationErrorMandatory(DynmaicTemplateFieldTitleMandatoryErrorMsg);
   }

   @Then("^Verifing the Template MiniApp Name Validatoin Text \"([^\"]*)\"$")
   public void Verify_Template_MiniApp_Name_Validation_Text(String TemplateMiniAppNameValidationError)
   {
      templateActions.VerifyTemplateMiniAppNameValidationError(TemplateMiniAppNameValidationError);
   }

   @Then("^Verify Template MiniApp PagePath Validation Text \"([^\"]*)\"$")
   public void Verify_Template_MiniApp_PagePath_Validation_Text(String TemplateMiniAppPagePathValidationError)
   {
      templateActions.VerifyTemplateMiniAppPagePathValidationError(TemplateMiniAppPagePathValidationError);;
   }

   @Then("^Verify Template Miniapp AppId Validation Text \"([^\"]*)\"$")
   public void Verify_Template_MiniApp_PagePath_validation_Text(String TemplateMiniAppAppIdValidationError)
   {
      templateActions.VerifyTemplateMiniAppAppIdtValidationError(TemplateMiniAppAppIdValidationError);
   }

   @When("^User Clicks on BackToList or Select in Review Form of Template Master \"([^\"]*)\"$")
   public void User_Clicks_on_BacktoList_or_select_in_ReviewForm(String TemplateReviewFormOption)
   {
      templateActions.ReviewFormOptionSelectingAction(TemplateReviewFormOption);
   }

   @Then("^User Enter Template Message Name \"([^\"]*)\" and \"([^\"]*)\"$")
   public void User_Enter_Template_Message_Name(String MessageName, String ClearOrSend)
   {
      MessageName = MessageName + CommonUtils.getDateAsUniqueString();

      templateActions.TemplateMessageAction(MessageName, ClearOrSend);
      templateMessageName = MessageName;

   }

   @Then("^User Enters data in the available Template Fields$")
   public void User_enters_data_in_the_available_Template_fields()
   {
      templateActions.TemplateFieldAction();
   }

   @When("^User selects JumpPage or Content or MiniApp or NoTypes \"([^\"]*)\"$")
   public void User_selects_jumpPage_or_Content_Or_MiniApp(String TemplateCheckBoxopt)
   {

      templateActions.selectingTemplatecheckboxAction(TemplateCheckBoxopt);

      templateCheckBoxChoosedOption = TemplateCheckBoxopt;
   }

   @Then("^Entering the create form details in the Template jumpExtLinkData \"([^\"]*)\" and ContentDesFieldData \"([^\"]*)\" and ImageName \"([^\"]*)\" and TemplateVideoUrl \"([^\"]*)\" and TemplateStaticQr \"([^\"]*)\" and MiniappNameData \"([^\"]*)\" and MiniappPagePathData \"([^\"]*)\" and MiniAppidData \"([^\"]*)\" and VideoOk/Close \"([^\"]*)\"$")
   public void Entering_the_create_form_details_in_the_Template(
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
      templateActions.EnteringDataInfoTemplate(
         templateCheckBoxChoosedOption,
         jumpExtLinkData,
         ContentDesFieldData,
         ImageName,
         TemplateVideoUrl,
         TemplateStaticQr,
         MiniappNameData,
         MiniappPagePathData,
         MiniAppidData,
         OkOrClose);
   }

   @Then("^User Clicks On TemplateActivity OnOrOff$")
   public void User_clicks_On_TemplateActivity_OnOrOff()
   {
      templateActions.TemplateActivityOnOffAction();
   }

   @When("^User Clicks on Create Or BackToList as \"([^\"]*)\"$")
   public void User_Clicks_on_Create_Or_BackToList(String Option)
   {
      templateActions.TemplateCreateOrBackAction(Option);
   }

   @When("^User Checks the MiniApp is Valid or not and Send the Preview to follower to \"([^\"]*)\" and \"([^\"]*)\"$")
   public void User_Checks_the_ValidMiniApp(String Followername, String PreviewOrClose)
   {
      templateActions.ValidMiniProgramAction(Followername, PreviewOrClose);
   }

   @Then("^Get Text of the WebPage with sheetName as \"([^\"]*)\" and ExcelName as \"([^\"]*)\" and Land as \"([^\"]*)\"$")
   public void get_all_the_text_from_ModulePage(String SheetName, String ExcelName, String Lang) throws IOException
   {
      // TemplatePages.getTextContains(SheetName, ExcelName, Lang);
   }

   @Then("^When User Clicks On Preview or Close btn MiniApp as \"([^\"]*)\"$")
   public void When_user_Clicks_Preview_or_Close_In_MiniApp(String PreviewOrClose)
   {
      templateActions.MiniAppPreviewOrCloseBtnAction(PreviewOrClose);
   }

   @When("^User clicks Template \"([^\"]*)\" button$")
   public void user_Clicks_Template_AddNewFolder_button(String AddNewFolder) throws Exception
   {

      // SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
      // SimpleDateFormat yearmonthdate = new SimpleDateFormat("yyyy-MM-dd");
      // SimpleDateFormat hour = new SimpleDateFormat("hh");
      // SimpleDateFormat Min = new SimpleDateFormat("mm");
      // Date custDate = new Date();
      // System.out.println(sdf.format(custDate));
      // String Date123 = sdf.format(custDate);
      // System.out.println(yearmonthdate.format(custDate));
      // System.out.println(hour.format(custDate));
      // System.out.println(Min.format(custDate));

      // int Minup = Integer.parseInt(Min.format(custDate));

      // int updateMin = Fiveminso + Fivemins ;
      // System.out.println(updateMin);
      templateActions.clickTemplateAddNewFolder(AddNewFolder);
   }

   @When("^Enter Folder Template name \"([^\"]*)\" and \"([^\"]*)\"$") // Entering folder Name
   public void Enter_Folder_Template_name(String FolderName, String Date) throws Exception
   {
      if (Date.equalsIgnoreCase("date"))
      {
         FolderName = FolderName + CommonUtils.getDateAsUniqueString();
         templateActions.EnterTemplateFolderName(FolderName);
         templateCreatedFolderName = FolderName;
      }
      else if (Date.equalsIgnoreCase("Withoutdate"))
      {
         templateActions.EnterTemplateFolderName(FolderName);
         // CreatedFolderName = FolderName;
      }
   }

   @Then("^User Click on Template Submit in Folder Option$") // Folder Submit button
   public void User_Clicks_on_Template_submit() throws Exception
   {
      templateActions.clickTemplatefolderSubmit();
   }

   @Then("^Check the Template Folder and TemplateCard REassign Icon$")
   public void Check_the_Template_folder_and_TemplateCard_Reassign_Icon() throws Exception
   {
      templateActions.CheckingTemplateReassignInFolderAndTemplateNameAction(templateSelectedFolderName, templateMessageName);
   }

   @When("^User select Folder name for Template from dropdown as \"([^\"]*)\" and \"([^\"]*)\"$") // folder selection while creating
   public void user_select_Folder_name_for_Template_from_dropdown(String selectFolderName, String CreateOrSelect) throws Exception
   {
      if (CreateOrSelect.equalsIgnoreCase("Select"))
      {
         templateActions.selectTemplateFolderVByNamendVerifyNavigation(selectFolderName);
         templateSelectedFolderName = selectFolderName;
      }
      else if (CreateOrSelect.equalsIgnoreCase("Create"))
      {
         templateActions.selectTemplateFolderVByNamendVerifyNavigation(templateCreatedFolderName);
      }
   }

   @When("^User selects Group name From the dropdown Template \"([^\"]*)\"$")
   public void User_selects_group_name_From_the_Dropdown_Template(String GroupName) throws Exception
   {
      templateActions.selectTemplateGroupFromFolderAction(GroupName);
   }

   @When("^User clicks on CopyMessage as YesOrNo \"([^\"]*)\" with Ok Or Cancel \"([^\"]*)\"$")
   public void User_Clicks_On_CopyMessage(String YesOrNo, String CopyOkOrCancel) throws Exception
   {
      templateActions.copyMessageTemplate(YesOrNo, CopyOkOrCancel);
   }

   @Then("^User selects Tag From the dropdown \"([^\"]*)\"$")
   public void User_selects_tag_from_The_Dropdown(String TagName) throws Exception
   {
      templateActions.selectTemplateTagFromFolderAction(TagName);
   }

   @Then("^User Selects Template folder By NAme \"([^\"]*)\"$")
   public void User_Selects_Template_folder_By_Name(String FolderToselect)
   {
      templateActions.TemplateSelectingfolderByNameAction(FolderToselect);
   }

   @Then("^User Clicks On Edit or View or Cancel or Delete or ReSchedule as \"([^\"]*)\" In the TemplateCard$")
   public void User_Clicks_on_edit_or_View_or_delete_in_the_TemplateCard(String EditOrViewOrCancel) throws Exception
   {
      templateActions.EditTemplateAction(templateMessageName, EditOrViewOrCancel);
   }

   @Then("^User Changes Reschedule  Min and Hour \"([^\"]*)\" and \"([^\"]*)\"$")
   public void User_changes_reschedule_Min_And_hour(String MinOrHour, int UpdateMinFeat) throws Exception
   {
      templateActions.SelectingREscheduleTimeAction(MinOrHour, UpdateMinFeat);
   }

   @Then("^User Clicks on Option of Reschecule Calender such as Notify to user or Reschedule or Cancel as \"([^\"]*)\"$")
   public void User_Clicks_on_Options_in_the_RescheduleCalender(String Options) throws Exception
   {
      templateActions.TemplateRescheduleOptActions(Options);
   }

   @Then("^User Clicks on Save or SaveAndClose \"([^\"]*)\"$")
   public void User_Cliks_on_save_or_SaveAndClose(String SaveOrSaveAndClose) throws Exception
   {
      templateActions.TemplateSaveOrSaveAndClose(SaveOrSaveAndClose);
   }

   @When("^User Clicks on Transfer Icon Schedule or SendForApproval or Approve \"([^\"]*)\"$")
   public void User_Clicks_on_Transfer_Icon(String TransferBtn) throws Exception
   {
      templateActions.TemplateTransferBtnAction(TransferBtn);
   }

   @Then("^User Selects Date and Time as Min or Hour \"([^\"]*)\" and upadtetime as \"([^\"]*)\"$")
   public void User_selects_date_and_time(String MinOrHour, int UpdateMinFeat) throws Exception
   {
      templateActions.SelectingDateAndTimeInTemplateAction(MinOrHour, UpdateMinFeat);
   }

   @Then("^The Template Create Page should be in Active state$")
   public void The_Template_Create_Page_should_br_in_Active_state() throws Exception
   {
      templateActions.verifyIsTemplateSubTabActive(Template.TemplateSub.CREATE.toString());
      templateActions.verifyTemplateCreativeInnerPage(Template.TemplateInnerPageHeaderText.CREATE.toString());
      // creativeActions.verifyCreatedRichMediaCreativeInPage(Creatives.CreaiveInnerPageHeaderText.TRANSLATIONREVIEW.toString(), creativeName, "Default");
   }

   @Then("^The Template Schedule Page should be in Active state$")
   public void The_Template_Schedule_Page_should_be_in_Active_state() throws Exception
   {
      templateActions.verifyIsTemplateSubTabActive(Template.TemplateSub.SCHEDULE.toString());
      // TemplateActions.verifyTemplateCreativeInnerPage(Template.TemplateInnerPageHeaderText.SCHEDULE.toString());
   }

   @Then("^The Template Approve Page should be in Active state$")
   public void The_Template_Approve_Page_should_be_in_Active_state() throws Exception
   {
      templateActions.verifyIsTemplateSubTabActive(Template.TemplateSub.APPROVE.toString());
      // TemplateActions.verifyTemplateCreativeInnerPage(Template.TemplateInnerPageHeaderText.APPROVE.toString());
   }

   @Then("^The Template Queue Page should be in Active state$")
   public void The_Template_Queue_Page_should_be_in_Active_State() throws Exception
   {
      templateActions.verifyIsTemplateSubTabActive(Template.TemplateSub.QUEUE.toString());
      // TemplateActions.verifyTemplateCreativeInnerPage(Template.TemplateInnerPageHeaderText.QUEUE.toString());
   }

   @Then("^User Clicks On Ok or Cancel Btn \"([^\"]*)\"$")
   public void User_clicks_On_Ok_Or_Cancel_Btn(String CancelOrOk) throws Exception
   {
      templateActions.CardCancelOrOkTemplateAction(CancelOrOk);
   }

   @When("^User Clicks on Reassign and Reassign to Create Flow$")
   public void User_Clicks_On_Reassign_and_Reassign_to_Create_Flow() throws Exception
   {
      templateActions.TemplateReassignAction();
   }

   @When("^User Clicks on Preview To follower for FollowerName as \"([^\"]*)\" and option as \"([^\"]*)\"$")
   public void User_Clicks_on_PreviewToFollower(String followerName, String PreviewOrClose) throws Exception
   {
      templateActions.TemplatePreviewTofollowerAction(followerName, PreviewOrClose);
   }

   @Then("^User Clicks Ok or Cancel Btn in Template Card Delete Opt \"([^\"]*)\"$")
   public void User_Cliks_ok_or_Cancel_Btn_in_Template_Card_delete_OPt(String TemplateOkOrCancel) throws Exception
   {
      templateActions.TemplateDeleteCancelOrOkBtnAction(TemplateOkOrCancel);
   }

   @Then("^User Clicks on SubTabs of Create Or Schedule Or Approve Or Queue Or Log Or SFMC Log as \"([^\"]*)\"$")
   public void User_Clicks_on_TemplateSubTabs_clicks(String TemplateSubTabs) throws Exception
   {
      templateActions.TemplatSubTabClickAction(TemplateSubTabs);
   }

   @When("^User select Queue tab of template message$")
   public void user_select_Queue_tab_of_template_message() throws Exception {
      templateActions.clickTemplateQueueTab();
   }

   @Then("^Queue tab should not have message that delivered to user$")
   public void queue_tab_should_not_have_message_that_delivered_to_user() throws Exception {
      templateActions.verifyQueuetabForDelivered();
   }

   @When("^User select Logs tab of template message$")
   public void user_select_Logs_tab_of_template_message() throws Exception {
      templateActions.clickTemplateLogTab();
   }

   @Then("^Message should present in log tab of template that is delevered to user$")
   public void message_should_present_in_log_tab_of_template_that_is_delevered_to_user() throws Exception {
      templateActions.verifyLogtabForDelivered();
   }
   
   @Then("^I Save the template message details as  \"([^\"]*)\"$")
   public void i_Save_the_template_message_details_as(String fileName) throws Exception {
      MessageDetails msgDetail = JsonUtils.readDataFromJSON(System.getProperty("user.dir")+ Constants.TEMPLATE_MESSAGE_FILE);
      System.out.println(msgDetail);
      msgDetail.setMsgName(templateMessageName);
      msgDetail.setMsgDetails(templateMessageName);
      msgDetail.setScheduleTime(CommonUtils.getCurrentDateInUIDateFormat());
      templateActions.saveTemplateMessageDetailsToJosn(fileName, msgDetail);
   }
   
   @When("^I read the message detail from file name as \"([^\"]*)\"$")
   public void i_read_the_message_detail_from_file_name_as(String fileName) throws Exception {
      templateActions.readMessageDetails(fileName);
   }
   
   @Then("^Message should also delivered to end user for template with file \"([^\"]*)\"$")
   public void message_should_also_delivered_to_end_user_for_template_with_file(String fileName) throws Exception {
      templateActions.verifyDelivredMessageToUser(fileName);
   }
}
