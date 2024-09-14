Feature: Current location label
  
  Scenario: Сurrent location label is displayed on the Main Page
    When I accept the consent data button on the Main Page
    And Сliсk search field
    Then Current location label is displayed
