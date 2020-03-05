@BackgroundExample
Feature: To explain the usage of background
	Background: Student completed school education
	Given the student finished high school
	Given the student finished higher secondary

Scenario: to study medicine
	Given the student applied for medical course
	When the student cleared the entrance exam
 	Then the student is eligible for joining any medical institute

Scenario: to study Engineering
	Given the student applied for engineering course
	When the student should have a sayable cutoff
 	Then the student is eligible for joining any Engineering college
 	