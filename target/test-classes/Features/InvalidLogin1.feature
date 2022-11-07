@ignore
Feature: Login Functionality

  Scenario: Login with invalid credentials should return error message

    Given I am on the landing page
    When I select the sign in link
    And I enter the correct username
    And I enter incorrect password
    When I click on the login button
    Then i should get the correct error message


