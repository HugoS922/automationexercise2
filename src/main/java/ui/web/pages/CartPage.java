package ui.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;

public class CartPage extends BasePageObject {
    @FindBy(css = ".text-center > b:nth-child(1)")
    WebElement cartMessage;

    public CartPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        cartMessage = wait.until(ExpectedConditions.visibilityOf(cartMessage));
    }

    public void clickProduct() {
        cartMessage.click();
    }

    public boolean isMyCartMessageDisplayed() {
        return cartMessage.isDisplayed();
    }
}
