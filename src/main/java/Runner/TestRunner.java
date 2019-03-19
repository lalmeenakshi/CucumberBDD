package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\Kumar\\eclipse-workspace\\CucumberBDDFramework\\src\\main\\java\\Features\\taggedhooks.feature", //the path of the feature files
			glue={"stepDefinitions"},
	format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
	monochrome=true,
	strict=true,
			dryRun=false,
			tags= {"@SmokeTest"}
			
			)
					public class TestRunner {

}
