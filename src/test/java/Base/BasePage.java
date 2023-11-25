package Base;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.remote.mobile.RemoteNetworkConnection;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.interactions.PointerInput.Kind.TOUCH;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;

import java.time.Duration;
import java.util.Arrays;
import java.util.Set;
import java.util.SortedMap;

import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;

public class BasePage {
    private static IOSDriver driver;
    private static WebDriverWait wait;
    private final static PointerInput FINGER = new PointerInput(TOUCH, "finger");


    public BasePage(IOSDriver driver) {
        BasePage.driver = driver;
        BasePage.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement findElement(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public void click(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public String getText(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return findElement(by).getText();
    }

    public void scrollDown() {
        Dimension dimension = driver.manage().window().getSize();
        Point start = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.7));
        Point end = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.1));
        doSwipe(start, end, 3500);
    }

    public void scrollLeft() {
        Dimension dimension = driver.manage().window().getSize();
        Point start = new Point((int) (dimension.width * 0.9), (int) (dimension.height * 0.21));
        Point end = new Point((int) (dimension.width * 0.4), (int) (dimension.height * 0.21));
        doSwipe(start, end, 3500);
    }

    public void doSwipe(Point start, Point end, int duration) {
        Sequence swipe = new Sequence(FINGER, 1)
                .addAction(FINGER.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()))
                .addAction(FINGER.createPointerDown(LEFT.asArg()))
                .addAction(FINGER.createPointerMove(ofMillis(duration), viewport(), end.getX(), end.getY()))
                .addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }

    public boolean isDisplayed(By by) {
        return driver.findElement(by).isDisplayed();
    }

    public boolean isNotDisplayed(By by) {
        try {
            return !driver.findElement(by).isDisplayed();
        } catch (NoSuchElementException | StaleElementReferenceException e) {
            return true;
        }
    }

    public boolean shouldSeeContainingTextForIOS(String text) {
        try {
            return isElementVisible(AppiumBy.xpath("//*[contains(@value,'" + text + "')]"));
        } catch (TimeoutException e) {
        }
        return false;
    }

    public void clickText(String text) {
        click(AppiumBy.xpath("//*[contains(@value,'" + text + "')]"));
    }

    public boolean isElementVisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void checkNotElement(String text) {
        assertTrue("Beklenen element görünmemektedir.", shouldSeeContainingTextForIOS(text));
    }

    public void switchSafariView(String text) {
        driver.activateApp("com.apple.mobilesafari");
//        driver.findElement(By.id("Continue")).click();
//        driver.findElement(By.id("Kapat")).click();
        Assert.assertTrue(isDisplayed(By.id(text)));

    }
}
