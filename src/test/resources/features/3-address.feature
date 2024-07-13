Feature: Register new Address
  
  As i not user
  I want to add address
  So that ...

  @scenario3
  Scenario: register address of user
    Given page of create address is all ready
    When user enters information from address "<pais>" and "<nombre>" and "<telefono>" and "<postal>" and "<direccion>" and "<distrito>" and "<ciudad>"
    Then user can see his new address

    Examples: 
      |pais| |nombre|            |telefono|  |postal| |direccion|                |distrito|  |ciudad|
      |Peru| |Jorge Cisneros|    |992229526| |15088|  |Av. Rafael escardo 620|   |Lima|      |Lima|
      |Peru| |Giancarlo Cabello| |986513358| |15088|  |Jr. Guillermo moore 232|  |Lima|      |Lima|