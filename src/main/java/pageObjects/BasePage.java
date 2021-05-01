package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import java.io.IOException;

/**
 * The class defines the common methods of the pages
 * all the pages inherit this class
 */
public class BasePage extends DriverFactory {
    protected WebDriverWait wait;

    public BasePage() {
        this.wait = new WebDriverWait(driver, 15);
    }

    /**********************************************************************************
     **CLICK METHODS
     **********************************************************************************/

    public void waitAndClickElementsUsing(WebElement element) {
        boolean clicked = false;
        int attempts = 0;
        while (!clicked && attempts < 10) {
            try {
                this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                clicked = true;
            } catch (Exception e) {
                Assert.fail("Unable to wait and click on the element using the By locator, element: >");
            }
            attempts++;
        }
    }


    /**********************************************************************************
     **SEND KEYS METHODS /
     **********************************************************************************/
    public void sendKeysToWebElement(WebElement element, String textToSend)   {
        try {
            this.WaitUntilWebElementIsVisible(element);
            element.clear();
            element.sendKeys(textToSend);
        } catch (Exception e) {
            Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
        }
    }


    /**********************************************************************************
     **WAIT METHODS
     **********************************************************************************/
    public boolean WaitUntilWebElementIsVisible(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
            return false;
        }
    }

    public boolean WaitUntilWebElementIsVisibleUsingByLocator(By element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        } catch (Exception e) {

            Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
            return false;
        }
    }

    public boolean isElementClickable(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    /**********************************************************************************
     **PAGE METHODS
     **********************************************************************************/
    public BasePage loadUrl(String url)  {
        driver.get(url);
        return new BasePage();
    }




}
