package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="./src/test/resources/Feature_File",
		glue="step_Definition",
		publish = true, 
		plugin = {"pretty", "html:target/output.html",
				"junit:target/output.xml"},
		
		dryRun = true // it will glue the step definition and feature file
		//tags = "@Regression"
		
		)

public class TestRunnerClass {

}
