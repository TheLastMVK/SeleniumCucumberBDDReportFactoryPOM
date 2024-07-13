Feature: Register new User
  
  As i not user
  I want to register
  So that ...

  @scenario1
  Scenario Outline: successful register new users
    Given page of register is all ready
    When user enters information of account "<email>" and "<password>" and "<repassword>" and "<secretword>"
    Then user can see his login page

    Examples: 
      | email                 |  | password     |  | repassword   |  | secretword |
      | JorDanCis59@gmail.com |  | JorDanCis00@ |  | JorDanCis00@ |  | rojas      |
      | JorDanCis60@gmail.com |  | JorDanCis00@ |  | JorDanCis00@ |  | salas      |
