package utils;

import constants.DirectoryPaths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {
    public static WebDriver createBrowserInstance() {
        WebDriver driver = null;
        switch (ConfigManager.getInstance().getString("browser")) {
            case "firefox":
                if (null == driver) {
                    System.setProperty("webdriver.gecko.driver", DirectoryPaths.GECKO_DIRECTORY);
                    driver = new FirefoxDriver();
                }
                break;

            case "chrome":
                if (null == driver) {
                    System.setProperty("webdriver.chrome.driver", DirectoryPaths.CHROME_DIRECTORY);
                    // CHROME OPTIONS
                    driver = new ChromeDriver();
//                    TODO add incognito Option
                }
                break;
        }
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get(ConfigManager.getInstance().getString("url"));
        driver.manage().window().maximize();
        return driver;
    }
}
