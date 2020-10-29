package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AltoroLoginPage {

    @FindBy(id = "uid")
    private WebElement userNameField;

    @FindBy(id = "passw")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value=\"Login\"]")
    private WebElement loginButton;


    public WebElement getLoginButton() { return loginButton;}

    public WebElement getUserNameField() { return userNameField;}

    public WebElement getPasswordField() { return passwordField;}

}
