Feature: Verify the Adactin Hotel Application Login Page
@Reg
  Scenario: verify the booking confirmation page
    Given user is in Booking Confirmation
    When user see the orderId
    And user click the Logout button
    Then user quit the browser
