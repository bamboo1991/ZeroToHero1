Feature: Breaking Bad API Verification

  Scenario:  Verify total amount of Quotes -Negative
    Given the user Get all the quotes "negative"
    And the status code is 400
    Then the user don't get the expected amount of Quotes