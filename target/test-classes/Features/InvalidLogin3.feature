Feature: Login Functionality


  Scenario Outline: invalid username or password should return the correct error message

    Given I land on the homepage
    And I click on the sign in button
    When I enter "<Username>"
    And I input "<Password>"
    When I click on the  login
    Then I should get the correct "<error>"

    Examples:
    | Username                       | Password          | error                      |
    |nwolisachinedu2015@yahoo.com    | godson2015        | Authentication failed.     |
    |wolisachinedu2015@yahoo.com     | Godson2015        | Authentication failed.     |
    |                                |                   | An email address required. |