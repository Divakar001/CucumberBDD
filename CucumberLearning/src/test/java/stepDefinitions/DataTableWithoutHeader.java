package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithoutHeader {
	WebDriver driver;
	@Given("^employee is on the login page$")
	public void employee_is_on_the_login_page() throws Throwable {
		driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    }

	@When("^the employee enter the valid credentials$")
	public void the_employee_enter_the_valid_credentials(DataTable datatable) throws Throwable {
		List<String> credentials=datatable.asList(String.class);
		String username= credentials.get(0);
		String password= credentials.get(1);
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);


	}

	@When("^click on that login button$")
	public void click_on_that_login_button() throws Throwable {
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
	   
	    
	}

	@Then("^user navigate to the main home page$")
	public void user_navigate_to_the_main_home_page() throws Throwable {
		String title= driver.getTitle();
		   if(title.contains("OrangeHRM")) {
			   System.out.println("login successfully");
		   }else
		   {
			System.out.println("login failed");
		}

	}


	
	 
	
}
