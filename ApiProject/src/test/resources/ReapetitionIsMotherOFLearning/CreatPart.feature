Feature: Lets create a pet and do some manipulations

  @API
  Scenario: create a pet with specific ID
    When I will "create" one pet with id num 102
    Then check its existence by statud code 200
    And  pet is created
