Feature: edit employee
  Background:
    * the user navigates to the EBP wep page
    Given the user logs in with valid username and password

Scenario Outline:
    * the user click on edit button
    * the user enters the info "<lastName>" "<firstName>" "<dependents>"
    * the user validate the edited information
    * the user validate the edited employee is displayed in the table
Examples:
  |lastName|firstName|dependents|