Feature: Verify User Creation


  Scenario: User table lists all users
    Given I have a user called deepak
    When I navigate to all users page
    Then I see the following users
      | name      |
      | deepak    |

  Scenario: Create a new User
    Given I navigate to all users page
    When I navigate to create new User
    And create new user name deepak
    And I navigate to all users page
    Then I see the following users
      | name      |
      | deepak    |
