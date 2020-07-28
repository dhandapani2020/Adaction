
Feature: Verify the Adactin Hotel Application Logi
@Reg
  Scenario Outline: verify the Search Hotel Page
    Given user is in Search Hotel Page
    When user choose "<location>" , "<hotels>" , "<RoomType>" , "<N.ofRoom>" , "<CheckInDate>" , "<CheckOutDate>" , "<AdultPerRoom>" , "<ChildrenPerRoom>"
    Then click the search button

    Examples: 
      | location | hotels         | RoomType | N.ofRoom | CheckInDate | CheckOutDate | AdultPerRoom | ChildrenPerRoom | 
      | Sydney   | Hotel Sunshine | Deluxe   |        4 | 27/06/2020  | 29/06/2020   |            2 |               0 | 
