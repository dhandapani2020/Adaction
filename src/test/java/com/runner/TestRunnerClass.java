package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\"}, glue= {"com.stepdefinition"}, snippets=SnippetType.CAMELCASE, 
dryRun=false, monochrome=true, tags= {"@Reg"}, plugin= {"pretty","json:src\\test\\resources\\Reports\\cucumber.json"})
public class TestRunnerClass {
	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport(System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports\\cucumber.json");
	}

}

