Feature: verifying the adactin login page

  Scenario Outline: verifying adactin login with login data
    Given user is on adactin page
    When user should enter "<username>"and"<password>"
    And user should click login button
    Then user should verify after login success message
    And user should enter "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
    And user should click search button
    And user should selecthotel
    And user should click continue
    And user should enter after select hotel "<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Credit Card Type>","<Expiry month>","<Expiry year>","<CVV Number>"
    Then user should click booknow
    Then user should get booking id

    Examples: 
      | username      | password    | Location    | Hotels      | Room  Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |  | First Name | Last Name | Billing Address | Credit Card No   | Credit Card Type | Expiry month | Expiry year | CVV Number |
      | udhayaaravind | Aravind9696 | Sydney      | Hotel Creek | Standard   | 2 - Two         | 26/09/2022    | 28/09/2022     | 2 - Two         | 0 - None          |  | udhayaa    | Aravind   | chennai         | 1234567891123456 | VISA             | December     |        2022 |        123 |
      | udhayaaravind | Aravind9696 | Melbourne   | Hotel Creek | Standard   | 2 - Two         | 26/09/2022    | 28/09/2022     | 2 - Two         | 0 - None          |  | udhayaa    | Aravind   | chennai         | 1234567891123456 | VISA             | December     |        2022 |        123 |
      | udhayaaravind | Aravind9696 | Brisbane    | Hotel Creek | Standard   | 2 - Two         | 26/09/2022    | 28/09/2022     | 2 - Two         | 0 - None          |  | udhayaa    | Aravind   | chennai         | 1234567891123456 | VISA             | December     |        2022 |        123 |
      | udhayaaravind | Aravind9696 | Brisbane    | Hotel Creek | Standard   | 2 - Two         | 26/09/2022    | 28/09/2022     | 2 - Two         | 0 - None          |  | udhayaa    | Aravind   | chennai         | 1234567891123456 | VISA             | December     |        2022 |        123 |
      | udhayaaravind | Aravind9696 | Adelaide    | Hotel Creek | Standard   | 2 - Two         | 26/09/2022    | 28/09/2022     | 2 - Two         | 0 - None          |  | udhayaa    | Aravind   | chennai         | 1234567891123456 | VISA             | December     |        2022 |        123 |
      | udhayaaravind | Aravind9696 | London      | Hotel Creek | Standard   | 2 - Two         | 26/09/2022    | 28/09/2022     | 2 - Two         | 0 - None          |  | udhayaa    | Aravind   | chennai         | 1234567891123456 | VISA             | December     |        2022 |        123 |
      | udhayaaravind | Aravind9696 | New York    | Hotel Creek | Standard   | 2 - Two         | 26/09/2022    | 28/09/2022     | 2 - Two         | 0 - None          |  | udhayaa    | Aravind   | chennai         | 1234567891123456 | VISA             | December     |        2022 |        123 |
      | udhayaaravind | Aravind9696 | Los Angeles | Hotel Creek | Standard   | 2 - Two         | 26/09/2022    | 28/09/2022     | 2 - Two         | 0 - None          |  | udhayaa    | Aravind   | chennai         | 1234567891123456 | VISA             | December     |        2022 |        123 |
