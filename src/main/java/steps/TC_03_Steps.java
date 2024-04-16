package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TC_02;
import pages.TC_03;

public class TC_03_Steps {
    TC_03 tc03 = new TC_03();
    @Given("Open the SHEIN App")
    public void openSheinApp() {

    }

    @When("I click on 'Nhà' in the top menu")
    public void clickOnNhaInTopMenu() {
    tc03.gotoHomeScreen();
    tc03.clickNha();
    }

    @Then("the 'Nhà + Vật Nuôi' screen displays the following categories")
    public void verifyNhaCategories() {
    tc03.verifyDetmay();
    tc03.verifyStorage();
    tc03.verifyCaithien();
    tc03.verifyLighting();
    tc03.verifyBedding();
    tc03.verifyKitchen();
    tc03.verifyHanggiadung();
    tc03.verifyEvent();
    tc03.verifyHomeDecor();
    tc03.verifyBathroom();
    tc03.verifyPet();
    tc03.verifyToy();
    }
}
