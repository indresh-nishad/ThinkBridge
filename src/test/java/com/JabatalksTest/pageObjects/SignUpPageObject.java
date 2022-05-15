package com.JabatalksTest.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SignUpPageObject {
	public WebDriver driver;
	@FindBy(xpath="//div[@id='language']")
	private WebElement drpDown;
	@FindBy(xpath="//div[text()='English']")
	private WebElement english;
	@FindBy(xpath="//input[@id='name']")
	private WebElement fullName;
	@FindBy (id="orgName")
	private WebElement orgName;
	@FindBy(id="singUpEmail")
	private WebElement email;
	@FindBy (xpath="//span[text()='I agree to the']")
	private WebElement checkbox;
	@FindBy (xpath="//button[contains(text(),'Get Started')]")
	private WebElement getStartedBtn;
	
	public SignUpPageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
	public void dropDown() throws InterruptedException {
		Actions ac =new Actions(driver);
		ac.moveToElement(drpDown).click().build().perform();
		ac.moveToElement(english).click().build().perform();
		Thread.sleep(5000);
		
	}
	public void getFullName(String name) {
		if(fullName.isEnabled()) {
		fullName.sendKeys(name);
		}

	}
	public void getOrgName(String org) {
		if(orgName.isEnabled()) {
			orgName.sendKeys(org);
			}
		
	}
	public void getEmail(String mail) {
		if(email.isEnabled()) {
			email.sendKeys(mail);
			}
		
		
		
	}
	public void clickCheckBox() {
		if(!(checkbox.isSelected())){
		checkbox.click();
		}
	}
	public void clickGetStartedBtn() {
		if(getStartedBtn.isEnabled())
		getStartedBtn.click();
	}
	

}
