package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	WebDriver driver;

	@Given("User is on the facebook login page")
	public void user_is_on_the_facebook_login_page() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("User enters enter the valid username and password")
	public void user_enters_enter_the_valid_username_and_password(DataTable table) {

		Map<Object, Object> asMap = table.asMap(getClass(), getClass());

		Object username = asMap.get("username");
		Object password = asMap.get("password");

		System.out.println(username);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys();
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User is on the home page")
	public void user_is_on_the_home_page() {

		System.out.println(driver.getTitle());

		driver.close();
	}

	@When("User enters enter the invalid username and invalid password")
	public void user_enters_enter_the_invalid_username_and_invalid_password() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc2gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1#$#");
	}

	@When("User enters enter the invalid username and valid password")
	public void user_enters_enter_the_invalid_username_and_valid_password() {

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc2gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc@123");
	}

}
