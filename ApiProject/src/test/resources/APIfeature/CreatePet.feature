Feature: Verify pet API endpoints


  @API
  Scenario: Create a pet endpoint
    When user "creates" a pet with id 101
    Then the status code should be 200
    And pet is "created"
