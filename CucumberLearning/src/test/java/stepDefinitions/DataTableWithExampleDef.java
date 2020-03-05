package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class DataTableWithExampleDef {
	WebDriver driver;
	@Given("^tester is on that login page$")
	public void tester_is_on_that_login_page() throws Throwable {
		driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    	}

	@When("^tester enter \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void tester_enter_and_password(String username, String password) throws Throwable {
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	    	}

	@When("^clicked button$")
	public void clicked_button() throws Throwable {
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
		
		
	}
	

}
