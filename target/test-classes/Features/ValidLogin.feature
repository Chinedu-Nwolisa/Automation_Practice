Feature: Login functionality


  Scenario: User should be able to login with valid credentials

    Given I am on the homepage
    When I click the sign in button
    And i enter valid username
    And i enter valid password
    When i click the login button
    Then I should be logged in successfully