package ui.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;
import ui.web.BaseHomePage;

public class BibaPage extends BasePageObject {
    @FindBy(css = ".title")
    WebElement bibaTitle;

    @FindBy(css = ".features_items")
    WebElement bibaBody;

    public BibaPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        bibaTitle = wait.until(ExpectedConditions.visibilityOf(bibaTitle));
        bibaBody = wait.until(ExpectedConditions.visibilityOf(bibaBody));
    }

    public boolean isMyBibaTitleDisplayed() {
        bibaTitle = wait.until(ExpectedConditions.visibilityOf(bibaTitle));
        System.out.println(bibaTitle.getText());
        return bibaTitle.getText().equals("BRAND - BIBA PRODUCTS");
    }

    public boolean isMyTitleDisplayed() {
        return bibaTitle.isDisplayed();
    }
}
