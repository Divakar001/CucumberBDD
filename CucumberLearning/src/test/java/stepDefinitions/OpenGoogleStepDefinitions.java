package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleStepDefinitions {
	WebDriver driver;
	WebElement textbox;
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new ChromeDriver();
	    driver.get("https://www.google.co.in");
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String searchTerm) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement textbox=driver.findElement(By.name("q"));
		textbox.sendKeys(searchTerm);
	} 

	@When("^enter the enters key\\.$")
	public void enter_the_enters_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).submit();
	   
	}

	@Then("^user should see the search results$")
	public void user_should_see_the_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Boolean status=driver.findElement(By.partialLinkText("Mounam")).isDisplayed();
		if(status) {
			System.out.println("search result is displayed");
		}
		
	}



	
	
	
}
