package stepDefinitions;

import cucumber.api.java.en.Given;

public class Expressions {

@Given("^i have (\\d+) laptop$")
public void i_have_laptop(int count) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("i have laptops :" +count);
}

@Given("^i have (\\d+\\.\\d+) CGPA$")
public void i_have_CGPA(float num) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("i have :"+num +"CGPA");
	
    
}
@Given("^\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")

public void is_elder_to_and(String name, String name2, String name3) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println(name+ " is elder to "+name2 +" and " +name3);
 }






}
