Feature: Validate History purchases
  
  As i not user
  I want to confirm purchases
  So that ...

  @scenario7
  Scenario: check order history
    Given page of order history is all ready
    When user takes a screenshot of their purchases
    Then user confirm their purchases
