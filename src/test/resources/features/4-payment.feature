Feature: Register method paymen
  
  As i not user
  I want to add method payment
  So that ...

  @scenario4
  Scenario: register method payment
    Given page of method payment is all ready
    When user enters information from method payment "<nombre>" and "<number>"
    Then user can see his method payment

    Examples: 
      |nombre|            |number|   
      |Jorge Cisneros|    |1234567890123456|
      |Giancarlo Cabello| |8544656525463456|