package com.Expert.PageObjects;


import java.util.ArrayList;

import org.openqa.selenium.By;
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
public class ExpertDashboard extends BasePage {

	public ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

	/**
	 * Instantiates a new home page.
	 *
	 * @param driver
	 *            the driver
	 * @param webElementHelper
	 *            the web element helper
	 */

	public ExpertDashboard(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		PageFactory.initElements(driver, this);

	}

	public void clickOnDashboard(){
		ThreadSleep(200);	
		WebElement dashboard = webElementHelper.getElement(By.xpath("(//span[text()='Dashboard'])[2]"));
		Actions action = new Actions(driver);
		ThreadSleep(200);
		action.moveToElement(dashboard);
        action.click(dashboard);
        
	}
	
	
	public void userVerifyDashboardText(){
		WebElement message =webElementHelper.getElement(By.xpath("//div[text()='Snapshot Metrics']"));
		ThreadSleep(200);
		String actualMessage =message.getText();
		System.out.println("Actual Message:"  +actualMessage);
		String expectedMessage = "Snapshot Metrics"; 
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	public boolean userVerifyDateTimeOnDashboard(){
		WebElement message =webElementHelper.getElement(By.xpath("//div[text()='Dashboard Data Last Updated at ']"));
		ThreadSleep(200);
		String actualMessage =message.getText();
		System.out.println("Actual Message:"  +actualMessage);
		driver.quit();
		return false;
	
	}
	
	@FindBy(xpath= "//a[@href='https://paro.io/refer-business/']")

	private WebElement referbussiness;
	
	public void clickOnReferbussiness(){
				ThreadSleep(1000);
		webElementHelper.click(referbussiness);
		driver.quit();
	
	}

	public void checkMonthlyHourslabel(){
		
		WebElement MonthlyHourslabel =webElementHelper.getElement(By.xpath("//span[text()='Monthly Hours Logged']"));
		ThreadSleep(200);
		String actualMessage =MonthlyHourslabel.getText();
		System.out.println("Actual Message:"  +actualMessage);
		String expectedMessage = "Monthly Hours Logged"; 
		Assert.assertEquals(actualMessage, expectedMessage);
		
	}
	public void checklogtime(){
	WebElement logtime =webElementHelper.getElement(By.xpath("(//div[@class='pt-4 px-3 text-center'])[1]"));
	String actuallogtime =logtime.getText();
	System.out.println("Actual Message:"  +actuallogtime);
	}
     public void quitbrowser(){
    	 
    	 driver.quit();
     }

     public void checkAvailableTime(){
    		WebElement AvailableTime =webElementHelper.getElement(By.xpath("(//div[@class='pt-4 px-3 text-center'])[1]"));
    		String actualAvailableltime =AvailableTime.getText();
    		System.out.println("Actual Message:"  +actualAvailableltime);
    		}
    	   
     public void checkLogTimeLink(){
 		WebElement checkLogTime =webElementHelper.getElement(By.xpath("//*[text()='Log time']"));
 		String checkLogTimeLink =checkLogTime.getText();
 		System.out.println("Actual Message:"  +checkLogTimeLink);
 		}
     
     public void checkUpdateavailability(){
  		WebElement checkUpdateavailability =webElementHelper.getElement(By.xpath("//*[text()='Update availability']"));
  		String checkLogTimeLink =checkUpdateavailability.getText();
  		System.out.println("Actual Message:"  +checkLogTimeLink);
  		}
     
     public void checkWinRate(){
   		WebElement checkWinRate =webElementHelper.getElement(By.xpath("//*[text()='Win Rate']"));
   		String checkWinRateLable =checkWinRate.getText();
   		System.out.println("Actual Message:"  +checkWinRateLable);
   		}
     public void checkEarningRealized(){
    		WebElement checkEarningRealized =webElementHelper.getElement(By.xpath("//span[text()='Earnings Realized']"));
    		String checkEarningRealizedlabel =checkEarningRealized.getText();
    		System.out.println("Actual Message:"  +checkEarningRealizedlabel);
    		}
     public void checkSuggestedHourlyRate(){
 		WebElement checkSuggestedHourlyRate =webElementHelper.getElement(By.xpath("//span[text()='Suggested Hourly Rate']"));
 		String checkSuggestedHourlyRatelabel =checkSuggestedHourlyRate.getText();
 		System.out.println("Actual Message:"  +checkSuggestedHourlyRatelabel);
 		}
     
 	@FindBy(xpath= "//a[text()='Search for opportunities']")
 	private WebElement clickOnseachopportunities;
 	 	public void clickOnseachopportunities(){
  		webElementHelper.click(clickOnseachopportunities);
   		driver.navigate().back();
 	 }
 	 @FindBy(xpath= "//div[text()='Submit']")
 	 	private WebElement Submit;
 	 	 	public void clickOnsubmit(){
 	  		webElementHelper.click(Submit);
 	 }
 	@FindBy(xpath= "//div[text()='View All Opportunities']")
 	 	 private WebElement ViewAllOpportunities;
 	 	 public void clickOnViewAllOpportunities(){
 	 	 webElementHelper.click(ViewAllOpportunities);
 	  	driver.navigate().back();
 	 }
 	 @FindBy(xpath="//span[@class='MuiSwitch-thumb']")
 	 private WebElement checkMostReceint;
 	 public void clickOnMostReceint(){
 		webElementHelper.click(checkMostReceint);
 	 }
 	 @FindBy(xpath="//span[@class='MuiSwitch-thumb']")
 	 private WebElement checkQualified;
 	 public void clickOnQualified(){
 		webElementHelper.click(checkQualified);
 	 }
 	 
Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='earnings-select']")));
// 	//dropdown.selectByIndex(2);
//// 	@FindBy(xpath="//select[@id='earnings-select']")
//// 	private WebElement eraningValue;
//// 	public void selectEarningValue(){
//// 		webElementHelper.isElementDisplayed(element)
// 	 
// 	WebElement dropdown = driver.findElement(By.xpath("//select[@id='earnings-select']")); 
// 		     Select earningMonth = new Select(dropdown); 
// 		    
// 		     System.out.println("Option is successfully selected"); 
 	}
 	
