package step_Definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_Login extends BaseClass{

	
	
	@Given("Go to orange HRM page")
	public void go_to_orange_hrm_page() {
		
		BaseClass.setup();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	@When("user enters the username in username field")
	public void user_enters_the_username_in_username_field() {
	   
		driver.findElement(By.name("username")).sendKeys("Admin");
	}
	@When("user enters password in password field")
	public void user_enters_password_in_password_field() {
	    
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
	@When("user click Login button on login page")
	public void user_click_login_button_on_login_page() {
	    
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("User should be on  page")
	public void user_should_be_on_page() {
	    
		boolean home = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		
		if(home)
		{
			System.out.println("user is on home page");
		}
		else
		{
			System.out.println("user is not home page");
		}
	}
	
	
	@When("user enters the username as {string} in username field")
	public void user_enters_the_username_in_username_field(String uname) {
	    
		driver.findElement(By.name("username")).sendKeys(uname);
	}

	@When("user enters password as {string} in password field")
	public void user_enters_password_in_password_field(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	

}
