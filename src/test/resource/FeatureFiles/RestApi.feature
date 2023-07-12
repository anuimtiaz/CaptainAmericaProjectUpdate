@regression @api @CM-08 @E2E
Feature: Petstore API Resting 

Scenario: Pet CRUD API

		Given Create pet
		And Get pet
		When Update the pet 
		Then Delete the pet 
		
	
		