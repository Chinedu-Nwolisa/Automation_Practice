Feature: Homepage logo and Cart Button

  Scenario: Verify that logo and cart button are displayed on the homepage

    Given i launch a browser
    And I enter Application url
    When I wait for 5 seconds
    Then I should see application logo and add to cart login