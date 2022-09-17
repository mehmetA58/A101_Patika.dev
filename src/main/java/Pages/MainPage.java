package Pages;

import Base.BaseStepMethod;
import Utilities.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static Base.BaseTest.driver;
import static ExtentReports.ExtentTestManager.getTest;


public class MainPage extends BaseStepMethod {

    private static final Logger LOGGER= LogManager.getLogger(MainPage.class);

    private static final By BTN_COOKIES_ALLOW =By.xpath("(//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll'])");

    //private static final By HOVER_MAİNPAGE_GIYIMAKSESUAR =By.xpath("(//li[@class='js-navigation-item '])[4]");


    public void goTo_A101() {
        LOGGER.info("User go to " + ConfigReader.getProperty("baseURL"));
        getTest().info("User go to " + ConfigReader.getProperty("baseURL"));

        driver.get(ConfigReader.getProperty("baseURL"));
    }
    public void enterTo_Allow(){
        LOGGER.info("User allowed cookies");
        getTest().info("User clicks cookies allowed button");
        clickElement(BTN_COOKIES_ALLOW);
    }
    public void goToDizAltiCorap(){
        LOGGER.info("User navigate to " + ConfigReader.getProperty("dizaltiURL"));
        getTest().info("User navigate to " + ConfigReader.getProperty("dizaltiURL"));
       driver.navigate().to(ConfigReader.getProperty("dizaltiURL"));
    }
}
