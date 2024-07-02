Feature: Omni Hypnose All Click On Links

 # Scenario:	Check the availability of Overhead Menu Elements
   # Given the user on main page
   # When the user click on OMNIfinder accepted
    #And the user click on AboutOMNI button
    #And the user click on OMNI Language toggle to choose german

@wip
  Scenario: Check the availability of Overhead Menu Elements
    Given the user on main page
    And the user click on OMNIfinder accepted
    And the user click on OMNI Language toggle to choose german
    And the user clicks on BEGINNE NOCH HEUTE starten
    When the user clicks on Jetzt Platz in der Schweiz sichern
    And the user fills the form
    And the user click on apply coupon button
    And the user enter the coupon in the place holder
    And the user click on apply
   #Then the user check the total amounth zero
   Then the user click on complete order
    #And the user clicks on Debit- or Kreditkarte
    #Then the user checks PayPal

   # Scenario:	Check the availability of Overhead Menu Elements
  #  Given the user on main page
  #  When the user click on OMNI Hypnotisor_Modul1
  #  And the user click on jetzt Onlineausbildung starten
 #   And user fills the form
  #  And user clicks on Debit- oder Kreditkarte
  #  Then user checks the paypal

# Feature: Omni Hypnosis - Click on All Links

 # Scenario: Check the availability of Overhead Menu Elements
  #  Given the user is on the main page
  #  When the user clicks on the OMNIfinder button
  #  And the user clicks on the About OMNI button
  #  And the user clicks on the OMNI Language toggle to choose German

 # Scenario Outline: Check the availability of Overhead Menu Elements
  #  Given the user is on the main page
  #  When the user clicks on the <OverheadMenu>
  #  Then the user is on the <OverheadMenu> page
  #  Examples:
   #   | OverheadMenu   |
   #   | Ausbildung     |
   #   | Weiterbildung  |
   #   | OMNIfinder     |
   #   | Über OMNI      |
   #   | Sign In        |

  #@wip