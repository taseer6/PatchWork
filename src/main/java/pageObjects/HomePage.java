package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    @FindBy(id = "search_query_top")
    WebElement searchBar;

    public HomePage() {
        super();
    }

    public void search(String searchText) {
        sendKeysToWebElement(searchBar, searchText);
    }
}
