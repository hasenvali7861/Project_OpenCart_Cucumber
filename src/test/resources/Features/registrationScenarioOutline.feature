Feature: My Demo Opencart Application outline registration page
  Scenario Outline: Registration scenario with scenario Outline
    Given User clicks on Register button
    And Enter firstName as "<firstName>"
    And Enter lastName as "<lastName>"
    And Enter email as "<email>"
    And Enter telephone as "<telephone>"
    And Enter password as "<password>"
    And Re_Enter password as "<password2>"
    And Check on Privacy policy
    And Click on continue button
    Then Registration done successfully
    Examples:
      | firstName | lastName         | email                          | telephone   | password     | password2    |
      | shaik     | hasenOutline     | hasentestOutline@gmail.com     | 12345678900 | hasen123     | hasen123     |
      | shaik     | valiOutline      | valitestOutline@gmail.com      | 12345678900 | vali123      | vali123      |
      | shaik     | hasenvaliOutline | hasenvalitestOutline@gmail.com | 12345678900 | hasenvali123 | hasenvali123 |
