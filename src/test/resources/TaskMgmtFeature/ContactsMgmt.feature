@PhaseTwo
Feature: Contacts Management
CRUD Operations for Contact


@RegressionTest
	Scenario: Create a Contact
	Given User is logged in
	When User create a Contact
	

@SmokeTest	
	Scenario: Update a Contact
	Given User is logged in
	When User update a Contact
	
	Scenario: Delete a Contact
	Given User is logged in
	When User delete a Contact