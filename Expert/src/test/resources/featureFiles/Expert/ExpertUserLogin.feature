Feature: ExpertUserLogin TestCases

Background: 
	Given the open web application 
	
	
Scenario: ValidExpertUserLogin
And I have enter UserName "annonbill@gmail.com"
And I have enter Password "Password1!"
And I have click on Sign in button
And User Verified the paro logo displayed on landing page
And Click on Logout button

Scenario: InvalidExpertUserLogin
And I have enter UserName "annonbill@gmail.com"
And I have enter Password "Password1"
And I have click on Sign in button
And User should verify the validation message



