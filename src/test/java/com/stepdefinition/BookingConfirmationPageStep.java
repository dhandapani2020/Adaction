package com.stepdefinition;

import com.base.LibGlobal;
import com.pages.BookingConfirmationPagePojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class BookingConfirmationPageStep extends LibGlobal {

	BookingConfirmationPagePojo bookingConfirmationPagePojo;

	@Given("user is in Booking Confirmation")
	public void userIsInBookingConfirmation() {
		Assert.assertTrue("User is not in booking confirmation page", true);
	}

	@Then("user see the orderId")
	public void userSeeTheOrderI() throws InterruptedException {
		bookingConfirmationPagePojo = new BookingConfirmationPagePojo();
		Thread.sleep(7000);
		String OrderNumber = bookingConfirmationPagePojo.getOrderNumber().getAttribute("value");
		System.out.println("Your order id for the hotel booking is:-" + OrderNumber);
	}

	@Then("user click the Logout button")
	public void userClickTheLogoutButton()  {
		bookingConfirmationPagePojo = new BookingConfirmationPagePojo();
		btnClick(bookingConfirmationPagePojo.getLogOutBtn());
		
	}
	@Then("user quit the browser")
	public void userQuitTheBrowser() {
		quitBrower();
	}
}
