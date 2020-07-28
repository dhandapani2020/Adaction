package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookAHotelPagePojo extends LibGlobal {

	public BookAHotelPagePojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement FName;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement LName;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement ccNumber;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement ccType;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement ccExpMonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement ccExpYr;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement CVV;

	@FindBy(id="book_now")
	private WebElement bookNowBtn;

	public WebElement getFName() {
		return FName;
	}

	public WebElement getLName() {
		return LName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCcNumber() {
		return ccNumber;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}

	public WebElement getCcExpYr() {
		return ccExpYr;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
}
