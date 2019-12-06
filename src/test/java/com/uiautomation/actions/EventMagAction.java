package com.uiautomation.actions;

import java.io.IOException;

import com.uiautomation.pages.EventMagPage;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import net.thucydides.core.annotations.Step;

;

public class EventMagAction
{
    EventMagPage eventMagPage;

    @Step
    public void eventAddActionClick()
    {
        eventMagPage.eventAddClick();
    }

    @Step
    public void eventManagementModuleClick(String EventModuleName)
    {
        eventMagPage.eventMagementModuleSelection(EventModuleName);
    }

    @Step
    public void eventbulkdataEntryAction(String filePath, String fileName, String sheetName) throws IOException, InvalidFormatException
   {
       eventMagPage.eventReadExcelData(filePath,fileName,sheetName);
   }
}