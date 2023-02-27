package ui.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;

public class HMPage extends BasePageObject {

    @FindBy(css = ".title")
    WebElement hMTitle;

    @FindBy(css = ".features_items")
    WebElement hMBody;

    public HMPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        hMTitle = wait.until(ExpectedConditions.visibilityOf(hMTitle));
        hMBody = wait.until(ExpectedConditions.visibilityOf(hMBody));
    }

    public boolean isMyHMTitleDisplayed() {
        hMTitle = wait.until(ExpectedConditions.visibilityOf(hMTitle));
        System.out.println(hMTitle.getText());
        return hMTitle.getText().equals("BRAND - H&M PRODUCTS");
    }

    public boolean isMyTitleDisplayed() {
        return hMTitle.isDisplayed();
    }
}
