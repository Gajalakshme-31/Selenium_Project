package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement LoginButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	


}
