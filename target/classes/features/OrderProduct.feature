Feature: user can order any product
  # Scenario case 2 (SC2)
  Background:
    Given user logged in the website for add product to make successful order
  Scenario: user make successfully order
    Given user select any product to show
    And user add this product to cart shpping list
    And user close from notification message
    When user press on shopping cart link
    And user agree the term of order
    And user press CheckOut button for order
    And user enter billing address if not exists
    And user shipping address
    And user select shipping method type
    And user select payment method type
    And user confirm the order by pressing confirm btn
    Then user show message "Your order has been successfully processed!"
    When user navigate the link order details
    Then user show order number of order
    And user show order content of order
    And user show order details of order
    And user show total price for this order

