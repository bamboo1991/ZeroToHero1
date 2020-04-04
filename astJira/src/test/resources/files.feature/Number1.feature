@regression
Feature : Creating Jira Project

  Scenario: Creating project board
    When user sends post request to the "endPoint"
      | http://localhost:8080/rest/api/1.0/dashboard |
    Then user verifies board was created with status code 200

  Scenario Outline: Creating sprint
    When User creates Sprints with different "<SprintName>" "<Goal>"
    Then user verifies board was created with status code 200
    Examples:
      | SprintName  | Goal                                                                  |
      | JC Sprint 1 | We are the champions                                                  |
      | JC Sprint 2 | Our project is create and learn how to create Jira board on Postman   |
      | JC Sprint 3 | User must be able to create account using his/her email and full name |

  Scenario Outline:  Creating issues for each Sprint1
    When user creates a issue under the sprint "<Sprint_name>" "<type>" "<assignee>""<summary>""<description>""<priority>"
    Then user verifies board was created with status code 201
    Examples:
      | Sprint_name | type | assignee   | summary                            | description | priority |
      | JC Sprint 1 | Bug  | bamboo1991 | User needs to put an email address | When        | High     |
      | JC Sprint 1 | Bug  | bamboo1991 | User must put an email address     | bla         | Low      |
      | JC Sprint 1 | Bug  | bamboo1991 | User must update an email address  | bla         | Medium   |

  Scenario Outline:  Creating issues for each Sprint2
    When user creates a issue under the sprint "<Sprint_name>" "<type>" "<assignee>""<summary>""<description>""<priority>"
    Then user verifies board was created with status code 201
    Examples:
      | Sprint_name | type | assignee   | summary                            | description | priority |
      | JC Sprint 2 | Bug  | bamboo1991 | User needs to put an email address | When        | High     |
      | JC Sprint 2 | Bug  | bamboo1991 | User must put an email address     | bla         | Low      |
      | JC Sprint 2 | Bug  | bamboo1991 | User must update an email address  | bla         | Medium   |

  Scenario Outline:  Creating issues for each Sprint3
    When user creates a issue under the sprint "<Sprint_name>" "<type>" "<assignee>""<summary>""<description>""<priority>"
    Then user verifies board was created with status code 201
    Examples:
      | Sprint_name | type | assignee   | summary                            | description | priority |
      | JC Sprint 3 | Bug  | bamboo1991 | User needs to put an email address | When        | High     |
      | JC Sprint 3 | Bug  | bamboo1991 | User must put an email address     | bla         | Low      |
      | JC Sprint 3 | Bug  | bamboo1991 | User must update an email address  | bla         | Medium   |





