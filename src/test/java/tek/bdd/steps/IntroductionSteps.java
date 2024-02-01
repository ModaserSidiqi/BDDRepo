package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IntroductionSteps {
    @Given("prepare for school")
    public void prepareToSchool(){
        System.out.println("This is Given prepare for school");
    }

    @When("walking school direction")
    public void walkingToSchool(){
        System.out.println("This is When walking for school direction");
    }
    @Then("arriving to school")
    public static void arrivingToSchool(){
        System.out.println("This is Then arriving to school");
    }
    @Given("Open apple website")
    public void openAppleWebsite(){
        System.out.println("Opening Apple website");
    }
    @Then("Click on iPhones menu")
    public void clickIphoneMenu(){
        System.out.println("opening the iphone menu");
    }
    @When("Entering the order information")
    public void enterItemInfo(){
        System.out.println("information about the product");
    }
    @Then("Clicking on purchases item button")
    public void buyProduct(){
        System.out.println("Order received");
    }
}
