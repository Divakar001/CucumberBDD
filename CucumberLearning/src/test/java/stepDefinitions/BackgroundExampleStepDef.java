package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundExampleStepDef {
	
	@Given("^the student finished high school$")
	public void the_student_finished_high_school() throws Throwable {
	    System.out.println("the student finished high school");
	}

	@Given("^the student finished higher secondary$")
	public void the_student_finished_higher_secondary() throws Throwable {
	    System.out.println("the student finished higher secondary");
	    }

	@Given("^the student applied for medical course$")
	public void the_student_applied_for_medical_course() throws Throwable {
		System.out.println("the student applied for medical course");
	   }

	@When("^the student cleared the entrance exam$")
	public void the_student_cleared_the_entrance_exam() throws Throwable {
		System.out.println("the student cleared the entrance exam");
	    
	}

	@Then("^the student is eligible for joining any medical institute$")
	public void the_student_is_eligible_for_joining_any_medical_institute() throws Throwable {
		System.out.println("the student is eligible for joining any medical institute");
	    
	}

	@Given("^the student applied for engineering course$")
	public void the_student_applied_for_engineering_course() throws Throwable {
		System.out.println("the student applied for engineering course");
	    
	}

	@When("^the student should have a sayable cutoff$")
	public void the_student_should_have_a_sayable_cutoff() throws Throwable {
		System.out.println("the student should have a sayable cutoff");
	    	}

	@Then("^the student is eligible for joining any Engineering college$")
	public void the_student_is_eligible_for_joining_any_Engineering_college() throws Throwable {
		System.out.println("the student is eligible for joining any Engineering college");
	   
	}



}
