package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TC_05;
import pages.TC_06;

public class TC_06_Steps {
    TC_06 tc06 = new TC_06();
    @Given("I open the SHEIN App_TC06")
    public void openSheinApp() {
        tc06.gotoHomeScreen();
    }

    @And("I click on Nhà in the top menu")
    public void clickOnNhaInTopMenu() {
        tc06.clickNha();
    }

    @And("I click on Hàng Giao Dụng category")
    public void clickOnHangGiaoDungCategory() {
        tc06.clickHanggiadung();
    }

    @And("I click on the secondproduct")
    public void clickOnSecondProduct() {
        tc06.clickSecondProduct();
    }

    @And("I click on Add to Cart")
    public void clickAddToCart() {
        tc06.clickAddtoCart();
    }

    @And("I click on the Cart icon")
    public void clickCartIcon() {
        tc06.clickCart();
    }

    @And("I click on the checkout button")
    public void clickCheckoutButton() {
        tc06.clickCheckout();
    }

    @And("I select 'Cash On Delivery' as the payment method")
    public void selectPaymentMethod() {
        tc06.selectCashOnDelivery();
    }

    @And("I click on 'Continue to Payment'")
    public void clickContinueToPayment() {
        tc06.clickContinue();
    }

    // Scenario steps
    @Then("the 'Order Confirmation' screen should display the following elements:")
    public void verifyOrderConfirmationElements() {
        tc06.verifyText();
        tc06.verifyPhoneNumber();
        tc06.verifyCode();
        tc06.verifyTextCannot();
    }
}
