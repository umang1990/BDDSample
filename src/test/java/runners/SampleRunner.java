package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//if run all feature file then need to remove file name
//Create Cucumber.properties file for generate report
@CucumberOptions(
		features="src/test/resources//features//GooglePageSearch.feature",
		glue = {"stepDefs"},
		monochrome=true,//redable console output
		//dryRun = true,//all steps are implement then it is going to run all step. if anyone not implemented then it is not going to run.
		plugin = {"pretty",//more information in console
			//	"html:target//Reports//HtmlReports.html",//create HTML report
			//	"json:target//Reports//JsonReports.json",//Create Json Report
			//	"usage:target//Reports//UsageReport",// Create Usage Report
			//	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"//extent report plugin and create extent report properties file
		
		}
)

public class SampleRunner extends AbstractTestNGCucumberTests{
 
	
	
}
