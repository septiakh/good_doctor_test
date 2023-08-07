package pages;

import config.BasePageObject;
import static locator.HomePageLocator.*;

public class HomePage extends BasePageObject {
    public void navBarMenu(String navbarName) {
        switch (navbarName){
            case "home":
                click(BUTTON_NAV_HOME);
                break;
            case "consult":
                click(BUTTON_NAV_CONSULT);
                break;
            case "store":
                click(BUTTON_NAV_STORE);
                break;
            case "activity":
                click(BUTTON_NAV_ACTICITY);
                break;
            case "profile":
                click(BUTTON_NAV_PROFILE);
                break;
            default:
                System.out.println("NavBar not found!");
        }
    }

    public void setAddress(String address){
        click(BUTTON_ADDRESS);
        type(INPUT_ADDRESS, address);
        click(LIST_ADDRESS_SEARCH);
    }

}
