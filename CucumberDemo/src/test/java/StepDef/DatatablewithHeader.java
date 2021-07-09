package StepDef;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DatatablewithHeader {
	WebDriver driver;
	
	
	@Given("Go to login page")
	public void go_to_login_page() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();
	}

	@When("enters the below credentials")
	public void enters_the_below_credentials(DataTable datatable) {
		List<Map<String, String>> mp = datatable.asMaps(String.class,String.class);
		driver.findElement(By.id("txtUsername")).sendKeys(mp.get(0).get("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(mp.get(0).get("password"));
		
//		List<List<String>> li = datatable.asLists(String.class);
//		driver.findElement(By.id("txtUsername")).sendKeys(li.get(0).get(0));
//		driver.findElement(By.id("txtPassword")).sendKeys(li.get(0).get(1));
	}

	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.name("Submit")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.close();
	}




}
