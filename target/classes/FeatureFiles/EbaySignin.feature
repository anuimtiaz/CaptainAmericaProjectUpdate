@regression @smoke @Capt.America-02 @E2E
Feature: Ebay Sign in Funtionality 

Background:
Given Open Ebay Homepage

Scenario: Ebay Sign in  Funtionality
When Click on Sign in 
And Enter Email or user Name
And Click Continue
And Enter Password
And Click Sign-In
Then User Should able to Sign in