package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogle {
	WebDriver driver;
	@Given("user is entering the google url")
	public void user_is_entering_the_google_url() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://www.google.co.in");

	}
	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String arg1) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(arg1);
	    
	}

	@When("^user enters the enter key$")
	public void user_enters_the_enter_key() throws Throwable {
		driver.findElement(By.name("q")).submit();
	}

	@Then("^user should see the search result$")
	public void user_should_see_the_search_result() throws Throwable {
		boolean status =driver.findElement(By.partialLinkText("selenium")).isDisplayed();
        if(status) {
            System.out.println("Result Displayed");
        }
	}


}
