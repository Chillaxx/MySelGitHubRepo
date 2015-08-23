package com.nk.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicSearchTest {
	
	WebDriver driver;
	String baseUrl="http://www.naukri.com";
	String title = null;
	int step=0;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
		
		@Test
		public void search() throws InterruptedException
		{
			title = driver.getTitle().trim();
			String ExpHomePageTitle = "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
			System.out.println(++step +" "+ "Verifying Home page");
			Assert.assertEquals(title, ExpHomePageTitle,"Home page is not displayed as expected");
			System.out.println("Home Page displayed Success");
				
			WebElement Skills = driver.findElement(By.xpath("//div[@id='skill']//input[@class='sugInp']"));
			Skills.sendKeys("Adobe");
			Thread.sleep(2000);
			String Key = Skills.getAttribute("placeholder");
			System.out.println("KeySkills Attribute is:"+Key);
			Thread.sleep(2000);

}
}
