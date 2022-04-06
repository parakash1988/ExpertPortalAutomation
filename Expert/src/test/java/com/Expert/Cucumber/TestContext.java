package com.Expert.Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Expert.Helper.WebElementHelper;
import com.Expert.PageObjects.CommonPage;
import com.Expert.PageObjects.ExpertDashboard;
import com.Expert.PageObjects.UserLogin;
import com.Expert.PageObjects.Login.ExpertPortalPage;
import com.Expert.Util.Constants;
import com.Expert.Util.DriverDetail;
import com.ExpertFactory.DriverFactory;


/**
 * The Class TestContext.
 */
public class TestContext {

	/** The driver. */
	private WebDriver driver;

	/** The web element helper. */
	private WebElementHelper webElementHelper;

	/** The driver factory. */
	private DriverFactory driverFactory;

	/** The login page. */
	private ExpertPortalPage expertloginPage;
	
	private UserLogin userloginexp;

	/** The common page. */
	private CommonPage commonPage;
	
    /**The DashBoard page. **/
	private ExpertDashboard expertportaldashboard;

	/**
	 * Instantiates a new test context.
	 */
	public TestContext() {

		WebDriver dr = DriverDetail.getUnoccupiedDriver();

		if (dr != null) {
			this.driver = dr;
		} else {
			driverFactory = new DriverFactory();
			this.driver = driverFactory.getDriver();
		}

		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		this.webElementHelper = new WebElementHelper(driver);
	}

	/**
	 * Tear down driver.
	 */
	public void tearDownDriver() {
		DriverDetail.PushUnoccupiedDriver(this.driver);
	}


	/**
	 * Gets the common page.
	 *
	 * @return the common page
	 */
	public CommonPage getCommonPage() {
		commonPage = new CommonPage(this.driver, this.webElementHelper);
		return commonPage;
	}

	/**
	 * Gets the login page.
	 *
	 * @return the login page
	 */
	public ExpertPortalPage getExpertUserLogin() {
		expertloginPage = new ExpertPortalPage(this.driver, this.webElementHelper);
		return expertloginPage;
	}
	
	public UserLogin getUserlogin() {
		userloginexp = new UserLogin(this.driver, this.webElementHelper);
		return userloginexp;
	}
	public ExpertDashboard getExpertDashboard() {
		expertportaldashboard = new ExpertDashboard(this.driver, this.webElementHelper);
		return expertportaldashboard;
	}
}
