package com.stepdefinition;

import com.base.LibGlobal;
import com.pages.BookAHotelPagePojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class BookAHotelPageStep extends LibGlobal {

	BookAHotelPagePojo bookAHotelPagePojo;
	
	@Given("user is in Book a hotel page")
	public void userIsInBookAHotelPage() {
		//Assert.assertTrue("User is not in book a hotel page", true);
	}
	
	@Then("user enter the {string},{string},{string},{string},{string},{string},{string},{string} to book the hotel")
	public void userEnterTheToBookTheHotel(String FirstName, String LastName, String Add, String CardNumber, String CrdType, String ExpireDate, String ExpireYear, String CVV_Number) {
		bookAHotelPagePojo=new BookAHotelPagePojo();
		enterText(bookAHotelPagePojo.getFName(), FirstName);
		enterText(bookAHotelPagePojo.getLName(), LastName);
		enterText(bookAHotelPagePojo.getAddress(), Add);
		enterText(bookAHotelPagePojo.getCcNumber(), CardNumber);
		drp_Down_ByValue(bookAHotelPagePojo.getCcType(), CrdType);
		drp_Down_ByValue(bookAHotelPagePojo.getCcExpMonth(), ExpireDate);
		drp_Down_ByValue(bookAHotelPagePojo.getCcExpYr(), ExpireYear);
		enterText(bookAHotelPagePojo.getCVV(), CVV_Number);
	}

	@Then("user clicks the Book Now button")
	public void userClicksTheBookNowButton() {
		bookAHotelPagePojo=new BookAHotelPagePojo();
		btnClick(bookAHotelPagePojo.getBookNowBtn());
	}

}
