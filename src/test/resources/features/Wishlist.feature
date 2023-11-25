@WishlistFeature
Feature: Wishlist Scenarios

  @Wishlist @WishlistCount
  Scenario Outline: Check <wishlistCount> wishlist count
    Given Adding to <wishlistCount> wishlist
    When Navigate wishlist tab
    Then I should see <wishlistCountTab> games in a wishlist tab
    Examples:
      | wishlistCount | wishlistCountTab |
      | 3             | 3                |
      | 5             | 5                |
      | 3             | 2                |

  @Wishlist @WishlistRemove
  Scenario: Remove from wishlist and check
    Given Adding to 1 wishlist
    When Navigate wishlist tab
    And User remove wishlist the 1 games
    Then User should see no game has been found text

  @Wishlist @AddWishlistFromGamesInfoPage
  Scenario: Add wishlist from games info page
    Given App opens and user search for game named "Portal"
    When User go game info page and add wishlist
    Then User should see the searched game "Portal" in the wishlist tab.

    @Wishlist @RemoveFromGamesInfoPage
      Scenario: Add and remove wishlist from games info page and
      Given App opens and user search for game named "Grand Theft Auto"
      When User go game info page and add wishlist
      And User should see the searched game "Grand Theft Auto" in the wishlist tab.
      When User go game's info page and click wishlist button
      Then User should not see search game "Grand Theft Auto" in wishlist tab







