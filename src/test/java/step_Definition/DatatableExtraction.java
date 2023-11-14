package step_Definition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class DatatableExtraction {
	
	
	WebDriver driver = BaseClass.setup();;
	
	
	
	@Given("user has multiple data")
	public void user_has_multiple_data(DataTable data) throws InterruptedException {
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement userName = driver.findElement(By.name("username"));
		
		List<String> asList = data.asList();
	    
		for(int i =0; i <asList.size();i++)
		{
			userName.sendKeys(asList.get(i));
			
			Thread.sleep(5000);
			
			userName.clear();
		}
	}

	@Then("data can be fectched")
	public void data_can_be_fectched() {
		
		System.out.println("data fetched");

	}
	
	@Given("user has multiple data in datatable")
	public void user_has_multiple_data_in_datatable(DataTable data) throws InterruptedException {
	   
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		
		List<List<String>> asLists = data.asLists();
		
		for(int i = 0; i<asLists.size();i++)
		{
			for(int j=0; j<asLists.get(i).size();j++)
			{
				if(j==0)
				{
					username.sendKeys(asLists.get(i).get(j));
					Thread.sleep(5000);
					username.clear();
				}
				else if(j==1)
				{
					password.sendKeys(asLists.get(i).get(j));					Thread.sleep(5000);
					password.clear();
				}
			}
		}
	}

	//@After
	public void closeBrowser()
	{
		BaseClass.quit();

	}

}
