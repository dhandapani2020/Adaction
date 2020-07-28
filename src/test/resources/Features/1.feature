
Feature: Verify the Adactin Hotel Application Login Page

  Background: 
    Given user is in Adactin Hotlel Home page
@Reg
  Scenario Outline: Verify the login credentials
    Then user enter the "<username>" and "<password>"
    Then user click the login button

    Examples: 
      | username | password |
      | vino0801 | giveme2$ |

  Scenario Outline: verify the Forget password link
    When user click the Forget Password link
    Then verify the forget password form page
    Then user enter the "<email_id>" to get the reset password link to his register email address
    Then click the Email Password button
    Then verify whether acknoledgement received or not
    And user clicks the click here to login link

    Examples: 
      | email_id      |
      | 123@gmail.com |
