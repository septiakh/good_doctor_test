package hooks;

import config.AndroidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AndroidDriverHooks {

  @Before(value = "@GoodDoctor")
  public void beforeScenario(){
    AndroidDriverInit.initialize();
  }

  @After(value = "@GoodDoctor")
  public void afterScenario(){
    AndroidDriverInit.quit();
  }

}
