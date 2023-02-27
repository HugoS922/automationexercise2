package ui.web.components;

import framework.selenium.UIMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;
import ui.web.pages.ProductsPage;

public class BrandsBarMenu extends BasePageObject {
    @FindBy(className = "brands_products")
    WebElement productsMenuButtons;

    @FindBy(xpath = "//div[@class=\"brands-name\" ]/descendant::a[text()=\"Polo\"]")
    WebElement poloButton;

    @FindBy(xpath = "//a[@href='/brand_products/Polo']//span[@class=\"pull-right\"]")
    WebElement poloQuantity;

    @FindBy(xpath = "//div[@class=\"brands-name\" ]/descendant::a[text()=\"H&M\"]")
    WebElement hMButton;

    @FindBy(xpath = "//a[@href='/brand_products/H&M']//span[@class=\"pull-right\"]")
    WebElement hMQuantity;

    @FindBy(xpath = "//div[@class=\"brands-name\" ]/descendant::a[text()=\"Madame\"]")
    WebElement madameButton;

    @FindBy(xpath = "//a[@href='/brand_products/Madame']//span[@class=\"pull-right\"]")
    WebElement madameQuantity;

    @FindBy(xpath = "//div[@class=\"brands-name\" ]/descendant::a[text()=\"Mast & Harbour\"]")
    WebElement mastHarbourButton;

    @FindBy(xpath = "//a[@href='/brand_products/Mast & Harbour']//span[@class=\"pull-right\"]")
    WebElement mastHarbourQuantity;

    @FindBy(xpath = "//div[@class=\"brands-name\" ]/descendant::a[text()=\"Babyhug\"]")
    WebElement babyHugButton;

    @FindBy(xpath = "//a[@href='/brand_products/Babyhug']//span[@class=\"pull-right\"]")
    WebElement babyHugQuantity;

    @FindBy(xpath = "//div[@class=\"brands-name\" ]/descendant::a[text()=\"Allen Solly Junior\"]")
    WebElement allenSollyJuniorButton;

    @FindBy(xpath = "//a[@href='/brand_products/Allen Solly Junior']//span[@class=\"pull-right\"]")
    WebElement allenSollyJuniorQuantity;

    @FindBy(xpath = "//div[@class=\"brands-name\" ]/descendant::a[text()=\"Kookie Kids\"]")
    WebElement kookieKidsButton;

    @FindBy(xpath = "//a[@href='/brand_products/Kookie Kids']//span[@class=\"pull-right\"]")
    WebElement kookieKidsQuantity;

    @FindBy(xpath = "//div[@class=\"brands-name\" ]/descendant::a[text()=\"Biba\"]")
    WebElement bibaButton;

    @FindBy(xpath = "//a[@href='/brand_products/Biba']//span[@class=\"pull-right\"]")
    WebElement bibaQuantity;

    public BrandsBarMenu() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        productsMenuButtons = wait.until(ExpectedConditions.elementToBeClickable(productsMenuButtons));
    }

    public boolean isMyBrandsBarDisplayed() {
        return productsMenuButtons.isDisplayed();
    }

    public ProductsPage clickOnPoloButton() {
        UIMethods.moveToWebElement(poloButton);
        poloButton = wait.until(ExpectedConditions.elementToBeClickable(poloButton));
        poloButton.click();
        return new ProductsPage();
    }

    public ProductsPage clickOnHMButton() {
        UIMethods.moveToWebElement(hMButton);
        hMButton = wait.until(ExpectedConditions.elementToBeClickable(hMButton));
        hMButton.click();
        return new ProductsPage();
    }

    public ProductsPage clickOnMadameButton() {
        UIMethods.moveToWebElement(madameButton);
        madameButton = wait.until(ExpectedConditions.elementToBeClickable(madameButton));
        madameButton.click();
        return new ProductsPage();
    }

    public ProductsPage clickOnMastHarbourButton() {
        UIMethods.moveToWebElement(mastHarbourButton);
        mastHarbourButton = wait.until(ExpectedConditions.elementToBeClickable(mastHarbourButton));
        mastHarbourButton.click();
        return new ProductsPage();
    }

    public ProductsPage clickOnBabyHugButton() {
        UIMethods.moveToWebElement(babyHugButton);
        babyHugButton = wait.until(ExpectedConditions.elementToBeClickable(babyHugButton));
        babyHugButton.click();
        return new ProductsPage();
    }

    public ProductsPage clickOnAllenSollyButton() {
        UIMethods.moveToWebElement(allenSollyJuniorButton);
        allenSollyJuniorButton = wait.until(ExpectedConditions.elementToBeClickable(allenSollyJuniorButton));
        allenSollyJuniorButton.click();
        return new ProductsPage();
    }

    public ProductsPage clickOnKookieKidsButton() {
        UIMethods.moveToWebElement(kookieKidsButton);
        kookieKidsButton = wait.until(ExpectedConditions.elementToBeClickable(kookieKidsButton));
        kookieKidsButton.click();
        return new ProductsPage();
    }

    public ProductsPage clickOnBibaButton() {
        UIMethods.moveToWebElement(bibaButton);
        bibaButton = wait.until(ExpectedConditions.elementToBeClickable(bibaButton));
        bibaButton.click();
        return new ProductsPage();
    }

    public String getPoloProductsQuantity() {
        return poloQuantity.getText().replaceAll("[()]", "");
    }

    public String getHMProductsQuantity() {
        return hMQuantity.getText().replaceAll("[()]", "");
    }

    public String getMadameProductsQuantity() {
        return madameQuantity.getText().replaceAll("[()]", "");
    }

    public String getMastHarbourProductsQuantity() {
        return mastHarbourQuantity.getText().replaceAll("[()]", "");
    }

    public String getBabyHugProductsQuantity() {
        return babyHugQuantity.getText().replaceAll("[()]", "");
    }

    public String getAllenSollyJuniorProductsQuantity() {
        return allenSollyJuniorQuantity.getText().replaceAll("[()]", "");
    }

    public String getKookieKidsProductsQuantity() {
        return kookieKidsQuantity.getText().replaceAll("[()]", "");
    }

    public String getBibaProductsQuantity() {
        return bibaQuantity.getText().replaceAll("[()]", "");
    }
}
