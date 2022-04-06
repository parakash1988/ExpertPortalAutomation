package com.Expert.StepDefinition;

import com.Expert.Cucumber.TestContext;
import com.Expert.PageObjects.CommonPage;

/**
 * The Class CommonStepDefinition.
 */

public class CommonStepDefinition {

	/** The common page. */
	public CommonPage commonPage;

	/** The home page. */

	/**
	 * Instantiates a new common step definition.
	 *
	 * @param testContext
	 *            the test context
	 */
	public CommonStepDefinition(TestContext testContext) {
		commonPage = testContext.getCommonPage();
	}

	/**
	 * Enter text in textbox for label.
	 *
	 * @param forLabel
	 *            the for label
	 * @param text
	 *            the text
	 */
	

}
