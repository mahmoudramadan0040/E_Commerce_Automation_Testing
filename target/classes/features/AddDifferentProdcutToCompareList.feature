@Regression
Feature: user can add product compare list
  # Scenario case 2 (SC2)
  Background:
    Given user logged in the website for add product to compare list

  Scenario: user add  two differnet product to compare list from Electronic category

    Given user select Electronic category

    And user select camera and photo sub category

    When user add First product to compare list

    Then user show msg "The product has been added to your Comparison list"

    When user add second product to compare list

    Then user show msg "The product has been added to your Comparison list"

    When user press the Comparison link

    Then user show all products that added in Comparison list
