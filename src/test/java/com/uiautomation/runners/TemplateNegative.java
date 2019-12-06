package com.uiautomation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features/TemplateBroadcast/Negative/TemplateNegative.feature" }, glue = { "com.uiautomation.steps" }, tags = {
   "@TempNeg" }

)
public class TemplateNegative
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub

   }

}
