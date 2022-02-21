@Smoke
Feature: Scenario: outline demo

  Scenario Outline: Multiple tests
    Given user is on Facebook
    When user enters "<email>"
    And user enters "<password>"
    And user clicks on login button
    Then user should see "<message>"
    Examples:
      | email          | password  | message           |
      | nurs@gmail.com | Qwerty123 | Successful        |
      | adik@mail.ru   | Hello312  | Successful        |
      | marsel@mail.ru | Asdfg312  | Account not found |