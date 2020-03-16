@regression
Feature: Authentication functionality

  @Smoke @TC-01
  Scenario: Create an account verify it is created by signing in (Use Datatable)
    Given the user navigated to the website
    When the user must sing up with email address
    Then the user will enter his or her information to sing up
      | FirstName | Ariet   |
      | LastName  | Johnson |
    * the user must provide address information
      | Name        | Ariet         |
      | LastName    | Johnson       |
      | Company     | Chase         |
      | Address     | 10 S deaborn  |
      | City        | Chicago       |
      | State       | Illinois      |
      | Zip         | 60062         |
      | Country     | United States |
      | PhoneNumber | 312-212-2222  |
    * once account was created exits by singing out
    * the user must verify the account by sign in with email and password
    Then the user must verify her or his name on header part "Ariet Johnson"


