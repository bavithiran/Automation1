/**
 * 
 */
package com.uiautomation.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

import java.util.List;

import com.uiautomation.pages.TemplatePage;
import com.uiautomation.utils.CommonUtils;
import com.uiautomation.utils.JsonUtils;
import com.wechat.appium.WeChatUtils;
import com.wechatify.models.MessageDetails;
import com.wechatify.utils.Constants;

import jline.internal.Log;
import net.thucydides.core.annotations.Step;

/**
 * 
 * @version $Id$
 */
public class TemplateActions
{

   TemplatePage templatePages;

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : bavithiranpc
    */

   @Step
   public void clickAddTemplateBtn()
   {
      templatePages.ClickAddTemplateBtnPage();
   }

   @Step
   public void TemplatSubTabClickAction(String TemplateSubTabs)
   {
      templatePages.TemplateBroadcastSubTabs(TemplateSubTabs);
   }

   @Step
   public void pullTemplateMasteraction()
   {
      templatePages.ClickPullTemplatePage();
   }

   @Step
   public void TemplateMessageAction(String MessageName, String ClearOrSend)
   {
      templatePages.TemplateMessagePage(MessageName, ClearOrSend);
   }

   @Step
   public void selecingRandomTemplateMasterAction()
   {
      templatePages.selectingRandomMasterTemplatePage();
   }

   @Step
   public void VerifyTemplateTitleValidationError(String TemplateMandatoryTitleError)
   {
      assertThat("Verify Template Title Validation", templatePages.getTemplateTitleValidationText(), equalTo(TemplateMandatoryTitleError));
   }

   @Step
   public void VerifyTemplateTitleMaximumcharValidationError(String TemplateTitleMaximumValidationTitleError)
   {
      assertThat(
         "Verify Template Maximum char validation",
         templatePages.getTemplateTitleMaximumcharValidationText(),
         equalTo(TemplateTitleMaximumValidationTitleError));
   }

   @Step
   public void VerifyTemplateMiniAppNameValidationError(String TemplateMiniAppNameValidationError)
   {
      assertThat(
         "Verify TemplateMiniApp Name or PagePath or AppId Validation",
         templatePages.getTemplateMiniAppNAmeFieldValidationText(),
         equalTo(TemplateMiniAppNameValidationError));
   }

   @Step
   public void VerifyTemplateMiniAppPagePathValidationError(String TemplateMiniAppPagePathValidationError)
   {
      assertThat(
         "Verify TemplateMiniApp Name or PagePath or AppId Validation",
         templatePages.getTemplateMiniAppPagePathValidationText(),
         equalTo(TemplateMiniAppPagePathValidationError));
   }

   @Step
   public void VerifyTemplateMiniAppAppIdtValidationError(String TemplateMiniAppAppIdValidationError)
   {
      assertThat(
         "Verify TemplateMiniApp Name or PagePath or AppId Validation",
         templatePages.getTemplateMiniAppAppIdValidationText(),
         equalTo(TemplateMiniAppAppIdValidationError));
   }

   @Step
   public void CheckMiniAppBtnClickAction()
   {
      templatePages.CheckMiniAppBtnClick();
   }

   @Step
   public void VerifyTemplateJumpPageInvalidUrlValidation(String TemplateJumpPageValidationError)
   {
      assertThat(
         "Verify TemplateJumpPage InvalidUrl Validation",
         templatePages.getTemplateJumpPageRequiredValidationText(),
         equalTo(TemplateJumpPageValidationError));
   }

   @Step
   public void VerifyTemplateContentValidation(String TemplateContentValidationError)
   {
      assertThat("verify Template Content Validation", templatePages.getTemplateContentValidationtext(), equalTo(TemplateContentValidationError));
   }

   @Step
   public void VerifyTemplateDynamicFieldValidationErrorMandatory(String DynmaicTemplateFieldTitleMandatoryErrorMsg)
   {
      int dynamicFieldCount = templatePages.NumberTemplateDynamicField();

      for (int DynamicRoot = 0; DynamicRoot < dynamicFieldCount; DynamicRoot++)
      {

         assertThat(
            "Verify the Template dyanamic Fields",
            templatePages.getTemplateDynamicField(DynamicRoot),
            equalTo(DynmaicTemplateFieldTitleMandatoryErrorMsg));

         Log.info(" Dynamic Template Fields Count check in Template Action File and ErrorMsg Given ", DynamicRoot, DynmaicTemplateFieldTitleMandatoryErrorMsg);

      }
   }

   @Step
   public void ReviewFormOptionSelectingAction(String TemplateReviewFormOption)
   {
      templatePages.TemplateReviewFormOptionPage(TemplateReviewFormOption);
   }

   @Step
   public void selectingTemplatecheckboxAction(String TemplateCheckBox)
   {
      templatePages.selectingTemplatecheckboxPages(TemplateCheckBox);
   }

   @Step
   public void EnteringDataInfoTemplate(
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
      templatePages.EnteringInfoInTemplatePage(
         TemplateCheckBoxChoosedOption,
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

   @Step
   public void TemplateFieldAction()
   {
      templatePages.TemplateFieldDataPage();
   }

   @Step
   public void TemplateActivityOnOffAction()
   {
      templatePages.TemplateActivitySwitchBtn();
   }

   @Step
   public void TemplateCreateOrBackAction(String Option)
   {
      templatePages.TemplateCreateOrBackTolist(Option);
   }

   @Step
   public void ValidMiniProgramAction(String Followername, String PreviewOrClose)
   {
      templatePages.ValidMiniappPrograncheck(Followername, PreviewOrClose);
   }

   @Step
   public void MiniAppPreviewOrCloseBtnAction(String PreviewOrClose)
   {
      templatePages.ValidMiniAppPreviewBtnOrClose(PreviewOrClose);
   }

   @Step
   public void clickTemplateAddNewFolder(String AddNewFolder)
   {
      templatePages.ClickTemplateCreatedFolderAction(AddNewFolder);
   }

   @Step // Enter Folder name
   public void EnterTemplateFolderName(String FolderName)
   {
      templatePages.EnterTemplateFolderNamePage(FolderName);
   }

   public void clickTemplatefolderSubmit()
   {
      templatePages.clickTemplateFolderSubmitPages();
   }

   @Step // folder selection
   public void selectTemplateFolderVByNamendVerifyNavigation(String selectFolderName)
   {
      templatePages.selectTemplateFolderByName(selectFolderName);
      CommonUtils.waitForSeconds(1);

   }

   @Step
   public void CheckingTemplateReassignInFolderAndTemplateNameAction(String TemplateSelectedFolderName, String TemplateMessageName)
   {
      templatePages.TemplateReassignCheckWithTemplateNameCard(TemplateSelectedFolderName, TemplateMessageName);
   }

   @Step
   public void copyMessageTemplate(String YesOrNo, String CopyOkOrCancel)
   {
      if (YesOrNo.equalsIgnoreCase("Yes"))
      {
         templatePages.TemplateCopyMessageOkorCancel(CopyOkOrCancel);
      }
      else if (YesOrNo.equalsIgnoreCase("NO"))
      {
         templatePages.TemplateCopyMessageClick();
      }

   }

   @Step
   public void selectTemplateGroupFromFolderAction(String GroupName)
   {
      templatePages.selectTemplateGroupFromFolder(GroupName);
   }

   @Step
   public void TemplateSelectingfolderByNameAction(String FolderToselect)
   {
      templatePages.TemplateFolderSelectingByName(FolderToselect);
   }

   @Step
   public void selectTemplateTagFromFolderAction(String TagName)
   {
      templatePages.selectTemplateTagFromFolder(TagName);
   }

   @Step
   public void EditTemplateAction(String TemplateMessageName, String EditOrViewOrCancel)
   {
      templatePages.TemplateEditFunc(TemplateMessageName, EditOrViewOrCancel);
   }

   @Step
   public void SelectingREscheduleTimeAction(String MinOrHour, int UpdateMinFeat)
   {
      templatePages.SelectingRescheduleDateAndTimeInTemplatePage(MinOrHour, UpdateMinFeat);
   }

   @Step
   public void TemplateRescheduleOptActions(String Options)
   {
      templatePages.TemplateRescheduleOpt(Options);
   }

   @Step
   public void TemplateSaveOrSaveAndClose(String SaveOrSaveAndClose)
   {
      templatePages.TemplateSaveOrSaveAndClose(SaveOrSaveAndClose);
   }

   @Step
   public void TemplateTransferBtnAction(String TransferBtn)
   {
      templatePages.TemplateTransferBtnPage(TransferBtn);
   }

   @Step
   public void verifyIsTemplateSubTabActive(String subTemplateTabName)
   {
      assertThat("Verify navigation to subTemplateTabName:" + subTemplateTabName, templatePages.isTemplateSubTabActive(subTemplateTabName), equalTo(true));

   }

   @Step
   public void verifyTemplateCreativeInnerPage(String TemplatepageHeader)
   {

      assertThat("Verify Template page header:", templatePages.getTemplatesubContentInnerPageHeader(), is(equalTo(TemplatepageHeader)));
      CommonUtils.waitForSeconds(5);

   }

   @Step
   public void SelectingDateAndTimeInTemplateAction(String MinOrHour, int UpdateMinFeat)
   {
      templatePages.SelectingDateAndTimeInTemplatePage(MinOrHour, UpdateMinFeat);
   }

   @Step
   public void CardCancelOrOkTemplateAction(String CancelOrOk)
   {
      templatePages.CardCancelTemplateOkOrClose(CancelOrOk);
   }

   @Step
   public void TemplateReassignAction()
   {
      templatePages.TemplateReassignPages();
   }

   @Step
   public void TemplatePreviewTofollowerAction(String followerName, String PreviewOrClose)
   {
      templatePages.TemplatePreviewToFollower(followerName, PreviewOrClose);
   }

   @Step
   public void TemplateDeleteCancelOrOkBtnAction(String TemplateOkOrCancel)
   {
      templatePages.TemplateDeleteOkOrCancelBtn(TemplateOkOrCancel);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   public void clickTemplateLogTab()
   {
      templatePages.clickTemplatelogTab();
   }

   MessageDetails msgDetails;

   @Step
   public void readMessageDetails(String fileName)
   {
      msgDetails = JsonUtils.readDataFromJSON(Constants.TEST_DATA_PATH + fileName);

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifyQueuetabForDelivered()
   {
      String emptyTemplateMessage = templatePages.getVerifyMessageInQueueTab().getText();

      if (templatePages.getVerifyMessageInQueueTab().isDisplayed())
      {
         System.out.println("No Message available");
         assertThat("No Message Available", emptyTemplateMessage.contains("No messages available"));

      }
      else
      {
         System.out.println("Template Message are available");
         // assertThat("Verify Message in QueueTab:", TemplatePages.getTemplatesubContentInnerPageHeader(), is(equalTo(msgDetails.getMsgName())));
      }
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifyLogtabForDelivered()
   {
      templatePages.searchMsgInLogByName(msgDetails.getMsgName());
      CommonUtils.waitForSeconds(5);
      assertThat("Verify Message Name", templatePages.getVerifyTemplateFields().get(0).getText().equals(msgDetails.getMsgName()));
      assertThat("Verify Message Total count ", templatePages.getVerifyTemplateFields().get(1).getText().equals(msgDetails.getRemarkCountOne()));
      assertThat("Verify Message success count ", templatePages.getVerifyTemplateFields().get(2).getText().equals(msgDetails.getRemarkCountOne()));
            
      assertThat("VerifyLogDate", (int)(CommonUtils.getDifferenceBetweenTwoDates(templatePages.getVerifyTemplateFields().get(3).getText(), msgDetails.getScheduleTime())) ,greaterThan(0));

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void clickTemplateQueueTab()
   {
      templatePages.clickQueueTab();

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void saveTemplateMessageDetailsToJosn(String fileName, MessageDetails msgDetails)
   {
      Log.info("Saving Msg detail to file:" + Constants.TEST_DATA_PATH + fileName);
      JsonUtils.writeDataToJson(msgDetails, Constants.TEST_DATA_PATH + fileName);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */

   @Step
   public void verifyDelivredMessageToUser(String fileName)
   {
      MessageDetails msgDetails = JsonUtils.readDataFromJSON(Constants.TEST_DATA_PATH + fileName);
      WeChatUtils.getDriver();
      try
      {
         List<String> messages = WeChatUtils.readMessageByChatName("India", "9978077098", "Singh2000#", "chatly");
         System.out.println("Total Count::" +messages.size());

         messages.forEach(m -> System.out.println("Messages::"+m));
         
         boolean match=false;
         for (String s : messages) {
            if(s.contains(msgDetails.getMsgDetails())){
                match = true;
                break;
            }
         }
        System.out.println(match);
        
         assertThat(match, equalTo(true));
      }
      catch (Exception e)
      {

      }
   }
}
