package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    @FindBy(css = "a.login")
    WebElement loginButtonHomePage;
    @FindBy(id = "email")
    WebElement emailField;
    @FindBy(id = "passwd")
    WebElement passwordField;
    @FindBy(id = "SubmitLogin")
    WebElement loginButtonLoginPage;
    @FindBy(xpath = "//*[@id='center_column']/div/ol/li")
    WebElement authenticationFailedMessageLocator;

    public LoginPage() {
        super();
    }

    public void clickLoginButton() {
        waitAndClickElementsUsing(loginButtonHomePage);
    }

    public void login(String email, String password) {
        sendKeysToWebElement(emailField, email);
        sendKeysToWebElement(passwordField, password);
        waitAndClickElementsUsing(loginButtonLoginPage);
    }

    public boolean verifyAuthenticationFailed() {
        String authenticationFailedMessage = "Authentication failed.";
        wait.until(ExpectedConditions.visibilityOf(authenticationFailedMessageLocator));
        return authenticationFailedMessage.equalsIgnoreCase(authenticationFailedMessageLocator.getText());
    }

}
