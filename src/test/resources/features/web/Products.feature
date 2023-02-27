@UI
Feature: Products page

  Scenario: A user with a proper role should be able to visit the products page
    Given I navigate to Home page
    When I should be able to see the Products button
    When I click on the Products button
    Then the Products page will load

  Scenario: A user with a proper role should be able to visit the Polo page
    Given i am in Products page
    When I should be able to see the Brands button
    When I click on the Polo button
    Then the Polo page will load
    Then the Polo quantity matches with the expected

  Scenario: A user with a proper role should be able to visit the H&M page
    Given i am in Products page
    When I should be able to see the Brands button
    When I click on the H&M button
    Then the H&M page will load
    Then the H&M quantity matches with the expected

  Scenario: A user with a proper role should be able to visit the Madame page
    Given i am in Products page
    When I should be able to see the Brands button
    When I click on the Madame button
    Then the Madame page will load
    Then the Madame quantity matches with the expected

  Scenario: A user with a proper role should be able to visit the Mast & Harbour page
    Given i am in Products page
    When I should be able to see the Brands button
    When I click on the Mast & Harbour button
    Then the Mast & Harbour page will load
    Then the Mast & Harbour quantity matches with the expected

  Scenario: A user with a proper role should be able to visit the Babyhug page
    Given i am in Products page
    When I should be able to see the Brands button
    When I click on the Babyhug button
    Then the Babyhug page will load
    Then the Babyhug quantity matches with the expected

  Scenario: A user with a proper role should be able to visit the Allen Solly Junior page
    Given i am in Products page
    When I should be able to see the Brands button
    When I click on the Allen Solly Junior button
    Then the Allen Solly Junior page will load
    Then the Allen Solly Junior quantity matches with the expected

  Scenario: A user with a proper role should be able to visit the Kookie Kids page
    Given i am in Products page
    When I should be able to see the Brands button
    When I click on the Kookie Kids button
    Then the Kookie Kids page will load
    Then the Kookie Kids quantity matches with the expected

  Scenario: A user with a proper role should be able to visit the Biba page
    Given i am in Products page
    When I should be able to see the Brands button
    When I click on the Biba button
    Then the Biba page will load
    Then the Biba quantity matches with the expected