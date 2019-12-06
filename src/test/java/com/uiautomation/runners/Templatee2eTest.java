package com.uiautomation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features/TemplateBroadcast/Positive/Templatee2e.feature" }, glue = { "com.uiautomation.steps" }
// , tags = {"@TempPos" }

)
public class Templatee2eTest
{

}
