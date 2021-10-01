package com.runnerClass;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/com/feature"},
		glue = {"com.stepDefinition"},
		tags = "@arlservice",
		dryRun = false,
		monochrome= true
		)

public class ScriptRunner {
	
	public static WebDriver driver;
	
	

}
