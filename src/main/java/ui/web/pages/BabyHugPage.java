package ui.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;

public class BabyHugPage extends BasePageObject {
    @FindBy(css = ".title")
    WebElement babyHugTitle;

    @FindBy(css = ".features_items")
    WebElement babyHugBody;

    public BabyHugPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        babyHugTitle = wait.until(ExpectedConditions.visibilityOf(babyHugTitle));
        babyHugBody = wait.until(ExpectedConditions.visibilityOf(babyHugBody));
    }

    public boolean isMyBabyHugTitleDisplayed() {
        babyHugTitle = wait.until(ExpectedConditions.visibilityOf(babyHugTitle));
        System.out.println(babyHugTitle.getText());
        return babyHugTitle.getText().equals("BRAND - BABYHUG PRODUCTS");
    }

    public boolean isMyTitleDisplayed() {
        return babyHugTitle.isDisplayed();
    }
}
