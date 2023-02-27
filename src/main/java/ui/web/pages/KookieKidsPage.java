package ui.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;
import ui.web.BaseHomePage;

public class KookieKidsPage extends BasePageObject {
    @FindBy(css = ".title")
    WebElement kookieKidsTitle;

    @FindBy(css = ".features_items")
    WebElement kookieKidsBody;

    public KookieKidsPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        kookieKidsTitle = wait.until(ExpectedConditions.visibilityOf(kookieKidsTitle));
        kookieKidsBody = wait.until(ExpectedConditions.visibilityOf(kookieKidsBody));
    }

    public boolean isMyKookieKidsTitleDisplayed() {
        kookieKidsTitle = wait.until(ExpectedConditions.visibilityOf(kookieKidsTitle));
        System.out.println(kookieKidsTitle.getText());
        return kookieKidsTitle.getText().equals("BRAND - KOOKIE KIDS PRODUCTS");
    }

    public boolean isMyTitleDisplayed() {
        return kookieKidsTitle.isDisplayed();
    }
}
