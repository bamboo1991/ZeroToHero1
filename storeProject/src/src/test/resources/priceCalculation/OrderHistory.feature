Feature: Validating Order History functionality

  Background:
    Given the user navigated to the automation practice webpage
    And the user logged in with valid credentials

    Scenario: Validating purchase of the most expensive dress
      Given the user inputs to the search box "summer dress"
      When the user clicks the search button
      Then the user clicks on the product with the highest price
      * the user clicks on check out button and proceeds to check out
      * the user validates the total price of the dress
