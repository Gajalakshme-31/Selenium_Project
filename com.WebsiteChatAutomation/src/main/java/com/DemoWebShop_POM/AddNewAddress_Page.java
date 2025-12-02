package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddress_Page {

	public AddNewAddress_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

@FindBy(id="Address_FirstName")
private WebElement FirstName;

@FindBy(id="Address_LastName")
private WebElement LastName;

@FindBy(id="Address_Email")
private WebElement Email;

@FindBy(id="Address_CountryId")
private WebElement Country_Dropdown ;

@FindBy(id="Address_City")
private WebElement City;

@FindBy(id="Address_Address1")
private WebElement Address;

@FindBy(id="Address_ZipPostalCode")
private WebElement PostalCode ;

@FindBy(id="Address_PhoneNumber")
private WebElement PhoneNumber ;

@FindBy(xpath="//input[@value='Save']")
private WebElement SaveButton ;


public WebElement getFirstName() {
	return FirstName;
}

public WebElement getLastName() {
	return LastName;
}

public WebElement getEmail() {
	return Email;
}

public WebElement getCountry_Dropdown() {
	return Country_Dropdown;
}

public WebElement getCity() {
	return City;
}

public WebElement getAddress() {
	return Address;
}

public WebElement getPostalCode() {
	return PostalCode;
}

public WebElement getPhoneNumber() {
	return PhoneNumber;
}

public WebElement getSaveButton() {
	return SaveButton;
}

}

