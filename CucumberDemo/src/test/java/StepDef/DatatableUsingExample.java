package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class DatatableUsingExample {
	WebDriver driver;
	
		@Given("User is on Home Page")
		public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
		}
		@When("User Navigate to LogIn Page")
		public void user_navigate_to_log_in_page() {
			driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		}
		@When("User enters {string} and {string}")
		public void user_enters_and(String stg1, String stg2) {
			driver.findElement(By.id("txtUsername")).sendKeys(stg1);
			driver.findElement(By.id("txtPassword")).sendKeys(stg2);
		    }
		@Then("Message displayed Login Successfully")
		public void message_displayed_login_successfully() {
			driver.findElement(By.name("Submit")).click();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			String actual=driver.getTitle();
			String expected="OrangeHRM";
			Assert.assertEquals(expected, actual);
			//System.out.println(actual);
			//System.out.println("Login Successfully");
			System.out.println("Assertion is Passed");
			driver.close();
		    
		}



		
		
			
		
		



}
