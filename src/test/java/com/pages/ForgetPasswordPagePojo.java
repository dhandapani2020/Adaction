package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class ForgetPasswordPagePojo extends LibGlobal {
	
	public ForgetPasswordPagePojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="emailadd_recovery")
	private WebElement RecoveryEmail;
	
	@FindBy(id="Submit")
	private WebElement EmailPassword;
	
	@FindBy(id="Reset")
	private WebElement Reset;
	
	@FindBy(xpath="//td[contains(text(),'Forgot Password Form ')]")
	private WebElement forgetPasswordPageHeader;
	
	@FindBy(xpath="//td[contains(text(),'An email has been sent')]")
	private WebElement recoverPasswordSendPageHeader;
	
	@FindBy(xpath="//a[text()='Click here to login']")
	private WebElement clickLoginPageLink;

	public WebElement getRecoveryEmail() {
		return RecoveryEmail;
	}

	public WebElement getEmailPassword() {
		return EmailPassword;
	}

	public WebElement getReset() {
		return Reset;
	}
		
	public WebElement getForgetPasswordPageHeader() {
		return forgetPasswordPageHeader;
	}
	
	public WebElement getRecoverPasswordSendPageHeader() {
		return recoverPasswordSendPageHeader;
	}
	
	public WebElement getClickLoginPageLink() {
		return clickLoginPageLink;
	}

}
