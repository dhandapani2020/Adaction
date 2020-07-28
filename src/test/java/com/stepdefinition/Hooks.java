package com.stepdefinition;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.LibGlobal;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends LibGlobal{

	
	@Before 
	public void beforeScenario() {
		Date startTime=new Date();
		System.out.println(startTime);
	}
	@After
	public void afterScenario(Scenario sc) {
		Date endTime=new Date();
		System.out.println(endTime);
		
		if (sc.isFailed()) {
			TakesScreenshot tk=(TakesScreenshot) driver;
			byte[] b = tk.getScreenshotAs(OutputType.BYTES);
			sc.embed(b, "image/png");
		}
		
	}
	@Before("@smoke")
	public void beforeSmoke() {
		System.out.println("beforeSmoke");

	}
	@After("@smoke")
	public void afterSmoke() {
		System.out.println("afterSmoke");

	}
	
}
