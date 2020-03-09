Feature: add employee

  Background:
    * the user navigates to the EBP wep page
    Given the user logs in with valid username and password

  Scenario Outline:
    * the user  click on Add Employee button
    * the user enters the info "<lastName>" "<firstName>" "<dependents>"
    * the user clicks on save button
    * the user check if new employee name does not starts with "A"
    * the user apply 10% discount if the new employee name starts with "A" or "a"
    * the user validate the new employee is displayed in the table
    * the user validate benefit cost validations are correct
    Examples:
      | lastName | firstName | dependents |
      | NNN      | MMM       | 12         |