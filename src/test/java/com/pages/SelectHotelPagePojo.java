package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectHotelPagePojo extends LibGlobal {
	
	public SelectHotelPagePojo() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSelectHotelRB() {
		return selectHotelRB;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	@FindBy(id="radiobutton_0")
	private WebElement selectHotelRB;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	@FindBy(id="cancel")
	private WebElement cancelBtn;
	
}
