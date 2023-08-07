package config;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class BasePageObject {

  public AndroidDriver<AndroidElement> getDriver() {
    return AndroidDriverInit.driver;
  }

  public AndroidElement find(By locator) {
    return getDriver().findElement(locator);
  }

  private Set<String> getContext(){
    Set<String> contextNames = getDriver().getContextHandles();
    for (String contextName : contextNames) {
      System.out.println("Context : "+contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
    }
    return contextNames;
  }


  public void setContextAppView(){
    getDriver().context((String) getContext().toArray()[0]);
  }

  public void setContextWebView(){
    String context = getContext().toArray()[1].toString();
    getDriver().context(context);
    System.out.println("Current : "+getDriver().getContext());
  }


  public void click(By locator) {
    find(locator).click();
  }

  public void type(By locator, String text) {
    AndroidElement element = find(locator);
    element.clear();
    element.sendKeys(text);
  }

  public String getText(By locator) {
    return find(locator).getText();
  }

  public MobileElement swipe(String by){
    return (MobileElement) getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*"+by+".*\"))"));
  }

  public void waitABit(int timeout){
    WebDriverWait wait = new WebDriverWait(getDriver(),timeout);
  }

  public Object evaluateJavascript(String script, Object args) {
    JavascriptExecutor jse = ((JavascriptExecutor) getDriver());
    return jse.executeScript(script, args);
  }
}
