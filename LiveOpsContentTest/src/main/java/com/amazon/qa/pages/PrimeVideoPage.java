package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class PrimeVideoPage extends TestBase {
	@FindBy(xpath = "//a[text()=\"Prime Video\"]")
	WebElement PrimeVideoLink;
	
	@FindBy(xpath = "//*[@id=\"nav-xshop-container\"]/div/a[1]")
	WebElement PrimeVideoPageLink;
	
	public PrimeVideoPage() {
		PageFactory.initElements(driver, this);
	}
	
//	public boolean verifyPrimeVideoLinkByID(String id) {
//		return PrimeVideoLink.isDisplayed();		
//	}
//	
	public PrimeVideoPage clickOnPrimeVideoPageLinkByID(String id) {
		driver.findElement(By.xpath("//*[@id=\"nav-xshop-container\"]/div/a[1]")).click();
		return new PrimeVideoPage();
	}



}

	
