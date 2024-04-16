package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TC_04;
import pages.TC_05;

public class TC_05_Steps {
    TC_05 tc_05 = new TC_05();
    @Given("Open the SHEIN")
    public void openSheinApp() {
        tc_05.gotoHomeScreen();
    }

    @When("I click on 'Me' on the menu bar")
    public void clickOnMeOnMenuBar() {
        tc_05.clickMe();
    }

    @And("I click on the setting icon on the top screen")
    public void clickOnSettingIcon() {
        tc_05.clickSetting();
    }

    @And("I click on 'Address book'")
    public void clickOnAddressBook() {
        tc_05.clickAddressBook();
    }

    @Then("the 'My Address' page should display the 'Add a shipping address' button")
    public void verifyAddShippingAddressButton() {
        tc_05.verifyAddaShipping();
    }
}
