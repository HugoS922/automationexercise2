@Login @UI
Feature: Login page

  Scenario Outline: A user with a proper role should be able to login Automation Exercise page
    Given I navigate to Login page
    When I login to the page as a user with "<User Role>" role
    Then I should login to Admin page successfully

    Examples:
      | User Role |
      | user      |
