Feature: Verify Home screen on SHEIN App

  Scenario:SHEIN_TC_01 Open SHEIN App and Verify Home Screen
    Given I open the SHEIN App
    Then the SHEIN App successfully auto redirects to the welcome screen
    And the following elements are displayed on the welcome screen:
