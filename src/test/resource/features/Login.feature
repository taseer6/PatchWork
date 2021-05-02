Feature: As an Authentic user I should be able to login and perform a search

  Background:
    Given I am on login page


  Scenario Outline: Authentic user should successfully login
    When I enter "<valid email>" and "<valid password>"
    Then I should successfully login and make a search
    Examples:
      | valid email         | valid password |
      | taseer6@hotmail.com | 12345          |

  Scenario Outline: Invalid user should get warning notification
    When I enter "<invalid email>" and "<invalid password>"
    Then I should get login warning notification
    Examples:
      | invalid email          | invalid password |
      | wrongemail@hotmail.com | 12345            |
      | taseer66@hotmail.com   | wrongpassword    |
      | taseer6624@hotmail.com   | wrongpassword    |
