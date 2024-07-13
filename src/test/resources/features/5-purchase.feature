Feature: Register new User
  
  As i not user
  I want to purchase order
  So that ...

  @scenario5
  Scenario: register first purchase order
    Given page of product search is all ready
    When user select the tree products to pay "apple" and "banana" and "shirt"
    And user select second address with delivery type
    And user select first method payment with order
    Then user can see his purchase

  @scenario6
  Scenario: register second purchase order
    Given page of product search is all ready
    When user select the random products to pay "random1" and "random2"
    And user select second address with delivery type
    And user select first method payment with order
    Then user can see his purchase
