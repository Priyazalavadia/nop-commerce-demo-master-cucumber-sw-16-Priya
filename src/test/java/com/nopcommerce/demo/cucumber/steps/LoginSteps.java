package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("^I am On login Page$")
    public void iAmOnLoginPage() {
    }

    @When("^I click on login Link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^Welcome Message displayed$")
    public void welcomeMessageDisplayed() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        org.testng.Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }


    @Then("^I should see error message displayed$")
    public void iShouldSeeErrorMessageDisplayed() {
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = new LoginPage().getErrorMessage();
        org.testng.Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
    }

    @Then("^I should see Logout link displayed$")
    public void iShouldSeeLogoutLinkDisplayed() {
        org.testng.Assert.assertTrue(new HomePage().isLogOutLinkDisplay(), "Logout link is not displayed");


    }

    @And("^I click On logout link$")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^i should see login link is displayed$")
    public void iShouldSeeLoginLinkIsDisplayed() {
        Assert.assertTrue(new HomePage().isLogInLinkDisplay(), "Login link is not displayed");

    }
}
