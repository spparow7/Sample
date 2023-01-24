package com.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin= {"pretty","json:target\\output.json"},glue="com.stepdefinition",features="src\\test\\resources")
public class Testrunnerclass {	
	
	@AfterClass
	public static void afterClass() {
     	Reporting.generateJvmReport("C:\\Users\\User\\eclipse-workspace\\Cucumber\\target\\output.json");
	}
}
