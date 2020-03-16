Feature: Price Calculation

  Background:
    Given the user navigated to the automation practice webpage

  Scenario Outline: Adding orders to cart and validating the total price calculation
    Given the user enters to the search box "<input>"
    When the user clicks the search button
    Then the user clicks on the product
    And the user clicks on continue shopping button
    Examples:
      | input         |
      | dress         |
      | shirt         |
      | casual dress  |
      | evening dress |
      | t-shirt       |

    Scenario: Validating the total price
      * the user clicks on check out button
      * the user validates the total price
