package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/div/span")
	WebElement loginBtn;
	
	@FindBy(xpath= "//*[@id=\"ap_email\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement signInBttn;
	
	@FindBy(name="password")
	WebElement password;	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement signInBtn;
	
	@FindBy(xpath="//*[@id=\"nav-logo\"]/a[1]")
	WebElement amazonImageTest;
	
	//Initializing the page objects
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateAmazonImageLink() {
		return amazonImageTest.isDisplayed();
	}
	
	public HomePage login(String un, String pw) {
		loginBtn.click();
		username.sendKeys(un);
		signInBttn.click();
		password.sendKeys(pw);
		signInBtn.click();
		
		return new HomePage();
		
	}
	
}
