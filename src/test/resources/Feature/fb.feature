Feature: to verify fb login

  Scenario Outline: to verify fb login with valid data
    Given user is on facebook page
    And user should enter username as "<username>"
    And user should enter password as "<password>"
    And user should login click btn

    Examples: 
      | username | password |
      | aravind  |     1234 |
