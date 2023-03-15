package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDef {
	WebDriver driver = new ChromeDriver();
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@When("User Search Java Tutorial")
	public void user_search_java_tutorial() {
		WebElement w1 = driver.findElement(By.xpath("//input[@title='Search']"));
		w1.sendKeys("Java Tutorial");
		w1.submit();
		
	}
	@Then("Should display Java Search result page")
	public void should_display_java_search_result_page() {
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	}
	@When("User Search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		WebElement w1 = driver.findElement(By.xpath("//input[@title='Search']"));
		w1.sendKeys("elenium Tutorial");
		w1.submit();
	}

	@Then("Should display Selenium Search result page")
	public void should_display_selenium_search_result_page() {
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	}
	//ScreenShot code as below. 
	@After
	public void attachScreenshot(Scenario scenario) {
		if(scenario.isFailed())
		{
			TakesScreenshot scr = (TakesScreenshot) driver;
			byte[] img = scr.getScreenshotAs(OutputType.BYTES);
			scenario.attach(img,"image/png","ImageOne");
		}
	}
}
