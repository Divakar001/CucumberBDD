@DataDriven
Feature: this is an orange Hrm login
Scenario: this is login scenario
	Given employee is on the login page
	When the employee enter the valid credentials
	| admin |admin123| 
	And click on that login button
	Then user navigate to the main home page
		