package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/ExplainingHooks.feature", 
	glue= {"stepDefinitions","hooks"},
	dryRun=false,
	monochrome=true,
	tags= {"@Hooks"}


		)

public class ExplainingHooksRunner {


}
	