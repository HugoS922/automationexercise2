package ui.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;
import ui.web.BaseHomePage;

public class PoloPage extends BasePageObject {
    @FindBy(css = ".title")
    WebElement poloTitle;

    @FindBy(css = ".features_items")
    WebElement poloBody;

    public PoloPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        poloTitle = wait.until(ExpectedConditions.visibilityOf(poloTitle));
        poloBody = wait.until(ExpectedConditions.visibilityOf(poloBody));
    }

    public boolean isMyPoloTitleDisplayed() {
        poloTitle = wait.until(ExpectedConditions.visibilityOf(poloTitle));
        return poloTitle.getText().equals("BRAND - POLO PRODUCTS");
    }

    public boolean isMyTitleDisplayed() {
        return poloTitle.isDisplayed();
    }
}
