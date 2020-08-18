package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.CategoryPage;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.pages.PrimeVideoPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	PrimeVideoPage primeVideoPage;
	CategoryPage categoryPage;
	
	public HomePageTest() {
		super();
	}
	
	//test cases should be separated -- independent with each other
	//Before each test cases -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod	
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

//	@Test(description="This test validates login")
//	public void verifyAmazonImageLinkTest() {
//		String homePageImage = homePage.verifyAmazonImageLinkTest();
//		Assert.assertEquals(homePageImage, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
//	}

//solve 
	@Test(description="This test validates user name")
	public void verifyuserNameLabelTest() {
		Assert.assertTrue(homePage.userNameLabel()) ;
	}
	
	@Test(priority=2)
	public void verifyPrimeVideoLinkTest() {
		primeVideoPage = homePage.verfiyPrimeVideoLink();
	}
	
	@Test(priority=3)
	public void selectAmazonHomePageTest() {
		primeVideoPage = homePage.clickOnPrimeVideoPageLink();
	}
	
	@Test(priority=2)
	public void verifyClickOnCategoryLinkTest() {
		categoryPage = homePage.clickOnCategoryLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
