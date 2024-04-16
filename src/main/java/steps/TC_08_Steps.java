package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TC_08;

public class TC_08_Steps {
TC_08 tc08 = new TC_08();
    @Given("I open the SHEIN App TC_08")
    public void openSheinApp() {
        tc08.gotoHomeScreen();
    }

    @Given("I click on the 'Me' button")
    public void clickMeButton() {
        tc08.clickMe();
    }

    @Given("I click on 'Points'")
    public void clickPoints() {
        tc08.clickPoints();
    }

    @Then("the 'SHEIN Points' screen should display the following elements")
    public void verifySheinPointsElements() {
       tc08.verifyGocheckin();
       tc08.verifyPoints0to1000();
       tc08.verifyPoints0to400();
       tc08.verifyPoints5to60();
    }

}
