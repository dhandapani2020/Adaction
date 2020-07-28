package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchHotelPagePojo extends LibGlobal {

		public SearchHotelPagePojo() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(id = "location")
		private WebElement hotelDD;
		
		@FindBy(id="hotels")
		private WebElement hotelName;
		
		@FindBy(xpath="//select[@id='room_type']")
		private WebElement hotelType;
		
		@FindBy(id="room_nos")
		private WebElement no_of_Rooms;
		
		@FindBy(id="datepick_in")
		private WebElement inDate;
		
		@FindBy(id="datepick_out")
		private WebElement outDate;
		
		@FindBy(id="adult_room")
		private WebElement adultPerRoom;
		
		@FindBy(xpath="//select[@id='child_room']")
		private WebElement childPerRoom;
		
		@FindBy(id="Submit")
		private WebElement searchButton;

		public WebElement getHotelDD() {
			return hotelDD;
		}

		public WebElement getHotelName() {
			return hotelName;
		}

		public WebElement getHotelType() {
			return hotelType;
		}

		public WebElement getNo_of_Rooms() {
			return no_of_Rooms;
		}

		public WebElement getInDate() {
			return inDate;
		}

		public WebElement getOutDate() {
			return outDate;
		}

		public WebElement getAdultPerRoom() {
			return adultPerRoom;
		}

		public WebElement getChildPerRoom() {
			return childPerRoom;
		}
		
		public WebElement getSearchButton() {
			return searchButton;
		}


	}
