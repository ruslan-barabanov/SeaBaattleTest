package test.seaBattleTest;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import constans.ConstantWaiters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.PathsPropertiesUtil;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    private static final String DEFAULT_URL = PathsPropertiesUtil.getProperty("default_url.path");

    protected Browser getBrowser() {
        return AqualityServices.getBrowser();
    }

    @BeforeMethod
    protected void beforeMethod() {
        AqualityServices.getBrowser().goTo(DEFAULT_URL);
        getBrowser().maximize();
        AqualityServices.getBrowser().getDriver().manage().timeouts().implicitlyWait(ConstantWaiters.TIMEOUT_5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void afterTest() {
        if (AqualityServices.isBrowserStarted()) {
            AqualityServices.getBrowser().quit();
        }
    }
}
