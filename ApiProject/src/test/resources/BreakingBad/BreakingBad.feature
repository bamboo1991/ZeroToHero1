@breakingBad
Feature: Breaking Bad API Verification

  Scenario: Verify total amount of Quotes -Positive
    When the user Get all quotes "negative"
    And status code is 200
    Then the user get the expected amount of Quotes
Scenario: Verify it is running
  Given The iuse login
