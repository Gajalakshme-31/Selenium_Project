package com.WebsiteChatAutomation_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemoWebShop_GenericUtility.Base_Test;
import com.DemoWebShop_POM.AddNewAddress_Page;
import com.DemoWebShop_POM.Addresses_Page;

public class TC_Add_New_Address_Test extends Base_Test {
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {
		webDriverUtility.javascriptScrollIntoView(driver, homePage.getAddressButton());
		homePage.getAddressButton().click();

		Addresses_Page addressesPage = new Addresses_Page(driver);
		addressesPage.getAddNewButton().click();

		AddNewAddress_Page addNewAddressPage = new AddNewAddress_Page(driver);

		addNewAddressPage.getFirstName().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 0));
		addNewAddressPage.getLastName().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 1));
		addNewAddressPage.getEmail().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 2));

		webDriverUtility.selectByVisibleText(addNewAddressPage.getCountry_Dropdown(),
				fileUtility.readDataFromExcelFile("Sheet1", 1, 3));
		addNewAddressPage.getCity().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 4));
		addNewAddressPage.getAddress().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 5));
		addNewAddressPage.getPostalCode().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 6));
		addNewAddressPage.getPhoneNumber().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 7));
		addNewAddressPage.getSaveButton().click();
	
		System.out.println("End of form filling");
		Thread.sleep(3000);
		webDriverUtility.webPageScreenShot(driver);

	}
}