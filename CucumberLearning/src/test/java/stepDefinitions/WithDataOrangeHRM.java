package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WithDataOrangeHRM {
	WebDriver driver;
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");

	   
	}

	@When("^the user enter the valid credentials \"(.*?)\" and \"(.*?)\"$")
	public void the_user_enter_the_valid_credentials_and(String name, String name2) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(name);
		driver.findElement(By.id("txtPassword")).sendKeys(name2);

	     
	}

	@When("^click the login button$")
	public void click_the_login_button() throws Throwable {
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
	   
	    
	   
	}

	@Then("^user navigate to the home page$")
	public void user_navigate_to_the_home_page() throws Throwable {
		String title= driver.getTitle();
		   if(title.contains("OrangeHRM")) {
			   System.out.println("login successfully");
		   }else
		   {
			System.out.println("login failed");
		}

	    
	   
	}


	
}
