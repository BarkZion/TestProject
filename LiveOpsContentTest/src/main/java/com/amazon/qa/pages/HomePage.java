package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//span[contains(text(),\"Hello, anteneh\")]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//*[@id='nav-hamburger-menu']")
	WebElement categoryLink;
	
	@FindBy(xpath="//span[contains(text(),\"Returns\")]")
	WebElement returnsAndOrdersLink;  
	
	@FindBy(xpath="//span[contains(text(),\"Try Prime\")]")
	WebElement tryPrimeLink;
	
	@FindBy(xpath="//div[@id=\"nav-cart-count-container\"]")
	WebElement cartLink;
	
	@FindBy(xpath="//span[contains(text(),\"Select your address\")]")
	WebElement selectLocationLink;

	@FindBy(xpath="//a[contains(text(),\"Prime Video\")]")
	WebElement primeVideoLink;
	
	@FindBy(xpath="//a[contains(text(),\"Customer Service\")]")
	WebElement customerSerivceLink;
	
	//Initializing the page objects
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public UserNamePage clickOnUserNamePageLink() {
		userNameLabel.click();
		return new UserNamePage();
	}
	
	public CategoryPage clickOnCategoryLink() {
		categoryLink.click();
		return new CategoryPage();
	}
	
	public ReturnsAndOrdersPage clickOnReturnsAndOrdersLink() {
		returnsAndOrdersLink.click();
		return new ReturnsAndOrdersPage();
	}
	
	public TryPrimePage clickOnTryPrimeLink() {
		tryPrimeLink.click();
		return new TryPrimePage();
	}
	
	public CartPage clickOnCartLink() {
		cartLink.click();
		return new CartPage();
	}
	
	public SelectLocationPage clickOnSelectLocationLink() {
		selectLocationLink.click();
		return new SelectLocationPage();
	}
	
	public PrimeVideoPage clickOnPrimeVideoLink() {
		primeVideoLink.click();
		return new PrimeVideoPage();
	}
	
	public CustomerServicePage clickOnCustomerSerivceLink() {
		customerSerivceLink.click();
		return new CustomerServicePage();
	}
	

}
