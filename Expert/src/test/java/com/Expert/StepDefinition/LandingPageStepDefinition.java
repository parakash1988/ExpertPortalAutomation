package com.Expert.StepDefinition;

import com.Expert.Cucumber.TestContext;
import com.Expert.PageObjects.UserLogin;
import com.Expert.PageObjects.Login.ExpertPortalPage;

/**
 * The Class LandingPageStepDefinition.
 */
public class LandingPageStepDefinition {

	/** The home page. */
	public ExpertPortalPage expertPortalPage;

	public LandingPageStepDefinition(TestContext testContext) {
		expertPortalPage = testContext.getExpertUserLogin();

	}

	
}
