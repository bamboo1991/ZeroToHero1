@regression
Feature: Valid credentials

  Background:
    Given the user navigated to the website

  @Smoke @TC-02
  Scenario: Login to your newly create account with valid username and password
    * the user must verify the account by sign in with "marge.wehner@gmail.com" and "bl%xds"
    Then the user must verify her or his name on header part "Ariet Johnson"