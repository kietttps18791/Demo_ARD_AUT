package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TC_06;
import pages.TC_07;

public class TC_07_Steps {
TC_07 tc07 = new TC_07();
    @Given("I open the SHEIN App TC_07")
    public void openSheinApp() {
        tc07.gotoHomeScreen();
    }

    @And("I search for the product iphone")
    public void searchProduct() {
        tc07.search();
    }

    @And("I click on the second product TC_07")
    public void clickOnSecondProduct() throws InterruptedException {
        tc07.secondPrd();
    }

    @And("I click on 'Add to Cart' with a quantity of 2")
    public void clickAddToCart() {
        tc07.clickFirstSize();
        tc07.addQTY();
        tc07.clickAddToCart();
    }

    @And("I click on the Cart")
    public void clickCartIcon() {
        tc07.clickCart();
    }

    @And("I click checkout button")
    public void clickCheckoutButton() {
        tc07.clickCheckout();
    }

    @And("I select Credit or Debit Card as the payment method")
    public void selectPaymentMethod() {
        tc07.clickCredit();
    }

    @And("I click on 'Place Order'")
    public void clickPlaceOrder() {
        tc07.clickPlaceOrder();
    }

    @Then("the 'Payment' screen should display the following elements:")
    public void verifyPaymentScreenElements() {
        tc07.verifyCardnumber();
        tc07.verifyCVV();
        tc07.verifyBillingAddress();
        tc07.verifyExpireDate();
        tc07.verifyOrderNumber();
        tc07.verifySubtotal();
        tc07.verifyPlaceorder();
    }
}
