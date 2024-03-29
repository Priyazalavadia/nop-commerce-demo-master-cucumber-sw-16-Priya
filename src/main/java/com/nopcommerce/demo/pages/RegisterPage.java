package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.drivermanager.ManageDriver;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='gender']//label")
    List<WebElement> genderRadios;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;

    @CacheLookup
    @FindBy(name = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(css = "#register-button")
    WebElement registerBtn;

    @CacheLookup
    @FindBy(className = "field-validation-error")
    List<WebElement> fieldValidationErrors;

    @CacheLookup
    @FindBy(css = ".result")
    WebElement yourRegCompletedText;

    @CacheLookup
    @FindBy(css = ".button-1.register-continue-button")
    WebElement continueBtn;


    public String getRegisterText() {
        String message = getTextFromElement(registerText);

        Reporter.log("Get registerText : " + registerText.getText() + "<br>");
        return message;
    }

    public void selectGender(String gender) {
        for (WebElement radio : genderRadios) {
            if (radio.getText().contains(gender)) {

                Reporter.log("Select '" + gender + "' radio button" + "<br>");
                clickOnElement(radio);
                break;
            }
        }
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        log.info("Enter Firstname: " + firstNameField.toString());

    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
       log.info("Enter Lastname: "+ lastNameField.toString());

    }

    public void selectDateOfBirth(String day, String month, String year) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
        selectByVisibleTextFromDropDown(dateOfBirthMonth, month);
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
        log.info("Select day: ' " + day + " ', month : '" + month +" ', year : '" + dateOfBirthDay.toString());

    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter Email : " +emailField.toString());

    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
       log.info("Enter Password : "+ passwordField.toString());

    }

    public void enterConfirmPassword(String confPassword) {
        sendTextToElement(confirmPasswordField, confPassword);
       log.info("Enter Confirm Password : '" + confirmPasswordField.toString());

    }

    public void clickOnRegisterButton() {
        clickOnElement(registerBtn);
        log.info("Click on register button : '" + registerBtn.toString());
    }

    public String getValidationErrorMessageForField(String fieldName) {
        String validationMessage = null;
        for (WebElement message : fieldValidationErrors) {
            if (message.getAttribute("data-valmsg-for").equals(fieldName)) {
                validationMessage = message.getText();
                log.info("Click on REGISTER button: ' "+ fieldValidationErrors.toString());

                break;
            }
        }
        return validationMessage;
    }

    public String getYourRegCompletedText() {
        String message = getTextFromElement(yourRegCompletedText);
       log.info("Get your reg completed text: " + yourRegCompletedText.toString());
         return message;
    }

    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
        log.info("Click on Continue button: " + continueBtn.toString());
    }

}
