package com.uiautomation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features/EventMagement/EventPositive.feature" }, glue = { "com.uiautomation.steps" }
, tags = {"@eventTest"}

)
public class EventMagRunners
{

}
