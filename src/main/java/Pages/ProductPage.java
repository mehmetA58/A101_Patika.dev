package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static ExtentReports.ExtentTestManager.getTest;

public class ProductPage extends BaseStepMethod {

    private static final Logger LOGGER= LogManager.getLogger(ProductPage.class);
    private static final By TXT_PRODUCTPAGE_FIRSTPRODUCT =By.xpath("//h3[1]");
    private static final By TXT_PRODUCTPAGE_PRODUCTCOLOUR =By.xpath("//div[@class='selected-variant-text']");
    private static final By BTN_PRODUCTPAGE_CART_ADD_BUTTON =By.xpath("(//button[@class='add-to-basket button green block with-icon js-add-basket'])");

    private static final By BTN_PRODUCTPAGE_VIEW_CART_BUTTON =By.xpath("(//a[@class='go-to-shop'])");

    public void clickTo_First_product(){
        LOGGER.info("User click first product in Dizalti Corap");
        getTest().info("User click first dizalti corap in Dizalti Corap Page");

        clickElement(TXT_PRODUCTPAGE_FIRSTPRODUCT);
    }
    public void verifyToProduct_Colour(){
        LOGGER.info("User can see product colour");
        getTest().info("User verify product colour in First Product Dizalti Corap Page");

        waitFor(2);
        SoftAssert sf=new SoftAssert();
        sf.assertTrue(getTextElement(TXT_PRODUCTPAGE_PRODUCTCOLOUR).contains("SİYAH"));
        sf.assertAll("secilen ilk diz altı corap siyah");


    }
    public void click_To_AddToCart_Button(){
        LOGGER.info("User can click add to cart button");
        getTest().info("User can click add to cart button in First Product Dizalti Corap Page");

        clickElement(BTN_PRODUCTPAGE_CART_ADD_BUTTON);

    }
    public void click_To_View_Cart_Button(){
        LOGGER.info("User can click view cart button");
        getTest().info("User can click view cart button in First Product Dizalti Corap Page");

        clickElement(BTN_PRODUCTPAGE_VIEW_CART_BUTTON);

    }

}
