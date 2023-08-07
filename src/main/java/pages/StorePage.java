package pages;

import config.BasePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static config.AndroidDriverInit.driver;
import static locator.StorePageLocator.*;

public class StorePage extends BasePageObject {

    public void searchProduct(String productName){
        click(INPUT_SEARCH);
        find(INPUT_SEARCH).sendKeys(productName);
        click(INPUT_SEARCH);
        Map<String, Object> params = new HashMap();
        params.put("element", find(INPUT_SEARCH));
        params.put("action", "search");
        evaluateJavascript("mobile: performEditorAction", params);
    }

    public void selectFirstItem(){
        waitABit(3);
        click(LABEL_ITEM_NAME);
    }

    public String getItemName(){
        return getText(LABEL_ITEM_NAME);
    }

    public String getItemPrice(String itemName){
        return getText(By.xpath(String.format(LABEL_ITEM_PRICE, itemName)));
    }

    public String getItemSend(){
        return getText(LABEL_ITEM_SEND);
    }

    public void setQty(int qty){
        for(int i=1; i<=qty; i++){
            click(BUTTON_INCREASE_QTY);
        }
    }

    public void addToCart() throws InterruptedException {
        Thread.sleep(3000);
        getDriver().context("WEBVIEW_com.pajk.idpersonaldoc");
        getDriver().findElementByCssSelector("#app > div > div > footer > div > div.right > div").click();

    }


}
