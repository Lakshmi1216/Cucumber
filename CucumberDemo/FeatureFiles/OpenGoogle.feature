Feature: This is to test  google search
Scenario: Google search scenario
 	Given user is entering the google url
 	When user is typing the search term "Selenium"
    And user enters the enter key
    Then user should see the search result