package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class loginPageSteps {

    pages.loginPage logPage=new pages.loginPage(DriverFactory.getDriver());

    @Given("Emre is on Login Page")
    public void emreIsOnLoginPage() {
        logPage.checkLogHeader();
    }

    @When("Click email radio button")
    public void clickEmailRadioButton() {
        logPage.clickMailRadioButton();
    }

    @Then("Enter wrong {string} to mail")
    public void enterWrongEmail(String mail) {
        logPage.enterWrongEmail(mail);
    }

    @Then("Click Login Button")
    public void clickLoginButton() {
        logPage.clickLoginBtn();
    }

    @Then("Enter wrong {string} to password")
    public void enterWrongPassword(String Password) {
        logPage.enterWrongPassword(Password);
    }

    @When("Click telefon radio button")
    public void clickTelefonRadioButton() {
        logPage.clickPhoneButton();
    }

    @Then("Enter wrong {string} phone number")
    public void enterWrongPhoneNumber(String phoneNum) {
        logPage.enterWrongPhoneNumber(phoneNum);
    }


    @When("Enter {string} to e-mail placeholder")
    public void enterToEMailPlaceholder(String mail) {
        logPage.enterForgotMail(mail);
    }

    @Then("Click send button")
    public void clickSendButton() {
        logPage.clickSendBtn();
    }

    @Then("Click register button")
    public void clickRegisterButton() {
        logPage.clickRegisterBtn();
    }

    @When("Click register button on login page")
    public void clickRegisterButtonOnLogin() {
        logPage.clickRegisterBtnLogPage();
    }

    @Then("Click Sozlesme radio button")
    public void clickSozlesmeRadioButton() {
        logPage.clickSozlesmeRadioButton();
    }

    @Given("Emre is on Home Page")
    public void emreIsOnHomePage() {
        logPage.checkHomeHeader();
    }

    @When("Click Skip Button")
    public void clickSkipButton() {
        logPage.clickSkipButton();
    }

    @Then("Click Profile Button")
    public void clickProfileButton() {
        logPage.clickProfileButton();
    }

    @Then("Enter {string} to email")
    public void enterToEmail(String email) {
        logPage.registerEmail(email);
    }


    @Then("Enter {string} to password")
    public void enterToPassword(String password) {
        logPage.registerPassword(password);
    }

    @Then("Enter {string} to number")
    public void enterToNumber(String phoneNumber) {
        logPage.registerNumber(phoneNumber);
    }


    @Then("Click Forgot Password")
    public void clickForgotPassword() {
        logPage.clickForgotPassword();
    }
}
