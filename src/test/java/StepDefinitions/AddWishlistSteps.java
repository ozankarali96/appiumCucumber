package StepDefinitions;
import Base.BaseCapabilities;
import PageObjects.AddWishlistPage;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class AddWishlistSteps {
    private static Logger logger = LogManager.getLogger(AddWishlistSteps.class);
    private IOSDriver driver = BaseCapabilities.driver;
    AddWishlistPage addWishlistPage = new AddWishlistPage(driver);

    @Given("Adding to {int} wishlist")
    public void addWishlist(Integer wishCount) {
        logger.info("Adding to wishlist");
        addWishlistPage.addWishList(wishCount);
    }
    @When("Navigate wishlist tab")
    public void navigateWishlistTab() {
        logger.info("Navigate to wishlist");
        addWishlistPage.goWishlistTab();
    }
    @Then("I should see {int} games in a wishlist tab")
    public void checkWishlistedGameCount(Integer text){
        logger.info("Checking game count");
        addWishlistPage.checkWishlistCount(text);

    }
}
