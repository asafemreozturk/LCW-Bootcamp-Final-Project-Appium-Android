package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class cartPageSteps {
    pages.cartPage cartPag=new pages.cartPage(DriverFactory.getDriver());
    @Given("User is on HomePage")
    public void userIsOnHomePage() {
        cartPag.checkHomeHeader();
    }

    @When("Click CartPage Icon")
    public void clickCartPageIcon() {
        cartPag.clickCartPage();
    }

    @Then("Check CartPage")
    public void checkCartPage() {
        cartPag.checkCartPage();
    }

    @Then("should see {string} size text")
    public void shouldSeeSizeText(String size) {
        cartPag.checkSizeText(size);
    }

    @Then("should see {string} color text")
    public void shouldSeeColorText(String color) {
        cartPag.checkColorText(color);
    }

    @Then("should see {string} model text")
    public void shouldSeeModelText(String model) {
        cartPag.checkModelText(model);
    }
    @When("Click Categories")
    public void clickCategories() {
        cartPag.clickCategories();
    }
    @Then("See Category Page")
    public void seeCategoryPage() {
        cartPag.checkCategoryPage();
    }
    @When("Click Woman filter")
    public void clickWomanFilter() {
        cartPag.clickWomenFilter();
    }
    @Then("Click Women Wear filter")
    public void clickWomenWearFilter() {
        cartPag.clickWomenWearFilter();
    }
    @When("Swipe Down and Click Blouse")
    public void swipeDownAndClickBlouse() {
        cartPag.swipeDownAndClickBlouse();
    }
    @Then("Click filter icon")
    public void clickFilterIcon() {
        cartPag.clickFilterIcon();
    }
    @Then("Click color filter")
    public void clickColorFilter() {
        cartPag.clickColorFilter();
    }
    @When("Search {string} color")
    public void searchColor(String black) {
        cartPag.colorSearch(black);
    }
    @Then("Click black icon")
    public void clickBlackIcon() {
        cartPag.clickBlackIcon();
    }
    @Then("Click apply button")
    public void clickApplyButton() {
        cartPag.clickApplyButton();
    }
    @Then("Click list products")
    public void clickListProducts() {
        cartPag.clickListProducts();
    }
    @When("Select first product from list")
    public void selectFirstProductFromList() {
        cartPag.clickFirstProduct();
    }
    @Then("Click AddToCart Button")
    public void clickAddToCartButton() {
        cartPag.clickAddCartBtn();
    }
    @Then("See details and Select size")
    public void selectSize() {
        cartPag.sizeSelect();
    }
    @Then("Click Close Icon")
    public void clickCloseIcon() {
        cartPag.clickCloseIcon();
    }
    @When("Click Checkout Button")
    public void clickCheckoutButton() {
        cartPag.clickCheckoutButton();
    }

}
