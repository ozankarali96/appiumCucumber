package Constants;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class WishlistConstants {
    public static final By FIRST_WISHLISTED_GAME_BUTTON = AppiumBy.xpath("//XCUIElementTypeApplication[@name=\"TestAssignmentApp\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton");
    public static final By WISHLIST_BUTTON = AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"wishlistBackgroundView\"])[1]/XCUIElementTypeButton");
    public static final By WISHLIST_TAB_BUTTON = AppiumBy.accessibilityId("Wishlist");
}
