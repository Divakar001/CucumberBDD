package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM {
	WebDriver driver;


@Given("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
}

@When("^the user enter the valid user name and password$")
public void the_user_enter_the_valid_user_name_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
}

@When("^click on the login button$")
public void click_on_the_login_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement login=driver.findElement(By.id("btnLogin"));
	login.click();
   
}

@Then("^user navigate to home page$")
public void user_navigate_to_home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   String title= driver.getTitle();
   if(title.contains("OrangeHRM")) {
	   System.out.println("login successfully");
   }else
   {
	System.out.println("login failed");
}


	
	

}
}