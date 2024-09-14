Feature: Search city
  
  Scenario: Search city page opens
    When I accept the consent data button on the Main Page
    And Input "New York" in the search field
    Then Search results list is displayed
    When I click on the first search result
    Then City weather page header contains "New York"
