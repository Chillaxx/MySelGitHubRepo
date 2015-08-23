package com.nk.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.openqa.selenium.Platform.WINDOWS;
import static org.openqa.selenium.os.WindowsUtils.killPID;
import static org.openqa.selenium.os.WindowsUtils.thisIsWindows;


public class SimpleTitleTest {
	WebDriver driver;
	String baseUrl="http://www.naukri.com";
	String title = null;
	int step=0;
	
	@BeforeClass(timeOut=30000)
	public void setUp()  {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	@Test(timeOut=30000)
	public void search() throws Exception
	{
		
		
		
		title = driver.getTitle().trim();
		String ExpHomePageTitle = "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
		System.out.println(++step +" "+ "Verifying Home page");
		Assert.assertEquals(title, ExpHomePageTitle,"Home page is not displayed as expected");
		System.out.println("Home Page displayed Success");
	}
	@AfterSuite(timeOut=30000)
	public void quitBrowser() throws InterruptedException  {
		
		Thread.sleep(5000);
		driver.quit();
		Thread.sleep(5000);
		//driver.switchTo().activeElement();
		//driver.quit();
	}
}

