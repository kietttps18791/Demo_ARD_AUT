Feature: Verify 'Order Confirmation' Screen on SHEIN App

  Scenario:SHEIN_TC_06 View Order Confirmation Details
    Given I open the SHEIN App_TC06
    And I click on Nhà in the top menu
    And I click on Hàng Giao Dụng category
    And I click on the secondproduct
    And I click on Add to Cart
    And I click on the Cart icon
    And I click on the checkout button
    And I select 'Cash On Delivery' as the payment method
    And I click on 'Continue to Payment'
    Then the 'Order Confirmation' screen should display the following elements: