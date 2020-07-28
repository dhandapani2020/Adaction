package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookingConfirmationPagePojo extends LibGlobal{

	public BookingConfirmationPagePojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderNumber;
	
	@FindBy(xpath="//input[@id='logout']")
	private WebElement logOutBtn;

	public WebElement getOrderNumber() {
		return orderNumber;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}
}
