Feature: Verify the Adactin Hotel Application Logi

  @Reg @smoke
  Scenario: verify the select hotel page of Adactin hotel
    Given user is in select hotel page
    When user select the holtel name from the list of options
    And user click the continue button
