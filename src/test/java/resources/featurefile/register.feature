@Test
Feature: Register Test
  As user I want to navigate to Register into nop commerce Website


  Scenario: User should create account successfully
    Given I am on Register Page
    When I click on register link
    Then I should see Register Page is displayed

  Scenario: Mandatory fields are required
    Given  I am on Register Page
    When I click on Registration Buttonn
    And  I should see First name is required "FirstName"
    And  I should see Last name is required "LastName"
    And  I should see email is required "Email"
    And  I should see password is required "Password"
    Then  I should see confirm password is required "ConfirmPassword"


  Scenario: verify That User Should Create Account Successfully
    Given  I am on Register Page
    When I click on register link
    And I select Gender "Male"
    And I enter First name "prime"
    And I enter Last name "test"
    And I select date of birth "22","February","1980"
    And I select Gender "Male"
    And I enter email "prime12345@gmail.com"
    And I enter password "Prime123"
    And I enter Confirm password "Prime123"
    And I click on registration button
    And I should see registration message
    Then I click on continue button
