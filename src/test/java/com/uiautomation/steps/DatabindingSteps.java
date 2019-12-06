/**
 * 
 */
package com.uiautomation.steps;

import com.uiautomation.actions.DatabindingAction;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * 
 * @version $Id$
 */
public class DatabindingSteps
{

   @Steps
   DatabindingAction databindingAction;
   
   @When("^Register new user through signup process with username as \"([^\"]*)\" and mobile as \"([^\"]*)\"$")
   public void register_new_user_through_signup_process(String userName, String mobileNumber) throws Exception {
      databindingAction.navigateToSignUpPage();
      databindingAction.registerNewUser("country", mobileNumber);
      databindingAction.isFollowerSignUpSuccess();
      
   }

   @When("^Newly signup user should available on data binding page with username as \"([^\"]*)\" and mobile as \"([^\"]*)\"$")
   public void newly_signup_user_should_available_on_data_binding_page(String user, String mobile) throws Exception {
      databindingAction.searchByNameInDataBindingList(user);
      databindingAction.verifyFollowerInDataBindingList(user, mobile);
   }
   
   @When("^User search follower by name as \"([^\"]*)\"$")
   public void user_seaerch_follower_by_name_as(String arg1) throws Exception {
      databindingAction.searchByNameInDataBindingList(arg1);
   }


   @Then("^Follower should display in data binding list with username as \"([^\"]*)\" and mobile as \"([^\"]*)\"$")
   public void follower_should_display_in_data_binding_list(String user, String mobile) throws Exception {
      databindingAction.verifyFollowerInDataBindingList(user, mobile);
   }

   @When("^User deletes the follower from databinding list$")
   public void user_deletes_the_follower_from_databinding_list() throws Exception {
      databindingAction.deleteFollowerFromDataBinding();
   }

   @Then("^Follower should be deleted from list with name as \"([^\"]*)\"$")
   public void follower_should_be_deleted_from_list_with_name_as(String arg1) throws Exception {
      databindingAction.searchByNameInDataBindingList(arg1);
      databindingAction.verifyDeletedFollower();
   }

}
