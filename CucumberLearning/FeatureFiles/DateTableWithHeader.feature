@DataDriven
Feature: with datatable header orange Hrm login
Scenario: this datatable with header is login scenario
	Given you is on the login page
	When you enter the valid credentials
	|username | password |
	| admin |admin123| 
	
	And please be click on that login button
	Then you move to the main home page
		