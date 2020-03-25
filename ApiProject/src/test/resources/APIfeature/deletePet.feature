Feature: Verify pet API endpoints
@API
  Scenario: User is able to delete a pet

    When user "delete" a pet with id 101
    Then the status code should be 200
    And pet is "deleted"