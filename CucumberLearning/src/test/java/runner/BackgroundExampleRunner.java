package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles",  
          glue= {"stepDefinitions","hooks"},          
          dryRun=false,
          strict=false,
          monochrome=true,
          plugin= {"html:report/webReport",  "json:report/jsonReport.json" , "junit:report/xmlreport.xml"},
		  tags = {"@BackgroundExample"}
)
public class BackgroundExampleRunner {
	
	
	

}
