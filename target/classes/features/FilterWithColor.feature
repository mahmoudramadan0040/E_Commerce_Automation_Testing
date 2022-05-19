@Regression
Feature: user can filter product with color
  # Scenario case 2 (SC2)
  Background:
    Given user logged in the website for Filter product

  Scenario: user filter product with color Red
    Given user press specific category that has sub category

    And press the sub category like shoes

    When user filter product by color red

    Then user show product items have color red

  Scenario: user filter product with color Grey
    Given user press specific category that has sub category

    And press the sub category like shoes

    When user filter product by color Grey

    Then user show product items have color Grey
