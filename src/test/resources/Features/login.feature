Feature: My Demo Opencart Application Login page

  Background:

    Given User clicks on login button

@test
  Scenario: Login should be Successful
    And User enters username as "abc123@gmail.com"
    And User enters password as "test@123"
    When User clicks on login option
    Then Login should be successful

@reg
  Scenario: Login should not be Successful
    And User enters username as "incorrect@demo.com"
    And User enters password as "incorrectPass"
    When User clicks on login button
    But Login should not be successful

