package com.nk.tests;

import com.nk.constants.Constants;
import com.nk.util.NkCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Registration {
	
	

	public class RegisterTestsForLogin extends NkCommon {
		int step= 1;	
		
		/**
		 *@author Senthil
		 * 
		 */	
		@BeforeTest
		public void setup(){ 
			super.setup();
			//setUp();
			}
		
		/**
		 *@author Senthil
		 * 
		 */
		@Test
		public void register() throws InterruptedException{
							
			System.out.println("TC_NA03.1#01");
			System.out.println("Test Step is verifying Jobseeker Login Lightbox ::"+step++);
			Assert.assertEquals(driver.getTitle().trim(), Constants.naukriHomePageTitle, "Current HP title doesnot match with the Expected Naukri HP");
			//Assert.assertEquals(driver.getTitle().trim(), "Current HP title doesnot match with the Expected Naukri HP");
			WebElement loginIcon = driver.findElement(By.xpath("//a[@id='login_Layer']"));
			loginIcon.click();
	    	Thread.sleep(500);
	    	WebElement loginLightBox = driver.findElement(By.id("loginLB"));
	    	boolean isLoginLBoxDisplayed = loginLightBox.isDisplayed();
	    	Assert.assertTrue(isLoginLBoxDisplayed, "The Login Light box is not displayed when clicked on HP Login Icon");
	    	System.out.println("Jobseeker Login Lightbox is verified");
	    	
	    	System.out.println("TC_NA03.1#02");
	    	System.out.println("Test Step is verifying Jobseeker Registration page ::"+step++);
	    	WebElement registerLink = driver.findElement(By.xpath("//div[@class='row txtC']/a[contains(.,'Register Now')]"));
	    	registerLink.click();
	    	Thread.sleep(3000);
	    	Assert.assertEquals(driver.getTitle().trim(),Constants.registrationPageTitle, "Registration page failed to load when clicked on Registration link");
	    	System.out.println("Jobseeker Registration page is verified");
			
	    	System.out.println("TC_NA03.1#03");
	    	System.out.println("Test Step is verifying Message on Jobseeker Registration page ::"+step++);
			WebElement curRegMsg = driver.findElement(By.tagName("h1"));
			Assert.assertEquals(curRegMsg.getText().trim(), Constants.registrationPageMessage, "The expected message on Registration page is not displayed");
			System.out.println("Message on Jobseeker Registration page is verified");
			
	    	System.out.println("TC_NA03.1#04");
	    	System.out.println("Test Step is verifying Create Login Details section on Registration page ::"+step++);
			WebElement createLoginDetails = driver.findElement(By.xpath("//div[@id='lftcont']/div[contains(.,'Create Login Details')]"));
			boolean isCreateLoginDetailsDisplayed = createLoginDetails.isDisplayed();
			Assert.assertTrue(isCreateLoginDetailsDisplayed, "Create Login Details section is not displayed on Registration page");
			System.out.println("Create Login Details section on Jobseeker Registration page is verified");
			
			System.out.println("TC_NA03.1#05");
			System.out.println("Test Step is verifying Your Contact Information section on Registration page ::"+step++);
			WebElement yourContactInformation = driver.findElement(By.xpath("//div[@id='lftcont']/div[contains(.,'Your Contact Information')]"));
			boolean isYourContactInformationDisplayed = yourContactInformation.isDisplayed();
			Assert.assertTrue(isYourContactInformationDisplayed, "Your Contact Information section is not displayed on Registration page");
			System.out.println("Your Contact Information section on Jobseeker Registration page is verified");
			
			System.out.println("TC_NA03.1#06");
			System.out.println("Test Step is verifying Your Current Employment Details section on Registration page ::"+step++);
			WebElement currentEmpDetails = driver.findElement(By.xpath("//div[@id='lftcont']/div[contains(.,'Your Current Employment Details')]"));
			boolean isCurrentEmpDetailsDisplayed = currentEmpDetails.isDisplayed();
			Assert.assertTrue(isCurrentEmpDetailsDisplayed, "Your Current Employment Details section is not displayed on Registration page");
			System.out.println("Your Current Employment Details section on Jobseeker Registration page is verified");
			
			System.out.println("TC_NA03.1#07");
			System.out.println("Test Step is verifying Your Education Background section on Registration page ::"+step++);
			WebElement yourEducationBackground = driver.findElement(By.xpath("//div[@id='lftcont']/div[contains(.,'Your Education Background')]"));
			boolean isEducationBkgndDisplayed = yourEducationBackground.isDisplayed();
			Assert.assertTrue(isEducationBkgndDisplayed, "Your Education Background section is not displayed on Registration page");
			System.out.println("Your Education Background section on Jobseeker Registration page is verified");
			
			System.out.println("TC_NA03.1#08");
			System.out.println("Test Step is verifying Upload your detailed resume section on Registration page ::"+step++);
			WebElement uploadResume = driver.findElement(By.xpath("//div[@class='cls padLR10']/div[contains(.,'Upload your detailed resume')]"));
			boolean isUploadResumeDisplayed = uploadResume.isDisplayed();
			Assert.assertTrue(isUploadResumeDisplayed, "Upload your detailed resume section is not displayed on Registration page");
			System.out.println("Upload your detailed resume section on Jobseeker Registration page is verified");
			
			System.out.println("TC_NA03.1#09");
			System.out.println("Test Step is verifying Mailer and Privacy Settings section on Registration page ::"+step++);
			WebElement mailerAndPrivacySettings = driver.findElement(By.xpath("//div[@class='cls padLR10']/div[contains(.,'Mailer and Privacy Settings')]"));
			boolean isMailerAndPrivacyDisplayed = mailerAndPrivacySettings.isDisplayed();
			Assert.assertTrue(isMailerAndPrivacyDisplayed, "Mailer and Privacy Settings section is not displayed on Registration page");
			System.out.println("Mailer and Privacy Settings section on Jobseeker Registration page is verified");
			
			System.out.println("TC_NA03.1#10");
			System.out.println("Test Step is verifying I agree checkbox on Registration page ::"+step++);
			WebElement iAgreeCheckbox = driver.findElement(By.xpath("//input[@id='agreetnc']"));
			boolean isIAgreeCheckboxDisplayed =iAgreeCheckbox.isDisplayed();
			Assert.assertTrue(isIAgreeCheckboxDisplayed, "I Agree Checkbox is not displayed on Registration page ");
			System.out.println("I Agree Checkbox on Jobseeker Registration page is verified");
			
			System.out.println("TC_NA03.1#11");
			System.out.println("Test Step is verifying Terms and Conditions link on Registration page ::"+step++);
			WebElement termsConditionslnk = driver.findElement(By.xpath("//div[@class='cls padLR10']//a[contains(.,'Terms and Conditions')]"));
			boolean istermsConditionslnkDisplayed = termsConditionslnk.isDisplayed();
			Assert.assertTrue(istermsConditionslnkDisplayed, "Terms and Conditions link is not displayed on Registration page");
			System.out.println("Terms and Conditions link on Jobseeker Registration page is verified");
			
			System.out.println("TC_NA03.1#12");
			System.out.println("Test Step is verifying Join Naukri.com button on Registration page ::"+step++);
			WebElement JoinNaukriButton = driver.findElement(By.xpath("//input[@value='Join Naukri.com']"));
			boolean isjoinNaukriButtonDisplayed = JoinNaukriButton.isDisplayed();
			Assert.assertTrue(isjoinNaukriButtonDisplayed, "Join Naukri.com Button is not displayed on Registration page");
			System.out.println("Join Naukri.com button on Jobseeker Registration page is verified");
			
			System.out.println("TC_NA03.1#13");
			System.out.println("Test Step is verifying Email Id field in Create Login Details section of Registration page ::"+step++);
			WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
			boolean isEmailDisplayed = email.isDisplayed();
			Assert.assertTrue(isEmailDisplayed, "The Email field is not displayed in Create Login Details section of Registration page");
			System.out.println("Email Id field in Create Login Details section of Registration page is verified ");
			
			System.out.println("TC_NA03.1#14");
			System.out.println("Test Step is verifying Error message when Email id field is not enetered in Create Login Details section of Registration page ::"+step++);
			WebElement password = driver.findElement(By.id("password"));
			password.click();				
			WebElement emailError = driver.findElement(By.xpath("//div[@id='error_email']"));
			Assert.assertEquals(emailError.getText().trim(), Constants.expectedEmailError, "Expected Email Error doesnot get displayed");
			System.out.println("Email Error message when Email id field is not enetered in Create Login Details section of Registration page is verified");
			
			System.out.println("TC_NA03.1#15");
			System.out.println("Test Step is verifying Password field in Create Login Details section of Registration page ::"+step++);
			boolean isPasswordDisplayed = password.isDisplayed();
			Assert.assertTrue(isPasswordDisplayed, "Password field is not displayed in Create Login Details section of Registration page");
			System.out.println("Password field in Create Login Details section of Registration page is verified ");
			
			System.out.println("TC_NA03.1#16");
			System.out.println("Test Step is verifying Confirm Password field in Create Login Details section of Registration page ::"+step++);
			WebElement confirmPassword = driver.findElement(By.id("cpassword"));
			boolean isConfirmPasswordDisplayed = confirmPassword.isDisplayed();
			Assert.assertTrue(isConfirmPasswordDisplayed, "Confirm Password field is not displayed in Create Login Details section of Registration page");
			System.out.println("Confirm Password field in Create Login Details section of Registration page is verified ");
			
			System.out.println("TC_NA03.1#17");
			System.out.println("Test Step is verifying the Error Alert displayed when already registered Email id is entered in Create Login Details section of Registration page ::"+step++);
			email.sendKeys(Constants.registeredEmail);
			password.click();
			Thread.sleep(3000);
			WebElement errorAlert = driver.findElement(By.xpath("//div[@id='forGotPassword']"));
			boolean isErrorAlertDisplayed = errorAlert.isDisplayed();
			Assert.assertTrue(isErrorAlertDisplayed, "Error Alert is not displayed");
			WebElement alreadyRegisteredMsg = driver.findElement(By.xpath("//div[@id='forGotPassword']/div[contains(.,'is already registered with us')]"));
			boolean isAlreadyRegisteredDisplayed = alreadyRegisteredMsg.isDisplayed();
			Assert.assertTrue(isAlreadyRegisteredDisplayed, "Alredy registered message is not displayed");
			System.out.println("Error Alert is verified ");
			
			System.out.println("TC_NA03.1#18");
			System.out.println("Test Step is verifying the Close(X) in Error Alert displayed::"+step++);
			WebElement close = driver.findElement(By.xpath("//div[@id='forGotPassword']//a[@title='Close']"));
			boolean isCloseDisplayed = close.isDisplayed();
			Assert.assertTrue(isCloseDisplayed, "The Close(X) is not displayed");
			close.click();
			boolean isErrorAlertDisplayed1 = errorAlert.isDisplayed();
			Assert.assertFalse(isErrorAlertDisplayed1, "Error Alert is displayed");
			System.out.println("Close(X) is verified ");
			
			System.out.println("TC_NA03.1#19");
			System.out.println("Test Step is verifying the Email field with email id which is not already registered::"+step++);
			email.clear();
			email.sendKeys(Constants.validEmail);
			password.click();
			boolean isErrorAlertDisplayed2 = errorAlert.isDisplayed();
			Assert.assertFalse(isErrorAlertDisplayed2, "Error Alert is displayed for Non-registered email id");
			System.out.println("Email field is verified ");
			
			System.out.println("TC_NA03.1#20");
			System.out.println("Test Step is verifying the Password field ::"+step++);
			password.sendKeys("ab12");
			Thread.sleep(1000);
			confirmPassword.click();
			Thread.sleep(2000);
			WebElement passwordError = driver.findElement(By.xpath("//div[(@id='error_password')]"));
			Assert.assertEquals(passwordError.getText().trim(), Constants.expectedPasswordError, "Expected Password error is not displayed when password entered is < 6 characters");
			password.clear();
	        password.sendKeys(Constants.passwordEntered);
			confirmPassword.click();
			System.out.println("Password field is verified ");
			
			System.out.println("TC_NA03.1#21");
			System.out.println("Test Step is verifying the Confirm Password field ::"+step++);
			confirmPassword.sendKeys("ab");
			WebElement name = driver.findElement(By.id("cname"));
			name.click();
			WebElement cPasswordError = driver.findElement(By.xpath("//div[(@id='error_cpassword')]"));
			Assert.assertEquals(cPasswordError.getText().trim(), Constants.expectedconfirmPasswordError, "The expected error message is not displayed when the Confirm password doesnot match with the Password entered");
			confirmPassword.clear();
		    confirmPassword.sendKeys(Constants.passwordEntered);
			name.click();
			System.out.println("Confirm Password error is verified");
			
			System.out.println("TC_NA03.1#22");
			System.out.println("Test Step is verifying the Full name field ::"+step++);
			boolean isNameDisplayed = name.isDisplayed();
			Assert.assertTrue(isNameDisplayed, "Full name field is not displayed in the Your Contact Information section");
			name.sendKeys(Constants.username);
			System.out.println("Full name field is verified ");
			
			System.out.println("TC_NA03.1#23");
			System.out.println("Test Step is verifying Current location dropdown ::"+step++);
			WebElement curLocationDropdown = driver.findElement(By.xpath("//input[@id='inpcityContainerDD']"));
			curLocationDropdown.click();
			boolean isCurLocDDDisplayed = curLocationDropdown.isDisplayed();
			Assert.assertTrue(isCurLocDDDisplayed, "Current location dropdown is not displayed");
			
			name.click();
			Thread.sleep(2000);
			WebElement dropdownError = driver.findElement(By.xpath("//div[@id='error_location']"));
			Assert.assertEquals(dropdownError.getText().trim(), Constants.expectedSelectLocError, "Expected Error message is not displayed if the location is not selected");
			
			/*curLocationDropdown.click();
			Thread.sleep(500);
			WebElement blore = driver.findElement(By.xpath("//div[@id='cityValContainer']/ul[1]/li[3]"));
			blore.click();*/
					
			System.out.println("Current location dropdown is verified");
			
			
			System.out.println("TC_NA03.1#24");
			System.out.println("Test Step is verifying Land line number field ::"+step++);
			WebElement mobilefield = driver.findElement(By.id("mphone"));
			Thread.sleep(2000);
			WebElement landlineLnk = driver.findElement(By.xpath("//a[contains(.,'Landline no.')]"));
			landlineLnk.click();
			Thread.sleep(1000);
			WebElement countryCode = driver.findElement(By.xpath("//input[@id='countrycode']"));
			boolean isCCDisplayed = countryCode.isDisplayed();
			Assert.assertTrue(isCCDisplayed, "Country code is not displayed");
			WebElement areaCode = driver.findElement(By.xpath("//input[@id='areacode']"));
			boolean isAreaCDisplayed = areaCode.isDisplayed();
			Assert.assertTrue(isAreaCDisplayed, "Area code is not displayed");
			WebElement landline = driver.findElement(By.xpath("//input[@id='landline']"));
			boolean isLandlineDisplayed = landline.isDisplayed();
			landlineLnk.click();
			Assert.assertTrue(isLandlineDisplayed, "Land line field is not displayed");
			System.out.println("Land line number field is verified");
			
			System.out.println("TC_NA03.1#25");
			System.out.println("Test Step is verifying Mobile field Error message ::"+step++);
			WebElement joinNaukriButton = driver.findElement(By.xpath("//input[@value='Join Naukri.com']"));
			joinNaukriButton.click();
			
			WebElement mobileError = driver.findElement(By.xpath("//div[(@id='error_mphone')]"));
			Assert.assertEquals(mobileError.getText().trim(), Constants.expectedMobileNumberError, "Expected Error message is not displayed when mobile field is not entered and submitted");
			
			WebElement basicEduError = driver.findElement(By.xpath("//div[(@id='error_ugcourse')]"));
			Assert.assertEquals(basicEduError.getText().trim(), Constants.expectedBasicEducationError, "Expected Error message is not displayed when Basic education is not selected");
			
			mobilefield.sendKeys(Constants.mobileNumber);
			System.out.println("Mobile Error message is verified");
			
			
			System.out.println("TC_NA03.1#26");
			System.out.println("Test Step is verifying Experence dropdown ::"+step++);
			WebElement experienceDD = driver.findElement(By.xpath("//select[@id='expyear']"));
			boolean isExpDDDisplayed = experienceDD.isDisplayed();
			Assert.assertTrue(isExpDDDisplayed, "Experience dropdown is not displayd");
			System.out.println("Experence dropdown is verified");
			
			System.out.println("TC_NA03.1#27");
			System.out.println("Test Step is verifying Experience dropdown error::"+step++);
			WebElement skills = driver.findElement(By.id("keywords1"));
			skills.click();
			
			WebElement experienceError = driver.findElement(By.xpath("//div[(@id='error_experience')]"));
			Assert.assertEquals(experienceError.getText().trim(), Constants.expectedExperienceError, "Error message is not displayed when Experience dropdown is not selected");
			
			System.out.println("Experence dropdown error is verified");
			
			System.out.println("TC_NA03.1#28");
			System.out.println("Test Step is verifying Designation auto suggest box::"+step++);
			new Select(experienceDD).selectByVisibleText("7");
			WebElement designation = driver.findElement(By.id("Desig_0"));
			boolean isDesignationDisplayed = designation.isDisplayed();
			Assert.assertTrue(isDesignationDisplayed, "Designation field is not displayed");
			
			designation.sendKeys(Constants.designation);
			System.out.println("Designation field is displayed");
			
			System.out.println("TC_NA03.1#29");
			System.out.println("Test Step is verifying Multiple Designation selection in auto suggest box::"+step++);
			skills.sendKeys("Selenium");
			Thread.sleep(1000);
			WebElement pressdown= driver.findElement(By.id("keywords1"));;
			pressdown.sendKeys(Keys.ARROW_DOWN);		
			WebElement pressenter = driver.findElement(By.id("keywords1"));
			pressenter.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			skills.sendKeys("QTP");
			WebElement pressdown1= driver.findElement(By.id("keywords1"));;
			pressdown1.sendKeys(Keys.ARROW_DOWN);		
			WebElement pressenter1 = driver.findElement(By.id("keywords1"));
			pressenter1.sendKeys(Keys.ENTER);
			pressenter1.sendKeys(Keys.ENTER);
			
			mobilefield.click();
			System.out.println("Multiple Designation selection in Designation auto suggest box is verified");
			
			System.out.println("TC_NA03.1#30");
			System.out.println("Test Step is verifying Basic education dropdown::"+step++);
			WebElement edu = driver.findElement(By.xpath("//select[@id='ugcourse']"));
			boolean isEducationDDDisplayed = edu.isDisplayed();
			Assert.assertTrue(isEducationDDDisplayed, "Basic education dropdown is not displayed");
			System.out.println("Basic education dropdown is verified");
			
			System.out.println("TC_NA03.1#31");
			System.out.println("Test Step is verifying Error message when Basic education is not selected::"+step++);
			Thread.sleep(3000);
			new Select(edu).selectByVisibleText(Constants.education);
			System.out.println("Error message when Basic education is not selected is verified");
			
			System.out.println("TC_NA03.1#32");
			System.out.println("Test Step is verifying Browse button::"+step++);
			WebElement browseButton = driver.findElement(By.id("inpFile"));
			boolean isBrowseButtonDisplayed = browseButton.isDisplayed();
			Assert.assertTrue(isBrowseButtonDisplayed, "Browse button is displayed");
			System.out.println("Browse button is verified");
			
			System.out.println("TC_NA03.1#33");
			System.out.println("Test Step is verifying Uploading file using Browse button::"+step++);
			Thread.sleep(2000);
	    	browseButton.sendKeys(Constants.path);
	    	Thread.sleep(2000);
	    	System.out.println("Uploading file using Browse button is verified");
	    	
	    	System.out.println("TC_NA03.1#34");
			System.out.println("Test Step is verifying Uploaded file using Browse button::"+step++);
	    	String docName = browseButton.getAttribute("value");
	    	System.out.println("The doc name is :: "+docName);
	    	Assert.assertEquals(docName, Constants.expectedDocName, "The uploaded file names doesnot match");
	    	System.out.println("Uploaded file using Browse button is verified");
			
	    	System.out.println("TC_NA03.1#35");
			System.out.println("Test Step is verifying Copy and Paste resume::"+step++);
			WebElement pasteResumeLnk = driver.findElement(By.xpath("//a[@id='copy_p']"));
			pasteResumeLnk.click();
			WebElement textarea = driver.findElement(By.xpath("//textarea[@id='txtcv']"));
			textarea.clear();
			textarea.sendKeys("Resume");
			System.out.println("Copy and Paste resume is verified");
			
			System.out.println("TC_NA03.1#36");
			System.out.println("Test Step is verifying Mailer and privacy settings checkboxes::"+step++);
			WebElement jobAlerts = driver.findElement(By.xpath("//div[@class='fleft cls w260']/div[contains(.,'Job Alerts')]"));
			boolean isJobAlertsDisplayed = jobAlerts.isDisplayed();
			Assert.assertTrue(isJobAlertsDisplayed, "JobAlerts checkbox is not displayed");
			WebElement ffEmails = driver.findElement(By.xpath("//div[@class='fleft cls w260']/div[contains(.,'Naukri FastForward E-Mails')]"));
			boolean isFFEmailsDisplayed = ffEmails.isDisplayed();
			Assert.assertTrue(isFFEmailsDisplayed, "FF Email checkbox is not displayed");		
			WebElement ffSMS = driver.findElement(By.xpath("//div[@class='fleft cls w260']/div[contains(.,'Naukri FastForward Calls/SMS ')]"));
			boolean isFFSMSDisplayed = ffSMS.isDisplayed();
			Assert.assertTrue(isFFSMSDisplayed, "FF SMS checkbox is not displayed");		
			WebElement notifications = driver.findElement(By.xpath("//div[@class='fright w265']/div[contains(.,'Important Notifications from Naukri.com ')]"));
			boolean isNotificationsDisplayed = notifications.isDisplayed();
			Assert.assertTrue(isNotificationsDisplayed, "Notifications checkbox is not displayed");
			WebElement  communication = driver.findElement(By.xpath("//div[@class='fright w265']/div[contains(.,'Communication from Clients(Voice/Calls/SMS')]"));
			boolean isCommunicationDisplayed = communication.isDisplayed();
			Assert.assertTrue(isCommunicationDisplayed, "Communication checkbox is not displayed");
			WebElement promo = driver.findElement(By.xpath("//div[@class='fright w265']/div[contains(.,'Other Promotions/ Special Offers')]"));
			boolean isPromoDisplayed = promo.isDisplayed();
			Assert.assertTrue(isPromoDisplayed, "Promo checkbox is not displayed");
			System.out.println("Mailer and privacy settings checkboxes are verified");
			
			System.out.println("TC_NA03.1#37");
			System.out.println("Test Step is verifying Error displayed for I Agree checkbox::"+step++);
			WebElement iAgreeChkBox = driver.findElement(By.xpath("//input[@id='agreetnc']"));
			boolean isSelectedIAgree = iAgreeChkBox.isSelected();
			if(isSelectedIAgree){
			iAgreeChkBox.click();
			}
			joinNaukriButton.click();
			Thread.sleep(1000);
			WebElement iAgreeError = driver.findElement(By.xpath("//span[(@id='error_agreetnc') and contains(.,'Please agree to the terms and conditions to continue.')]"));
			boolean isIAgreeErrorDisplayed = iAgreeError.isDisplayed();
			Assert.assertTrue(isIAgreeErrorDisplayed, "Error message is not displayed when I Agree checkbox is not selected");
			System.out.println("Error displayed for nonselection of I Agree checkbox is verified");
			iAgreeChkBox.click();
			
			curLocationDropdown.click();
			Thread.sleep(500);
			WebElement blore = driver.findElement(By.xpath("//div[@id='cityValContainer']/ul[1]/li[3]"));
			blore.click();
			
			System.out.println("TC_NA03.1#38");
			System.out.println("Test Step is verifying Submission of the Registration details::"+step++);
			joinNaukriButton.click();
			Thread.sleep(3000);
			Assert.assertEquals(driver.getTitle().trim(), Constants.expectedResumeMgrTitle, "Job seeker doesnot navigate to the expected page after submissio of Registration details");
			System.out.println("Submission of the Registration details is verified");
			
		}
		
		/**
		 *@author Senthil
		 * 
		 */
		@AfterTest
		public void exit(){	
			//super.close();
			//close();
			
		}

	}


}
