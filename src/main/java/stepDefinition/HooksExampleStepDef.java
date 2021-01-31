package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksExampleStepDef {
	@Given("^This is the Number one step$")
	public void this_is_the_Number_one_step() {
		System.out.println("Hooks with multiple scenario part 1");
	}

	@When("^This is the Number two step$")
	public void this_is_the_Number_two_step() {
		System.out.println("Hooks with multiple scenario part 2");
	}

	@Then("^this is the Number three step$")
	public void this_is_the_Number_three_step() {
		System.out.println("Hooks with multiple scenario part 3");
	}

}
