package pagehandler;

import navigator.WebDriverController;
import org.eclipse.jetty.websocket.common.extensions.compress.XWebkitDeflateFrameExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.AltoroLoginPage;
import stepdef.CucumberTestHook;

import static configdefinition.DefaultTestValues.WEBDRIVER_SLEEP_IN_MILLIS;
import static configdefinition.DefaultTestValues.WEBDRIVER_TIMEOUT;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static navigator.InitPageFactory.altoroLoginPage;

public class AltoroLoginPageHandler {
    protected WebDriver wDriver;
    private WebDriverWait wait;

    public AltoroLoginPageHandler(WebDriver wDriver){
        this.wDriver = wDriver;
       // wait = new WebDriverWait(wDriver,WEBDRIVER_TIMEOUT,WEBDRIVER_SLEEP_IN_MILLIS);

    }
    public void waitForPageLanding(){
       // wait.until(visibilityOf(altoroLoginPage.getLoginButton()));
        //wait.until(visibilityOf(altoroLoginPage.getUserNameField()));
        //wait.until(visibilityOf(altoroLoginPage.getPasswordField()));
    }

    public void fillUserName(String username){
    altoroLoginPage.getUserNameField().sendKeys("admin");
    }

    public void fillPassword(String username){
        altoroLoginPage.getPasswordField().sendKeys("admin");

    }

    public void clickLoginButton(){
        altoroLoginPage.getLoginButton().click();
    }


}
