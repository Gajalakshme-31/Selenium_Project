package com.WebsiteChatAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WC_Login {
public WC_Login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

@FindBy(css = "[data-cy='login-email-input']")
private WebElement EmailInput;

@FindBy(css="[data-cy='login-password-input']")
private WebElement PasswordField;

public WebElement getEmailInput() {
	return EmailInput;
}

public WebElement getPasswordField() {
	return PasswordField;
}

public WebElement getLoginButton() {
	return LoginButton;
}

public WebElement getForgotPassword() {
	return ForgotPassword;
}

@FindBy(css="[data-cy='login-submit-button']")
private WebElement LoginButton;

@FindBy(css="[data-cy='forgot-password-link']")
private WebElement ForgotPassword;

	
	
}
