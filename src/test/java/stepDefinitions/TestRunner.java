package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/feature",
		tags = {"@Login"},  //to run one single test
		//tags = {"@Rapid","@Regression"}, //to run multiple tags using AND
		//tags = {"@Sanity and @Regression"}, another way to run multiple tags using AND
		//tags = {"@Sanity, @Regression"}, to run multiple tags using OR
		//tags = {"@Sanity or @Regression"}, to run multiple tags using OR
		glue = {"stepDefinitions"}
		)

public class TestRunner {

}
