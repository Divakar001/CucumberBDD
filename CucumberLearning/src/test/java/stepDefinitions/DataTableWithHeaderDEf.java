package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithHeaderDEf {
	
	WebDriver driver;
	@Given("^you is on the login page$")
	public void you_is_on_the_login_page() throws Throwable {
		driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
}
@When("^you enter the valid credentials$")
	public void you_enter_the_valid_credentials(DataTable datatable) throws Throwable {
	  List<Map<String, String>> credentials=  datatable.asMaps(String.class, String.class);
		String username=credentials.get(0).get("username");
		String password=credentials.get(0).get("password");
	  
	  driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

	@When("^please be click on that login button$")
	public void please_be_click_on_that_login_button() throws Throwable {
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
	    
	}

	@Then("^you move to the main home page$")
	public void you_move_to_the_main_home_page() throws Throwable {String title= driver.getTitle();
	   if(title.contains("OrangeHRM")) {
		   System.out.println("login successfully");
	   }else
	   {
		System.out.println("login failed");
	}

	  
	}


	

}
