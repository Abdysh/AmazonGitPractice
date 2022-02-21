package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.List;

public class DataTableSteps {

    @Given("user is on NambaFood")
    public void user_is_on_namba_food() {
        System.out.println("User is on Namba Food");
    }
    @When("user clicks on Foods")
    public void user_clicks_on_foods() {
        System.out.println("User clicks on Foods button");
    }
    @Then("user should find Sushi category")
    public void user_should_find_sushi_category() {
        System.out.println("User found Sushi category");
    }
    @When("user clicks on Sushi")
    public void user_clicks_on_sushi() {
        System.out.println("User clicks on Sushi");
    }
    @Then("user should see List of cafes")
    public void user_should_see_list_of_cafes() {
        System.out.println("");
    }
    @Then("user should scroll down the page to Arigato cafe")
    public void user_should_scroll_down_the_page_to_arigato_cafe() {
        System.out.println("User scroll down to Arigato cafe");
    }
    @When("user clicks on Arigato")
    public void user_clicks_on_arigato() {
        System.out.println("User clicks on Arigato");
    }
    @Then("user should find Kimchi")
    public void user_should_find_kimchi() {
        System.out.println("User found Kimchi");
    }
    @When("user increase Kimchi amount to {int}")
    public void user_increase_kimchi_amount_to(Integer kimchiAmount) {
        System.out.println("User increased Kimchi amount to: " + kimchiAmount);
    }
    @When("user should click on order button")
    public void user_should_click_on_order_button() {
        System.out.println("User clicks on order button");
    }
    @Then("on the Card  user should see {string}")
    public void on_the_card_user_should_see(String totalPrice) {
        System.out.println("Total price: " + totalPrice);
    }

    //// Second Scenario
    @Given("user is on {string}")
    public void user_is_on(String URL) {
        System.out.println("User is on " + URL);
    }
    @Then("following menu bar should be displayed on Home page")
    public void following_menu_bar_should_be_displayed_on_home_page(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data = dataTable.asLists((Type) String.class);
        System.out.println(data.get(0).get(1));
        System.out.println(data.get(1).get(2));
        System.out.println(data.get(2).get(4));
        System.out.println(data.get(1).get(3));

        String java = data.get(2).get(2);
        System.out.println(java);
    }

    @Given("user is on cars.kg")
    public void user_is_on_cars_kg() {
        System.out.println("User is on " + "URL");
    }
    @Then("following cars should be displayed")
    public void following_cars_should_be_displayed(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data = dataTable.asLists((Type) String.class);
        System.out.println(data.get(0).get(1));
        System.out.println(data.get(1).get(2));

        int bmw760 = Integer.parseInt(data.get(2).get(0));
        System.out.println(bmw760);

        int num = 5;
    }

}
