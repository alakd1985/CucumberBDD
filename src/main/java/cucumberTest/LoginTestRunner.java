package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./Feature/LogIn_Test.feature", glue = { "stepDefinition" })
public class LoginTestRunner {

}
//D:\\Selenium Projects\\ToolsQACucumber