package Runner;

import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"features"},
                 glue =     {"Stepdefination"},
                 plugin =    { "pretty","html:target/cucumber-reports",
    		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                		  tags ="@Regression",
                  monochrome = true )

public class Funnerclass extends AbstractTestNGCucumberTests{
	
	}