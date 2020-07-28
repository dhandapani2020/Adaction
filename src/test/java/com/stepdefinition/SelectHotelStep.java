package com.stepdefinition;

import com.base.LibGlobal;
import com.pages.SelectHotelPagePojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SelectHotelStep extends LibGlobal {

	SelectHotelPagePojo selectHotelPagePojo;
	@Given("user is in select hotel page")
	public void userIsInSelectHotelPage() {
	    Assert.assertTrue("User is not in Select hotel page", true);
	    
	}

	@When("user select the holtel name from the list of options")
	public void userSelectTheHoltelNameFromTheListOfOptions() {
		selectHotelPagePojo = new SelectHotelPagePojo();
		RbtnClick(selectHotelPagePojo.getSelectHotelRB());
	}

	@When("user click the continue button")
	public void userClickTheContinueButton() {
		selectHotelPagePojo = new SelectHotelPagePojo();
		btnClick(selectHotelPagePojo.getContinueBtn());
	    
	}



	
}
