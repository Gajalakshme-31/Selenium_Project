package com.WebsiteChatAutomation;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

public class GenerateReport {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// To add the name of the file automatically every time
		String fileName = LocalDateTime.now().toString().replace("-","").replace(".","").replace(":","");
		
		//BuiltIn class to generate report
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/" + fileName + ".html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(spark);
		//To provide the name of the testrun
		ExtentTest test = reports.createTest("Smoke testing - QA");
		
		
		WebDriver driver = new ChromeDriver();
		test.log(Status.INFO, "Browser Launched");
		
		driver.manage().window().maximize();
		test.log(Status.INFO, "Browser maximized");
		String mail = "r@mailinator.com";
		String pass = "Qwerty@123";
		String url = "https://appvance.ai/";
		int a=0;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://websitechat-qa.netlify.app/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[data-cy='login-email-input']")).sendKeys(mail);
		driver.findElement(By.cssSelector("[data-cy='login-password-input']")).sendKeys(pass);
		a=10;
		driver.findElement(By.cssSelector("[data-cy='login-submit-button']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div[2]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[data-cy='website-url-input']")).sendKeys(url);
		
		Thread.sleep(2000);
		
		if (a==10)
		{
		test.log(Status.PASS,"SignIn Successfull");
		}
		else
		{
			test.log(Status.FAIL,"SignIn Failed");
		}
		
		
		
		
		
		
		
		
		
		/*//To attach screenshot within the report
		
		String dest_path = "./screenshot/" + fileName + ".png";
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(dest_path);
		FileHandler.copy(src, dest);
		
		//To map the exact address of the SS into the report
		test.addScreenCaptureFromPath("."+ dest_path);
		*/
		Thread.sleep(3000);
		driver.quit();
		
		//Without this line the report will not be generated
		reports.flush();
		
	}

}

