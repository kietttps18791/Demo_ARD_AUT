package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TC_02;

public class TC_02_Steps {
    TC_02 tc02 = new TC_02();
    @Given("I open the SHEIN")
    public void openSheinApp() {
        // Code to open the SHEIN App
    }

    @When("I click on the 'Category' option")
    public void clickOnCategory() {
        tc02.gotoHomeScreen();
        tc02.clickCategory();
    }

    @Then("the 'Category' screen displays the following items")
    public void verifyCategoryItems() {
        tc02.verifyDam();
        tc02.verifyAo();
        tc02.verifyDodibien();
        tc02.verifyPhukien();
        tc02.verifyTrangsuc();
        tc02.verifyTui();
    }
}
