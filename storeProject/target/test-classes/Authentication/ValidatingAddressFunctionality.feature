@regression
Feature: Validating My Address Functionality

  Background:
    Given the user navigated to the website
@Smoke @TC-04
  Scenario:
    * the user must refresh the page
    * the user must login "marge.wehner@gmail.com" and "bl%xds"
    * User home address needs to be updated
      | Address      | 12 east devon ave |
      | City         | New York          |
      | State        | New York          |
      | Zip          | 33333             |
      | Country      | United States     |
      | Phone Number | 3120002222        |
  * the user must validate the new address
  |New address|12 east devon ave|
  |New zip    | 33333           |



