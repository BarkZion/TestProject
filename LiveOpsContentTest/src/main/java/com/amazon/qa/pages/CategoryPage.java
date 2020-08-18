package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class CategoryPage extends TestBase {

	@FindBy(xpath = "//*[@id='nav-hamburger-menu']")
	WebElement categoryLink;
	
	
//	private WebElement categoryLabel;
	
	//Initializing the page objects
	public CategoryPage() {
	} {
		PageFactory.initElements(driver, this);
	}
	
//	public boolean verifyCategoryLabel() {
//		return categoryLabel.isDisplayed();
//	}
	
	public void selectCategoryByID(String id) {
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();		
	}

	public static void click() {
		driver.findElements(By.xpath("//div[@id='hmenu-content']/ul[1]/li[2]/a/div"));
		
	}

	public void selectCategoryByClass(String string) {
		// TODO Auto-generated method stub
		
	}

	public boolean verifyCategoryLabel() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
