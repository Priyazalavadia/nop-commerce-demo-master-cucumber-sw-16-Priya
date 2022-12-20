
Feature: Login Test
  As user I want to navigate computer page into nop commerce website


  Scenario: User should navigate to login page successfully
    Given I am On login Page
    When I click on login Link
    Then Welcome Message displayed



  Scenario: User should login successfully with Invalid credentials
    Given I am On login Page
    When I click on login Link
    And I enter email "prime1234@gmail.com"
    And I enter password "prime123"
    And I click on login button
    Then I should see error message displayed

  Scenario: verify That User Should LogIn SuccessFully With Valid Credentials
    Given I am On login Page
    When I click on login Link
    And I enter email "prime1234@gmail.com"
    And I enter password "Prime123"
    And I click on login button
    Then I should see Logout link displayed


  Scenario:verify That User Should LogOut SuccessFully
    Given I am On login Page
    When I click on login Link
    And I enter email "prime1234@gmail.com"
    And I enter password "Prime123"
    And I click on login button
    And I click On logout link
    Then i should see login link is displayed

