package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TC_01;

public class TC_01_Steps {
    TC_01 tc01 = new TC_01();
    @Given("I open the SHEIN App")
    public void openSheinApp() {
    }

    @Then("the SHEIN App successfully auto redirects to the welcome screen")
    public void gotoWelcomeScreen() {
        tc01.gotoHomeScreen();
    }

    @And("the following elements are displayed on the welcome screen:")
    public void verifyElements() {
        tc01.verifySearch();
        tc01.verifyCatagory();
        tc01.verifyShop();
        tc01.verifyNew();
        tc01.verifyCart();
        tc01.verifyMe();
    }
}
