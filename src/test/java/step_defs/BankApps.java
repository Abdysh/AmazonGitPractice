package step_defs;

import com.digital_nomads.javaFall2021.applications.DemirBank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Type;
import java.util.List;

public class BankApps {
    
    DemirBank adikDemirBank;

    @Given("User should register to Bank with following data")
    public void user_should_register_to_bank_with_following_data(io.cucumber.datatable.DataTable dataTable) throws Exception {
        List<List<String>> number = dataTable.asLists((Type) String.class);
        long accNum = Long.parseLong(number.get(1).get(0));
        long routNum = Long.parseLong(number.get(1).get(1));

        adikDemirBank = new DemirBank(accNum, routNum);
        System.out.println(adikDemirBank.getAccountNumber());
        System.out.println(adikDemirBank.getRoutingNumber());
    }
    @Then("User should successfully registered to the bank with following data")
    public void user_should_successfully_registered_to_the_bank_with_following_data(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> number = dataTable.asLists((Type) String.class);
        long accNum = Long.parseLong(number.get(1).get(0));
        long routNum = Long.parseLong(number.get(1).get(1));
        Assertions.assertEquals(accNum, adikDemirBank.getAccountNumber());
        Assertions.assertEquals(routNum, adikDemirBank.getRoutingNumber());
    }
}
