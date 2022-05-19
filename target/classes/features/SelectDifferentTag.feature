@Regression
Feature: user can selected different tag
  # Scenario case 2 (SC2)
  Background:
    Given user logged in the website for select tag product

  Scenario: user select tag game then display item

    Given user select any category

    When user scroll down to show popular tag
    And user show all tag
    And user selected Game tag

    Then user show product for Game tag
  Scenario: user select computer tag

    Given user select any category

    When user scroll down to show popular tag
    And user show all tag
    And user selected Computer tag
    Then user show product for computer tag