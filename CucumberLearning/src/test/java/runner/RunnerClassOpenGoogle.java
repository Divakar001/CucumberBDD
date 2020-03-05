package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles",  
          glue="stepDefinitions",
          dryRun=true,
          strict=false,
          monochrome=true,
          plugin= {"html:report/webReport",  "json:report/jsonReport.json" , "junit:report/xmlreport.xml"},
		  tags = {"@simplelogin,@DataDriven"}
				  
		  
		)
public class RunnerClassOpenGoogle {
	//it should combine the both feature file and step definitions
	//runner define


  
 



		
}