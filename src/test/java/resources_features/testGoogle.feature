@all
Feature: TestGoogle
  @all
  Scenario: Search of google


    When User go to "google.com"
    Then User fills in the search bar
    And  User clicks on search button
    Then User sees the first result
    And Close browser