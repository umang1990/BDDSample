package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberStepDef {
	@Given("there are {int} cucumber")
	public void there_are_cucumber(Integer int1) {
	    System.out.println("there are {int} cucumber");
	}
	@When("I eat {int} cucumbers")
	public void i_eat_cucumbers(Integer int1) {
		System.out.println("I eat {int} cucumbers");
	}
	@Then("I should have {int} cucumbers")
	public void i_should_have_cucumbers(Integer int1) {
		System.out.println("I should have {int} cucumbers");
	}
}
