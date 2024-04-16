Feature: Verify 'Payment' Screen on SHEIN App

  Scenario:SHEIN_TC_07 View Payment Details
    Given I open the SHEIN App TC_07
    And I search for the product iphone
    And I click on the second product TC_07
    And I click on 'Add to Cart' with a quantity of 2
    And I click on the Cart
    And I click checkout button
    And I select Credit or Debit Card as the payment method
    And I click on 'Place Order'
    Then the 'Payment' screen should display the following elements:

