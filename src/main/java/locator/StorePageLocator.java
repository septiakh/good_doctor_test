package locator;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface StorePageLocator {

    By INPUT_SEARCH = MobileBy.xpath("//android.widget.EditText");
    By LABEL_ITEM_NAME = MobileBy.xpath("//*[contains(@text, 'Rp')]//preceding-sibling::android.widget.TextView[2]");
    String LABEL_ITEM_PRICE = "//android.view.View[contains(@text, '%s')]//following-sibling::android.view.View[contains(@text, 'Rp')]";
    By LABEL_ITEM_SEND = MobileBy.xpath("//android.view.View[contains(@text, 'Rp')]//following-sibling::android.view.View");

    //WEBVIEW
    By BUTTON_DECREASE_QTY = MobileBy.xpath("//span[contains(@aria-label, 'Decrease Value')]");
    By BUTTON_INCREASE_QTY = MobileBy.xpath("//span[contains(@aria-label, 'Increase Value')]");
    By BUTTON_ADD_TO_CART = By.xpath("//div[contains(@class, 'btn') and text() = 'Tambahkan']");
    By BUTTON_CART = MobileBy.xpath("//div[contains(@class, 'cartIcon')]");



}
