package ui.web.pages;

import framework.EnvironmentManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;
import ui.web.BaseHomePage;

public class HomePage extends BaseHomePage {

    @FindBy(css = ".logo > a:nth-child(1) > img:nth-child(1)")
    WebElement helpButton;

    public HomePage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        helpButton = wait.until(ExpectedConditions.visibilityOf(helpButton));
    }
}
