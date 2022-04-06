package com.Expert.StepDefinition.Login;



import org.junit.Assert;

import com.Expert.Cucumber.TestContext;
import com.Expert.PageObjects.CommonPage;
import com.Expert.PageObjects.UserLogin;
import com.Expert.PageObjects.Login.ExpertPortalPage;
import com.Expert.StepDefinition.Login.ExpertUserLoginStep;

import cucumber.api.java.en.Given;

public class ExpertUserLoginStep {

private ExpertPortalPage expertloginPage;
	
	private UserLogin userlogin;
	
	
	/** The common page. */
	public CommonPage commonPage;

	/** The config. */

	/**
	 * Instantiates a new step definition.
	 *
	 * @param testContext
	 *            the test context
	 */
	public ExpertUserLoginStep(TestContext testContext) {
		expertloginPage = testContext.getExpertUserLogin();
		userlogin =testContext.getUserlogin();
	
	}

	/**
	 * Launch application.
	 */
	@Given("^the open web application$")
	public void LaunchApplication() {
		expertloginPage.LaunchApplication();

	}

	@Given("^I have enter UserName \"([^\"]*)\"$")
	public void enterUserName(String UserName) {
		
		
		userlogin.enterEmailId(UserName);
	}

	@Given("^I have enter Password \"([^\"]*)\"$")
	public void enterPassword(String Password) {
		userlogin.enterPassword(Password);
	}

	@Given("^I have click on Sign in button$")
	public void Signinbutton() {
		userlogin.clickOnLoginSubmit();

	}
	@Given("^User Verified the paro logo displayed on landing page$")
	public void verifiedparologolandingpage(){
	 
		userlogin.userVerifedParoLogo();
		//userlogin.quitbrowser();
		
	}
	

    @Given("^Click on Logout button$")
    public void clickLogoutbutton(){
    	
    	userlogin.clickOnLogout();
    	userlogin.quitbrowser();
    }
	@Given("^User should verify the validation message$")
	public void systemdisplayedvalidation() {
		
		userlogin.userVerifiedValidationMessage();
		userlogin.quitbrowser();
	}
}
