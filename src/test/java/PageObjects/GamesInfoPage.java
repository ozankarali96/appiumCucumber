package PageObjects;

import Base.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Assert;

import static Constants.GamesConstants.*;
import static Constants.GamesInfoConstants.*;
import static Constants.WishlistConstants.WISHLIST_BUTTON;

public class GamesInfoPage extends BasePage {
    public GamesInfoPage(IOSDriver driver) {
        super(driver);
    }

    public void goGameInfoPage(){
        click(FIRST_GAME_BUTTON);
    }
    public void checkTitles(){
        isElementVisible(DESCRIPTIONS_TITLE_TEXT);
        isElementVisible(INFO_TITLE_TEXT);
        isElementVisible(VISIT_REDDIT_TITLE_TEXT);
        isElementVisible(VISIT_WEBSITE_TITLE_TEXT);
        Assert.assertEquals("Descriptions",getText(DESCRIPTIONS_TITLE_TEXT));
        Assert.assertEquals("Informations",getText(INFO_TITLE_TEXT));
        Assert.assertEquals("Visit Reddit",getText(VISIT_REDDIT_TITLE_TEXT));
        Assert.assertEquals("Visit Website",getText(VISIT_WEBSITE_TITLE_TEXT));
    }
    public void searchGame(String text){
        sendKeys(SEARCH_TB,text);
        click(SEARCH_BUTTON);
    }
    public void checkInfoTitles(){
        isElementVisible(RELEASE_DATE_TEXT);
        isElementVisible(GENRES_TEXT);
        isElementVisible(PLAY_TIME_TEXT);
        isElementVisible(PUBLISHERS_TEXT);
        Assert.assertEquals("Release Date:",getText(RELEASE_DATE_TEXT));
        Assert.assertEquals("Genres:",getText(GENRES_TEXT));
        Assert.assertEquals("Play Time:",getText(PLAY_TIME_TEXT));
        Assert.assertEquals("Publishers:",getText(PUBLISHERS_TEXT));

    }
    public void goReddit(){
        click(VISIT_REDDIT_TITLE_TEXT);
        switchSafariView("Home");
    }
    public void goWebSite(){
        click(VISIT_WEBSITE_TITLE_TEXT);
        switchSafariView("Rockstar Games Home");
    }

}
