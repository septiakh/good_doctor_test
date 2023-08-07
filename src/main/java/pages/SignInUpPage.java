package pages;

import config.BasePageObject;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

import java.util.Random;

import static locator.HomePageLocator.*;
import static locator.StartPageLocator.*;

public class SignInUpPage extends BasePageObject {

    public void inputPhone(String phoneNumber){
        type(INPUT_PHONE, phoneNumber);
    }

    public void clickContinueButtonStart(){
        click(BUTTON_LANJUT);
    }

    public void clickContinueButton(){
        click(BUTTON_LANJUT_LOGIN);
    }

    public void clickAgreeCheckboxTNC(){
        click(BUTTON_AGREE);
        click(BUTTON_AGREE);
    }

    public void uncheckCheckboxTNC(){
        click(BUTTON_AGREE);
    }


    public void inputRandomOTP(){
        Random random = new Random();
        int number = 1000 + random.nextInt(999999);
        String otp = String.valueOf(number);
        for (char ot:otp.toCharArray()){
            AndroidKey androidKey = AndroidKey.valueOf("DIGIT_" + ot);
            getDriver().pressKey(new KeyEvent(androidKey));
        }
    }

    public String getToastMessage(String message){
        waitABit(1);
        return find(By.xpath(String.format(LABEL_TOAST_MESSAGE, message))).getText();
    }

    public boolean isLanjutButtonEnable(){
        return find(BUTTON_LANJUT_LOGIN).isEnabled();
    }

}
