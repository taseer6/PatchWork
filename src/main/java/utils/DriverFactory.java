package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;
import pageObjects.LoginPage;

/**
 * The is the parent class for all the pages and runners
 * it initializes the pages to the factory and browser
 */
public class DriverFactory {
    public static WebDriver driver;
    public static LoginPage loginpage;
    public static HomePage homePage;

    public WebDriver getDriver() {
        driver=BrowserFactory.createBrowserInstance();
        loginpage = PageFactory.initElements(driver, LoginPage.class);
        homePage=PageFactory.initElements(driver,HomePage.class);
        return driver;
    }

}