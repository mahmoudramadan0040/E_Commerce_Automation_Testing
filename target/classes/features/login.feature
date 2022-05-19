@Regression
Feature: user should be able to login to the system
  # Scenario case 2 (SC2)

  Scenario: user login with valid username and password

    Given user open the Browser for login

    And user navigate the login page

    When user enter the valid Email and  valid Password

    And user press submit

    Then user should login successfully

    And  user redirect to Home Page