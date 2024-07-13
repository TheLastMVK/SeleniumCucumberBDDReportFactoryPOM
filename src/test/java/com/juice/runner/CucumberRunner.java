package com.juice.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features", //definimos la ruta de los features
		glue = {"com.juice.stepDefinitionsTest", "com.juice.utils"}, //ruta de alojamiento de los steps
		plugin = {"pretty", "summary",
				"html:target/cucumber.html",
				"json:target/cucumber.json",
				"junit:target/cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		},
		publish = true,		
		monochrome = false,
		//tags = "@scenario2",
		dryRun = false
		)

public class CucumberRunner extends AbstractTestNGCucumberTests{
	
	
}