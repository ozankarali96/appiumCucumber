package Constants;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class GamesConstants {

    public static final By SEARCH_TB = AppiumBy.xpath("//XCUIElementTypeSearchField[@name=\"Search\"]");
    public static final By SEARCH_BUTTON = AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Search\"]");
    public static final By FIRST_GAME_BUTTON = AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"gameTitle\"])[1]");
    public static final By GAMES_TAB_TITLE = AppiumBy.xpath("//XCUIElementTypeButton[@name=\"horizontalNavBarRightItem\"]");
    public static final By HORIZONTAL_BUTTON = AppiumBy.accessibilityId("horizontalNavBarRightItem");
    public static final By VERTICAL_BUTTON = AppiumBy.accessibilityId("verticalNavBarRightItem");
    public static final By GAMES_TAB_BUTTON = AppiumBy.accessibilityId("Games");
    public static final By SEGA_TAB_BUTTON = AppiumBy.accessibilityId("SEGA");


}
