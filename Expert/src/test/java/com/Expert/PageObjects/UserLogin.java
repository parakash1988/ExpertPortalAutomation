package com.Expert.PageObjects;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import  org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

import com.Expert.Helper.WebElementHelper;

/**
 * The Class HomePage.
 */
public class UserLogin extends BasePage {

	public ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

	/**
	 * Instantiates a new home page.
	 *
	 * @param driver
	 *            the driver
	 * @param webElementHelper
	 *            the web element helper
	 */

	public UserLogin(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath= "//input[@type='email']")

	private WebElement emailID;
	
	public void enterEmailId(String UserName){
		//webElementHelper.click(emailID);
		webElementHelper.TypeInto(emailID, UserName);
	}
	
	@FindBy(xpath= "//input[@name='password']")

	private WebElement password;
	
	public void enterPassword(String Password){
				
		webElementHelper.TypeInto(password, Password);
	
	}
	
	@FindBy(xpath= "//button[@name='submit']")

	private WebElement submit;
	
	public void clickOnLoginSubmit(){
				
		webElementHelper.click(submit);
	
	}
	
	@FindBy(xpath= "(//*[@alt='Paro logo'])[2]")

	private WebElement verifiedParoLogo;
	
	public boolean userVerifedParoLogo(){
		
		webElementHelper.isElementDisplayed(verifiedParoLogo);

		return false;
	}
		
	public void userVerifiedValidationMessage(){
		WebElement message =webElementHelper.getElement(By.xpath("//span[text()='Wrong email or password.']"));
		ThreadSleep(200);
		String actualMessage =message.getText();
		System.out.println("Actual Message:"  +actualMessage);
		String expectedMessage = "WRONG EMAIL OR PASSWORD."; 
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	
	public void clickOnLogout(){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		Actions actions = new Actions(driver);
		WebElement clickonLogout = webElementHelper.getElement(By.xpath("(//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body1 MuiTypography-displayBlock'])[26]"));
		actions.moveToElement(clickonLogout);
		//ThreadSleep(200);
		actions.click(clickonLogout);
		
	
	}
     public void quitbrowser(){
    	 
    	 driver.close();
     }

	
     
}