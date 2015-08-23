package com.nk.common;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NkCommon 

{
	
	public WebDriver driver;
	String BASE_URL="http://www.naukri.com/";
	
	@BeforeClass
	public void setup()
	{
		
		driver= new FirefoxDriver();
		driver.get(BASE_URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
@Test
	public void getscreenshot() throws IOException
	{
		
		try {
			
			File filescreen=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			//copy the file to the required path
					
			//String fileString= new File("C:\\Users\\manjunathr\\Desktop\\screenshot.jpeg") ;
			FileUtils.copyFile(filescreen, new File("C:\\Users\\manjunathr\\Desktop\\Mahesh.jpeg"));
			//FileUtils.copyFile(filescreen, destina);
			
			
			
		} catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}
		 //take screenshot and save it in a file
	}
}
