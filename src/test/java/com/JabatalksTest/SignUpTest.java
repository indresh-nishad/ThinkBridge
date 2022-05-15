package com.JabatalksTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.JabatalksTest.Utilities.BrowserFactory;
import com.JabatalksTest.Utilities.ConfigDataProvider;
import com.JabatalksTest.pageObjects.SignUpPageObject;

public class SignUpTest {	
	public WebDriver driver;
	public SignUpPageObject spo;
		public ConfigDataProvider cdp;
	
	@BeforeClass
	public void createInstance() {
		spo=new SignUpPageObject(driver);
		cdp=new ConfigDataProvider();
			}
	

	@BeforeTest
	@Parameters ({"url", "browser"})
	void launch( String url, String browser) {
		driver= BrowserFactory.launchApplication(driver, browser, url);
		
	}
	@Test
	public void getDropdownTextTest() throws InterruptedException{
		spo.dropDown();	
		
	}
	@Test
	public void enterDetails() {
		spo.getFullName(cdp.getName());
		spo.getOrgName(cdp.getOrg());
		spo.getEmail(cdp.getEmail());
	}
	@Test
	public void clickCheckBox() {
		spo.clickCheckBox();
	}
	@Test
	public void getStarted() {
		spo.clickGetStartedBtn();
	}
	
	
		
	
	@AfterClass
	public void destroyInstance() {
	spo=null;
		cdp=null;
	}
	
	@AfterTest
	void tearDown() {
		driver=BrowserFactory.tearDownBrowser(driver);
		}
	


}
