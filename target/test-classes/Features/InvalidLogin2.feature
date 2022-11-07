@ignore
Feature: Login Functionality

  Scenario: Wrong username and correct password should return the correct error message

    Given I get on the homepage
    And I press the sign in button
    When I enter the wrong username
    And enter the correct password
    When I click on the button to login
    Then I should get the correct error message
