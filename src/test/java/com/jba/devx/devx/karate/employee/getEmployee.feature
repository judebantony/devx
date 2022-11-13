Feature: Get employee

  Background:
    * url 'http://localhost:8080/api/v1'

  Scenario: Fetch a employee

    Given path '/employee/1'
    And header Content-Type = 'application/json'
    When method GET
    Then status 200
 
  Scenario: Fetch non existing employee

    Given path '/employee/2'
    And header Content-Type = 'application/json'
    When method GET
    Then status 500