package com.e2eTests.automation;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/specs/features"},
		//glue = {""},
		plugin = {"pretty", "html:target/cucumber-html-report", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/OrangeReport.html"},
		snippets = SnippetType.CAMELCASE,
		tags = {("@loginoutline")},
	    //tags = {("@buzz, @authentication")},

		monochrome = true
		)
public class TestRunner {

	@AfterClass
	public static void WriteExtentReport () {
		Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));
	}

	
}
