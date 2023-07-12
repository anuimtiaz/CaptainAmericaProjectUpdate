@regression @smoke @CM-06 @E2E
Feature: Ebay Summary Mousehover

Description: User should able to mousehover to My eBay and click on Summary
		
		Background: 
				Given Open Ebay Homepage 
				
		Scenario: Ebay Summary Mousehover
		When Mouse Hover to MyEbay Summary
		Then Click on Summary