$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("register.feature");
formatter.feature({
  "line": 2,
  "name": "Register Test",
  "description": "As user I want to navigate to Register into nop commerce Website",
  "id": "register-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.before({
  "duration": 4558026500,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should create account successfully",
  "description": "",
  "id": "register-test;user-should-create-account-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on Register Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see Register Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.iAmOnRegisterPage()"
});
formatter.result({
  "duration": 121529700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 852911700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iShouldSeeRegisterPageIsDisplayed()"
});
formatter.result({
  "duration": 44641200,
  "status": "passed"
});
formatter.after({
  "duration": 706763800,
  "status": "passed"
});
formatter.before({
  "duration": 2608892800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Mandatory fields are required",
  "description": "",
  "id": "register-test;mandatory-fields-are-required",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I am on Register Page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on Registration Buttonn",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should see First name is required \"FirstName\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see Last name is required \"LastName\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see email is required \"Email\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see password is required \"Password\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see confirm password is required \"ConfirmPassword\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.iAmOnRegisterPage()"
});
formatter.result({
  "duration": 85700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iClickOnRegistrationButtonn()"
});
formatter.result({
  "duration": 40078291600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FirstName",
      "offset": 37
    }
  ],
  "location": "RegisterSteps.iShouldSeeFirstNameIsRequired(String)"
});
formatter.result({
  "duration": 20068718700,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tFirstName field error message not displayed expected [null] but found [First name is required.]\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\r\n\tat com.nopcommerce.demo.cucumber.steps.RegisterSteps.iShouldSeeFirstNameIsRequired(RegisterSteps.java:41)\r\n\tat ✽.And I should see First name is required \"FirstName\"(register.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "LastName",
      "offset": 36
    }
  ],
  "location": "RegisterSteps.iShouldSeeLastNameIsRequired(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Email",
      "offset": 32
    }
  ],
  "location": "RegisterSteps.iShouldSeeEmailIsRequired(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Password",
      "offset": 35
    }
  ],
  "location": "RegisterSteps.iShouldSeePasswordIsRequired(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ConfirmPassword",
      "offset": 43
    }
  ],
  "location": "RegisterSteps.iShouldSeeConfirmPasswordIsRequired(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1080007800,
  "status": "passed"
});
formatter.before({
  "duration": 2680755400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "verify That User Should Create Account Successfully",
  "description": "",
  "id": "register-test;verify-that-user-should-create-account-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "I am on Register Page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I select Gender \"Male\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter First name \"prime\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter Last name \"test\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select date of birth \"22\",\"February\",\"1980\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select Gender \"Male\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I enter email \"prime12345@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I enter password \"Prime123\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter Confirm password \"Prime123\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on registration button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I should see registration message",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.iAmOnRegisterPage()"
});
formatter.result({
  "duration": 36500,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 876053900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Male",
      "offset": 17
    }
  ],
  "location": "RegisterSteps.iSelectGender(String)"
});
formatter.result({
  "duration": 65725600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prime",
      "offset": 20
    }
  ],
  "location": "RegisterSteps.iEnterFirstName(String)"
});
formatter.result({
  "duration": 81159100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 19
    }
  ],
  "location": "RegisterSteps.iEnterLastName(String)"
});
formatter.result({
  "duration": 72267100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "22",
      "offset": 24
    },
    {
      "val": "February",
      "offset": 29
    },
    {
      "val": "1980",
      "offset": 40
    }
  ],
  "location": "RegisterSteps.iSelectDateOfBirth(String,String,String)"
});
formatter.result({
  "duration": 246021400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Male",
      "offset": 17
    }
  ],
  "location": "RegisterSteps.iSelectGender(String)"
});
formatter.result({
  "duration": 39902900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prime12345@gmail.com",
      "offset": 15
    }
  ],
  "location": "RegisterSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 80781100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prime123",
      "offset": 18
    }
  ],
  "location": "RegisterSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 77952000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prime123",
      "offset": 26
    }
  ],
  "location": "RegisterSteps.iEnterConfirmPassword(String)"
});
formatter.result({
  "duration": 75385200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iClickOnRegistrationButton()"
});
formatter.result({
  "duration": 1394504100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iShouldSeeRegistrationMessage()"
});
formatter.result({
  "duration": 35769400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 334280000,
  "status": "passed"
});
formatter.after({
  "duration": 716791400,
  "status": "passed"
});
});