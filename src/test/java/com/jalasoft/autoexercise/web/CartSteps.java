package com.jalasoft.autoexercise.web;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import ui.PageTransporter;
import ui.web.pages.CartPage;
import ui.web.pages.HomePage;

public class CartSteps {
    private boolean result;
    private final PageTransporter pageTransporter;
    private HomePage homePage;
    private CartPage cartPage;

    public CartSteps() {
//        this.controller = controller;
//        this.homePage = HomePage;
        this.pageTransporter = PageTransporter.getInstance();
    }

    @Given("I navigate to Home page for carts")
    public void iNavigateToProductsPage() {
        homePage = pageTransporter.navigateToHomePage();
    }

    @When("I should be able to see the Cart button")
    public void iShouldBeAbleToSeeTheCartButton() {
        result = homePage.topBarMenu.isMyCategoriesBarDisplayed();
        Assert.assertTrue(result);
    }

    @When("I click on the Cart button")
    public void iClickOnTheCartButton() {
        cartPage = homePage.topBarMenu.clickCartButton();
    }

    @Then("the Cart page will load empty")
    public void theCartPageWillLoad() {
        result = cartPage.isMyCartMessageDisplayed();
        Assert.assertTrue(result);
    }
}
