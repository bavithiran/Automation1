
package com.uiautomation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features/creative/negetive/FollowerManagementNegative.feature" }, glue = { "com.uiautomation.steps" }
//,tags = {"@Audio"}

)
public class FollowerManagementNegativeTest
{
  
}
