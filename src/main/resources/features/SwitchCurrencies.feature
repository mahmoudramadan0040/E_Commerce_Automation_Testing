Feature: user can switch between currencies US-Euro

  Scenario: user can switch between us dollar --> Euro

    Given user logged in the website

    When user select the us dollar currencies

    Then user show product in the dollar currencies

  Scenario: user can switch between Euro --> dollar

    Given user logged in the website

    When user select the Euro currencies

    Then user show product in the Euro currencies