package pagehandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static navigator.InitPageFactory.altoroHomePage;
import static navigator.InitPageFactory.altoroTransferFundsPage;
import static navigator.InitPageFactory.altoroLoginPage;

public class AltoroHomePageHandler {
    protected WebDriver wDriver;
    private WebDriverWait wait;

    public AltoroHomePageHandler(WebDriver wDriver){
        this.wDriver = wDriver;

    }

    public void clickiewAccountSummaryButton(){
        //
        altoroHomePage.getViewAccountSummary().click();
    }
    public void clickTransferFundsButton(){
        //
        altoroHomePage.getTransferFundsButton().click();
    }
    public void selectCheckingAccountDropdown()
    {
        altoroHomePage.getCheckingAccountsDropdown();

    }
    public void selectCorporateAccountFromAccount()
    {
        altoroTransferFundsPage.getCorporateAccountAccountsDropdown();

    }
    public void selectCheckingAccountFromAccount()
    {
        altoroTransferFundsPage.getCheckingAccountAccountsDropdown();

    }
    public void enterTransferAmount()
    {
        altoroTransferFundsPage.getTransferAmountTextBox().sendKeys("1000");

    }
    public void clickTransferMoneyButton(){
        //
        altoroTransferFundsPage.getTransferMoneyButton().click();
    }
    public void clickGoButton(){
        //
        altoroHomePage.getGoButton().click();
    }
    public void clickLogOutButton(){
        //
        altoroHomePage.getLogOutButton().click();
    }
}
