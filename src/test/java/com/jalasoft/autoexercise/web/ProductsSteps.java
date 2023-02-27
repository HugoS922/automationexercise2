package com.jalasoft.autoexercise.web;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import ui.PageTransporter;
import ui.web.pages.HomePage;
import ui.web.pages.ProductsPage;

public class ProductsSteps {

    private boolean result;
    private final PageTransporter pageTransporter;
    private HomePage homePage;
    private ProductsPage productsPage;

    public ProductsSteps() {
        this.pageTransporter = PageTransporter.getInstance();
    }

    @Given("I navigate to Home page")
    public void iNavigateToProductsPage() {
        homePage = pageTransporter.navigateToHomePage();
    }

    @Given("I should be able to see the Products button")
    public void iShouldBeAbleToSeeTheButtonOfProducts() {
        result = homePage.topBarMenu.isMyCategoriesBarDisplayed();
        Assert.assertTrue(result);
    }

    @Given("I click on the Products button")
    public void iClickOnTheProductsButton() {
        productsPage = homePage.topBarMenu.clickProductsButton();
    }

    @Then("the Products page will load")
    public void theProductsPageWillLoad() {
        result = productsPage.isMyProductsListDisplayed();
        Assert.assertTrue(result);
    }

    @Given("i am in Products page")
    public void iAmInProductsPage() {
        homePage = pageTransporter.navigateToProductsPage();
    }

    @When("I should be able to see the Brands button")
    public void iShouldBeAbleToSeeTheBrandsButton() {
        result = homePage.brandsBarMenu.isMyBrandsBarDisplayed();
        Assert.assertTrue(result);
    }

    @When("I click on the Polo button")
    public void iClickOnThePoloButton() {
        productsPage = homePage.brandsBarMenu.clickOnPoloButton();
    }

    @Then("the Polo page will load")
    public void thePoloPageWillLoad() {
        result = homePage.poloPage.isMyPoloTitleDisplayed();
        Assert.assertTrue(result);
    }

    @When("I click on the H&M button")
    public void iClickOnTheHMButton() {
        productsPage = homePage.brandsBarMenu.clickOnHMButton();
    }

    @Then("the H&M page will load")
    public void theHMPageWillLoad() {
        result = homePage.hMPage.isMyHMTitleDisplayed();
        Assert.assertTrue(result);
    }

    @When("I click on the Madame button")
    public void iClickOnTheMadameButton() {
        productsPage = homePage.brandsBarMenu.clickOnMadameButton();
    }

    @Then("the Madame page will load")
    public void theMadamePageWillLoad() {
        result = homePage.madamePage.isMyMadameTitleDisplayed();
        Assert.assertTrue(result);
    }

    @When("I click on the Mast & Harbour button")
    public void iClickOnTheMastHarbourButton() {
        productsPage = homePage.brandsBarMenu.clickOnMastHarbourButton();
    }

    @Then("the Mast & Harbour page will load")
    public void theMastHarbourPageWillLoad() {
        result = homePage.mastHarbourPage.isMyMastHarbourTitleDisplayed();
        Assert.assertTrue(result);
    }

    @When("I click on the Babyhug button")
    public void iClickOnTheBabyhugButton() {
        productsPage = homePage.brandsBarMenu.clickOnBabyHugButton();
    }

    @Then("the Babyhug page will load")
    public void theBabyhugPageWillLoad() {
        result = homePage.babyHugPage.isMyBabyHugTitleDisplayed();
        Assert.assertTrue(result);
    }

    @When("I click on the Allen Solly Junior button")
    public void iClickOnTheAllenSollyJuniorButton() {
        productsPage = homePage.brandsBarMenu.clickOnAllenSollyButton();
    }

    @Then("the Allen Solly Junior page will load")
    public void theAllenSollyJuniorPageWillLoad() {
        result = homePage.allenSollyJuniorPage.isMyAllenSollyTitleDisplayed();
        Assert.assertTrue(result);
    }

    @When("I click on the Kookie Kids button")
    public void iClickOnTheKookieKidsButton() {
        productsPage = homePage.brandsBarMenu.clickOnKookieKidsButton();
    }

    @Then("the Kookie Kids page will load")
    public void theKookieKidsPageWillLoad() {
        result = homePage.kookieKidsPage.isMyKookieKidsTitleDisplayed();
        Assert.assertTrue(result);
    }

    @When("I click on the Biba button")
    public void iClickOnTheBibaButton() {
        productsPage = homePage.brandsBarMenu.clickOnBibaButton();
    }

    @Then("the Biba page will load")
    public void theBibaPageWillLoad() {
        result = homePage.bibaPage.isMyBibaTitleDisplayed();
        Assert.assertTrue(result);
    }

    @Then("the Polo quantity matches with the expected")
    public void thePoloQuantityMatchesWithTheExpected() {
        int actualProducts = productsPage.isMyProductsListComplete();
        int expectedProducts = Integer.parseInt(homePage.brandsBarMenu.getPoloProductsQuantity());
        Assert.assertEquals(actualProducts, expectedProducts);
    }

    @Then("the H&M quantity matches with the expected")
    public void theHMQuantityMatchesWithTheExpected() {
        int actualProducts = productsPage.isMyProductsListComplete();
        int expectedProducts = Integer.parseInt(homePage.brandsBarMenu.getHMProductsQuantity());
        Assert.assertEquals(actualProducts, expectedProducts);
    }

    @Then("the Madame quantity matches with the expected")
    public void theMadameQuantityMatchesWithTheExpected() {
        int actualProducts = productsPage.isMyProductsListComplete();
        int expectedProducts = Integer.parseInt(homePage.brandsBarMenu.getMadameProductsQuantity());
        Assert.assertEquals(actualProducts, expectedProducts);
    }

    @Then("the Mast & Harbour quantity matches with the expected")
    public void theMastHarbourQuantityMatchesWithTheExpected() {
        int actualProducts = productsPage.isMyProductsListComplete();
        int expectedProducts = Integer.parseInt(homePage.brandsBarMenu.getMastHarbourProductsQuantity());
        Assert.assertEquals(actualProducts, expectedProducts);
    }

    @Then("the Babyhug quantity matches with the expected")
    public void theBabyhugQuantityMatchesWithTheExpected() {
        int actualProducts = productsPage.isMyProductsListComplete();
        int expectedProducts = Integer.parseInt(homePage.brandsBarMenu.getBabyHugProductsQuantity());
        Assert.assertEquals(actualProducts, expectedProducts);
    }

    @Then("the Allen Solly Junior quantity matches with the expected")
    public void theAllenSollyJuniorQuantityMatchesWithTheExpected() {
        int actualProducts = productsPage.isMyProductsListComplete();
        int expectedProducts = Integer.parseInt(homePage.brandsBarMenu.getAllenSollyJuniorProductsQuantity());
        Assert.assertEquals(actualProducts, expectedProducts);
    }

    @Then("the Kookie Kids quantity matches with the expected")
    public void theKookieKidsQuantityMatchesWithTheExpected() {
        int actualProducts = productsPage.isMyProductsListComplete();
        int expectedProducts = Integer.parseInt(homePage.brandsBarMenu.getKookieKidsProductsQuantity());
        Assert.assertEquals(actualProducts, expectedProducts);
    }

    @Then("the Biba quantity matches with the expected")
    public void theBibaQuantityMatchesWithTheExpected() {
        int actualProducts = productsPage.isMyProductsListComplete();
        int expectedProducts = Integer.parseInt(homePage.brandsBarMenu.getBibaProductsQuantity());
        Assert.assertEquals(actualProducts, expectedProducts);
    }
}
