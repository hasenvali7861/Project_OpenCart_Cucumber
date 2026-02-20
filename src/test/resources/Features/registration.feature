Feature: Demo Registration page
  Scenario: Enter details for new registration
    Given User clicks on Register button
    And Enter firstName as "TestFirstHasen"
    And Enter lastName as "TestLastHasen"
    And Enter email as "TestCucumberHasen@gmail.com"
    And Enter telephone as "9876543210"
    And Enter password as "TestHasen123"
    And Re_Enter password as "TestHasen123"
    And Check on Privacy policy
    And Click on continue button
    Then Registration done successfully