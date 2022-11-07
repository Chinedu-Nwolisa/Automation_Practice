Feature: Create User

  Scenario: Create New User

    Given i get on the home screen
    When i get on the login screen
    And i enter email address for new account
    And i click the create account button
    When i enter all required details
    And i click the register button
    Then my account should be created successfully