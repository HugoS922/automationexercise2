package ui.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;

public class MastHarbourPage extends BasePageObject {
    @FindBy(css = ".title")
    WebElement mastHarbourTitle;

    @FindBy(css = ".features_items")
    WebElement mastHarbourBody;

    public MastHarbourPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        mastHarbourTitle = wait.until(ExpectedConditions.visibilityOf(mastHarbourTitle));
        mastHarbourBody = wait.until(ExpectedConditions.visibilityOf(mastHarbourBody));
    }

    public boolean isMyMastHarbourTitleDisplayed() {
        mastHarbourTitle = wait.until(ExpectedConditions.visibilityOf(mastHarbourTitle));
        System.out.println(mastHarbourTitle.getText());
        return mastHarbourTitle.getText().equals("BRAND - MAST & HARBOUR PRODUCTS");
    }

    public boolean isMyTitleDisplayed() {
        return mastHarbourTitle.isDisplayed();
    }
}
