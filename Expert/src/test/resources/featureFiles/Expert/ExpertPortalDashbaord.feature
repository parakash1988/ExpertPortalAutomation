Feature: ExpertPortal Dashboard TestCases

Background: 
	Given the open web application 
	And I have enter UserName "annonbill@gmail.com"
  And I have enter Password "Password1!"
  And I have click on Sign in button
  And User Verified the paro logo displayed on landing page
	
Scenario: ExpertPortal Dashboard
And Click on Right side manu bar Dashboard
And User Verify the Snapshot Metrics label
And Click on Introduce us to a new client and achieve bigger earnings for your business.
And User Verify the Dashboard Data Last Updated time and date

Scenario: ChecktheLinkandlabelonExpertDashboard
And Monthly Hours Logged label
And check logged time 
And check Available time
And check logtime link
And click on logtime link
And I have enter UserName "annonbill@gmail.com"
And I have enter Password "Password1!"
And I have click on Sign in button
And click on DashboardIcon
And check update availability
And click on DashboardIcon
And check winrate label
And check Earning Realized
And check Suggested Hourly Rate
And click on search for opportunites
And click on submit button
And click on view all opportunites
And check Most Recent Opportunities
And check Most Qualified Percentage Opportunities
And Select Earning dropdown value "Last 6 Months"








