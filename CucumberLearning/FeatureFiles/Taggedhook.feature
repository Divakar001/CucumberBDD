@TaggedHook
Feature: Test tagged Hook
@First
Scenario: this is a first scenario
	Given this is a first step
	When this is a second step
	Then this is a third step

@Second
Scenario: this is a second scenario
	Given this is a first step
	When this is a second step
	Then this is a third step

@Third
Scenario: this is a third scenario
	Given this is a first step
	When this is a second step
	Then this is a third step
	