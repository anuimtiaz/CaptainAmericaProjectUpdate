@regression @smoke @CA-03 @E2E
Feature: Ebay Cart Functionality 
Description: User should able to add iteams in the cart

		Background: 
					Given Open Ebay Homepage 

		Scenario: Ebay Cart Functionality 
				Given Search for Big & Tall Cotton Tee
				When Select the first shirt on the items
				And Select size type
				And Select men size
				And Select shade
				And Select quantity
				Then Add to shopping cart 
				
				
				
		