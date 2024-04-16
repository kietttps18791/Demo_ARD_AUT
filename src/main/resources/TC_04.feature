Feature: Verify 'Product Detail' Screen on SHEIN App

  Scenario:SHEIN_TC_04 View Product Details
    Given open the SHEIN App
    And I click on 'Nhà' in the top
    And I click on 'Hàng Giao Dụng' category
    And I click on 'Filter'
    And I select 'New' as the product filter
    And I select 'Daily Home Essentials' as the product category
    And I click 'Done'
    When I click on the second product
    Then the 'Product Detail' screen should be displayed
