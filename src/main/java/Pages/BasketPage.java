package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static ExtentReports.ExtentTestManager.getTest;

public class BasketPage extends BaseStepMethod {

    private static final Logger LOGGER= LogManager.getLogger(BasketPage.class);

    private static final By BTN_BASKETPAGE_SEPETI_ONAYLA_BUTTONU =By.xpath("(//a[@class='button green checkout-button block js-checkout-button'])");

    public void click_To_sepeti_onayla_button(){

        LOGGER.info("User can click Sepeti Onayla Buttonu");
        getTest().info("User can click Sepeti Onayla Buttonu in Cart Page");

        clickElement(BTN_BASKETPAGE_SEPETI_ONAYLA_BUTTONU);
    }
}
