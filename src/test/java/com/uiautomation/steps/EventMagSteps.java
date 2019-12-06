package com.uiautomation.steps;

import java.io.IOException;

import com.uiautomation.actions.EventMagAction;
import com.uiautomation.utils.CommonUtils;
import com.wechatify.utils.Constants;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EventMagSteps
{

    @Steps
    EventMagAction eventMagAction;

    @Then("^User Clicks On Add Button In eventManagement Module$")
    public void User_Clicks_Add_Button_in_Event()
    {
        eventMagAction.eventAddActionClick();
    }

    @When("^User enters Event Managament Module \"([^\"]*)\"$")
    public void User_enters_into_eventManagement_Module(String EventModuleName)
    {
        eventMagAction.eventManagementModuleClick(EventModuleName);
    }

    @Then("^User Reads Event name from ExcelFile \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void User_enter_eventNameFiler_From_Excel(String filePath, String fileName, String sheetName) throws IOException, InvalidFormatException
    {
      filePath = CommonUtils.getAbsolutePathPath(Constants.EXCEL_SHEET_DATA_FAQ_PATH);
      eventMagAction.eventbulkdataEntryAction(filePath,fileName,sheetName);
    }

}