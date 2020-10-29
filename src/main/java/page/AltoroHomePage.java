package page;

import cucumber.api.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AltoroHomePage {

    @FindBy(id = "btnGetAccount")
    private WebElement GoButton;
    //a[@href="/logout.jsp"]")
    @FindBy(xpath = "//*[text()='Sign Off']")
    private WebElement logOutButton;

    @FindBy(id = "MenuHyperLink1")
    private WebElement viewAccountSummary;

    @FindBy(id = "MenuHyperLink3")
    private WebElement transferFundsButton;

    @FindBy(id = "listAccounts")
    private WebElement viewAccountDropdown;

    public WebElement getViewAccountSummary() { return viewAccountSummary;}
    public WebElement getTransferFundsButton() { return transferFundsButton;}

    public WebElement getGoButton() { return GoButton;}

    public WebElement getAccountsDropdown() { return viewAccountDropdown;}
    public WebElement getLogOutButton() { return logOutButton;}

    public void getCheckingAccountsDropdown(){
        Select s = new Select(getAccountsDropdown());
        s.selectByValue("800001");
    }



}
