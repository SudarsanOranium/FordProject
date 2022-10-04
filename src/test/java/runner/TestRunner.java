package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "C:\\Cucumber10AMSession\\src\\test\\resources\\Features\\loginPage.feature", 
glue = {"stepDefinition"}, monochrome = true,
plugin = { "pretty", "html:target/report.html"}
		
		
		)
public class TestRunner {

}
