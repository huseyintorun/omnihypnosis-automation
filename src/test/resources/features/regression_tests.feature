Feature: Omni Page Regression Test

  Scenario: Login function
    Given the user is on the main page
    When the user clicks on the Cookiebot Alle zulassen button
    And the user clicks on the Sign in button and enter credentials and click second sign in button
    Then the user is logged in and the main menü appears

