/**
 * 
 */
package com.uiautomation.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;

import java.util.List;

import com.uiautomation.pages.FollowerManagementPage;
import com.wechatify.enums.FollowerManagement.FollowerManagementTopHeader;

import net.thucydides.core.annotations.Step;

/**
 * Action class for follower management action
 * @version $Id$
 */
public class FollowerManagementActions {
   
   private FollowerManagementPage followerPage;
   
   @Step
   public void verifyFollowerMgmtTopHeaders() {
      assertThat("Verify Top headers of follower management:",
      followerPage.getUserManagementTopHeadersLists(),
      hasItems(FollowerManagementTopHeader.FOLLOWER_HEADER.toString()));
   }

   @Step
   public void verifyFollowerNavigation() {
      assertThat("Verify follower management top tab displayed:", followerPage.isFollowerManagementTopTabDisplayed(), is(equalTo(true)));
   }

   @Step
   public void clickFollowerMenu(){
      followerPage.clickFollowerNavMenu();
   }
   
   @Step
   public void verifyTopMenuOptions(List<String> followerMgmtOptions) {
      boolean match = true;
      for (int i = 0; i < followerMgmtOptions.size(); i++) {
         if (followerPage.getFollowerMgmtTopHeadersLists().get(i).contains(followerMgmtOptions.get(i))) {
            match = match && true;
         } else {
            match = false;
         }
      }
      assertThat("Verify Top menu options for Follower management", match, is(equalTo(true)));
   }
   
   @Step
   public void verifyTabOptions(List<String> followerMgmtOptions) {
      assertThat("Verify Top menu options", followerPage.getFollowerTypeTabsAsList(), is(equalTo(followerMgmtOptions)));
   }
   
   @Step
   public void verifyIsGroupManagement() {
      assertThat("Verify Follower management options for Follower management", followerPage.verifyIsGroupManagement(), is(equalTo(true)));
   }
   
   @Step
   public void verifyIsFollowerManagement(final String followerHeader) {
      assertThat("Verify Follower management options for Follower management", followerPage.verifyIsFollowerManagement(), is(equalTo(followerHeader)));
   }
   
   @Step
   public void clickGroupManagement() {
      followerPage.clickGroupManagement();
   }
   
   @Step
   public void verifyGroupManagement(final String groupMgmtHeader) {
      assertThat("Verify Follower management header", followerPage.verifyGroupManagement(groupMgmtHeader), is(equalTo(groupMgmtHeader)));
   }
   
   @Step
   public void clickAddGroupBtn() {
      followerPage.clickAddGroupBtn();
   }
   
   @Step
   public void verifyAddGroupPage() {
      followerPage.verifyAddGroupPage();
   }
   
   @Step
   public void addGroupDetails(final String groupName) {
      followerPage.addGroupDetails(groupName);
   }
   
   @Step
   public void clickSaveButton() {
      followerPage.clickSaveButton();
   }
   
   @Step
   public void verifyGroupUserData(final String groupMgmtHeader) {
      assertThat("Verify Follower management header", followerPage.verifyGroupManagement(groupMgmtHeader), is(equalTo(groupMgmtHeader)));
   }
   
   
   @Step
   public void clickCloseButton() {
      followerPage.clickCloseButton();
   }
   
   @Step
   public void clickCancelButtonAddGroup() {
      followerPage.clickCancelButtonAddGroup();
   }
   
   @Step
   public void verifyOldFollowerPage(final String groupMgmtHeader) {
      assertThat("Verify Follower management header", followerPage.verifyGroupManagement(groupMgmtHeader), is(equalTo(groupMgmtHeader)));
   }
   
   @Step
   public void enterGlobalGroupName() {
      followerPage.addGroupName();
   }
   
   @Step
   public void verifySearchResults() {
     followerPage.verifyGroupNameisPresent();
      
   }
   
   @Step
   public void verifyFollowerSearchResults(final String followerName) {
     followerPage.verifyFollowerSearchResults(followerName);
     followerPage.clickEditButton();
   }
   
   @Step
   public void userClickSearchGroup() {
      followerPage.clickAddGroupSearchButton();
   }
   
   @Step
   public void userClickCancelGroupSearch() {
      followerPage.clickCancelButtonGroupMgmt();
   }
   
   
   @Step
   public void clickFollowerManagement() {
      followerPage.clickFollowerManagement();
   }
   
   @Step
   public void clickFollowerSearchButton() {
      followerPage.searchFollowerButton();
   }
   
   @Step
   public void enterFollowerNameandSearch(final String followerName) {
      followerPage.enterFollowerName(followerName);
      followerPage.filterSearchFollowerMgmt();
   }
   
   @Step
   public void deleteUserGroup() {
      followerPage.deleteUserGroup();
   }
   
   @Step
   public void verifydeleteUserGroupPopup(final String deletePopupTitle) {
      assertThat("Verify Follower management header", followerPage.verifydeleteUserGroupPopup(), is(equalTo(deletePopupTitle)));
   }
   
   
   @Step
   public void clickdeleteUserGroup() {
      followerPage.clickdeleteUserGroup();
   }
   
   @Step
   public void clickCanceldeleteUserGroup() {
      followerPage.clickCanceldeleteUserGroup();
   }
   
   @Step
   public void addUserGroup() {
      followerPage.addFilterUserGroup();
   }
   
   @Step
   public void addFilterRemarks(final String remarks) {
      followerPage.addFilterRemarks(remarks);
   }
   
   @Step
   public void savefilterEditData() {
      followerPage.savefilterEditData();
   }
   
   @Step
   public void userVerifySuccessMessage(final String successMessage) {
      followerPage.verifySavedRecordMessage(successMessage);
   }
   
   @Step
   public void userVerifyErrorMessage(final String errorMessage) {
      followerPage.userVerifyErrorMessage(errorMessage);
   }
   
   @Step
   public void enterFollowerName(final String errorMessage) {
      followerPage.enterFollowerName(errorMessage);
   }
   
   @Step
   public void clickFollowerSearchCancelButton() {
      followerPage.filterSearchCancelFollowerMgmt();
   }
   
   @Step
   public void clickCancelButtonWhileTagging() {
      followerPage.filterSearchCancelEdit();
   }
   
}
