package StepDefinitions;

import Base.BaseCapabilities;
import PageObjects.GeneralPage;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralSteps {
    private static Logger logger = LogManager.getLogger(GeneralSteps.class);
    private IOSDriver driver = BaseCapabilities.driver;
    private WebDriverWait wait;
    GeneralPage generalPage = new GeneralPage(driver);

    @Given("App opens and user search for game named {string}")
    public void appOpen(String text) {
        logger.info("Game search is started");
        generalPage.searchGame(text);
    }

    @When("User go game info page and add wishlist")
    public void goInfoPage() {
        logger.info("Search finished, game's info page will be open");
        generalPage.gameInfoPageAndAddWishlist();
    }

    @Then("User should see the searched game {string} in the wishlist tab.")
    public void checkWishlistTab(String text) {
        logger.info("Checking wishlist tab");
        generalPage.checkWishlistTab(text);
    }

    @And("User go Wishlist tab and check searched in the list")
    public void checkGameWishlistTab() {
        logger.info("Looking game in wishlist tab");
        generalPage.checkGameWishlistTab("Portal");
    }

    @When("User go game's info page and click wishlist button")
    public void goBackWishlistAndRemoveWishlist() {
        logger.info("Going back to game's info page and click wishlist button");
        generalPage.goBackGameInfoPageAndClickWishlist();
    }

    @Then("User should not see search game {string} in wishlist tab")
    public void checkWishlistTab2(String text) {
        logger.info("Checking wishlist tab");
        generalPage.goWishlistTabAndCheckGame(text);
    }

    @Given("User check horizontal button clickable and vertical button is not clickable")
    public void checkListButton() {
        logger.info("Checking list button");
        generalPage.horizontalClickable();
        generalPage.verticalIsNotClickable();
    }

    @When("User click the horizontal button")
    public void clickHorizantalButton() {
        logger.info("Clicking the horizantal button");
        generalPage.clickHorizantalButton();
    }

    @Then("User should see horizontal button is not  clickable and vertical button is clickable")
    public void checkListButtonAfterClicking() {
        logger.info("Checking list button after clicking");
        generalPage.verticalClickable();
        generalPage.horizontalIsNotClickable();
    }

    @When("User search game")
    public void searchGame() {
        logger.info("Searching for a game");
    }

    @Then("User should see the searched result {string} on the screen")
    public void searchingResultOnTheScreen(String text) {
        logger.info("Searching completed");
        generalPage.searchingResultOnTheScreen(text);
    }

    @And("User remove wishlist the {int} games")
    public void unwishlistGames(Integer int1) {
        logger.info("Removing from wishlist page");
        generalPage.removeFromWishlist(int1);
    }

    @Then("User should see no game has been found text")
    public void noGameText() {
        logger.info("No game text will be visible");
        generalPage.noGameText();
        logger.info("No game text is visible");
    }

    @Given("App opens")
    public void appOpens() {
        logger.info("App opening");
    }

    @When("User click the wishlist tab button")
    public void clickWishlistTabButton() {
        logger.info("Navigate to wishlist tab");
        generalPage.goWishlistTabButton();
    }

    @And("User click the games tab button")
    public void clickGamesTabButton() {
        logger.info("Navigate to games tab");
        generalPage.goGamesTab();
    }

    @Then("User should see games title")
    public void gamesTitle() {
        logger.info("Checking for the games tab title");
        generalPage.gamesTabTitle();
        logger.info("Games page title found");
    }
    @When("User scroll until see the {string}")
    public void findGame(String gameName){
        logger.info("Looking for the game");
        generalPage.scrollDownUntilCatchTheGame(gameName);
    }
    @When("Scroll left until see the tab {string}")
    public void findTab(String tabName){
        logger.info("Looking for the tab");
        generalPage.scrollLeftUntilCatchTheGame(tabName);
    }
    @Then("User click the tab {string}")
    public void clickTab(String text){
        logger.info("Cliking tab :" + text);
        generalPage.clickText(text);
    }

    @Then("User click {string}")
    public void goInfoPage(String text){
        logger.info("Going to info page for : " + text);
        generalPage.clickText(text);
    }

}

