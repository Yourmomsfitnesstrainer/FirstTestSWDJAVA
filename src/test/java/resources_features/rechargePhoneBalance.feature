@all
Feature: TestGoogle

  @all
  Scenario: Search of google


    When User go to "epayments.com"
    Then User accepts cookies
    Then User button click SignIn
    Then User fields login and pass
    And  User goes to menu "transfer"
    And  User click section "onMobilePhone"
    And  User fill field phone number "+79177197899"


    And Close browser