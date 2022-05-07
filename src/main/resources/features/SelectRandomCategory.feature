Feature: user select random category
  # Scenario case 2 (SC2)
  Background:
    Given user logged in the website for select category

  Scenario: user select any category
    When user press any category

    Then user show product items for this category

  Scenario: user select any category and sub category

    When user press the category

    And user press sub category

    Then user show the product items for this  subcategory
