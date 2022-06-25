package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class loginPage {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By logHeader = MobileBy.id("com.lcwaikiki.android:id/headerLogin");
    By skipButton = MobileBy.id("com.lcwaikiki.android:id/tvNext");
    By homeHeader = MobileBy.id("com.lcwaikiki.android:id/txtWelcomeHeader");
    By profileButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.view.ViewGroup/android.widget.ImageView");
    By mailRadioBtn = MobileBy.id("com.lcwaikiki.android:id/radioBtnEmail");
    By emailPlaceholder = MobileBy.id("com.lcwaikiki.android:id/edtEmail");
    By loginButton = MobileBy.id("com.lcwaikiki.android:id/buttonLogin");
    By passwordPlaceholder = MobileBy.id("com.lcwaikiki.android:id/edtPassword");
    By phoneRadioBtn = MobileBy.id("com.lcwaikiki.android:id/radioBtnPhone");
    By phonePlaceholder = MobileBy.id("com.lcwaikiki.android:id/edtPhone");
    By forgotMail = MobileBy.id("com.lcwaikiki.android:id/editText");
    By sendButton = MobileBy.id("com.lcwaikiki.android:id/buttonSend");
    By registerNow = MobileBy.id("com.lcwaikiki.android:id/registerNow");
    By szlesmeRadioBtn = MobileBy.id("com.lcwaikiki.android:id/contractChecked");
    By registerMail = MobileBy.id("com.lcwaikiki.android:id/edtEmail");
    By registerPassword = MobileBy.id("com.lcwaikiki.android:id/edtPassword");
    By registerPhone = MobileBy.id("com.lcwaikiki.android:id/edtPhoneNumber");
    By forgotPassword = MobileBy.id("com.lcwaikiki.android:id/textForgotPassword");
    By registerBtn=MobileBy.id("com.lcwaikiki.android:id/buttonRegister");
    public loginPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkLogHeader() {
        elementHelper.presenceElement(logHeader);
    }

    public void clickSkipButton() {
        elementHelper.click(skipButton);
    }

    public void checkHomeHeader() {
        elementHelper.presenceElement(homeHeader);
    }

    public void clickProfileButton() {
        elementHelper.click(profileButton);
    }

    public void clickMailRadioButton() {
        elementHelper.click(mailRadioBtn);
    }

    public void enterWrongEmail(String mail) {
        elementHelper.sendKey(emailPlaceholder, mail);
    }

    public void clickLoginBtn() {
        elementHelper.click(loginButton);
    }

    public void enterWrongPassword(String password) {
        elementHelper.sendKey(passwordPlaceholder, password);
    }

    public void clickPhoneButton() {
        elementHelper.click(phoneRadioBtn);
    }

    public void enterWrongPhoneNumber(String phoneNum) {
        elementHelper.sendKey(phonePlaceholder, phoneNum);
    }

    public void enterEmail(String mail) {
        elementHelper.sendKey(emailPlaceholder, mail);
    }

    public void clickSendBtn() {
        elementHelper.click(sendButton);
    }

    public void clickRegisterBtnLogPage() {
        elementHelper.click(registerNow);
    }

    public void clickSozlesmeRadioButton() {
        elementHelper.click(szlesmeRadioBtn);
    }

    public void registerEmail(String Email) {
        elementHelper.sendKey(registerMail, Email);
    }

    public void registerPassword(String Password) {
        elementHelper.sendKey(registerPassword, Password);
    }

    public void registerNumber(String Number) {
        elementHelper.sendKey(registerPhone, Number);
    }

    public void clickForgotPassword() {
        elementHelper.click(forgotPassword);
    }

    public void enterForgotMail(String email) {
        elementHelper.sendKey(forgotMail, email);
    }

    public void clickRegisterBtn() {
        elementHelper.click(registerBtn);
    }


}