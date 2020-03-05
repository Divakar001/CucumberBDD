@DataDriven
Feature: with datatable with example orange Hrm login
Scenario Outline:o: this datatable with example is login scenario
	Given tester is on that login page
	When tester enter "<username>" and password "<password>"
	And clicked button
	
			
Examples:
|username | password |
| admin |admin123| 
| admin |admin13| 

