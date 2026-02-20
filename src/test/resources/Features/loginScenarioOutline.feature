Feature: My Demo Opencart Application Login page
  Scenario Outline: Login scenario with scenario Outline

    Given User logins to application with "<username>" and  "<password>"

    @smoke
    Examples:
      | username           | password  |
      | hasenvali@test.com | hasenvali |
      | abc123@gmail.com   | test@123  |

    @prod
    Examples:
      | username          | password |
      | hasenvali@test.com | hasenvali |
      | abc123@gmail.com | test@123 |


