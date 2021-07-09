package StepDef;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parastepdef {
	WebDriver driver;
	@Given("user is going to enter Url")
	public void user_is_going_to_enter_url() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();
	    
	}

	@When("user is going to enter uid {string} and pswd {string}")
	public void user_is_going_to_enter_uid_and_pswd(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	   }

	@Then("user should submit")
	public void user_should_submit() {
		driver.findElement(By.name("Submit")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.close();
		}
	@When("user is going to enter  below uid and pswd")
	public void user_is_going_to_enter_below_uid_and_pswd(DataTable datatable) {
		List<String> li = datatable.asList();
		driver.findElement(By.id("txtUsername")).sendKeys(li.get(0));
		driver.findElement(By.id("txtPassword")).sendKeys(li.get(1));
		
//		List<List<String>> li = datatable.asLists(String.class);
//		driver.findElement(By.id("txtUsername")).sendKeys(li.get(0).get(0));
//		driver.findElement(By.id("txtPassword")).sendKeys(li.get(0).get(1));
	}

}