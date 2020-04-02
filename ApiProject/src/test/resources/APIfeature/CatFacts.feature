Feature: Cat facts verification

  Scenario: Verify facts not by Mr.Wohlbruck
    When user send GET request to cat facts api
    Then status code is 200
    And user sees facts not only from Wohlbruck

    Scenario: Verify facts not about cats
      When user sends GET request to cat facts api
      Then status code is 200
      And user sees facts not about cats