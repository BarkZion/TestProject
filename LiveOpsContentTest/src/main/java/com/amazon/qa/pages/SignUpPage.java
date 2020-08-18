package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class SignUpPage extends TestBase{
	@FindBy(xpath="//*[@id=\"nav-signin-tooltip\"]/a/span")
	WebElement signInBtn;
	private WebElement signInButton;
	
	//Initializing the page objects
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public boolean validateSignInImage() {
		return signInButton.isDisplayed();
	}
	
	public WebElement ValidateSignInButton() {
		return driver.findElement(By.className("Sign in"));
	}
	
	
	
	
}
