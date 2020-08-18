package com.amazon.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.pages.PrimeVideoPage;


public class PrimeVideoPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	PrimeVideoPage primeVideoPage;
	PrimeVideoPage primeVideoLink;
	PrimeVideoPage primeVideoPageLink;
	
	public PrimeVideoPageTest() {
		super();
	}

	@BeforeMethod	
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		primeVideoPage = new PrimeVideoPage();
	}

//	@Test(priority=2)
//	public void verifyPrimeVideoLinkTest() {
//		primeVideoPage = homePage.verfiyPrimeVideoLink();
//	}
	
	@Test(priority=1)
	public void clickOnPrimeVideoPageLinkTest() {
		primeVideoPageLink = homePage.clickOnPrimeVideoPageLink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

