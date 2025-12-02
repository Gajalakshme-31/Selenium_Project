package com.DemoWebShop_POM;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Welcome_Page {
	//Always create a constructor first
	public Welcome_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}
	
	

}
