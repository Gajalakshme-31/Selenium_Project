package com.WebsiteChatAutomation_TestScripts;

import org.testng.annotations.Test;

import com.DemoWebShop_GenericUtility.Base_Test;
import com.DemoWebShop_POM.Addresses_Page;

public class TC_Delete_Address_Test extends Base_Test {
	
	@Test
	public void deleteAddress() throws InterruptedException
	{
		webDriverUtility.javascriptScrollIntoView(driver, homePage.getAddressButton());
		homePage.getAddressButton().click();
		
		Addresses_Page addressesPage = new Addresses_Page(driver);
		addressesPage.getDeleteBtn().click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
