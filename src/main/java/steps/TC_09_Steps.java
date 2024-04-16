package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TC_08;
import pages.TC_09;

public class TC_09_Steps {
TC_09 tc09 =new TC_09();

    @Given("I open the SHEIN App TC_09")
    public void openSheinApp() {
        tc09.gotoHomeScreen();
    }

    @Given("I click on the Me")
    public void clickMeButton() {
        tc09.clickMe();
    }

    @Given("I click on Gift Card")
    public void clickGiftCard() {
        tc09.clickGiftcard();
    }

    // Scenario steps
    @Then("the 'Gift Card' screen should display the following elements")
    public void verifyGiftCardElements() {
        tc09.verifyCardNumber();
        tc09.verifyPIN();
        tc09.verifyCheckBalence();
    }
}
