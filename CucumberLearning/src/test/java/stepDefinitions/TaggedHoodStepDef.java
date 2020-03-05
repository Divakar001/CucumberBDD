package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHoodStepDef {
	@Given("^this is a first step$")
	public void this_is_a_first_step() throws Throwable {
		System.out.println("this is first step");
	     	}

	@When("^this is a second step$")
	public void this_is_a_second_step() throws Throwable {
		System.out.println("this is second step");
	    	}

	@Then("^this is a third step$")
	public void this_is_a_third_step() throws Throwable {
		System.out.println("this is third step");
	    
	}

}
