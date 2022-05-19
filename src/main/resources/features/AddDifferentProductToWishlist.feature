@Regression
Feature: user can add product to wishlist
  # Scenario case 2 (SC2)
  Background:
    Given user logged in the website for add product to wishlist

  Scenario: user add  product to wishlist from jewelry category

    Given user select jewelry category

    When user add the product to wishlist

    Then user show msg "The product has been added to your wishlist"

    When user press the wishlist link

    Then user show product that add to wishlist

  Scenario: user add  product to wishlist from Book category

    Given user select Book category

    When user add the product to wishlist

    Then user show msg "The product has been added to your wishlist"

    When user press the wishlist link

    Then user show product that add to wishlist