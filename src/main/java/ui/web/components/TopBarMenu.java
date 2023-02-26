package ui.web.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;
import ui.web.pages.CartPage;
import ui.web.pages.ProductsPage;

public class TopBarMenu extends BasePageObject {
    @FindBy(css = ".nav")
    WebElement myCategoriesBar;

    @FindBy(css = ".navbar-nav > li:nth-child(2) > a")
    WebElement productsButton;

    @FindBy(css = ".navbar-nav > li:nth-child(3) > a:nth-child(1)")
    WebElement cartButton;

    @FindBy(css = ".navbar-nav > li:nth-child(4) > a:nth-child(1)")
    WebElement logoutButton;

    public TopBarMenu() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        myCategoriesBar = wait.until(ExpectedConditions.elementToBeClickable(myCategoriesBar));
    }

    public boolean isMyCategoriesBarDisplayed() {
        return myCategoriesBar.isDisplayed();
    }

    public ProductsPage clickProductsButton() {
        productsButton = wait.until(ExpectedConditions.elementToBeClickable(productsButton));
        productsButton.click();

        return new ProductsPage();
    }

    public CartPage clickCartButton() {
        cartButton = wait.until(ExpectedConditions.elementToBeClickable(cartButton));
        cartButton.click();

        return new CartPage();
    }

    public boolean islogoutButtonDisplayed(){
        return logoutButton.isDisplayed();
    }
}
