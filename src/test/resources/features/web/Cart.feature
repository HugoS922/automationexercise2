@Cart @UI
Feature: Cart page

  Scenario: A user with a proper role should be able to visit the Cart page
    Given I navigate to Home page for carts
    When I should be able to see the Cart button
    When I click on the Cart button
    Then the Cart page will load empty

#  Scenario: A user with a proper role should be able to fill the cart
#    Given I navigate to Home page for carts
#    When I should be able to see the Cart button
#    When I click on the Cart button
#    Then the Cart page will load empty