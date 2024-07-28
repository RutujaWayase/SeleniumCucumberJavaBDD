package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},
//@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature",glue={"StepDefinitions"},
@CucumberOptions(features="src/test/resources/Features/LoginDemoSteps.feature",glue={"StepDefinitions"},
monochrome = true,
//plugin = {"pretty","html:target/HtmlReports/report.html"}
//plugin = {"pretty", "json:target/JSONReports/report.json"}
//plugin = {"pretty", "junit:target/JUnitReports/report.xml"},
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports/report.html"
		}
//,
//tags="@smoketest"
		)
public class TestRunner {
	

}
