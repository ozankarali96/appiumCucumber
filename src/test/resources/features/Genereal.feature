@GeneralFeature
Feature: General screens control

  @General @SearchFunc
  Scenario: Searching func
    Given App opens and user search for game named "Grand Theft Auto"
    When User search game
    Then User should see the searched result "Grand Theft Auto" on the screen

  @General @ListElementFunc
  Scenario: Check vertical-horizontal button
    Given User check horizontal button clickable and vertical button is not clickable
    When  User click the horizontal button
    Then User should see horizontal button is not  clickable and vertical button is clickable

  @General @TabControl
  Scenario: User check wishlist tab button
    Given App opens
    When User click the wishlist tab button
    Then User should see no game has been found text

  @General @TabControl
  Scenario: User check games tab button
    Given App opens
    When User click the wishlist tab button
    And User click the games tab button
    Then User should see games title

  @General @ScrollFunc
  Scenario: Scroll until catch the game
    Given App opens
    When User scroll until see the "Left 4 Dead 2"
    And User click "Left 4 Dead 2"
    Then User should see Release Date, Genres, Play Time, Publishers under Informations title


  @General @ScrollFunc
  Scenario: Scroll tabs
    Given App opens
    When Scroll left until see the tab "SEGA"
    Then User click "SEGA"
