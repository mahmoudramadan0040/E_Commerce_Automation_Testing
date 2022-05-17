Feature: user should be able to register to the system


  Scenario: user register with your data
    Given user open the browser for registeration

    And user navigate the register page

    When user enter the data for account

    And user press register button

    Then user should register successfully
