$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/1.feature");
formatter.feature({
  "name": "Verify the Adactin Hotel Application Login Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify the login credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "user enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user click the login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "vino0801",
        "giveme2$"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in Adactin Hotlel Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStep.userIsInAdactinHotlelHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the login credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "user enter the \"vino0801\" and \"giveme2$\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.userEnterTheAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.userClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Features/2.feature");
formatter.feature({
  "name": "Verify the Adactin Hotel Application Logi",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verify the Search Hotel Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "user is in Search Hotel Page",
  "keyword": "Given "
});
formatter.step({
  "name": "user choose \"\u003clocation\u003e\" , \"\u003chotels\u003e\" , \"\u003cRoomType\u003e\" , \"\u003cN.ofRoom\u003e\" , \"\u003cCheckInDate\u003e\" , \"\u003cCheckOutDate\u003e\" , \"\u003cAdultPerRoom\u003e\" , \"\u003cChildrenPerRoom\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click the search button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "location",
        "hotels",
        "RoomType",
        "N.ofRoom",
        "CheckInDate",
        "CheckOutDate",
        "AdultPerRoom",
        "ChildrenPerRoom"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Sunshine",
        "Deluxe",
        "4",
        "27/06/2020",
        "29/06/2020",
        "2",
        "0"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verify the Search Hotel Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in Search Hotel Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchHotelPageStep.userIsInSearchHotelPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose \"Sydney\" , \"Hotel Sunshine\" , \"Deluxe\" , \"4\" , \"27/06/2020\" , \"29/06/2020\" , \"2\" , \"0\"",
  "keyword": "When "
});
formatter.match({
  "location": "SearchHotelPageStep.userChoose(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchHotelPageStep.clickTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Features/3.feature");
formatter.feature({
  "name": "Verify the Adactin Hotel Application Logi",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify the select hotel page of Adactin hotel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Reg"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in select hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "SelectHotelStep.userIsInSelectHotelPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the holtel name from the list of options",
  "keyword": "When "
});
formatter.match({
  "location": "SelectHotelStep.userSelectTheHoltelNameFromTheListOfOptions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "SelectHotelStep.userClickTheContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Features/4.feature");
formatter.feature({
  "name": "Verify the Adactin Hotel Application Login Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verify the book a hotel page of Adactin hotel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user is in Book a hotel page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter the \"\u003cFirstName\u003e\",\"\u003cLastName\u003e\",\"\u003cBillingAddress\u003e\",\"\u003cCreditCardNo\u003e\",\"\u003cCreditCardType\u003e\",\"\u003cExpiryMonth\u003e\",\"\u003cExpiryYear\u003e\",\"\u003cCVV\u003e\" to book the hotel",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks the Book Now button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "BillingAddress",
        "CreditCardNo",
        "CreditCardType",
        "ExpiryMonth",
        "ExpiryYear",
        "CVV"
      ]
    },
    {
      "cells": [
        "Dhandapani",
        "Balakumar",
        "Trichy",
        "1234567891234567",
        "VISA",
        "1",
        "2020",
        "124"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verify the book a hotel page of Adactin hotel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in Book a hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "BookAHotelPageStep.userIsInBookAHotelPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the \"Dhandapani\",\"Balakumar\",\"Trichy\",\"1234567891234567\",\"VISA\",\"1\",\"2020\",\"124\" to book the hotel",
  "keyword": "When "
});
formatter.match({
  "location": "BookAHotelPageStep.userEnterTheToBookTheHotel(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the Book Now button",
  "keyword": "And "
});
formatter.match({
  "location": "BookAHotelPageStep.userClicksTheBookNowButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Features/5.feature");
formatter.feature({
  "name": "Verify the Adactin Hotel Application Login Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify the booking confirmation page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in Booking Confirmation",
  "keyword": "Given "
});
formatter.match({
  "location": "BookingConfirmationPageStep.userIsInBookingConfirmation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see the orderId",
  "keyword": "When "
});
formatter.match({
  "location": "BookingConfirmationPageStep.userSeeTheOrderI()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Logout button",
  "keyword": "And "
});
formatter.match({
  "location": "BookingConfirmationPageStep.userClickTheLogoutButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingConfirmationPageStep.userQuitTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});