package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo {

	@Given("User is on the amazon login page")
	public void user_is_on_the_amazon_login_page() {
		
		System.out.println("user is on the login page");
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
		
		System.out.println("user enters the credentials");
	}

	@Then("User is on search page")
	public void user_is_on_search_page() {
		
		System.out.println("user enters on the search page");
	}

	@Given("User is on the search item page")
	public void user_is_on_the_search_item_page() {
		
		System.out.println("user is on the search bar");
	}

	@When("User enters the item to search")
	public void user_enters_the_item_to_search() {
		
		System.out.println("user searches for iphone11");
	}

	@Then("User adds the item to the cart")
	public void user_adds_the_item_to_the_cart() {
		
		System.out.println("user enters the item to cart");
	}

	@Given("User is on the cart item page")
	public void user_is_on_the_cart_item_page() {
		
		System.out.println("user is on the page");
	}

	@When("User clicks the proceed to checkout")
	public void user_clicks_the_proceed_to_checkout() {
		
		System.out.println("user clicks on procced to checkout");
	}

	@Then("User is in the payment page")
	public void user_is_in_the_payment_page() {
		
		System.out.println("user is on the payment page");
	}

}
