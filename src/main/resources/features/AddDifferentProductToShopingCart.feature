Feature: user can add product to wishlist
  # Scenario case 2 (SC2)
  Background:
    Given user logged in the website for add product to Cart list

  Scenario: user add  product to Cart list from Digital category

    Given user select Digital category

    When user add the product to shopping cart

    Then user show msg "The product has been added to your shopping cart"

    And user close notification msg

    When user press the Shopping Cart link

    Then user show product that add to shopping cart

  Scenario: user add  product to Cart list from Electronics category

    Given user select Electronics category

    And user select sub category Phone

    When user add the product to shopping cart

    Then user show msg "The product has been added to your shopping cart"

    And user close notification msg

    When user press the Shopping Cart link

    Then user show product that add to shopping cart