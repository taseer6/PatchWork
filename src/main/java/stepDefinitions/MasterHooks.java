package stepDefinitions;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {
	/**
	 * The class defines Hooks
	 * before and after will run once in the start
	 * and end of the test exectution
	 */
	@Before
	public void setup() {
		driver = getDriver();
	}
	
	@After
	public void tearDownAndScreenshotOnFailure(Scenario scenario) throws InterruptedException {
		Thread.sleep(3000);
		try {
			if(driver != null && scenario.isFailed()) {
				scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
			if(driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
		} catch (Exception e) {
			System.out.println("Methods failed: tearDownAndScreenshotOnFailure, Exception: " + e.getMessage());
		}
}
}
