package com.nk.tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPocTest extends com.nk.util.NkCommon
{

	public static final String lnk_head_xpath_Login="//a[@title='Jobseeker Login']";
	public static final String lbl_linkText_emailid="Email ID";
	public static final String lbl_linkText_Username="Username";
	public static final String lbl_xpath_emailid="//div[@id='eRow']/div/label";
	public static final String txt_id_emailid="eLogin";
	public static final String lbl_xpath_Password="//div[@class='row']/div/label[text()='Password']";
	public static final String txt_id_Password="pLogin";
	public static final String btn_xpath_login="//div[@class='row']/button[contains(text(),'Login')]";
	public static final String lbl_xpath_namedisplay="//p/span[1]/strong";
	
	public static final String lnk_linkText_forgetPassword="Forgot Password?";
	public static final String lnk_linkText_registernow="Register Now";
	public static final String para_xpath_NotMemberYet="//div[@class='row txtC']";
	public static final String para_xpath_Unauthorized="//div[@class='dClmr txtC']";
	
	public static final String Err_id_emailError="eLogin_err";
	public static final String Err_id_Password="pLogin_err";
	public static final String Err_id_invaliddetailsError="fLogin_err";
	public static final String img_ID_CloseImage="closeLB";
	
	public static final String Head_xpath_links="//div[@class='headGNB cloneCont wrap']/ul/li/a/div[1][@class='mTxt']";
	public static final String Head_xpath_linkRemain="//div[@class='headGNB cloneCont wrap']/ul/li/a/div[2]";
	public static final String Notification_xpath_TootlTip="//ul/li[1]/a/div[2]";
	public static final String Notification_xpath_link="//ul/li[1]/a/div[2]";
	public static final String Notification_xpath_Tooltp="//ul/li/div/ul/li/a[@id='blobId']";
	public static final String MYnaukri_xpath_link="//div[contains(text(),'My Naukri')]";
	public static final String mynaukri_xpath_tooltip="//ul[@class='rghtSec fr menu logged']/li[2]/div/ul/li[1]/a";
	public static final String Mynaukri_xpath_linksclick="//ul[2]/li[2]/div/ul/li/a";
	
	public static final String Submenu_xpath_Logout="//ul[2]/li[2]/div/ul/li[5]/a";
	public static final String Para_xpath_logoutMessage="//div/div[2]/span";
	
	String Expected_Result=null;
	String Title= null;
	String Actual_Result= null;
	boolean isDisplayed= false;
	String Parent_window=null;
	
	@BeforeClass
	
	public void setup()
	{
		super.setup();
	}
	
	@AfterClass
	public void teardown()
	{
		super.teardown();
	}
	
	@Test (enabled=true,priority =0)
	public void myNaukriPageHeader() throws Exception
	{
		try 
		
		{
			
	Parent_window= driver.getWindowHandle();
			
			WebElement loginlink= driver.findElement(By.xpath(lnk_head_xpath_Login));
			isDisplayed=loginlink.isDisplayed();
			Assert.assertTrue(isDisplayed, "Login Head Header object is Missing:");
			
			
			Actions loginactions= new Actions(driver);
			loginactions.moveToElement(loginlink);
			loginactions.click().perform();
			
			WebElement EmailId_head= driver.findElement(By.linkText(lbl_linkText_emailid));
			isDisplayed=EmailId_head.isDisplayed();
			Assert.assertTrue(isDisplayed, "Emailid Header tab is Missing");
			
			WebElement Username_head= driver.findElement(By.linkText(lbl_linkText_Username));
			isDisplayed= Username_head.isDisplayed();
			Assert.assertTrue(isDisplayed, "Username Header is Missing");
			
			WebElement Emailid_Label= driver.findElement(By.xpath(lbl_xpath_emailid));
			isDisplayed= Emailid_Label.isDisplayed();
			Assert.assertTrue(isDisplayed, "EmailID Label is Not displaying");
			
			WebElement Emailid_text= driver.findElement(By.id(txt_id_emailid));
			isDisplayed= Emailid_text.isDisplayed();
			
			Emailid_text.sendKeys("manjuec.ole@gmail.com");
			
			WebElement Password_label= driver.findElement(By.xpath(lbl_xpath_Password));
			isDisplayed= Password_label.isDisplayed();
			
			WebElement Password_text= driver.findElement(By.id(txt_id_Password));
			isDisplayed= Password_text.isDisplayed();
			
			Password_text.sendKeys("olemanju");
			
			 
			WebElement loginbutton= driver.findElement(By.xpath(btn_xpath_login));
			isDisplayed=loginbutton.isDisplayed();
			loginbutton.click();
			
			Actions nameact= new Actions(driver);
			nameact.moveToElement(loginbutton);
			
			Thread.sleep(5000);
		for (String ChildWindows : driver.getWindowHandles())
		{
			driver.switchTo().window(ChildWindows);
		}
			
			WebElement namecheck= driver.findElement(By.xpath(lbl_xpath_namedisplay));
			isDisplayed= namecheck.isDisplayed();
			
			System.out.println(namecheck.getText());
			
			if (namecheck.equals("manjunath"))
			{
				System.out.println("Passed");
			} else 
			{
				System.out.println("Failed");

			}
			
			
			ArrayList<String> HeaderList= new ArrayList<String>();
			HeaderList.add("Jobs");
			HeaderList.add("Recruiters");
			HeaderList.add("Companies");
			HeaderList.add("Services");
			HeaderList.add("More");
			//HeaderList.add("Notifications");
			
			
			List<WebElement> Headlinks= driver.findElements(By.xpath(Head_xpath_links));
			
			for (int i = 0; i < Headlinks.size(); i++) 
			{
				Actual_Result= Headlinks.get(i).getText();
				
				String []act= Actual_Result.split(" ", 1);		 
				
				System.out.println(act[0]);
				Expected_Result=HeaderList.get(i).toString();
				
				Assert.assertEquals(act[0], Expected_Result, "Header Links are Not Matching");
			}
			
			
			ArrayList<String> RemainList= new ArrayList<String>();
			RemainList.add("Notifications");
			RemainList.add("My Naukri");
			
			List<WebElement> remainlink= driver.findElements(By.xpath(Head_xpath_linkRemain));
			
			for (int i = 0; i < remainlink.size(); i++) 
			{
				Actual_Result= remainlink.get(i).getText();
				String act=Actual_Result.replace("\n50", "");
				Expected_Result= RemainList.get(i).toString();
				
				Assert.assertEquals(act, Expected_Result, "Header Remaining Links are Missing");
			}
			
			WebElement not_tooltip= driver.findElement(By.xpath(Notification_xpath_TootlTip));
			isDisplayed= not_tooltip.isDisplayed();
			
			Actions avt= new Actions(driver);
			avt.moveToElement(not_tooltip);
			
			WebElement tooltip= driver.findElement(By.xpath("//ul/li/div/ul/li/a[@id='blobId']"));
		avt.moveToElement(tooltip);
		avt.build().perform();
		Thread.sleep(5000);
		

		
		WebElement my_naukri= driver.findElement(By.xpath("//div[contains(text(),'My Naukri')]"));
		isDisplayed= my_naukri.isDisplayed();
		
		Actions nauk= new Actions(driver);
		nauk.moveToElement(my_naukri);
		
		WebElement nauk_tooltip= driver.findElement(By.xpath("//ul[@class='rghtSec fr menu logged']/li[2]/div/ul/li[1]/a"));
		nauk.moveToElement(nauk_tooltip);
		nauk.build().perform();
		
		WebElement Logoutlink= driver.findElement(By.xpath(Submenu_xpath_Logout));
		nauk.moveToElement(Logoutlink);
		nauk.click().build().perform();
		
		for (String Childwindows : driver.getWindowHandles())
		{
			driver.switchTo().window(Childwindows);
		}
			
		WebElement logoutmessage= driver.findElement(By.xpath(Para_xpath_logoutMessage));
		
		if (logoutmessage.getText().contains("You have successfully Logged out of")) 
		{
			System.out.println("Logout Message Sucessfully displayed");
		} else 
		{
			System.out.println(" Logout message is not Matching");
		}
			//driver.close();
			driver.switchTo().window(Parent_window);
			
			//driver.close();
			driver.navigate().to("www.naukri.com");
			
		}
		
		catch (Exception e) 
		
		{
			throw new Exception("myNaukriPageHeader Test Case Failed " + e.getLocalizedMessage());
		}
	}

	@Test(enabled=true,priority =2)
	public void blankEnterySubmit() throws Exception
	{
	try
	{
		Parent_window= driver.getWindowHandle();
		
		WebElement loginlink= driver.findElement(By.xpath(lnk_head_xpath_Login));
		isDisplayed=loginlink.isDisplayed();
		Assert.assertTrue(isDisplayed, "Login Head Header object is Missing:");
		
		
		Actions loginactions= new Actions(driver);
		loginactions.moveToElement(loginlink);
		loginactions.click().perform();
		
		
		WebElement Emailid_text= driver.findElement(By.id(txt_id_emailid));
		isDisplayed= Emailid_text.isDisplayed();
		
		WebElement Password_text= driver.findElement(By.id(txt_id_Password));
		isDisplayed= Password_text.isDisplayed();
		
		WebElement loginbutton= driver.findElement(By.xpath(btn_xpath_login));
		isDisplayed=loginbutton.isDisplayed();
		loginbutton.click();
		
		WebElement ErrorMessageEmail= driver.findElement(By.id(Err_id_emailError));
		isDisplayed=ErrorMessageEmail.isDisplayed();
		Assert.assertTrue(isDisplayed, "ErrorMessageEmail is Not Displayed");
		
		
		if (ErrorMessageEmail.getText().contains("enter your Email ID"))
		{
			System.out.println("Email Id Validation Message displayed");
		} else 
		
		{
			System.out.println("Email Id Validation Not Displayed");
		}
		
		
		WebElement ErrorMessagePassword= driver.findElement(By.id(Err_id_Password));
		isDisplayed=ErrorMessagePassword.isDisplayed();
		Assert.assertTrue(isDisplayed, "ErrorMessagePassword is Not Displayed");
		
		if (ErrorMessagePassword.getText().contains("enter your Password"))
		{
			System.out.println("Password Validation Message displayed");
		} else 
		
		{
			System.out.println("Password Validation Not Displayed");
		}
		
		Thread.sleep(10000);
		
		WebElement Err= driver.findElement(By.id(Err_id_invaliddetailsError));
		isDisplayed=Err.isDisplayed();
		Assert.assertTrue(isDisplayed, "Error Message is Not Displayed");
		
		//WebElement closeimage= driver.findElement(By.id("img_ID_CloseImage"));
		WebElement closeimage=driver.findElement(By.xpath("//div[@class='ltGlobalHd']/a[@id='closeLB']"));
		closeimage.click();
		
		Thread.sleep(3000);
		//driver.close();
		
		Actual_Result=driver.getTitle();
		Assert.assertTrue(Actual_Result.contains("Jobs - Recruitment"), "Home Page Title is NOt Matching");
		//driver.navigate().to("www.naukri.com");
		
	} 
	catch (Exception e) 
	{

		throw new Exception("blankEnterySubmit Test case Failed " +e.getLocalizedMessage());

	}	

	}

	@Test (enabled=true,priority =1)
	public void loginObjectVerification() throws Exception
	{
	try 
	{
		//driver.navigate().to("www.naukri.com");
		Parent_window= driver.getWindowHandle();
		
		WebElement loginlink= driver.findElement(By.xpath(lnk_head_xpath_Login));
		isDisplayed=loginlink.isDisplayed();
		//Assert.assertTrue(isDisplayed, "Login Head Header object is Missing:");
		
		
		Actions loginactions= new Actions(driver);
		loginactions.moveToElement(loginlink);
		loginactions.click().perform();
		
		WebElement EmailId_head= driver.findElement(By.linkText(lbl_linkText_emailid));
		isDisplayed=EmailId_head.isDisplayed();
		Assert.assertTrue(isDisplayed, "Emailid Header tab is Missing");
		
		WebElement Username_head= driver.findElement(By.linkText(lbl_linkText_Username));
		isDisplayed= Username_head.isDisplayed();
		Assert.assertTrue(isDisplayed, "Username Header is Missing");
		
		WebElement Emailid_Label= driver.findElement(By.xpath(lbl_xpath_emailid));
		isDisplayed= Emailid_Label.isDisplayed();
		Assert.assertTrue(isDisplayed, "EmailID Label is Not displaying");
		
		WebElement Emailid_text= driver.findElement(By.id(txt_id_emailid));
		isDisplayed= Emailid_text.isDisplayed();
		
		//Emailid_text.sendKeys("manjuec.ole@gmail.com");
		
		WebElement Password_label= driver.findElement(By.xpath(lbl_xpath_Password));
		isDisplayed= Password_label.isDisplayed();
		
		WebElement Password_text= driver.findElement(By.id(txt_id_Password));
		isDisplayed= Password_text.isDisplayed();
		
		//Password_text.sendKeys("olemanju");
		
		WebElement forgetpasswordlink= driver.findElement(By.linkText(lnk_linkText_forgetPassword));
		isDisplayed= forgetpasswordlink.isDisplayed();
		 
		WebElement loginbutton= driver.findElement(By.xpath(btn_xpath_login));
		isDisplayed=loginbutton.isDisplayed();
		
		WebElement notmembertext= driver.findElement(By.xpath(para_xpath_NotMemberYet));
		isDisplayed=notmembertext.isDisplayed();
		
		WebElement registernowlink= driver.findElement(By.linkText(lnk_linkText_registernow));
		isDisplayed=registernowlink.isDisplayed();
		
		WebElement unauther= driver.findElement(By.xpath(para_xpath_Unauthorized));
		isDisplayed=unauther.isDisplayed();
		
		if (unauther.getText().contains("un-authorized access to your account")) 
		{
		System.out.println("Verification Pass");
		} else 
		{
			System.out.println("Verification Failed");
		}
		
		//driver.close();
	} 
	catch (Exception e) 
	{
		throw new Exception("loginObjectVerification Test Case Failed " +e.getLocalizedMessage());
	}	

	}
	
	public void closePopupandVerifyHomePage()
	{
		
	}
}
