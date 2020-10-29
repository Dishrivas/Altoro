package navigator;

import org.openqa.selenium.WebDriver;
import page.AltoroLoginPage;
import page.AltoroTransferFundsPage;
import page.AltoroHomePage;
import static org.openqa.selenium.support.PageFactory.initElements;

public class InitPageFactory {
    public static AltoroLoginPage altoroLoginPage;
    public static AltoroHomePage altoroHomePage;
    public static AltoroTransferFundsPage altoroTransferFundsPage;

    public static AltoroLoginPage altoroLoginPageInit(WebDriver webDriver){
        altoroLoginPage = initElements(webDriver,AltoroLoginPage.class);
        return altoroLoginPage;
    }

    public static AltoroTransferFundsPage altoroAccountSummaryPageInit(WebDriver webDriver){
        altoroTransferFundsPage = initElements(webDriver, AltoroTransferFundsPage.class);
        return altoroTransferFundsPage;
    }

    public static AltoroHomePage altoroHomePageInit(WebDriver webDriver){
        altoroHomePage = initElements(webDriver,AltoroHomePage.class);
        return altoroHomePage;
    }
}
