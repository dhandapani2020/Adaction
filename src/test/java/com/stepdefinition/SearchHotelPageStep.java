package com.stepdefinition;

import org.junit.Assert;

import com.base.LibGlobal;
import com.pages.SearchHotelPagePojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelPageStep extends LibGlobal {
	SearchHotelPagePojo searchHotelPagePojo;
	
	@Given("user is in Search Hotel Page")
	public void userIsInSearchHotelPage() {
		searchHotelPagePojo = new SearchHotelPagePojo();
		Assert.assertTrue("User is not in Search Hotel Page", true);
	}

	@When("user choose {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
	public void userChoose(String HotelLocation, String Hotel, String Room_Type, String no_of_Rooms, String checkInDate,
			String checkOutDate, String no_of_Adult, String no_of_Child) {
		searchHotelPagePojo = new SearchHotelPagePojo();
		drp_Down_ByValue(searchHotelPagePojo.getHotelDD(), HotelLocation);
		drp_Down_ByValue(searchHotelPagePojo.getHotelName(), Hotel);
		drp_Down_ByVisibleTxt(searchHotelPagePojo.getHotelType(), Room_Type);
		drp_Down_ByValue(searchHotelPagePojo.getNo_of_Rooms(), no_of_Rooms);
		enterText(searchHotelPagePojo.getInDate(), checkInDate);
		enterText(searchHotelPagePojo.getOutDate(), checkOutDate);
		drp_Down_ByValue(searchHotelPagePojo.getAdultPerRoom(), no_of_Adult);
		drp_Down_ByValue(searchHotelPagePojo.getChildPerRoom(), no_of_Child);
	}

	@Then("click the search button")
	public void clickTheSearchButton() {
		searchHotelPagePojo = new SearchHotelPagePojo();
		btnClick(searchHotelPagePojo.getSearchButton());
	}
}
