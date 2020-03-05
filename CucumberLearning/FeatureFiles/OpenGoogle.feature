Feature: This is to test the google search
Scenario:  Google search scenario
	Given user is entering google.co.in
	When user is typing the search term "Mounam pesiyathey"
	And enter the enters key.
	Then user should see the search results
	