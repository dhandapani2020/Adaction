package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPagePojo extends LibGlobal{
	
	public LoginPagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement uName;

	@FindBy(id = "password")
	private WebElement passWord;

	@FindBy(id = "login")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[text()='Forgot Password?']")
	private WebElement forgetPasswordlink;

	public WebElement getuName() {
		return uName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getForgetPasswordlink() {
		return forgetPasswordlink;
	}
	
	
	
}
