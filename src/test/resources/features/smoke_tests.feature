@smoke
Feature: Omni Page Smoke Test

  Scenario: Check the basic features of the Omni hypnosis website
    Given the user is on the main page
    Then the URL of the website should be correct
    When the user clicks on the Cookiebot Alle zulassen button
    And the user click on About OMNI button
    Then the AboutOMNI page should be confirmed
    When the user clicks on the OMNI Language toggle to choose German
    Then the language should change to German

  Scenario: Check the availability of order process for Switzerland
    Given the user is on the main page
    When the user clicks on the Cookiebot Alle zulassen button
    And the user clicks on the OMNI Language toggle to choose German
    And the user clicks on BEGINNE NOCH HEUTE button
    Then the Order Process page should open
    When the user clicks on Jetzt Platz in der Schweiz sichern
    And the user fills out the form and chooses Switzerland as the country
    And the user clicks on Hast du einen Gutscheincode?
    And the user enters the coupon in the placeholder
    And the user clicks on apply
    Then the user clicks on complete order and verifies if the order is completed

  Scenario: Check the availability of order process for Germany
    Given the user is on the main page
    When the user clicks on the Cookiebot Alle zulassen button
    And the user clicks on the OMNI Language toggle to choose German
    And the User choose Deutchland from Hover Over Menu
    And the user clicks on Jetzt Platz in Deutschland sichern
    And the user fills the form
    And the user clicks on Hast du einen Gutscheincode?
    And the user enters the coupon in the placeholder
    And the user clicks on apply
    Then the user clicks on complete order and verifies if the order is completed

  Scenario: Check the availability of order process for the USA
    Given the user is on the main page
    When the user clicks on the Cookiebot Alle zulassen button
    And the User choose US from Hover Over Menu
    And the user clicks on Secure your spot in the US
    And the user fills the form and choose USA as country
    And the user clicks on Hast du einen Gutscheincode?
    And the user enters the coupon in the placeholder
    And the user clicks on apply
    Then the user clicks on complete order and verifies if the order is completed

  Scenario: Check the availability of Hypnokids Certification online
    Given the user is on the main page
    When the user clicks on the Cookiebot Alle zulassen button
    And the user choose online coursess from hoverover menu Continuing Education
    And the user clicks on Hypnokids Certification
    And the user clicks on the Buynow button
    And the user fills the form
    And the user clicks on Hast du einen Gutscheincode?
    And the user enters the coupon in the placeholder
    And the user clicks on apply
    Then the user clicks on complete order and verifies if the order is completed

