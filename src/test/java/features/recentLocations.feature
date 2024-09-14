Feature: Recent locations
  
  Scenario: Recent location page opens
    When I accept the consent data button on the Main Page
    And Input "London" in the search field
    And I click on the first search result
    And Wait for the selected city page is open
    And Back to the previous page
    Then Main page is opened
    When I choose the first recent location
    Then City weather page header contains "London"
