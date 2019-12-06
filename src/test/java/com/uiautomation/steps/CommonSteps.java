
package com.uiautomation.steps;

import com.uiautomation.actions.RichMediaCreativeActions;
import com.uiautomation.actions.TextCreativePageActions;
import com.uiautomation.pages.CommonPage;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * 
 * @version $Id$
 */
public class CommonSteps extends CommonPage
{

   @Steps
   RichMediaCreativeActions richMediaCreativesActions;
   CommonPage CommonPage;
   
   @Steps
   TextCreativePageActions textPageActions;
   
   @When("^User selects the respective module \"([^\"]*)\"$")
   public void User_selects_the_respective_module(String ModuleName) throws Exception
   {
      UserSelectsModule(ModuleName);
   }

   @When("^User Clicks on preview button$")
   public void user_Clicks_on_button_preview() throws Exception
   {
      richMediaCreativesActions.clickPreviewButton();
   }

   @When("^User click on mediatype subtab \"([^\"]*)\"$")
   public void User_click_on_mediatype_subtab(String MediaType) throws Exception
   {
      richMediaCreativesActions.selectingSubMediaTypeAction(MediaType);
   }
   
   @When("^User Clicks on \"([^\"]*)\" button$")
   public void user_Clicks_on_button(String buttonText) throws Exception {
      richMediaCreativesActions.clickSaveNavigationByButtonText(buttonText);
      
   }
   
   @When("^User selects Module By ModuleName \"([^\"]*)\"$")
   public void User_selects_moduleBy_Modulename(String ModuleName) throws Exception
   {
      
      CommonPage.UserSelectsModuleByName(ModuleName);
   }
   
   @When("^User clicks on Notify to User$")
   public void Notify_to_User() throws Exception
   {
      textPageActions.notifyToUSer();
   }
   
   @When("^User chooses a user for email notification \"([^\"]*)\"$")
   public void User_chooses_a_user_for_email_notification(String emailid) throws Exception
   {
      textPageActions.selectUserstoNotify(emailid);
   }
}
