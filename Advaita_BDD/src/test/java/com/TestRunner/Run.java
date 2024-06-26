package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/DataSetupTestCase.feature", glue = "com.StepDefinition", dryRun = false, monochrome = true,
//        plugin = {"com.avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		plugin = { "pretty", "html:target/cucumber-reports/reports1.html",
				"json:target/cucumber-reports/reports_json.json", "junit:target/cucumber-reports/reports_xml.xml" }

)

public class Run {

	// This Class Should be Empty
}
