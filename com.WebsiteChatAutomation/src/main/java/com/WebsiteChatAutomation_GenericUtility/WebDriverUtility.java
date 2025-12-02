package com.WebsiteChatAutomation_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility 
{/*
	//To take SS for the entire page
	public void webPageScreenShot(WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstantss.screenShotPath);
		FileHandler.copy(temp, dest);
	}
	
	//To take SS for particular webelement
	public void webElementScreenShot(WebElement element) throws IOException
	{
		
		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstantss.screenShotPath);
		FileHandler.copy(temp, dest);
	}
	//To select the value from the dropdown using its text
	public void selectByVisibleText(WebElement ele, String text)
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}
	//To click on few elements
	public void javascriptClick(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
	//To scroll till the view of the element
	public void javascriptScrollIntoView(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	
*/
}
