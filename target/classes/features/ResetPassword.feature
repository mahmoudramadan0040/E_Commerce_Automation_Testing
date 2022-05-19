@Regression
Feature: user can reset the password


  Scenario: user reset password using email
    Given user open the browser for reset

    And user navigate the reset page

    When user enter forget password

    And user enter the valid email

    And user press recover button

    Then user should Reset successfully
