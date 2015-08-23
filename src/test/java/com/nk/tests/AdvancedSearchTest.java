package com.nk.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdvancedSearchTest {
	
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
		
		WebElement Adsearch = driver.findElement(By.xpath("//div[@class='advnLink']//a[contains(text(),'Advanced Search')]"));
		Adsearch.click();
		Thread.sleep(1000);
		
		
		WebElement KeySkills = driver.findElement(By.xpath("//div[@id='advKeyskills']//input[@class='sugInp']"));
		KeySkills.sendKeys("Cognizant");
		Thread.sleep(2000);
		String Key = KeySkills.getAttribute("placeholder");
		System.out.println("KeySkills Attribute is:"+Key);
		Thread.sleep(2000);
		
		WebElement KeyLocation = driver.findElement(By.id("Sug_advLocation"));
		KeyLocation.sendKeys("Bangalore");
		Thread.sleep(2000);
		String Loc = KeyLocation.getAttribute("placeholder");
		System.out.println("Location Attribute is:" +Loc);
		Thread.sleep(2000);
		
		WebElement WorkExpYears = driver.findElement(By.id("adv_workExp_year"));
		WorkExpYears.click();
		
		int year=5;
		WebElement Years = driver.findElement(By.id("dd_cja_expyr"+year));
		Years.click();
		Thread.sleep(2000);
		
					
		WebElement WorkExpMonths = driver.findElement(By.id("adv_workExp_month"));
		WorkExpMonths.click();
		
		WebElement Months = driver.findElement(By.id("dd_cja_expmn2"));
		Months.click();
		Thread.sleep(2000);
				
		WebElement ExpSalMin = driver.findElement(By.id("adv_exp_min"));
		ExpSalMin.click();
		
		WebElement Min = driver.findElement(By.id("dd_cja_min6"));
		Min.click();
		
		WebElement ExpSalMax = driver.findElement(By.xpath("//div[@id='dd_adv_exp_max']//input[@class='sdTxt w45']"));
		ExpSalMax.click();
		Thread.sleep(2000);
		
		WebElement Max = driver.findElement(By.id("dd_cja_max8"));
		Max.click();
		Thread.sleep(2000);
				
		WebElement Search = driver.findElement(By.className("srchTxt"));
		Search.click();
		Thread.sleep(1000);
		
		WebElement Search1 = driver.findElement(By.xpath("//a[@data-id='ddAdvIndusrty_7']"));
		Search1.click();
		
		WebElement Search2 = driver.findElement(By.xpath("//a[@data-id='ddAdvIndusrty_4']"));
		Search2.click();
		
		WebElement JobCater = driver.findElement(By.id("adv_jobCategory"));
		JobCater.click();
		Thread.sleep(1000);
		
		WebElement JobCaterOpt = driver.findElement(By.id("2"));
		JobCaterOpt.click();
		
		
		
		WebElement JobType=driver.findElement(By.xpath("//a[contains(text(),' Company Jobs ')]"));
		JobType.click();
		
		WebElement JobDate=driver.findElement(By.xpath("//a[contains(text(),' Date ')]"));
		JobDate.click();
		
		WebElement AdvSearch = driver.findElement(By.id("adv_submit"));
		AdvSearch.click();
		Thread.sleep(2000);
		
		
		
		//div[@id='advKeyskills']//input[@class='sugInp']
		//input[@name='qp_advKeyskills']
		
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
