package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ro.Si;
import org.junit.Assert;
import pages.HomePage;
import pages.SignInUpPage;
import pages.StorePage;

public class GoodDoctorSteps {
    HomePage homePage = new HomePage();
    StorePage storePage = new StorePage();
    SignInUpPage signInUpPage = new SignInUpPage();
    @Given("user set Address {string}")
    public void userSetAddress(String address) {
        homePage.setAddress(address);
    }

    @When("user click Nav Bar {string}")
    public void userClickNavBar(String navbarMenu) {
        homePage.navBarMenu(navbarMenu);
    }

    @And("user input product {string} on search box")
    public void userInputProductOnSearchBox(String itemName) {
        storePage.searchProduct(itemName);
    }

    @And("user select the first item")
    public void userSelectTheFirstItem() {
        storePage.selectFirstItem();
    }

    @And("user click Add to Cart")
    public void userClickAddToCart() throws InterruptedException {
        storePage.setContextWebView();
        storePage.addToCart();
    }

    @And("user set item qty {int}")
    public void userSetItemQty(int itemQty) {
        storePage.setContextWebView();
        storePage.setQty(itemQty);
    }

    @Given("user input phone number {string}")
    public void userInputPhoneNumber(String phoneNumber) {
        signInUpPage.inputPhone(phoneNumber);
    }

    @When("user click agree T&C box button")
    public void userClickAgreeTCBoxButton() {
        signInUpPage.clickAgreeCheckboxTNC();
    }

    @And("user input random OTP")
    public void userInputRandomOTP() {
        signInUpPage.inputRandomOTP();
    }

    @Then("user click Verifikasi button")
    public void userClickVerifikasiButton() {
        signInUpPage.clickContinueButton();
    }

    @Given("user click Lanjut button on start page")
    public void userClickLanjutButtonOnStartPage() {
        signInUpPage.clickContinueButtonStart();
    }

    @And("user click Lanjut button on Sign In Page")
    public void userClickLanjutButtonOnSignInPage() {
        signInUpPage.clickContinueButton();
    }

    @And("user verify got error mesage {string}")
    public void userVerifyGotErrorMesage(String message) {
        Assert.assertEquals(message, signInUpPage.getToastMessage(message));
    }

    @And("user uncheck T&C box button")
    public void userUncheckTCBoxButton() {
        signInUpPage.uncheckCheckboxTNC();
    }

    @Then("user verify button Lanjutkan is disable")
    public void userVerifyButtonLanjutkanIsDisable() {
        Assert.assertFalse("Button still enable", signInUpPage.isLanjutButtonEnable());
    }

    @Given("user is on inputed phone number page")
    public void userIsOnInputedPhoneNumberPage() {
        signInUpPage.clickContinueButtonStart();
    }

    @And("user check TNC box")
    public void userCheckTNCBox() {
        signInUpPage.clickAgreeCheckboxTNC();
    }

    @And("user click Lanjutkan button")
    public void userClickLanjutkanButton() {
        signInUpPage.clickContinueButton();
    }

    @And("user input invalid OTP number")
    public void userInputInvalidOTPNumber() {
        signInUpPage.inputRandomOTP();
    }
}