package com.uiautomation.steps;

import java.util.List;

import com.uiautomation.actions.FollowerManagementActions;
import com.uiautomation.pages.CommonPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Create for Follower management flow
 * 
 * @version $Id$
 */
public class FollowerManagementSteps extends CommonPage {
   
   @Steps
   FollowerManagementActions followerManagementActions;
   
   
   @When("^User clicks on follower and group management$")
   public void user_clicks_on_follower_and_group_management() throws Exception {
      followerManagementActions.clickFollowerMenu();
   }

   @Then("^User should navigate to follower and group management$")
   public void user_should_navigate_to_follower_and_group_management() throws Exception {
      followerManagementActions.verifyFollowerNavigation();
   }

   @Then("^Follower and Management page should have following sections$")
   public void follower_and_Management_page_should_have_following_sections(List<String> followerMgmtTopMenuOptions) throws Exception {
      followerManagementActions.verifyTopMenuOptions(followerMgmtTopMenuOptions);
   }

   @Then("^Follower and Management page should have following tabs$")
   public void follower_and_Management_page_should_have_following_tabs(List<String> followerMgmtTabOptions) throws Exception {
      followerManagementActions.verifyTabOptions(followerMgmtTabOptions);
   }

   @When("^User clicks Group Management tab$")
   public void user_clicks_Group_Management_tab() throws Exception {
      followerManagementActions.clickGroupManagement();
      followerManagementActions.verifyIsGroupManagement();
   }

   @Then("^User should see \\\"([^\\\"]*)\\\" group management$")
   public void user_should_see_group_management(final String groupMgmt) throws Exception {
      followerManagementActions.verifyGroupManagement(groupMgmt);
   }
   
   @Then("^User should click add group button$")
   public void user_should_click_add_group_button() throws Exception {
      followerManagementActions.clickAddGroupBtn();
   }

   @Then("^User should see Add group popup page$")
   public void user_should_see_Add_group_popup_page() throws Exception {
      followerManagementActions.verifyAddGroupPage();
   }
   
   @Then("^User should enter the groupname \\\"([^\\\"]*)\\\" and click save button$")
   public void user_should_enter_the_groupname_and_click_save_button(String groupname) throws Exception {
      followerManagementActions.addGroupDetails(groupname);
      followerManagementActions.clickSaveButton();
   }

   @Then("^User should enter the groupname \\\"([^\\\"]*)\\\"$")
   public void user_should_enter_the_groupname(String groupname) throws Exception {
      followerManagementActions.addGroupDetails(groupname);
   }
   
   @Then("^User clicks cancel button on add group page$")
   public void user_click_cancel_button_add_group_page() throws Exception {
      followerManagementActions.clickCancelButtonAddGroup();
   }

   @Then("^User should verify the details \\\"([^\\\"]*)\\\"$")
   public void user_should_verify_the_details(final String groupMgmt) throws Exception {
      followerManagementActions.verifyGroupUserData(groupMgmt);
   }
   
   @Then("^User click close button$")
   public void user_click_close_button() throws Exception {
      followerManagementActions.clickCloseButton();
   }
   
   @Then("^User should verify lande page \\\"([^\\\"]*)\\\"$")
   public void user_should_verify_old_page(final String groupMgmt) throws Exception {
      followerManagementActions.verifyOldFollowerPage(groupMgmt);
   }
   
   @Then("^User should enter the global groupname created$")
   public void user_enter_group_name() throws Exception {
      followerManagementActions.enterGlobalGroupName();
   }
   
   @Then("^User click search button result should come$")
   public void user_click_search_button() throws Exception {
      followerManagementActions.userClickSearchGroup();
   }
   
   @Then("^User clicks Follower Management tab$")
   public void user_click_follower_tab() throws Exception {
      followerManagementActions.clickFollowerManagement();
   }
   
   @Then("^When User cancel button user should navigate to same page again \\\"([^\\\"]*)\\\"$")
   public void user_click_cancel_button_groups(final String groupMgmt) throws Exception {
      followerManagementActions.userClickCancelGroupSearch();
      followerManagementActions.verifyOldFollowerPage(groupMgmt);
   }
   
   @Then("^Verify the result group name with global group name$")
   public void user_verify_result_groups() throws Exception {
      followerManagementActions.verifySearchResults();
   }
   
   @Then("^User clicks search follower button$")
   public void user_click_search_follower_button() throws Exception {
      followerManagementActions.clickFollowerSearchButton();
   }
   
   @Then("^delete the group user name$")
   public void delete_user_griup_name() throws Exception {
      followerManagementActions.deleteUserGroup();
   }
   
   @Then("^User should see delete popup page \\\"([^\\\"]*)\\\"$")
   public void user_see_delete_popup_page(final String deletePopupTitle) throws Exception {
      followerManagementActions.verifydeleteUserGroupPopup(deletePopupTitle);
   }
   
   @Then("^User should click yes to delete groupname$")
   public void user_click_yes_to_delete() throws Exception {
      followerManagementActions.clickdeleteUserGroup();
   }
   
   @Then("^User should click cancel to avoid delete groupname$")
   public void user_click_cancel_to_delete() throws Exception {
      followerManagementActions.clickCanceldeleteUserGroup();
   }
   
   
   @Then("^User should see \\\"([^\\\"]*)\\\" record and click edit$")
   public void user_click_edit_follower_page(final String followerName) throws Exception {
      followerManagementActions.verifyFollowerSearchResults(followerName);
   }
   
   @Then("^User should add group name and assign to user$")
   public void user_add_group_and_assign_user() throws Exception {
      followerManagementActions.addUserGroup();
   }
   
   @Then("^User should see \\\"([^\\\"]*)\\\" follower management$")
   public void user_verify_follower_management(final String followerMgmt) throws Exception {
      followerManagementActions.verifyIsFollowerManagement(followerMgmt);
   }
   
   @Then("^User should enter follower name \\\"([^\\\"]*)\\\" and search$")
   public void user_enter_follower_name(final String followerName) throws Exception {
      followerManagementActions.enterFollowerNameandSearch(followerName);
   }
   
   @Then("User should enter remarks \\\"([^\\\"]*)\\\" and click save$")
   public void user_enter_remarks_and_save(final String remarks) throws Exception {
      followerManagementActions.addFilterRemarks(remarks);
      followerManagementActions.savefilterEditData();
   }
   
   @Then("User should enter remarks \\\"([^\\\"]*)\\\"$")
   public void user_enter_remarks(final String remarks) throws Exception {
      followerManagementActions.addFilterRemarks(remarks);
   }
   
   @Then("^User Should verify success message \\\"([^\\\"]*)\\\"$")
   public void user_verify_Sucess_message(final String successMessage) throws Exception {
      followerManagementActions.userVerifySuccessMessage(successMessage);
   }
   
   @Then("^User Should verify error message \\\"([^\\\"]*)\\\"$")
   public void user_verify_error_message(final String errorMessage) throws Exception {
      followerManagementActions.userVerifyErrorMessage(errorMessage);
   }
   
   @Then("^User should enter follower name \\\"([^\\\"]*)\\\"$")
   public void user_enter_follower_name_cancel(final String followerName) throws Exception {
      followerManagementActions.enterFollowerName(followerName);
   }
   
   @Then("^User clicks cancel button$")
   public void user_click_cancel() throws Exception {
      followerManagementActions.clickFollowerSearchCancelButton();
   }
   
   @Then("^User clicks cancel button while tagging user$")
   public void user_click_cancel_whiletaggling_follower() throws Exception {
      followerManagementActions.clickCancelButtonWhileTagging();
   }

}
