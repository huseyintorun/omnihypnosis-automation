@smoke
Feature: Omni Page Smoke Test

  Scenario: Check the Basis Features of Omni_hypnosis Website
    Given the user on main page
    Then check the URL of website correct
    When the user click on OMNIfinder accepted
    And the user click on AboutOMNI button
    Then User confirm that Page
    Then the user click on OMNI Language toggle to choose german
    Then user check that Lamguage changed
@wip
  Scenario: Check the availability of order Process for Switzerland
    Given the user on main page
    And the user click on OMNIfinder accepted
    And the user click on OMNI Language toggle to choose german
    And the user clicks on BEGINNE NOCH HEUTE starten
    Then the user checks that Order Process page opens
    When the user clicks on Jetzt Platz in der Schweiz sichern
    And the user fills the form and choose Switzerland as country
    And the user click on apply coupon button
    And the user enter the coupon in the place holder
    #And the user click on apply
    #Then the user click on complete order and check if order completed or not
@wip
  Scenario: Check the availability of order Process for Deutschland
    Given the user on main page
    And the user click on OMNIfinder accepted
    And the user click on OMNI Language toggle to choose german
    And the User choose Deutchland from Hover Over Menu
    And the user clicks on Jetzt Platz in Deutschland sichern
    And the user fills the form
    And the user click on apply coupon button
    And the user enter the coupon in the place holder
   #And the user click on apply
    #Then the user click on complete order and check if order completed or not

  Scenario: Check the availability of order Process for USA
    Given the user on main page
    And the user click on OMNIfinder accepted
    And the user click on OMNI Language toggle to choose german
    And the User choose US from Hover Over Menu
    And the user clicks on Secure your spot in the US
    And the user fills the form and choose USA as country
    And the user click on apply coupon button
    And the user enter the coupon in the place holder
    #And the user click on apply
    #Then the user click on complete order and check if order completed or not

  Scenario: Check the availability of Hypnokids Certification online
    Given the user on main page
    And the user click on OMNIfinder accepted
    And the user choose online coursess from hoverover menu Continuing Education
    And the user clicks on Hypnokids Certification
    And the user clicks Buynow button
    And the user fills the form
    And the user click on apply coupon button
    And the user enter the coupon in the place holder
    #And the user click on apply
    #Then the user click on complete order and check if order completed or not

