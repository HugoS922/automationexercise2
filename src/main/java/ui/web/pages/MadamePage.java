package ui.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;

public class MadamePage extends BasePageObject {
    @FindBy(css = ".title")
    WebElement madameTitle;

    @FindBy(css = ".features_items")
    WebElement madamePageBody;

    public MadamePage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        madameTitle = wait.until(ExpectedConditions.visibilityOf(madameTitle));
        madamePageBody = wait.until(ExpectedConditions.visibilityOf(madamePageBody));
    }

    public boolean isMyMadameTitleDisplayed() {
        madameTitle = wait.until(ExpectedConditions.visibilityOf(madameTitle));
        System.out.println(madameTitle.getText());
        return madameTitle.getText().equals("BRAND - MADAME PRODUCTS");
    }

    public boolean isMyTitleDisplayed() {
        return madameTitle.isDisplayed();
    }
}
