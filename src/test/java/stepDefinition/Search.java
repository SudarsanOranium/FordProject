package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {
	WebDriver driver;
	@Given("User is on home page")
	public void user_is_on_home_page() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	@When("User enters the {string} in the search bar")
	public void user_enters_the_in_the_search_bar(String string) {
		
		driver.findElement(By.name("q")).sendKeys(string + Keys.ENTER);
	}

	@Then("User is on the mobile page")
	public void user_is_on_the_mobile_page() {
		
		System.out.println(driver.getTitle());
		driver.close();
	}

}
