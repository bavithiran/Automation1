/**
 * 
 */
package com.uiautomation.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.uiautomation.utils.CommonUtils;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class DatabindingPage extends PageObject
{

   @FindBy(css = ".country.standard .country-name")
   private List<WebElement> countryNameDropdown;

   @FindBy(id = "intlMobile")
   private WebElement mobileNumberText;

   @FindBy(id = "signUpFormSubmit")
   private WebElement signUpFollowerButton;

   @FindBy(css = "#lblStaticThankyou font font")
   private WebElement signupThankYouText;

   @FindBy(css = "#wechatSignupForm .selected-flag")
   private WebElement selectCountryDropdown;

   @FindBy(id = "Name")
   private WebElement searchNameTxBx;

   @FindBy(id = "SubmitSearch")
   private WebElement searchSubmitButton;

   @FindBy(css = "[data-ng-repeat=\"res in SignUpRecords\"] td[data-ng-bind=\"res.Name\"]")
   private WebElement nameInDataBindingList;

   @FindBy(css = "[data-ng-repeat=\"res in SignUpRecords\"] td[data-ng-bind=\"res.Mobile\"]")
   private WebElement mobileInDataBindingList;

   @FindBy(css = "[ng-model=\"res.Selected\"]")
   private WebElement userCheckBoxDataBindList;

   @FindBy(id = "clrBtnId")
   private WebElement clearUserButton;

   @FindBy(id = "submitClearLog")
   private WebElement submitClearLogButton;

   @FindBy(id = "#Title")
   private WebElement deleteFollowerTitle;

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */

   ArrayList<String> tabs;

   public void navigateToUrl(String followeId)
   {
      getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");

      ((JavascriptExecutor) getDriver()).executeScript("window.open()");

      CommonUtils.waitForSeconds(3);

      tabs = new ArrayList<String>(getDriver().getWindowHandles());

      getDriver().switchTo().window(tabs.get(1));

      getDriver().navigate().to("https://www.wechatify.com/databinder/signup/" + followeId);
      CommonUtils.waitForSeconds(3);

   }

   public void switchToParentWindow()
   {
      CommonUtils.waitForSeconds(3);
      getDriver().switchTo().window(tabs.get(0));
   }

   public void signupForFollower(String country, String mobileNumber)
   {
      CommonUtils.waitForSeconds(3);
      selectCountryDropdown.click();
      CommonUtils.selectOptionByFullText(countryNameDropdown, country);
      mobileNumberText.clear();
      mobileNumberText.sendKeys(mobileNumber);
      signUpFollowerButton.click();
      CommonUtils.waitForSeconds(3);
   }

   public boolean getSigUpThankYouMessageText()
   {
      return signupThankYouText.isDisplayed();
   }

   public void searchByNameinDataBindingList(String name)
   {
      searchNameTxBx.clear();
      searchNameTxBx.sendKeys(name);
      searchSubmitButton.click();
   }

   public String getUserNameFromDataBindingList()
   {
      try
      {
         return nameInDataBindingList.getText();
      }
      catch (Exception e)
      {
         return "";
      }
   }

   public String getUserMobileFromDataBindingList()
   {
      return mobileInDataBindingList.getText();
   }

   public void deleteUserFromDataBinding()
   {
      try
      {
         userCheckBoxDataBindList.click();
         clearUserButton.click();
         submitClearLogButton.click();
      }
      catch (Exception e)
      {

      }
   }
}
