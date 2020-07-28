Feature: Verify the Adactin Hotel Application Login Page

@Reg @test
  Scenario Outline: verify the book a hotel page of Adactin hotel
    Given user is in Book a hotel page
    When user enter the "<FirstName>","<LastName>","<BillingAddress>","<CreditCardNo>","<CreditCardType>","<ExpiryMonth>","<ExpiryYear>","<CVV>" to book the hotel
    And user clicks the Book Now button

    Examples: 
      | FirstName  | LastName  | BillingAddress | CreditCardNo     | CreditCardType | ExpiryMonth | ExpiryYear | CVV |
      | Dhandapani | Balakumar | Trichy         | 1234567891234567 | VISA           |           1 |       2020 | 124 |
