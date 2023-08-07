package locator;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface HomePageLocator {

    By LAYOUT_BANNER = MobileBy.id("crm_banner_content");
    By BUTTON_BANNER_CLOSE = MobileBy.id("crm_banner_close");

    //NAVBAR
    By BUTTON_NAV_HOME = MobileBy.id("home_bottom_homepage");
    By BUTTON_NAV_CONSULT = MobileBy.id("home_bottom_consult");
    By BUTTON_NAV_STORE = MobileBy.id("home_bottom_health_mall");
    By BUTTON_NAV_ACTICITY = MobileBy.id("home_bottom_my_activity");
    By BUTTON_NAV_PROFILE = MobileBy.id("home_bottom_profile");

    By BUTTON_ADDRESS = MobileBy.id("home_page_address");
    By INPUT_ADDRESS = MobileBy.xpath("//android.widget.EditText");
    By LIST_ADDRESS_SEARCH = MobileBy.xpath("//android.widget.Button[1]");
    By BUTTON_SEARCH = MobileBy.id("top_bar_search");
    By BUTTON_ITEM_MENU = MobileBy.id("dtv_item_image");
    String BUTTON_CONSULT_PARTNER = "//android.widget.TextView[contains(@text, '%s')]//preceding-sibling::android.widget.ImageView";

}
