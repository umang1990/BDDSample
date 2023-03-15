Feature: Google Page Search Functionality

Scenario: Java Search
	Given User is on Google Home Page
	When User Search Java Tutorial
	Then Should display Java Search result page
	
	
	Scenario: Selenium Search
	Given User is on Google Home Page
	When User Search Selenium Tutorial
	Then Should display Selenium Search result page