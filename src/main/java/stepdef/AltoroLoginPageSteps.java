package stepdef;

import configdefinition.PageTypeConfig;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import navigator.NavigationPageFactory;
import navigator.WebDriverController;
import page.AltoroLoginPage;
import org.openqa.selenium.WebDriver;
import page.AltoroTransferFundsPage;
import pagehandler.AltoroLoginPageHandler;
import pagehandler.AltoroHomePageHandler;

public class AltoroLoginPageSteps{
//public WebDriver driver;


    AltoroLoginPageHandler pagehandler = new AltoroLoginPageHandler(WebDriverController.webDriverController);
    AltoroHomePageHandler altoroHomePageHandler = new AltoroHomePageHandler(WebDriverController.webDriverController);



    private void login(String username, String password) {
    pagehandler.fillUserName(username);
    pagehandler.fillPassword(password);
    pagehandler.clickLoginButton();
    }

    @Then("^I should be able to see the home page$")
    public void iShouldBeAbleToSeeTheHomePage() {

    }

    @Given("^I enter user credential and login$")
    public void iEnterUserCredentialAndLogin() {
        login("admin","admin");
    }

    @And("^I Click Signoff button from the menu bar$")
    public void iClickSignoffButtonFromTheMenuBar() {
        altoroHomePageHandler.clickLogOutButton();
    }

    @When("^I Go to ‘View Account Summary’$")
    public void iGoToViewAccountSummary() {
        altoroHomePageHandler.clickiewAccountSummaryButton();
    }

    @Then("^I Select ‘(\\d+) Checking’ in ‘View Account Details’ drop down$")
    public void iSelectCheckingInViewAccountDetailsDropDown(int arg0) {
        altoroHomePageHandler.selectCheckingAccountDropdown();
    }

    @And("^I Click ‘Go’$")
    public void iClickGo() {
        altoroHomePageHandler.clickGoButton();

    }

    @When("^I Go to ‘Transfer Funds’$")
    public void iGoToTransferFunds() {
        altoroHomePageHandler.clickTransferFundsButton();

    }

    @Then("^I Select ‘(\\d+) Corporate’ account as From Account$")
    public void iSelectCorporateAccountAsFromAccount(int arg0) {
        altoroHomePageHandler.selectCorporateAccountFromAccount();

    }

    @Then("^I Select ‘(\\d+) Corporate’ account as To Account$")
    public void iSelectCorporateAccountAsToAccount(int arg0) {
        altoroHomePageHandler.selectCheckingAccountFromAccount();
    }

    @Then("^I Enter ‘(\\d+)’ into ‘Amount to Transfer’ text box$")
    public void iEnterIntoAmountToTransferTextBox(int arg0) {
        altoroHomePageHandler.enterTransferAmount();
    }

    @And("^I Click on ‘Transfer Money’ button$")
    public void iClickOnTransferMoneyButton() {
        altoroHomePageHandler.clickTransferMoneyButton();
    }
}

