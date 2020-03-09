Feature: This is for discount

  Background:
    * the user navigates to the EBP wep page
    Given the user logs in with valid username and password

  Scenario:
    * the user check if new employee name does not starts with "A"
    * the user apply 10% discount if the new employee name starts with "A" or "a"
    * the user validate benefit cost validations are correct