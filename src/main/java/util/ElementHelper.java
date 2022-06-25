package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.regex.Pattern;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class ElementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHelper(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.action = new Actions(driver);
    }

    public WebElement findElement(By key) {
        WebElement element = presenceElement(key);
        //scrollToElement(element);
        return element;
    }

    public void click(By key) {
        findElement(key).click();
    }

    public void sendKey(By key, String text) {
        findElement(key).sendKeys(text);
    }

    public boolean checkElementText(By key, String text) {
        return wait.until(ExpectedConditions.textMatches(key, Pattern.compile(text)));
    }

    public String getAttribute(By key, String attr) {
        return findElement(key).getAttribute(attr);
    }

    public WebElement presenceElement(By key) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public List<WebElement> presenceElements(By key) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(key));
    }

    public void Swipe(int initX,int initY,int lastX,int lastY) {
        new TouchAction(driver).longPress(PointOption.point(initX, initY))
                .moveTo(PointOption.point(lastX, lastY))
                .release().perform();
    }


}
