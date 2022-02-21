@Smoke
Feature: Data Table practice
@Regression
  Scenario: Order Kimchi from Arigato
    Given user is on NambaFood
    When user clicks on Foods
    Then user should see "250 best cafe"
    And user should find Sushi category
    When user clicks on Sushi
    Then user should see List of cafes
    And user should scroll down the page to Arigato cafe
    When user clicks on Arigato
    Then user should find Kimchi
    When user increase Kimchi amount to 3
    And user should click on order button
    Then on the Card  user should see "450S"


  Scenario: Verify following tabs are displayed in Amazon
    Given user is on "https://amazon.com/"
    Then following menu bar should be displayed on Home page
      | All | Today's Deal | Customer Service | Registry | Gift Cards | Sell |
      | All | Today's Deal | Customer Service | Registry | Gift Cards | Sell |
      | All | Today's Deal | Customer Service | Registry | Gift Cards | Sell |

  Scenario: Cars model
    Given user is on "https://cars.kg/"
    Then following cars should be displayed
      | BMW | Toyota | Lexus | Mers | Audi | Lada  | Tesla   |
      | 525 | Camry  | LX    | E500 | 100  | Sedan | Model S |
      | 760 | LC     | GX    | S500 | Q7   | Shoha | Model X |