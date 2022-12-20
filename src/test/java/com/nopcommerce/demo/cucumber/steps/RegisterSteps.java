package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class RegisterSteps {
    SoftAssert softAssert = new SoftAssert();

    @Given("^I am on Register Page$")
    public void iAmOnRegisterPage() {
    }

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should see Register Page is displayed$")
    public void iShouldSeeRegisterPageIsDisplayed() {
        org.testng.Assert.assertEquals("Register", new RegisterPage().getRegisterText(), "Register page not displayed");
    }

    @When("^I click on Registration Buttonn$")
    public void iClickOnRegistrationButtonn() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("^I should see First name is required \"([^\"]*)\"$")
    public void iShouldSeeFirstNameIsRequired(String FirstName){
        softAssert.assertEquals("First name is required.",
                new RegisterPage().getValidationErrorMessageForField(FirstName),
                "FirstName field error message not displayed");
        softAssert.assertAll();

    }

    @And("^I should see Last name is required \"([^\"]*)\"$")
    public void iShouldSeeLastNameIsRequired(String LastName){
        softAssert.assertEquals("First name is required.",
                new RegisterPage().getValidationErrorMessageForField(LastName),
                "FirstName field error message not displayed");
        softAssert.assertAll();

    }

    @And("^I should see email is required \"([^\"]*)\"$")
    public void iShouldSeeEmailIsRequired(String email) {
            softAssert.assertEquals("Email is required.",
                    new RegisterPage().getValidationErrorMessageForField(email),
                    "Email field error message not displayed");
            softAssert.assertAll();


        }

    @And("^I should see password is required \"([^\"]*)\"$")
    public void iShouldSeePasswordIsRequired(String password) {
        softAssert.assertEquals("Password is required.",
                new RegisterPage().getValidationErrorMessageForField(password),
                "Password field error message not displayed");
        softAssert.assertAll();
    }

    @Then("^I should see confirm password is required \"([^\"]*)\"$")
    public void iShouldSeeConfirmPasswordIsRequired(String confirmPassword) {
        softAssert.assertEquals("Password is required.",
                new RegisterPage().getValidationErrorMessageForField(confirmPassword),
                "ConfirmPassword field error message not displayed");
        softAssert.assertAll();
    }





    @And("^I select Gender \"([^\"]*)\"$")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("^I enter First name \"([^\"]*)\"$")
    public void iEnterFirstName(String First) {
        new RegisterPage().enterFirstName(First);
    }

    @And("^I enter Last name \"([^\"]*)\"$")
    public void iEnterLastName(String Last) {
        new RegisterPage().enterLastName(Last);
    }

    @And("^I select date of birth \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iSelectDateOfBirth(String day, String month, String year){
        new RegisterPage().selectDateOfBirth(day, month, year);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email){
        new RegisterPage().enterEmail(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String passcode) {
        new RegisterPage().enterPassword(passcode);

    }


    @And("^I enter Confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPasscode) {
        new RegisterPage().enterConfirmPassword(confirmPasscode);

    }

    @And("^I click on registration button$")
    public void iClickOnRegistrationButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("^I should see registration message$")
    public void iShouldSeeRegistrationMessage() {
        Assert.assertEquals("Your registration completed", new RegisterPage().getYourRegCompletedText(),
                "Registration not successful");
    }

    @Then("^I click on continue button$")
    public void iClickOnContinueButton() {
        new RegisterPage().clickOnContinueButton();
    }



}
