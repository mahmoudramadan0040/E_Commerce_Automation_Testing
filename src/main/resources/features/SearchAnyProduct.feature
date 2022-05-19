@Regression
Feature: user should search for any product
  Background: user login first
    Given user login in the website
  Scenario: user search for any product
    Given user write computer keyword on search input

    When user enter the search

    Then user show result of search

