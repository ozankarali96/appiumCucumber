package StepDefinitions;

import Base.BaseCapabilities;
import PageObjects.GamesInfoPage;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GamesInfoPageSteps {
    private static Logger logger = LogManager.getLogger(GamesInfoPageSteps.class);
    private IOSDriver driver = BaseCapabilities.driver;

    GamesInfoPage gamesInfoPage = new GamesInfoPage(driver);

    @Given("App opening")
    public void appOpens() {
        logger.info("App is opening");
    }
    @When("User go game's info page")
    public void goGameInfoPage(){
        logger.info("Going game info page");
        gamesInfoPage.goGameInfoPage();
    }
    @Then("Go Visit Reddit and check")
    public void clickReddit() {
        logger.info("Going reddit page");
        gamesInfoPage.goReddit();
    }
    @Then("Go Visit Website and check")
    public void clickWebsite() {
        logger.info("Going reddit page");
        gamesInfoPage.goWebSite();
    }
    @Then("User should see Descriptions, Informations, Visit Reddit and Visit Website titles")
    public void infoPageTitles(){
        logger.info("Checking titles");
        gamesInfoPage.checkTitles();
    }
    @When("User search game {string}")
    public void goChosenGameInfoPage(String text){
        logger.info("Searching for : " + text);
        gamesInfoPage.searchGame(text);
    }
    @And("Go info page ")
    public void goInfoPage(){
        logger.info("Going game info page");
        gamesInfoPage.goGameInfoPage();
    }

    @Then("User should see Release Date, Genres, Play Time, Publishers under Informations title")
    public void checkInfoTitle(){
        logger.info("Checking titles under informations title");
        gamesInfoPage.checkInfoTitles();
    }


}
