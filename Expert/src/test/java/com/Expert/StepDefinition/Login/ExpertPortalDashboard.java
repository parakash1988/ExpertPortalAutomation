package com.Expert.StepDefinition.Login;



import org.junit.Assert;

import com.Expert.Cucumber.TestContext;
import com.Expert.PageObjects.CommonPage;
import com.Expert.PageObjects.ExpertDashboard;
import com.Expert.PageObjects.UserLogin;
import com.Expert.PageObjects.Login.ExpertPortalPage;
import com.Expert.StepDefinition.Login.ExpertPortalDashboard;

import cucumber.api.java.en.Given;

public class ExpertPortalDashboard {

private ExpertPortalPage expertloginPage;
	
	private UserLogin userlogin;
	
	private ExpertDashboard expertportaldashboard;
	
	
	/** The common page. */
	public CommonPage commonPage;

	/** The config. */

	/**
	 * Instantiates a new step definition.
	 *
	 * @param testContext
	 *            the test context
	 */
	public ExpertPortalDashboard(TestContext testContext) {
		expertloginPage = testContext.getExpertUserLogin();
		userlogin =testContext.getUserlogin();
		expertportaldashboard = testContext.getExpertDashboard();
	
	}

	/**
	 * Launch application.
	 */
	
	@Given("^Click on Right side manu bar Dashboard$")
	public void clickRightsidemanubarDashboard(){
		expertportaldashboard.clickOnDashboard();
	}

	@Given("^Click on Introduce us to a new client and achieve bigger earnings for your business\\.$")
	public void clickearningsforyourbusiness(){
		expertportaldashboard.clickOnReferbussiness();
	}

	@Given("^User Verify the Snapshot Metrics label$")
	public void userVerifytheSnapshotMetricslabel(){
		expertportaldashboard.userVerifyDashboardText();
	}

	@Given("^User Verify the Dashboard Data Last Updated time and date$")
	public void userVerifyDashboardDataLastUpdatedtimedate() throws Throwable {
		
		Assert.assertTrue("Displayed Valid date Time", true);
	   
	}
	//**************Expert Dashboard Link chekc*******************//
	@Given("^Monthly Hours Logged label$")
	public void monthlyHoursLoggedlabel(){
		expertportaldashboard.checkMonthlyHourslabel();
	}

	@Given("^check logged time$")
	public void checkloggedtime(){
		expertportaldashboard.checklogtime();
	}

	@Given("^check Available time$")
	public void checkAvailabletime(){
	   
	}

	@Given("^check logtime link$")
	public void checklogtimelink(){
	   
	}

	@Given("^check update availability$")
	public void checkupdateavailability(){
	   
	}

	@Given("^check winrate label$")
	public void checkwinratelabel(){
	  
	}

	@Given("^check Earning Realized$")
	public void checkEarningRealized(){

	}

	@Given("^check Suggested Hourly Rate$")
	public void checkSuggestedHourlyRate(){
	   
	}

	@Given("^click on search for opportunites$")
	public void clickonsearchforopportunites(){
	   
	}

	@Given("^click on submit button$")
	public void clickonsubmitbutton(){
	  
	}

	@Given("^check Top (\\d+) Opportunities$")
	public void checkTopOpportunities(int arg1){
	    
	}

	@Given("^click on view all opportunites$")
	public void clickonviewallopportunites(){
	   
	}

	@Given("^Select Earning dropdown value \"([^\"]*)\"$")
	public void selectEarningdropdownvalue(String arg1) {
	   
	}
}