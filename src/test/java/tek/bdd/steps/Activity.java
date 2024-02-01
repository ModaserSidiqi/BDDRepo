package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity {
    @Given("students prepare for the school")
    public void getPreparation(){
    }

    @When("student {string} go to school")
    public void student_go_to_school(String string) {
    }

    @Then("they all take the bus and go to school")
    public void they_all_take_the_bus_and_go_to_school() {

    }
}
