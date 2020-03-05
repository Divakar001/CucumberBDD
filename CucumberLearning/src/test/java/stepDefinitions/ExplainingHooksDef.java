package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ExplainingHooksDef {
	@Given("^need to groom all the relevant concept$")
	public void need_to_groom_all_the_relevant_concept() throws Throwable {
		System.out.println("revise all concept for clarity");
	    
	}

	@When("^for attending the interviews$")
	public void for_attending_the_interviews() throws Throwable {
		System.out.println("for attending the interviews");
	    	}

	@When("^Succeed and get the job$")
	public void succeed_and_get_the_job() throws Throwable {
		System.out.println("be confident in interview");
	   
	}



}
