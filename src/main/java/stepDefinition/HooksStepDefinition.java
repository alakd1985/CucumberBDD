package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinition {
	@Given("^This is the first step$")
	public void this_is_the_first_step() {
		System.out.println("This is the first step");
	}

	@When("^This is the second step$")
	public void this_is_the_second_step() {
		System.out.println("This is the second step");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() {
		System.out.println("This is the third step");
	}

	@Given("^This is the fourth step$")
	public void this_is_the_fourth_step() {
		System.out.println("This is the fourth step");
	}

	@When("^This is the fifth step$")
	public void this_is_the_fifth_step() {
		System.out.println("This is the fifth step");
	}

	@Then("^this is the sixth step$")
	public void this_is_the_sixth_step() {
		System.out.println("This is the sixth step");
	}
}
