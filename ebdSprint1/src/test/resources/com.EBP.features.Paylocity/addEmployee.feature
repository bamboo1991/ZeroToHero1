Feature: add employee

  Background:
    * the user navigates to the EBP wep page
    Given the user logs in with valid username and password

  Scenario Outline:
    * the user  click on Add Employee button
    * the user enters the info "<lastName>" "<firstName>" "<dependents>"
    * the user clicks on save button
    * the user validate the new employee is displayed in the table "<lastName>" "<firstName>" "<dependents>"
    * the user
    Examples:
      | lastName  | firstName   | dependents |
      | Aisanat   | Apazova     | 0          |
      | Ajara     | Arzybaeva   | 1          |
      | Hojamyrat | Bermuhammad | 3          |
      | Ariet     | Stamov      | 1          |
      | Anilustun | Unknown     | 2          |
