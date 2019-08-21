@all
Feature: TestGoogle
  Scenario: Search of google
    Given User opened a browser
    When User is on google page
    Then User fills in the search bar
    And  User clicks on search button
    Then User sees the first result
    And Close browser