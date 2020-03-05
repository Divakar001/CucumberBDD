Feature: this is an orange Hrm login
Scenario: this is login scenario
	Given user is on the login page
	When the user enter the valid credentials "admin" and "admin123" 
	And click the login button
	Then user navigate to the home page
	