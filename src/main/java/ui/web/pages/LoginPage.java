package ui.web.pages;

import framework.EnvironmentManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;

public class LoginPage extends BasePageObject {
    @FindBy(css = ".login-form > form:nth-child(2) > input:nth-child(2)")
    WebElement usernameField;

    @FindBy(css = ".login-form > form:nth-child(2) > input:nth-child(3)")
    WebElement passwordField;

    @FindBy(css = "button.btn:nth-child(4)")
    WebElement loginButton;


    public LoginPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        usernameField = wait.until(ExpectedConditions.visibilityOf(usernameField));
        passwordField = wait.until(ExpectedConditions.visibilityOf(passwordField));
        loginButton = wait.until(ExpectedConditions.visibilityOf(loginButton));
    }

    public void setUserNameTextBox(String userName) {
        usernameField.click();
        usernameField.clear();
        usernameField.sendKeys(userName);
    }

    public void setPasswordTextBox(String password) {
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.submit();
    }

    public HomePage loginWithUser(String userRole) {
        setUserNameTextBox(EnvironmentManager.getInstance().getUserEmail(userRole));
        setPasswordTextBox(EnvironmentManager.getInstance().getPassword(userRole));
        clickLoginButton();
        return new HomePage();
    }
}
