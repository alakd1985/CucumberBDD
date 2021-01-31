package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "D:\\Selenium Projects\\ToolsQACucumber\\Feature\\Hooks.feature" }, glue = {
		"stepDefinition", "utilities" })
public class HooksTestRunner {

}