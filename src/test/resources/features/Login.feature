@smoke
Feature: Login


  Scenario: Verify trello on Atlassian home
    Given I Log in with user "{credentials.owner1}"
    Then I verify if trello button is displayed
