package com.nk.constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nk.util.NkCommon;

public class Constants extends NkCommon {
	public static String naukriHomePageURL = "http://www.naukri.com";
	public static String naukriHomePageTitle = "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
	public static String registrationPageTitle = "Register on Naukri.com and Apply to Millions of Jobs Online. Free Registration. Submit Your Resume Now.";
    public static String registrationPageMessage ="Become a Member of Naukri.com and find the right job. Create your Profile now, Free!";
    public static String expectedResumeMgrTitle = "Resume Manager - Post Resume Online - Submit your CV - Naukri.com";
    public static String registeredEmail = "balu.kumar@gmail.com";
    public static String registeredPassword = "balu007";
    public static String registeredUserName = "balakumaran";
    public static String validEmail = "chandana1.kumars@gmail.com";
    public static String passwordEntered = "chandanas1007";
    public static String username = "chandan";
    public static String mobileNumber = "9913594965";
    public static String designation = "Senior Software Engineer";
    public static String education = "B.Tech/B.E.";
    public static String path = "C:\\Users\\Admin\\Desktop\\resume.docx";
    public static String expectedDocName = "resume.docx";
    public static String expectedEmailError = "Please specify your email ID.";
    public static String expectedPasswordError = "Password chosen must be minimum 6 characters long.";
    public static String expectedconfirmPasswordError = "Your passwords entries do not match.";
    public static String expectedSelectLocError = "Please select your current location.";
    public static String expectedMobileNumberError = "Please specify your mobile number.";
    public static String expectedBasicEducationError = "Please select your basic course.";
    public static String expectedExperienceError = "Please select your total experience.";
    public static WebElement loginIcon = driver.findElement(By.xpath("//a[@id='login_Layer']"));
    public static WebElement loginLightBox = driver.findElement(By.id("loginLB"));
    public static WebElement emailIcon = driver.findElement(By.xpath("//a[@id='eSel']"));
    public static WebElement userNameIcon = driver.findElement(By.xpath("//a[@id='uSel']"));
    public static WebElement emailfield = driver.findElement(By.id("eLogin"));
    public static WebElement passwdField = driver.findElement(By.id("pLogin"));
    public static WebElement forgotPwdLnk = driver.findElement(By.xpath("//a[contains(.,'Forgot Password?')]"));
    public static WebElement loginButton = driver.findElement(By.xpath("//button[@value='Login']"));
    public static WebElement notMemberTxt = driver.findElement(By.xpath("//div[@class='ltCntnt']//div[(contains(.,'Not a member as yet?')) and contains(.,'Register Now')]"));
    public static WebElement registerNowLink = driver.findElement(By.xpath("//div[@class='row txtC']/a[contains(.,'Register Now')]"));
    public static WebElement disclaimer = driver.findElement(By.xpath("//div[@class='dClmr txtC']"));
    public static WebElement closeLightBox = driver.findElement(By.xpath("//a[@id='closeLB']"));
    public static String expectedMyNaukriPageTitle = "Mynaukri";
    public static WebElement registerLink = driver.findElement(By.xpath("//div[@class='row txtC']/a[contains(.,'Register Now')]"));
    public static WebElement curRegMsg = driver.findElement(By.tagName("h1"));
    
    
    
    
    
    /*public static String naukriHomePageURL = "http://www.naukri.com";
	public static WebElement loginIcon = driver.findElement(By.xpath("//a[@id='login_Layer']"));
	public static WebElement loginLightBox = driver.findElement(By.id("loginLB"));
	public static WebElement emailIcon = driver.findElement(By.xpath("//a[@id='eSel']"));
	public static WebElement userNameIcon = driver.findElement(By.xpath("//a[@id='uSel']"));
	public static WebElement emailfield = driver.findElement(By.id("eLogin"));
	public static WebElement passwdField = driver.findElement(By.id("pLogin"));
	public static WebElement forgotPwdLnk = driver.findElement(By.xpath("//a[contains(.,'Forgot Password?')]"));
	public static WebElement loginButton = driver.findElement(By.xpath("//button[@value='Login']"));
	public static WebElement notMemberTxt = driver.findElement(By.xpath("//div[@class='ltCntnt']//div[(contains(.,'Not a member as yet?')) and contains(.,'Register Now')]"));
	public static WebElement registerNowLink = driver.findElement(By.xpath("//div[@class='row txtC']/a[contains(.,'Register Now')]"));
	public static WebElement disclaimer = driver.findElement(By.xpath("//div[@class='dClmr txtC']"));
    public static WebElement closeLightBox = driver.findElement(By.xpath("//a[@id='closeLB']"));
    public static String expectedMyNaukriPageTitle = "Mynaukri";*/
	
	
    
    
   /* public static String emailForLogin = "sofi.lokeshwari@gmail.com";
    public static String userNameForLogin="lokeshwari";
    public static String passwordForLogin = "sofi123";
    public static WebElement myNaukriIcon = driver.findElement(By.xpath("//li[contains(.,'My Naukri')]/a"));
   public static WebElement logoutLink = driver.findElement(By.xpath("//a[@class='logout']"));
    public static WebElement logoutSuccessMessage = driver.findElement(By.xpath("//span[contains(.,'You have successfully Logged out of naukri.com ')]"));
    public static WebElement loginAgainLink = driver.findElement(By.xpath("//a[contains(.,'Login Again')]"));
    public static WebElement userLoginfield = driver.findElement(By.id("uLogin"));
     public static WebElement jobsIcon = driver.findElement(By.xpath("//a[@title='Search Jobs']"));
    public static WebElement recruitersIcon = driver.findElement(By.xpath("//a[@title='Search Recruiters']"));
    public static WebElement companiesIcon = driver.findElement(By.xpath("//a[@title='Jobs Posted By Top Companies']"));
    public static WebElement servicesIcon = driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']"));
    public static WebElement moreIcon = driver.findElement(By.xpath("//a[contains(.,'More')]"));
    public static WebElement notifications = driver.findElement(By.xpath("//a[contains(.,'Notifications')]"));
    public static WebElement notificationsTooltip = driver.findElement(By.xpath("//a[contains(.,'new jobs for you')]"));
      public static WebElement editProfileLink = driver.findElement(By.xpath("//a[@title='Edit Profile']"));
    public static WebElement profilePerformance = driver.findElement(By.xpath("//a[@title='Who Viewed My Profile']"));
    public static WebElement blockedCompanies = driver.findElement(By.xpath("//a[@title='Blocked Companies']"));
    public static WebElement changePassword = driver.findElement(By.xpath("//a[@title='Change Password']"));
    */
    
}

