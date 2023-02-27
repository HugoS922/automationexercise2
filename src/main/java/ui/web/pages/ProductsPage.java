package ui.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;
import ui.web.BaseHomePage;

import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends BaseHomePage {
    @FindBy(css = ".features_items")
    WebElement productsPreview;

    @FindBy(className = "text-center")
    WebElement title;

    public ProductsPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        productsPreview = wait.until(ExpectedConditions.visibilityOf(productsPreview));
    }

    public void clickProduct() {
        productsPreview.click();
    }

    public boolean isMyProductsListDisplayed() {
        return productsPreview.isDisplayed();
    }

    public int isMyProductsListComplete() {
        List<WebElement> list = new ArrayList<>();
        list = productsPreview.findElements(By.className("col-sm-4"));
        return list.size();
    }
}
