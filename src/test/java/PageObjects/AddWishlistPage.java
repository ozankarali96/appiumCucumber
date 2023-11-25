package PageObjects;

import Base.BasePage;
import StepDefinitions.AddWishlistSteps;
import io.appium.java_client.ios.IOSDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;


import static Constants.WishlistConstants.*;

public class AddWishlistPage extends BasePage {
    private static Logger logger = LogManager.getLogger(AddWishlistSteps.class);

    int counter = 0;
    public AddWishlistPage(IOSDriver driver) {
        super(driver);
    }

    public void addWishList(int wishCount) {
        for (int i = 0; i < wishCount; i++) {
            scrollDown();
            while(!isDisplayed(WISHLIST_BUTTON)){
                scrollDown();
            }
            click(WISHLIST_BUTTON);
        }
    }

    public void goWishlistTab() {
        click(WISHLIST_TAB_BUTTON);
    }

    public void checkWishlistCount(Integer text) {
        while (isElementVisible(FIRST_WISHLISTED_GAME_BUTTON)){
            click(FIRST_WISHLISTED_GAME_BUTTON);
            counter += 1;
        }
        if (counter==text){
        }else{
            logger.fatal("Wishlist count is not matched");
            Assert.fail();
        }

    }
}
