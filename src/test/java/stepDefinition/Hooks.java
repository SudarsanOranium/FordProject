package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforeScenario() {
		
		System.out.println("====I am launching the browser=====");
	}
	
	@After
	public void afterSceanrio() {
		
		System.out.println("===I am closing the browser=====");
		
	}

}
