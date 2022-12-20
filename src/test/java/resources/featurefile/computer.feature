@Computer
Feature: Computer page Test
  As user I want to navigate computer page into nop commerce website


  Scenario: User Should Navigate To Computer Page Successfully
    Given I am on computer page
    When I click on Menu Tab "Computers"
    Then I should navigate to computer page successfully


  Scenario: User Should Navigate To Desktop Page Successfully
    Given I am on computer page
    When  I click on Menu Tab "Computers"
    And  I click on subMenu "Desktops"
    Then verify desktop page displayed successfully

  Scenario Outline: User Should Build Your Own Computer And Add To Cart successfully
    Given I am on computer page
    When I click on Menu Tab "Computers"
    And  I click on subMenu "Desktops"
    And  Select Product "Build your own computer"
    And  Select Processor "<processor>"
    And  Select ram "<ram>"
    And  Select hdd "<hdd>"
    And  Select os "<os>"
    And  Select software "<software>"
    And  Click on Add to cart button
    Then I can see the confirmation message
    Examples:
      | processor                                       | ram           | hdd               | os                       | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]     | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00]  | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]     | Total Commander [+$5.00]   |



