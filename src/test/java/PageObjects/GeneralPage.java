package PageObjects;
import Base.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Assert;


import static Constants.GamesInfoConstants.*;
import static Constants.GamesConstants.*;
import static Constants.WishlistConstants.*;
public class GeneralPage extends BasePage{
    int counter = 0;

    public GeneralPage(IOSDriver driver) {
        super(driver);
    }
    public void searchGame(String text) {
        sendKeys(SEARCH_TB, text);
        click(SEARCH_BUTTON);

    }
    public void gameInfoPageAndAddWishlist(){
        click(FIRST_GAME_BUTTON);
        click(GAME_INFO_PAGE_WISHLIST_BUTTON);
    }
    public void checkWishlistTab(String text){
        click(WISHLIST_TAB_BUTTON);
        checkNotElement(text);
    }
    public void checkGameWishlistTab(String text){
        click(WISHLIST_TAB_BUTTON);
        shouldSeeContainingTextForIOS(text);
    }
    public void goBackGameInfoPageAndClickWishlist(){
        click(GAMES_TAB_BUTTON);
        click(GAME_INFO_PAGE_WISHLIST_BUTTON);
    }
    public void goWishlistTabAndCheckGame(String text){
        click(WISHLIST_TAB_BUTTON);
        if (shouldSeeContainingTextForIOS(text)){
            Assert.fail();
        }
    }
    public void searchingResultOnTheScreen(String text){
        shouldSeeContainingTextForIOS(text);
    }

    public void horizontalClickable(){
        isElementVisible(HORIZONTAL_BUTTON);
    }
    public void verticalIsNotClickable(){
        isNotDisplayed(VERTICAL_BUTTON);
    }

    public void clickHorizantalButton(){
        click(HORIZONTAL_BUTTON);
    }

    public void verticalClickable(){
        isElementVisible(VERTICAL_BUTTON);
    }
    public void horizontalIsNotClickable(){
        isNotDisplayed(HORIZONTAL_BUTTON);
    }
    public void addWishList(int wishCount) {
        for (int i = 0; i < wishCount; i++) {
            scrollDown();
            click(WISHLIST_BUTTON);
        }
    }
    public void goWishlistTab(){
        click(WISHLIST_TAB_BUTTON);
    }
    public void goGamesTab(){
        click(GAMES_TAB_BUTTON);
    }
    public void gamesTabTitle(){
        isElementVisible(GAMES_TAB_TITLE);

    }
    public void removeFromWishlist(Integer text){
        while (isElementVisible(FIRST_WISHLISTED_GAME_BUTTON)){
            click(FIRST_WISHLISTED_GAME_BUTTON);

            counter += 1;
        }
        if (counter==text){

        }else{

            Assert.fail();
        }

    }
    public void goWishlistTabButton() {
        click(WISHLIST_TAB_BUTTON);
    }
    public void noGameText(){
        checkNotElement("No game has been found");
    }
    public void scrollDownUntilCatchTheGame(String text){
        while(!shouldSeeContainingTextForIOS(text)){
            scrollDown();
        }

    }
    public void scrollLeftUntilCatchTheGame(String text){
        while(!shouldSeeContainingTextForIOS(text)){
            scrollLeft();
        }

    }


}
