Feature: BankApp

  Scenario: Account for user
    Given User should register to Bank with following data
      | Account number | Routing number |
      | 123456789012   | 123456789      |

    Then User should successfully registered to the bank with following data
      | Account number | Routing number |
      | 123456789012   | 123456789      |
