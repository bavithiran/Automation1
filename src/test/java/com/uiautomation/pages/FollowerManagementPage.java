/**
 * 
 */
package com.uiautomation.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.uiautomation.utils.CommonUtils;

import net.serenitybdd.core.annotations.findby.FindBy;

/**
 * Page Specification for Follower management
 * @version $Id$
 */
public class FollowerManagementPage extends CommonPage {
   private String uniqueGroup;
   
   @FindBy(css = "li#BroadcastSchedule.menuFive>a")
   private List<WebElement> followerManagementTopHeaderList;
   
   @FindBy(css = "li#BroadcastSchedule.menuFive>a")
   private List<WebElement> followerManagementTopHeader;
   
   @FindBy(xpath = "//*[@id='follwersmanagement']")
   private WebElement followerManagementTabfm;
   
   @FindBy(xpath = "//*[@id='groupmanagement']")
   private WebElement followerMgmtTabGroupManagement;
   
   @FindBy(xpath = "//*[@id='userPreferenceSetting']")
   private WebElement followerMgmtTabUsrPrefSetting;
   
   @FindBy(xpath = "//*[@id='AlertInfo']")
   private WebElement alertMessageGroupAlreadyExists;
   
   @FindBy(xpath = "//*[@id='ManageTabs']/li/a")
   private List<WebElement> followerSubTabs;
   
   @FindBy(xpath = "//*[@id='GroupManagementContent']/h2")
   private WebElement groupMgmtHeader;
   
   @FindBy(xpath = "//*[@id='GroupManagementContent']/div[1]/div/div/div[2]/div/input")
   private WebElement addGroup;
   
   @FindBy(xpath = "//*[@id='closeAddDetails']")
   private WebElement closeButtonAddGroup;
   
   @FindBy(xpath = "//*[@id='addEditGroupDetails']/div[1]/div[1]/div[2]/div[1]/label[1]")
   private WebElement groupNameHeader;
   
   @FindBy(xpath = "//*[@id='AddViewModelTxtbxId']")
   private WebElement groupName;
   
   @FindBy(xpath = "//*[@id='btngroupcancel']")
   private WebElement cancelButton;
   
   @FindBy(xpath = "//*[@id='btngroupadd']")
   private WebElement saveButton;
   
   @FindBy(xpath = "//*[@id='btngroupsearch']")
   private WebElement searchButton;
   
   @FindBy(xpath = "//*[@id='CancelSearch']")
   private WebElement cancelButtonGroupMgmt;
   
   @FindBy(css = ".sea-field>.form-control")
   private WebElement enterGroupNamesearch;
   
   @FindBy(css = "#managementTable>tbody>tr>td>div>.col-md-12")
   private WebElement verifyGroupName;
   
   @FindBy(xpath = "//*[@id='AlertInfo']")
   private WebElement successVerificationMsg;
   
   @FindBy(xpath = "//*[@id='FollwersManagementContent']/h2")
   private WebElement followerMgmtTitle;
   
   @FindBy(xpath = "//*[@id='FilterShowHide']")
   private WebElement searchFollowerButton;
   
   @FindBy(xpath = "//*[@id='Keyword']")
   private WebElement txtBoxFollowerName;
   
   @FindBy(xpath = "//*[@id='divFilter']/div[1]/div[2]/div[5]/input[1]")
   private WebElement filterSearchFollowerMgmt;
   
   @FindBy(xpath = "//*[@id='divFilter']/div[1]/div[2]/div[5]/input[2]")
   private WebElement filterSearchCancelFollowerMgmt;
   
   @FindBy(xpath = "//*[@id='cancelEditDetails']")
   private WebElement filterSearchCancelEdit;
   
   @FindBy(xpath = "//*[@id='managementTable']/tbody/tr/td[3]")
   private WebElement filterSearchUserName;
   
   @FindBy(xpath = "//*[@id='managementTable']/tbody/tr/td[10]")
   private WebElement filterSearchEditButton;
   
   @FindBy(xpath = "//*[@id='managementTable']/tbody/tr/td[6]/div/a[2]")
   private WebElement deleteGroupButton;
   
   @FindBy(xpath = "//*[@id='DelOk']")
   private WebElement deleteConfirmYes;
   
   @FindBy(xpath = "//*[@id='cancelEditDetails']")
   private WebElement deleteConfirmCancel;
   
   @FindBy(xpath = "//*[@id='tagIdList_chosen']")
   private WebElement filterSearchSelectGroup;
   
   @FindBy(xpath = "//*[@id='addEditGroupDetails']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/textarea[1]")
   private WebElement filterSearchRemarks;
   
   @FindBy(xpath = "//*[@id='addEditGroupDetails']/div[1]/div[1]/div[3]/button[2]")
   private WebElement filterSaveButton;
   
   @FindBy(xpath = "//*[@id='popup-del']/div/div/div[1]")
   private WebElement deletePopupTitle;
 
   @FindBy(xpath = "//*[@id='addEditGroupDetails']/div/div/div[2]/div/div/div[2]/div[1]/span")
   private WebElement errorMessage;
   
   public List<String> getFollowerMgmtTopHeadersLists() {
      List<String> userHeaders = new ArrayList<>();
      for (WebElement header : followerManagementTopHeaderList){
         String headerText = CommonUtils.removeJunkFromString(header.getText());
         userHeaders.add(headerText);
      }
      return userHeaders;
   }
   
   public void verifyGroupUserData(final String groupMgmtTitle){
      //followerMgmtTabUsrPrefSetting.click();//TODO
//      validate successmessage
   }
   
   public boolean isFollowerManagementTopTabDisplayed(){
      waitFor(followerManagementTopHeader.get(0));
      CommonUtils.waitForSeconds(2);
      return followerManagementTopHeader.get(0).isDisplayed();
   }
   
   public String isGroupAlreadyExists(){
      return CommonUtils.removeJunkFromString(alertMessageGroupAlreadyExists.getText());
   }
   
   public List<String> getFollowerTypeTabsAsList() {
      final List<String> creativeList = new ArrayList<>();
      for (WebElement creative : followerSubTabs) {
         creativeList.add(creative.getText());
      }
      return creativeList;
   }
   
   public boolean verifyIsGroupManagement(){
      waitFor(groupMgmtHeader);
      CommonUtils.waitForSeconds(2);
      return groupMgmtHeader.isDisplayed();
   }
   
   public String verifyIsFollowerManagement(){
      waitFor(followerMgmtTitle);
      CommonUtils.waitForSeconds(2);
      return CommonUtils.removeJunkFromString(followerMgmtTitle.getText());
   }
   
   public String verifyGroupManagement(final String mgmtHeader){
      return CommonUtils.removeJunkFromString(groupMgmtHeader.getText());
   }
   
   public void clickGroupManagement(){
      followerMgmtTabGroupManagement.click();
   }
   
   public void clickFollowerManagement(){
      followerManagementTabfm.click();
   }
   
   public void clickUserPref(){
      followerMgmtTabUsrPrefSetting.click();
   }
   
   /**
    * Add random group number 
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   public void addGroupDetails(final String groupNam){
      uniqueGroup = groupNam+CommonUtils.randomNumberGenerator(1000);
      groupName.sendKeys(uniqueGroup);
   }
   
   public void verifyAddGroupPage(){
      waitFor(groupNameHeader);
      groupNameHeader.isDisplayed();
   }
   
   public void clickSaveButton(){
      saveButton.click();
   }
   
   public void clickCloseButton(){
      closeButtonAddGroup.click();
   }
   
   public void clickCancelButtonAddGroup(){
      cancelButton.click();
   }
   
   /**
    * Click Add group button event 
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   
   public void clickAddGroupBtn(){
      waitFor(addGroup);
      CommonUtils.waitForSeconds(1);
      addGroup.click();
   }
   
   /**
    * Click Cancel group button event 
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   
   public void clickCancelButtonGroupMgmt(){
      waitFor(cancelButtonGroupMgmt);
      cancelButtonGroupMgmt.click();
   }
   /**
    * Click Add group search button event 
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   public void clickAddGroupSearchButton(){
      waitFor(searchButton);
      searchButton.click();
   }
   
   /**
    * search button event 
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   public void searchFollowerButton(){
      waitFor(searchFollowerButton);
      CommonUtils.waitForSeconds(1);
      searchFollowerButton.click();
   }
   
   /**
    * cancel button event while searching group
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   public void filterSearchCancelEdit(){
      waitFor(filterSearchCancelEdit);
      filterSearchCancelEdit.click();
   }
   
   /**
    * filter result for follower management
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   
   public void filterSearchFollowerMgmt(){
      waitFor(filterSearchFollowerMgmt);
      CommonUtils.waitForSeconds(1);
      filterSearchFollowerMgmt.click();
   }
   
   /**
    * Cancel button followe rpage when user enter follower name
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   public void filterSearchCancelFollowerMgmt(){
      waitFor(filterSearchCancelFollowerMgmt);
      CommonUtils.waitForSeconds(1);
      filterSearchCancelFollowerMgmt.click();
   }
   
   /**
    * Enter follower name and search
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   public void enterFollowerName(final String followerName){
      txtBoxFollowerName.sendKeys(followerName);
   }
   
   /**
    * Add group name
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   public void addGroupName(){
      CommonUtils.waitForSeconds(1);
      enterGroupNamesearch.sendKeys(uniqueGroup);
   }
   
   /**
    * Verify post add user group is added or not
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   public void verifyGroupNameisPresent(){
      CommonUtils.waitForSeconds(1);
      assertThat("Verify Groupname", verifyGroupName.getText(), is(equalTo(uniqueGroup)));
   }
   
   /**
    * Verify search results while adding group. TODO
    * @Description: 
    * @param
    * @return : void
    * @exception :
    */
   
   public boolean verifyTagDetails(){
      waitFor(successVerificationMsg);
      return successVerificationMsg.isDisplayed();
   }
   
   
   /**
    * Verify search results while searching follower
    * @Description: 
    * @param
    * @return : void
    * @exception :
    */
   
   public void verifyFollowerSearchResults(final String followerName){
      CommonUtils.waitForSeconds(1);
      assertThat("Verify follower name search ", filterSearchUserName.getText(), is(equalTo(followerName)));
   }
   
   /**
    * Click edit button while trying to tag user
    * @Description: 
    * @param
    * @return : void
    * @exception :
    */
   
   public void clickEditButton(){
      filterSearchEditButton.click();
   }
   
   public void addFilterUserGroup(){
//      TODO---use uniqueGroup
      //filterSearchSelectGroup.sendKeys("test1");
   }
   
   /**
    * Click Delete the user group
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   public void deleteUserGroup(){
      deleteGroupButton.click();
   }
   
   /**
    * verify Delete the user group popup
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   public String verifydeleteUserGroupPopup(){
      waitFor(deletePopupTitle);
      return CommonUtils.removeJunkFromString(deletePopupTitle.getText());
   }
   
   /**
    * confirm delete popup page
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   public void clickdeleteUserGroup(){
      deleteConfirmYes.click();
   }
   
   /**
    * Cancel delete popup page
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   public void clickCanceldeleteUserGroup(){
      deleteConfirmCancel.click();
   }
   
   /**
    * Click save button while trying to tag user
    * @Description: 
    * @param
    * @return : void
    * @exception :
    */
   public void savefilterEditData(){
      filterSaveButton.click();
   }

   /**
    * Add remarks while tagging user
    * @Description: 
    * @param
    * @return : void
    * @exception :
    */
   public void addFilterRemarks(final String remarks){
      filterSearchRemarks.clear();
      filterSearchRemarks.sendKeys(remarks);
   }
   
   /**
    * When user sucessfuly tag user name with group, this message verifies success message
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Narottam
    */
   public void verifySavedRecordMessage(final String successMessage){
      waitFor(alertMessageGroupAlreadyExists);
      assertThat("Verify follower name sucess message ", alertMessageGroupAlreadyExists.getText(), is(equalTo(successMessage)));
   }
   
   /*
    * Error message verification when follwer enter remarks greater then 12 characters
    */
   public void userVerifyErrorMessage(final String errorMessageText){
      waitFor(errorMessage);
      assertThat("Verify follower name error  message ", errorMessage.getText(), is(equalTo(errorMessageText)));
   }
   
}
