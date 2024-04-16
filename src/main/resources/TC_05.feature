Feature: Verify Add Shipping Address on SHEIN App

  Scenario:SHEIN_TC_05 Add a Shipping Address Successfully
    Given Open the SHEIN
    When I click on 'Me' on the menu bar
    And I click on the setting icon on the top screen
    And I click on 'Address book'
    Then the 'My Address' page should display the 'Add a shipping address' button
