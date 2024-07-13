Feature: Login User
  
  As i not user
  I want to login
  So that ...

  @scenario2
  Scenario Outline: login a user
    Given page of login is all ready
    When user enters credentials "<email>" and "<password>"
    Then user can see a message

    Examples: 
      | email                    |  | password     |
      | CorreoDePrueba@gmail.com |  | JorDanCis00@ |
      | JorDanCis59@gmail.com    |  | JorDanCis00@ |
