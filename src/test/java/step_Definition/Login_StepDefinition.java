package step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_StepDefinition {

	WebDriver driver;
	
	@Given("Go to facebook page url")
	public void launchURl() {
	    
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
	}

	@When("user enter username")
	public void user_enter_username() {
	    
		driver.findElement(By.id("email")).sendKeys("oranium@gmail.com");
	}

	@When("user enters password")
	public void user_enters_password() {
		
		driver.findElement(By.id("pass")).sendKeys("1234");
	}

	@When("user click Login button")
	public void user_click_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("User should be on facebook page")
	public void user_should_be_on_facebook_page() {
	    System.out.println("user is on facebook book page");
	}
}
