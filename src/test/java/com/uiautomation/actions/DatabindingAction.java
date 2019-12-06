/**
 * 
 */
package com.uiautomation.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import com.uiautomation.pages.DatabindingPage;
import com.uiautomation.utils.CommonUtils;

import net.thucydides.core.annotations.Step;

public class DatabindingAction
{

   DatabindingPage dataBindingPage;

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */

   @Step
   public void navigateToSignUpPage()
   {
      dataBindingPage.navigateToUrl("obrb9smNvkZIrBQJLu-yUpvEYGy4");

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */

   @Step
   public void registerNewUser(String string, String string2)
   {
      dataBindingPage.signupForFollower("India (भारत)", "9978077098");

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */

   @Step
   public void isFollowerSignUpSuccess()
   {
      try
      {
         assertThat("Signup Success page text", dataBindingPage.getSigUpThankYouMessageText(), is(equalTo(true)));
         dataBindingPage.switchToParentWindow();
      }
      catch (Exception e)
      {
         dataBindingPage.switchToParentWindow();
      }

   }

   @Step
   public void searchByNameInDataBindingList(String name)
   {
      dataBindingPage.searchByNameinDataBindingList(name);

   }
   
   @Step
   public void deleteFollowerFromDataBinding()
   {
      dataBindingPage.deleteUserFromDataBinding();
      CommonUtils.waitForSeconds(3);

   }
   
   @Step
   public void verifyFollowerInDataBindingList(String name, String mobile)
   {
      assertThat("Verify Username", dataBindingPage.getUserNameFromDataBindingList().toLowerCase(), is(equalTo(name.toLowerCase())));
      assertThat("Verify Mobile", dataBindingPage.getUserMobileFromDataBindingList(), is(equalTo(mobile)));

   }
   
   @Step
   public void verifyDeletedFollower()
   {
      assertThat("Signup Success page text", dataBindingPage.getUserNameFromDataBindingList().toLowerCase(), is(equalTo("")));

   }

}
