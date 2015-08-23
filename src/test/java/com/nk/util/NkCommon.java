package com.nk.util;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NkCommon {
	
		
		public static WebDriver driver;
		String BASE_URL="http://www.naukri.com/";
		
		@BeforeClass
		public void setup()
		{
			
			driver= new FirefoxDriver();
			driver.get(BASE_URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}

		protected void parentMenuAction(WebElement element)
		{
		 try 
		 {
		  Actions action = new Actions(driver);
		  action.moveToElement(element);
		  action.build().perform();
		  //action.moveToElement(element);
		  //action.click().perform();

		  //System.out.println("Sucessfully Parent clicked on the element");
		  
		 }
		 catch (Exception e) 
		 {
		  System.out.println("Parent Element is not attached to the page document " + e.getLocalizedMessage());

		 }
		}


		protected void ChildMenuAction(WebElement element)
		{
		 try 
		 {
		  Actions action = new Actions(driver);
		  action.moveToElement(element);
		  action.click().perform();

		  //System.out.println("Sucessfully Child clicked on the element");
		  
		 }
		 catch (Exception e) 
		 {
		  System.out.println("Child Element is not attached to the page document " + e.getLocalizedMessage());

		 }
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
