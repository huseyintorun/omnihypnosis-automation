Feature: Omni Hypnose All Click On Links

  Scenario:	Check the availability of Overhead Menu Elements
    Given the user on main page
    When the user click on OMNIfinder accepted
    And the user click on AboutOMNI button
    Then the user click on OMNI Language toggle to choose german

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
   Then the user click on complete order


  @Smoke
 # Assertions eklenecek.
  #Java Faker class ekle

  #2. ürün https://www.omnihypnosis.com/courses/omni-hypnosetherapeut-zertifizierung-intensiv-live-deutschland-oesterreich
# 3. https://www.omnihypnosis.com/courses/omni-hypnotherapist-certification-intensive-live-usa

  @Regression
    # Öncelik smoke zaman kalirsa bu
