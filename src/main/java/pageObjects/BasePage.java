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


    /***************** **helper methods **********/


    public void waitAndClickElementsUsing(WebElement element) {
        boolean clicked = false;
        int attempts = 0;
        while (!clicked && attempts < 10) {
            try {
                this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                clicked = true;
            } catch (Exception e) {
                Assert.fail("can't click element");
            }
            attempts++;
        }
    }


    /***************** **helper methods **********/

    public void sendKeysToWebElement(WebElement element, String textToSend)   {
        try {
            this.WaitUntilWebElementIsVisible(element);
            element.clear();
            element.sendKeys(textToSend);
        } catch (Exception e) {
            Assert.fail("Unable send the keys " + e.getMessage());
        }
    }



    /***************** **helper methods **********/

    public boolean WaitUntilWebElementIsVisible(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            Assert.fail("element isn't visible" + e.getMessage());
            return false;
        }
    }
}
