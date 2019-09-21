package com.lti.runner;

import org.junit.runner.RunWith;
//
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/Login.feature", glue="com.lti.stpd", plugin = { "html:Reports/cucumber-html-report" ,"json:Reports/cucumber.json"})
public class TestRunner2 {
	
	

}
