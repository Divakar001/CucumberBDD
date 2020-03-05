@simplelogin
Feature: this is an orange Hrm login simplelogin
Scenario: this is login scenario
	Given user is on login page
	When the user enter the valid user name and password 
	And click on the login button
	Then user navigate to home page
	