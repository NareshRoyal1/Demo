package Runners;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features="src//test//resources//features//conduitdemo.feature",
glue= {"StepDefs"},
dryRun=false,
monochrome=true,
plugin= {"pretty",
		"html:target/reports/HtmlReport.html"})
public class ConduitDemoRunner extends AbstractTestNGCucumberTests {
	

}
