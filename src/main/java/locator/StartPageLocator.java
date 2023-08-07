package locator;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface StartPageLocator {

    By BUTTON_LANJUT = MobileBy.id("go_btn");
    By INPUT_PHONE = MobileBy.id("phone_number_edit");
    By BUTTON_AGREE = MobileBy.id("login_select_agree_image");
    By BUTTON_HEDAER_BACK = MobileBy.id("manual_top_back");
    By BUTTON_LANJUT_LOGIN = MobileBy.id("login_btn");

    //OTP Page
    By LABEL_INPUT_OTP = MobileBy.id("manual_layout_title");
    By BUTTON_RESEND_OTP = MobileBy.id("text_sms_status");
    String LABEL_TOAST_MESSAGE = "//*[contains(@text, '%s')]";
}
