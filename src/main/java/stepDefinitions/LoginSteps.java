package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory {


    @Given("^I am on login page$")
    public void i_am_on_login_page() {
        loginpage.clickLoginButton();
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_and(String email, String password) throws Throwable {
        loginpage.login(email,password);
    }

    @Then("^I should successfully login and make a search$")
    public void i_should_successfully_login_and_make_a_search() {
        homePage.search("I'm searching something");
    }

    @Then("^I should get login warning notification$")
    public void i_should_get_login_warning_notification() {
        Assert.assertTrue(loginpage.verifyAuthenticationFailed());
    }


}
