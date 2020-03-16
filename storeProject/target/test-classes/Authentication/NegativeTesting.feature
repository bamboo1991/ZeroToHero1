@regression
Feature: invalid credentials

  @Smoke @TC-03
  Scenario: Try to login with invalid account information
    Given the user navigated to the website
    * the user must validate her or his account by providing wrong credentials "marge.ner@gmail.com" and "ariet"