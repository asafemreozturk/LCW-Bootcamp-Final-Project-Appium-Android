package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class cartPage {

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public cartPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    By homeHeader = MobileBy.id("com.lcwaikiki.android:id/txtWelcomeHeader");
    By cartPageHeader=MobileBy.id("com.lcwaikiki.android:id/toolbarTitle");
    By cartPageButton=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.ImageView");
    By categoryButton=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ImageView");
    By categoryHeader=MobileBy.id("com.lcwaikiki.android:id/toolbarTitle");
    By women=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView");
    By womenWear=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView");
    By womenBlouse=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]/android.widget.TextView");

    By filterIcon=MobileBy.id("com.lcwaikiki.android:id/filter_text");
    By colorFilter=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView");
    By colorPlaceholder=MobileBy.id("com.lcwaikiki.android:id/searchFilterEditText");
    By blackColor=MobileBy.id("com.lcwaikiki.android:id/checked_color_text");
    By applyButton=MobileBy.id("com.lcwaikiki.android:id/subFilterButton");
    By listFindingsButton=MobileBy.id("com.lcwaikiki.android:id/buttonFilter");
    By productCard=MobileBy.id("com.lcwaikiki.android:id/productImageView");
    By addtoCartBtn=MobileBy.id("com.lcwaikiki.android:id/basket");
    By prdDetailBtn=MobileBy.id("com.lcwaikiki.android:id/recyclerDetailTag");
    By closeIcon=MobileBy.id("com.lcwaikiki.android:id/productClose");
    By sizeCard=By.xpath("(//android.widget.FrameLayout[@content-desc=\"Stokta\"])[3]/android.widget.TextView");

    By cartProductSize=MobileBy.id("com.lcwaikiki.android:id/itemBasketSizeText");
    By cartModel=MobileBy.id("com.lcwaikiki.android:id/itemBasketCodeText");
    By cartColor=MobileBy.id("com.lcwaikiki.android:id/itemBasketColorText");
    By checkoutButton=MobileBy.id("com.lcwaikiki.android:id/tv_go_checkout");

    public void checkHomeHeader() {
        elementHelper.presenceElement(homeHeader);
    }
    public void clickCartPage() { elementHelper.click(cartPageButton);}
    public void checkCartPage(){ elementHelper.presenceElement(cartPageHeader); }
    public void checkSizeText(String size) { elementHelper.checkElementText(cartProductSize,size); }
    public void checkColorText(String color) {elementHelper.checkElementText(cartColor,color); }
    public void checkModelText(String model) {elementHelper.checkElementText(cartModel,model); }
    public void clickCategories() { elementHelper.click(categoryButton);}
    public void checkCategoryPage(){ elementHelper.presenceElement(categoryHeader);}
    public void clickWomenFilter() {elementHelper.click(women);}
    public void clickWomenWearFilter() { elementHelper.click(womenWear);}
    public void swipeDownAndClickBlouse() {
        elementHelper.Swipe(816,1535,848,1049);
        elementHelper.click(womenBlouse);
    }
    public void clickFilterIcon() {elementHelper.click(filterIcon);}
    public void clickColorFilter() {elementHelper.click(colorFilter);}
    public void colorSearch(String black) { elementHelper.sendKey(colorPlaceholder,black);}
    public void clickBlackIcon() {elementHelper.click(blackColor);}
    public void clickApplyButton(){elementHelper.click(applyButton);}
    public void clickListProducts(){elementHelper.click(listFindingsButton);}
    public void clickFirstProduct() { elementHelper.click(productCard);}
    public void clickAddCartBtn() {elementHelper.click(addtoCartBtn);}
    public void sizeSelect() { elementHelper.click(sizeCard); }
    public void clickCloseIcon() {
        elementHelper.click(prdDetailBtn);
        elementHelper.click(prdDetailBtn);
        elementHelper.click(closeIcon);}
    public void clickCheckoutButton() {
        elementHelper.click(checkoutButton);
    }

}
