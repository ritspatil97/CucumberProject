package StepDefinations;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Login {

	// ChromeOptions options = new ChromeOptions();
	WebDriver driver;

	@Before("@login")
	public void setup() {

		WebDriverManager.edgedriver().setup();
		// options.addArguments("start-maximized");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@Given("^I navigate to application URL$")
	public void I_navigate_to_application_URL() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_valid_someusername_and_somepassword(String username, String password) {

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);

	}

	@And("^I click on login button$")
	public void I_click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("^User should be able to login \"([^\"]*)\"$")
	public void User_should_be_able_to_login_status(String Expected) {

		String staus = null;
		try {

			if (driver.findElement(By.xpath("//*[text()='Invalid credentials']")).isDisplayed()) {
				staus = "failure";
			}
		} catch (Exception e) {
			staus = "success";
		}
		// Assert.assertEquals(staus, Expected);

		System.out.println(staus);
		

	}
	@After("@login")
	public void teardown() {
		driver.quit();
	}
}
