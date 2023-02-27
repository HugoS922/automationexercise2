package ui;

import framework.EnvironmentManager;
import framework.selenium.DriverManager;
import org.openqa.selenium.WebDriver;
import ui.web.pages.HomePage;
import ui.web.pages.LoginPage;
import utils.LoggerManager;

public class PageTransporter {
    private static final LoggerManager log = LoggerManager.getInstance();

    private WebDriver driver;
    private String homeURL;
    private String productsURL = "/products";
    private String loginURL = "/login";

    private static PageTransporter instance;

    protected PageTransporter() {
        initialize();
    }

    public static PageTransporter getInstance() {
        if (instance == null) {
            instance = new PageTransporter();
        }
        return instance;
    }

    private void initialize() {
        log.info("Initializing Page Transporter");
        homeURL = EnvironmentManager.getInstance().getBaseURL();
        driver = DriverManager.getInstance().getWebDriver();
    }

    private void goToURL(String url) {
        driver.navigate().to(url);
    }
    public boolean isOnHomePage() {
        return driver.getCurrentUrl().contains(homeURL);
    }

    public boolean isOnProductsPage() {
        return driver.getCurrentUrl().contains(homeURL + productsURL);
    }

    public boolean isOnLoginAdminPage() {
        return driver.getCurrentUrl().contains(homeURL + loginURL);
    }

    public HomePage navigateToHomePage() {
        if (!isOnHomePage()) {
            goToURL(homeURL);
        }
        return new HomePage();
    }
    public HomePage navigateToProductsPage() {
        if (!isOnProductsPage()) {
            goToURL(homeURL + productsURL);
        }
        return new HomePage();
    }

    public LoginPage navigateToLoginPage() {
        if (!isOnLoginAdminPage()) {
            goToURL(homeURL + loginURL);
        }
        return new LoginPage();
    }
}
