@GamesInfoPage
Feature: Games Info Page
  Background:
    Given App opening

  @GamesInfoPage @GameInfos
  Scenario: Check games info page
    When User go game's info page
    Then User should see Descriptions, Informations, Visit Reddit and Visit Website titles

  @GamesInfoPage @ChosenGame
  Scenario: Check chosen games info page
    When User search game "Counter Strike"
    And User go game's info page
    Then User should see Descriptions, Informations, Visit Reddit and Visit Website titles

  @GamesInfoPage @TitleControl
  Scenario: Check games information title
    When User go game's info page
    Then User should see Release Date, Genres, Play Time, Publishers under Informations title

  @GamesInfoPage @VisitReddit
  Scenario: Visit Reddit flow
    When User go game's info page
    Then Go Visit Reddit and check

  @GamesInfoPage @VisitWebsite
  Scenario: Visit Website flow
    When User go game's info page
    Then Go Visit Website and check