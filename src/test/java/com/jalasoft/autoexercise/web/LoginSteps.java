package com.jalasoft.autoexercise.web;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import ui.PageTransporter;
import ui.web.pages.HomePage;
import ui.web.pages.LoginPage;

public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private PageTransporter pageTransporter;

    public LoginSteps() {
        this.pageTransporter = PageTransporter.getInstance();
    }

    @Given("I navigate to Login page")
    public void iNavigateToProductsPage() {
        loginPage = pageTransporter.navigateToLoginPage();
    }

    @When("I login to the page as a user with {string} role")
    public void iLoginToThePageAsAUserWithRole(String userRole) {
        homePage = loginPage.loginWithUser(userRole);
    }

    @Then("I should login to Admin page successfully")
    public void iShouldLoginToAdminPageSuccessfully() {
        boolean islogoutButtonDisplayed = homePage.topBarMenu.islogoutButtonDisplayed();
        Assert.assertTrue(islogoutButtonDisplayed, "My account was not displayed");
    }
}
