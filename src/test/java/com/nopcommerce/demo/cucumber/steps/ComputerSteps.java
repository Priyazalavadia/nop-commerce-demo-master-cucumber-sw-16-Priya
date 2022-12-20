package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @Given("^I am on computer page$")
    public void iAmOnComputerPage() {
    }

    @When("^I click on Menu Tab \"([^\"]*)\"$")
    public void iClickOnMenuTab(String menu) {
        new HomePage().clickOnMenuTab(menu);

    }

    @Then("^I should navigate to computer page successfully$")
    public void iShouldNavigateToComputerPageSuccessfully() {
        String expectedMessage = "Computers";
        String actualMessage = new ComputerPage().getPageTitleText();
        org.testng.Assert.assertEquals(expectedMessage, actualMessage, "Computers page not displayed");
    }

     @And("^I click on subMenu \"([^\"]*)\"$")
    public void iClickOnSubMenu(String subTab){
         new ComputerPage().clickOnSubMenu(subTab);

    }

    @Then("^verify desktop page displayed successfully$")
    public void verifyDesktopPageDisplayedSuccessfully() {
        String expectedMessage = "Desktops";
        String actualMessage = new ComputerPage().getPageTitleText();
        org.testng.Assert.assertEquals(expectedMessage, actualMessage, "Desktops page not displayed");
    }


    @And("^Select Product \"([^\"]*)\"$")
    public void selectProduct(String productName){
        new DesktopsPage().selectProduct(productName);

    }

    @And("^Select Processor \"([^\"]*)\"$")
    public void selectProcessor(String processor){
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^Select ram \"([^\"]*)\"$")
    public void selectRam(String ram){
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("^Select hdd \"([^\"]*)\"$")
    public void selectHdd(String hdd){
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("^Select os \"([^\"]*)\"$")
    public void selectOs(String os){
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("^Select software \"([^\"]*)\"$")
    public void selectSoftware(String software){
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("^Click on Add to cart button$")
    public void clickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^I can see the confirmation message$")
    public void iCanSeeTheConfirmationMessage() {
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = new BuildYourOwnComputerPage().getProductAddedMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Product does not added to cart");
    }
}
