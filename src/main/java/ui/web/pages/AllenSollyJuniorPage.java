package ui.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;

public class AllenSollyJuniorPage extends BasePageObject {
    @FindBy(css = ".title")
    WebElement allenSollyJuniorTitle;

    @FindBy(css = ".features_items")
    WebElement allenSollyJuniorBody;

    public AllenSollyJuniorPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        allenSollyJuniorTitle = wait.until(ExpectedConditions.visibilityOf(allenSollyJuniorTitle));
        allenSollyJuniorBody = wait.until(ExpectedConditions.visibilityOf(allenSollyJuniorBody));
    }

    public boolean isMyAllenSollyTitleDisplayed() {
        allenSollyJuniorTitle = wait.until(ExpectedConditions.visibilityOf(allenSollyJuniorTitle));
        System.out.println(allenSollyJuniorTitle.getText());
        return allenSollyJuniorTitle.getText().equals("BRAND - ALLEN SOLLY JUNIOR PRODUCTS");
    }

    public boolean isMyTitleDisplayed() {
        return allenSollyJuniorTitle.isDisplayed();
    }
}
