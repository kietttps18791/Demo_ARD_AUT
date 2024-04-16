package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TC_03;
import pages.TC_04;

public class TC_04_Steps {
    TC_04 tc04 = new TC_04();
    @Given("open the SHEIN App")
    public void openSheinApp() {
        tc04.gotoHomeScreen();
    }

    @And("I click on 'Nhà' in the top")
    public void clickOnNhaInTopMenu() {
        tc04.clickNha();
    }

    @And("I click on 'Hàng Giao Dụng' category")
    public void clickOnHangGiaoDungCategory() {
        tc04.clickHanggiadung();
    }

    @And("I click on 'Filter'")
    public void clickFilter() {
        tc04.clickFilter();
    }

    @And("I select 'New' as the product filter")
    public void selectProductFilter() {
        tc04.selectFilterNew();
    }

    @And("I select 'Daily Home Essentials' as the product category")
    public void selectProductCategory() {
        tc04.clickFirstCategory();
    }

    @And("I click 'Done'")
    public void clickDone() {
        tc04.clickDone();
    }

    // Scenario steps
    @When("I click on the second product")
    public void clickOnSecondProduct() {
        tc04.clickSecondProduct();
    }

    @Then("the 'Product Detail' screen should be displayed")
    public void verifyProductDetailScreen() {
        tc04.verifyImage();
        tc04.verifyPrice();
        tc04.verifyQTY();
        tc04.verifyAddtocart();
    }
}
