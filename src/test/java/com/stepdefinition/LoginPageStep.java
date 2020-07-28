package com.stepdefinition;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import com.base.LibGlobal;
import com.pages.ForgetPasswordPagePojo;
import com.pages.LoginPagePojo;
import com.pages.SearchHotelPagePojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageStep extends LibGlobal {

	WebDriver driver;
	LoginPagePojo loginPagePojo;
	ForgetPasswordPagePojo forgetPasswordPagePojo;
	SearchHotelPagePojo searchHotelPagePojo;

	@Given("user is in Adactin Hotlel Home page")
	public void userIsInAdactinHotlelHomePage() throws MalformedURLException {
		driver = getDriver();
		maxBrowser();
		loadUrl("http://adactinhotelapp.com/");
	}

	@Then("user enter the {string} and {string}")
	public void userEnterTheAnd(String userName, String passWord) {
		loginPagePojo=new LoginPagePojo();
		enterText(loginPagePojo.getuName(), userName);
		enterText(loginPagePojo.getPassWord(), passWord);
	}
	
	@Then("user click the login button")
	public void userClickTheLoginButton() {
		loginPagePojo=new LoginPagePojo();
		btnClick(loginPagePojo.getLoginButton());
	}
	
}
