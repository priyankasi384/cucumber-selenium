Feature: Test login functionality

  Scenario Outline: Check login is successfull with given scenario
    Given User is on login page
    When User Enters <username> and <password>
    And click on login button
    Then User redirected to the home page

    Examples: 
      | username | password     |
      | student  | Password123  |
      | studen1  | Password1234 |
