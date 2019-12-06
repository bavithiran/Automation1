
package com.uiautomation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features/databinding/Databinding.feature" }, glue = { "com.uiautomation.steps" }
//,tags = {"@test"}
)
public class DataBindingTest
{
  
}


