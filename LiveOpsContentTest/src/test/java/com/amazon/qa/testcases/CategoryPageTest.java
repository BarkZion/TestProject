package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.CategoryPage;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.util.TestUtil;

public class CategoryPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	CategoryPage categoryPage;
	
	
	public CategoryPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		categoryPage = new CategoryPage();
		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	
	@Test(priority=1)
	public void selectCategoryTest() {
		categoryPage.selectCategoryByID("");
	}
	
//	@Test(priority=2)
//	public void selectCategory1Test() {
//		categoryPage.selectCategoryByClass(("Prime Video"));
//	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
