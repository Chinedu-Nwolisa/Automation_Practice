Feature: Sign In

  Scenario: Assert that the sign in button navigates to the sign in page

    Given i get on the homepage
    And i press the sign in button
    Then i should navigate to the sign in page successfully