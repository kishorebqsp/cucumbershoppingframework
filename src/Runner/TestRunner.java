package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Users\\Admin\\eclipse-workspace\\Cucumbershoppingframework\\src\\files\\file.feature",
		glue= {"Stepdefinition"}

	)

 public class TestRunner {
	 
	}
