package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	private static WebDriver driver = null;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() {
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");

	}

	@When("^User enters credentials to Login$")
	public void user_enters_credentials_to_Login(List<Credentials> usercredentials) {

		for (Credentials credentials : usercredentials) {

			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(credentials.getUsername());
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(credentials.getPassword());
			driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		}
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() {
		System.out.println("Login Successfully");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() {

		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() {
		driver.quit();
		System.out.println("LogOut Successfully");
	}
}
