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

import com.nk.util.NkCommon;

public class JobSeekerHomeSearchPageTest extends NkCommon
{
	public static final String lnkxpathemployerzone="//ul/li/a[@title='Employer Login']";
	public static final String lnkxpathbuyonline="//li/a[@title='Buy Online- RESDEX and Vacancy Listings']/div";
	public static final String headerxpathemployerlogin="//div/div[@class='alignCenter']/div/h1";
	public static final String submenuxpathbuyonline="//ul/li[1]/a[@title='Buy Online- RESDEX and Vacancy Listings']";
	
	public static final String lblidcartempty="cartCont";
	public static final String lnkxpathpostaninstantjob="//ul/li[2]/a[@title='Post an Insta Job']";
	public static final String headxpathinstajobposting="//h1";
	
	public static final String lnkxpathalljobs="//ul/li[1]/a[@title='All Jobs']";
	public static final String lnkxpathIITIIMjobs="//ul/li[2]/a[@title='IIT/IIM Jobs']";
	public static final String lnkxpathgovtjobs="//ul/li[3]/a[@title='Govt. Jobs']";
	public static final String lnkxpathinternationalgobs="//ul/li[4]/a[@title='International Jobs']";
	
	public static final String txtxpathskills="//div[@id='skill']/div/div[2]/input[@class='sugInp']";
	public static final String txtxpathlocation="//div/div[2]/input[@class='sugInp w135']";
	public static final String txtxpathExperiance="//div[@id='exp_dd']/div/input[@class='sdTxt w85']";
	public static final String txtxpathsalary="//div[@id='salary_dd']/div/input[@class='sdTxt w85']";
	public static final String btnidsearch="qsbFormBtn";
	public static final String partlinkadvancedsearch="Advanced Search";
	
	
	public static final String txtidEmailtoRegister= "emailId";
	public static final String txtpasswordcreatepassword="pwd";
	public static final String headexpathiagreeterma="//form[@id='formpZero']/div[3]";
	public static final String lnkxpathtermsandconditions="//form[@id='formpZero']/div[3]/a";
	public static final String headxpathjobseekerwindow="//div/div/b[text()='Job Seekers']";
	public static final String btnidsubmityourCV="p0submit";
	public static final String headerxpathemailidalreadyregistered="//div[@id='loginLB']/div/div";
	public static final String headeidemailcloseimage="closeLB";
	
	
	public static final String lnkxpathbrowsejobs="//div/h1";
	public static final String lnkbrowsetextalljobs="All Jobs";
	public static final String lnkbrowsejobsbycomplany="Jobs by Company";
	public static final String lnkbrowsejobsbycategory="Jobs by Category";
	public static final String lnkbrowsejobsbylocation="Jobs by Location";
	public static final String lnkbrowsejobsbydesignation="Jobs by Designation";
	public static final String lnkbrowsejobsbySkill="Jobs by Skill";
	
	
	public static final String headerxpathgetbetterjobparagraph= "//div[@class='center_large_title']";
	public static final String btnidcreatejobalert="cjaMain";
	public static final String headerxpathTelluswhatkindofjob="//div/div/div[contains(text(),'Tell us what kind of jobs you want')]";
	public static final String lnkxpathclosetelluswhat="//div/div/a";
	
	public static final String lblxpathbestplacetowork="//div[@class='hpms fl']/h3[1]";
	public static final String lblxpathallsectors="//div[@id='tabs_job']/ul/li[text()='All Sectors']";
	public static final String lblxpathinformationTechnology="//div[@id='tabs_job']/ul/li[text()='Information Technology']";
	public static final String lblxpathinformtechtext="//div[@id='tabP-2']/ul/li[text()='Information Technology']";
	public static final String lblxpathmanufraturing="//div[@id='tabs_job']/ul/li[text()='Manufacturing']";
	public static final String lblxpathmanufratext="//div[@id='tabP-3']/ul/li[text()='Manufacturing']";
	public static final String lblxpathservice="//div[@id='tabs_job']/ul/li[text()='Services']";
	public static final String lblxpathservicetext="//div[@id='tabP-4']/ul/li[text()='Services']";
	
	
	public static final String gal_headxpathjobgallary="//div[@class='hpms fl']//h3[2]";
	public static final String gal_lnkxpathAllsectors="//div[@id='tabs_places']/ul/li[1][contains(text(),'All Sectors')]";
	public static final String gal_lnkxpathinformationTechnology= "//div[@id='tabs_places']/ul/li[2]";
	public static final String gal_HeadXpathInformationTechnology="//div[@id='tabJ-2']/ul[1]/li[1]";
	public static final String gal_lnkxpathManufractureing="//div[@id='tabs_places']/ul/li[3]";
	public static final String gal_HeadxpathManufractureing="//div[@id='tabJ-3']/ul[1]/li[1]";
	public static final String gal_lnkxpathServices="//div[@id='tabs_places']/ul/li[4]";
	public static final String gal_Headxpathservices="//div[@id='tabJ-4']/ul[1]/li[1]";
	
	public static final String ff_logo_xpath_Services="//div/ul/li[4]/a[@title='Naukri FastForward- Resume Services']";
	
	public static final String walk_para_xpath_paragraph="//div/div[3]/h3";
	public static final String walk_btnxpathwalkinjobs="//div/div[3]/a/button";
	
	
	public static final String fast_logo_xpath_fastfarward="//div/a/h3";
	public static final String fast1_text_immressiveresume="//h2[@id='forTop']";
	public static final String fast_lnk_xpath_knowyourresumescore ="//div/ul/li/a[text()='Know your resume score']";
	public static final String fast_paragraph_xpath_getyour="//div/ul[@class='p0L10']/li[1]/p[contains(text(),'Get your FREE')]";
	public static final String fast_link_xpath_resumeFeedBackReport="//div/ul[@class='p0L10']/li[1]/p[contains(text(),'Get your FREE')]/a";
	public static final String fast1_lnk_xpath_resumefeedback="//div/h3";
	public static final String fast_lnk_xpath_notgettingenough="//ul/li[2]/a[@title='Not getting enough profile views?']";
	public static final String fast1_text_xpath_Resumedisplay="//div[@id='forTop']/div/div/h2[text()='Why Resume Display']";
	public static final String fast_paragraph_xpath_get34 ="//div/div[2]/ul[@class='p0L10']/li[2]/p";
	public static final String fast_text_xpath_toolfree="//div[contains(text(),'(Toll-Free)')]";
	
	public static final String CN_xpath_Careerlogo="//div/h3[1][@class='cnLogo']";
	public static final String CN_Para_xpath_Salarytrends="//div/h3[2][@class='noBorder_center_large_title']";
	public static final String CN_BTn_xpath_ViewSalary="//div/a[@title='View Salaries']/button";
	public static final String CN1_lbl_xpath_TopIndustry="//div[@id='topIndTemp']/h2/strong";
	public static final String CN_Para_xpath_ViewRecruiters="//div[@class='viewRecruiter wgtCont']/p";
	public static final String CN_Btn_xpath_viewRecruiters="//div/a[@title='View Recruiters']/button";
	public static final String CN1_lbl_xpath_Recrutdomine="//div/h1[text()='Search, Follow and Connect with top recruiters in your domain']";
	
	
	public static final String Rec_lbl_xpath_ServiceForRecruiter="//div/h3[text()='Services for Recruiters']";
	public static final String Rec_lnk_xpath_NaukriCalls="//div/ul/li[1]/a[text()='Naukri Calls']";
	public static final String Rec1_para_xpath_Specialoffers="//div[text()='Special Offers - RESDEX and Vacancy Listings']";
	public static final String Rec_para_xpath_FastestRecru="//div/ul/li[1]/p[text()='Fastest Recruiter Vehicle']";
	public static final String Rec_lnk_xpath_SearchCV="//div/ul/li[2]/a[text()='Search CVs for Free now']";
	public static final String Rec1_head_xpath_Basicdetails="//div/h4[text()='Basic Details']";
	//Resdex
	public static final String Rec_para_xpath_FindRightCandidate="//div/ul/li[2]/p[text()='Find the right candidate']";
	public static final String Rec_lnk_xpath_HRZone="//div/ul/li[3]/a[text()='HR Zone']";
	//India - Jobs, Careers, Recruitment, Employment, Hiring, Recruiting, portal for Indian Talent
	public static final String Rec_para_xpath_getUpdatedonthLatest="//div/ul/li[3]/p[text()='Get updated on the latest HR news']";
	public static final String Rec_lnk_xpath_CampusHiring="//div/ul/li[4]/a[text()='Campus Hiring Solutions']";
	//Firstnaukri.com
	public static final String Rec_para_xpth_optimizeyourFreshersHiring="//div/ul/li[4]/p[text()='Optimize your Fresher Hiring']";
	
	public static final String job_lnk_xpath_jobSpeak="//div/h3[text()='Naukri JobSpeak']";
	public static final String job_para_xpath_monthly="//div/p[contains(text(),'A monthly Job Index that provides insight')]";
	public static final String job_lnk_xpath_viewLatestaddition="//div/a[@title='Naukri JobSpeak']";
	public static final String job1_header_xpath_subscribe="//div/strong";
	
	
		public static final String jobbyloc_byloc_xpath_Locationlist=" //div[8]/ul/li/a[@target='_blank']";
			public static final String jobbyloc_lnk_xpath_delhi="//div[8]/ul/li/a[text()='Jobs in Delhi']";
			public static final String jobbyloc_lnk_xpath_Mumbai="//div[8]/ul/li[2]/a[text()='Jobs in Mumbai']";
			public static final String jobbbtext="//div/div/input[@value='delhi']";
	
			
			public static final String Err_Id_ErrorMessage= "qsbError";
			public static final String Img_xpath_Blurimgclose="//div/span[@class='close']";
			
			public static final String Job_cat_head_xpath_jobsbyLoacation="//div/h5";
			public static final String job_cat_lnks_XpathList="//div/div[9]/ul/li/a";
	
			public static final String Foot_lbl_xpath_information="//div[1][@class='column ']/ul/li[@class='header']/a";
			public static final String Foot_lnk_xpath_informationList="//div/div[@class='wrap']/div[1]/ul[1]/li/a[@title[contains(text(),*)]]";
	
			
			public static final String Foot_lbl_xpath_jobseeker="//div/div[@class='wrap']/div[2]/ul[1]/li[1][@class='header']/a";
			public static final String Foot_lnk_xpath_JobseekerList="//div/div[@class='wrap']/div[2]/ul[1]/li[position()<=8]/a[@title[contains(text(),*)]]";
			
			public static final String Foot_lnk_xpath_BrowseJobslist="//div/div[@class='wrap']/div[3]/ul[1]/li/a[@title[contains(text(),*)]]";
			public static final String Foot_lbl_xpath_Browsejobs="//div/div[@class='wrap']/div[3]/ul[1]/li[@class='header']/a";
			
			public static final String Foot_lbl_xpath_Employers="//div/div[@class='wrap']/div[4]/div/ul[1]/li[@class='header']/a";
			public static final String Foot_lnk_xpath_Employeelisst="//div/div[@class='wrap']/div[4]/div/ul[1]/li/a[@title[contains(text(),*)]]";
			public static final String Foot_lbl_xpath_Employer_FromUSA="//div/div[@class='wrap']/div[4]/div/ul[1]/li[7]/a";
			public static final String Foot_lbl_xpath_Employer_TollFree="//div/div[@class='wrap']/div[4]/div/ul[1]/li[8]/a";
			
			public static final String Foot_lnk_xpath_followus="//div[@class='fl column last-child']/div[2]/a[@title[contains(text(),*)]]";
			public static final String Foot_lbl_xpth_followus="//div[@class='fl column last-child']/div[2]/a[text()='Follow Us']";
			
			public static final String Partner_lbl_xpath="//div[@class='footer carousel']/div/span";
			public static final String Partner_backarrow_xpath="//div[@class='footer carousel']/div/div/span[1]";
			public static final String Partner_Forwardarrow_xpath="//div[@class='footer carousel']/div/div/span[2]";
			public static final String Partner_lnks_xpath="//div/div[@class='wrap']/div//div[@class='windows']/ul/li/a";
			
			public static final String Foot_lbl_xpath_FastFarward="//div/div[@class='wrap']/div[2]/ul[1]/li[9][@class='header']/a";
			public static final String Foot_lnk_xpath_FastFarward="//div/div[@class='wrap']/div[2]/ul[1]/li[position()>9]/a[@title[contains(text(),*)]]";
			
			public static final String Top_lbl_xpath_Employers="//div/h2[2]";
			public static final String Top_lnks_xpath_Employers="//table/tbody/tr/td/a";
			
			public static final String Header_links_xpath="//div[@class='headGNB cloneCont wrap']//ul[1]/li/a/div";
			
		
			public static final String Head_recruiters_xpath_sublinks="//ul[@class='midSec menu']/li[2]/div/ul[1]/li/a";
			public static final String Head_recruiters_xpath_Head_link="//ul[@class='midSec menu']/li[2]/a/div";
			public static final String Head_recruiters_xpath_browseallLinks="//ul[@class='midSec menu']/li[2]/div/ul[1]/li[1]/a";
			public static final String Head_recruiters_xpath_GotoNaukrilinks="//ul[@class='midSec menu']/li[2]/div/ul[1]/li[2]/a";
			
			public static final String menu_head_xpath_jobs="//a/div[text()='Jobs']";
			public static final String menu_links_xpath_jobs="//div[@class='subMenu c2']/ul[1]/li[1]/a";
			public static final String menu_links_xpath_location="//div[@class='subMenu c2']/ul[1]/li[2]/a";
			public static final String menu_links_xpath_Skills="//div[@class='subMenu c2']/ul[1]/li[3]/a";
			public static final String menu_links_xpath_Designation="//div[@class='subMenu c2']/ul[1]/li[4]/a";
			
			public static final String menu_links_xpath_Company="//div[@class='subMenu c2']/ul[2]/li[1]/a";
			public static final String menu_links_xpath_Category="//div[@class='subMenu c2']/ul[2]/li[2]/a";
			public static final String menu_links_xpath_AdvanceSearch="//div[@class='subMenu c2']/ul[2]/li[3]/a";
			public static final String menu_links_xpath_PostyourResume="//div[@class='subMenu c2']/ul[2]/li[4]/a";
			
			public static final String menu_head_xpath_Services="//ul/li[4]/a/div";
			public static final String menu_subHead_services_xpath_ResumeWriting="//li[4]/div/ul[1]/li[1]/a";
			public static final String menu_services_xpath_TextResume="//li[4]/div/ul[1]/li[2]/a";
			public static final String menu_services_xpath_visualResume="//li[4]/div/ul[1]/li[3]/a";
			public static final String menu_services_xpath_ResumeQuality="//li[4]/div/ul[1]/li[4]/a";
			public static final String menu_services_xpath_ResumeSamples="//li[4]/div/ul[1]/li[5]/a";
			public static final String menu_subHead_xpath_Jobsforyou="//li[4]/div/ul[1]/li[6]/a";
			public static final String menu_services_xpath_jobs4you="//li[4]/div/ul[1]/li[7]/a";
			public static final String menu_subHead_xpath_elearning="//li[4]/div/ul[2]/li[1]/a";
			public static final String menu_services_xpath_Ecourse="//li[4]/div/ul[2]/li[2]/a";
			public static final String menu_services_xpath_Certifications="//li[4]/div/ul[2]/li[3]/a";
			public static final String menu_subHead_xpath_RecruiterSearch="//li[4]/div/ul[2]/li[4]/a";
			public static final String menu_services_xpath_ResumeDisplay="//li[4]/div/ul[2]/li[5]/a";
			public static final String menu_services_xpath_RecruiterConnection="//li[4]/div/ul[2]/li[6]/a";
			public static final String menu_services_xapth_PriorityApplicant="//li[4]/div/ul[2]/li[7]/a";
			public static final String menu_subHead_xpath_Other="//li[4]/div/ul[3]/li[1]/a";
			public static final String menu_services_xpath_HelpFaq="//li[4]/div/ul[3]/li[2]/a";
			public static final String menu_services_xpath_CareerAdvise="//li[4]/div/ul[3]/li[3]/a";
			public static final String menu_services_xpath_ContactUs="//li[4]/div/ul[3]/li[4]/a";
			
			public static final String menu_head_xpath_More="//ul/li[5]/a/div";
			public static final String menu_subhead_More_xpath_MangAndBusiness="//li[5]/div/ul[1]/li[1]/a";
			public static final String menu_More_xpath_MBA="//li[5]/div/ul[1]/li[2]/a";
			public static final String menu_More_xpath_DistanceMBA="//li[5]/div/ul[1]/li[3]/a";
			public static final String menu_More_xpath_PartMBA="//li[5]/div/ul[1]/li[4]/a";
			public static final String menu_subhead_more_xpath_InformationTechnology="//li[5]/div/ul[1]/li[5]/a";
			public static final String menu_More_xpath_MCA="//li[5]/div/ul[1]/li[6]/a";
			public static final String menu_More_xpath_DistanceMCA="//li[5]/div/ul[2]/li[1]/a";
			public static final String menu_More_xpath_SoftwareCources="//li[5]/div/ul[2]/li[2]/a";
			public static final String menu_More_xpath_HardwareCourse="//li[5]/div/ul[2]/li[3]/a";
			public static final String menu_subhead_more_xpath_AnimationMultimedia="//li[5]/div/ul[2]/li[4]/a";
			public static final String menu_More_xpath_Animation="//li[5]/div/ul[2]/li[5]/a";
			public static final String menu_More_xpath_GraphicDesign="//li[5]/div/ul[2]/li[6]/a";
			public static final String menu_More_xpath_WebDesigning="//li[5]/div/ul[2]/li[7]/a";
			public static final String menu_subHead_xpath_Studyabroad="//li[5]/div/ul[3]/li[1]/a";
			public static final String menu_More_xpath_StudyMBA="//li[5]/div/ul[3]/li[2]/a";
			public static final String menu_More_xpath_StudyMS="//li[5]/div/ul[3]/li[3]/a";
			public static final String menu_More_xpath_StudyBEBtech="//li[5]/div/ul[3]/li[4]/a";
			public static final String menu_subHead_xpath_More_More="//li[5]/div/ul[3]/li[5]/a";
			public static final String menu_More_xpath_PayCheck="//li[5]/div/ul[4]/li[2]/a";
			public static final String menu_more_xpath_NaukrionMobile="//li[5]/div/ul[4]/li[3]/a";
			public static final String menu_More_xpath_Blog="//li[5]/div/ul[4]/li[4]/a";
			
			
			
		
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
	// 1 to 5 is Header Links
	@Test
	public void hpHeaderrightside() throws Exception
	{
		try 
		{
			//Parent Window
			String Parentwindow= driver.getWindowHandle();
			
			//Intialization for Employrerlogin
			WebElement employerzone= driver.findElement(By.xpath(lnkxpathemployerzone));
			//Checks Employerlogin links is displayed
			isDisplayed=employerzone.isDisplayed();
			Assert.assertTrue(isDisplayed, "EmployerZone Element is Missing");
			
			//click on on employerlogin link
			employerzone.click();
			Thread.sleep(4000);
			
			//foreach for all windows
			for (String employerzonechild : driver.getWindowHandles()) 
			{
				//driver or control will shift to child windows
				driver.switchTo().window(employerzonechild);
			}
			
			//employer login screen displayed and checking the Header of the screen
			WebElement emplorerlogin= driver.findElement(By.xpath(headerxpathemployerlogin));
			Thread.sleep(4000);
			Expected_Result=emplorerlogin.getText();
			System.out.println(Expected_Result);
			//Closing Child window
			driver.close();
			
			//driver or control will switch to parent window
			driver.switchTo().window(Parentwindow);
			
			WebElement mainBuyOnlineHead= driver.findElement(By.xpath(lnkxpathbuyonline));
			
			parentMenuAction(mainBuyOnlineHead);
		
			Thread.sleep(5000);
			//submenu intialzation
			WebElement subbuyonline= driver.findElement(By.xpath(submenuxpathbuyonline));
			subbuyonline.click();
			
			
			for (String buyonlinesubmenu : driver.getWindowHandles())
			{
			driver.switchTo().window(buyonlinesubmenu);	
			}
			Expected_Result="Your cart is empty";
			WebElement cart= driver.findElement(By.id(lblidcartempty));
			Actual_Result=cart.getText().trim();
			System.out.println(Actual_Result);
			Assert.assertEquals(Actual_Result, Expected_Result,"Cart object is missing");
			driver.close();
			driver.switchTo().window(Parentwindow);
					
			parentMenuAction(mainBuyOnlineHead);
			Thread.sleep(5000);
			WebElement submenuinsta= driver.findElement(By.xpath(lnkxpathpostaninstantjob));
			submenuinsta.click();
			Thread.sleep(3000);
			
	for (String submenuinstajob : driver.getWindowHandles())
			{
				driver.switchTo().window(submenuinstajob);
				
			}
			
	WebElement headinginsta= driver.findElement(By.xpath(headxpathinstajobposting));
	Expected_Result="Insta Job Posting";
	Actual_Result=headinginsta.getText().trim();
	System.out.println(Actual_Result);
	Assert.assertEquals(Actual_Result, Expected_Result,"Insta Job Text is Not Matching");
	driver.close();
	driver.switchTo().window(Parentwindow);
	System.out.println("Comaplted");	
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception("hpHeaderright side test cases failed  " + e.getLocalizedMessage());
		}
		
		
	}
	//Recruiters Menu
	@Test  (priority=-1)
	public void recuitersMenu() throws Exception
	{
		try 
		{
			
			
			WebElement RecruiterMain= driver.findElement(By.xpath(Head_recruiters_xpath_Head_link));
			parentMenuAction(RecruiterMain);
		
			
			Parent_window= driver.getWindowHandle();
			//List<WebElement> submenulist= driver.findElements(By.xpath(Head_recruiters_xpath_sublinks));
			
			WebElement recsubmenubrowse= driver.findElement(By.xpath(Head_recruiters_xpath_browseallLinks));
			recsubmenubrowse.click();
			Thread.sleep(3000);
						
				for (String recruiterchild1 : driver.getWindowHandles()) 
				{
					driver.switchTo().window(recruiterchild1);
					
				}
				
				Actual_Result=driver.getTitle();
				System.out.println(Actual_Result);
				Expected_Result="Browse Recruiters by Locations, Companies, FA & Industries - Naukri.com";
				Assert.assertEquals(Actual_Result, Expected_Result, "Browse links Titles are not Matching");
				
				driver.close();
				driver.switchTo().window(Parent_window);
						
				
				parentMenuAction(RecruiterMain);
								
				WebElement recgotonaukri=driver.findElement(By.xpath(Head_recruiters_xpath_GotoNaukrilinks));
				recgotonaukri.click();
				
								
				for (String ChildGotoNaukri : driver.getWindowHandles())
				{
					driver.switchTo().window(ChildGotoNaukri);
				}
				Thread.sleep(4000);
			Actual_Result=driver.getTitle();
			Expected_Result="NaukriRecruiter helps you hire better | Create your profile";
			Assert.assertEquals(Actual_Result, Expected_Result, "Go to Naukri Title is not Matching");
			
			driver.close();
			driver.switchTo().window(Parent_window);
			
		} catch (Exception e) 
		{
			throw new Exception("RecuitersMenu Test Case Failed " +e.getLocalizedMessage());
		}
		
	}

	//Header List Items and Recruiter Sub Menu Links
	@Test
	public void headerListItemsAndRecruiters() throws Exception
	{
		try {
			
			ArrayList<String> headermanual=new ArrayList<>();
			headermanual.add("Jobs");
			headermanual.add("Recruiters");
			headermanual.add("Companies");
			headermanual.add("Services");
			headermanual.add("More");
			headermanual.add("Login");
			
			List<WebElement> headerlist= driver.findElements(By.xpath(Header_links_xpath));
			
			for (int i = 0; i < headerlist.size(); i++) 
			{
				Actual_Result= headerlist.get(i).getText().trim();
				
				Expected_Result=headermanual.get(i).toString();
				
				Assert.assertEquals(Actual_Result, Expected_Result, "Header links are not Matching");
				}
			
			
			
		} catch (Exception e) 
		{
			throw new Exception("headerlistname test case Failed "  +e.getLocalizedMessage());
		}
		
	}
	
	//Jobs Menu Items Click
@Test (priority=1)

public void jobsMenu() throws Exception
{
	try 
	{
		Parent_window= driver.getWindowHandle();
		
		WebElement  jobsHead= driver.findElement(By.xpath(menu_head_xpath_jobs));
		isDisplayed=jobsHead.isDisplayed();
		Assert.assertTrue(isDisplayed, "jobsHead Head Menu is Missing");
		Thread.sleep(3000);
		
		//Browse all Jobs Link
		parentMenuAction(jobsHead);
		
		WebElement browsealljobslink= driver.findElement(By.xpath(menu_links_xpath_jobs));
		browsealljobslink.click();
	
		
		for (String ChildBrowseallJObs : driver.getWindowHandles())
		{
			driver.switchTo().window(ChildBrowseallJObs);
			
		}
		Expected_Result="Browse Jobs by Company, Location, Skills, Designation & Industry - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Browse Jobs Menu links Title is Not matching");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		
		//Jobs By Location Link
		parentMenuAction(jobsHead);
		
		WebElement jobsByLocation=driver.findElement(By.xpath(menu_links_xpath_location));
		jobsByLocation.click();
		Thread.sleep(3000);
			
		for (String ChildjobsLocation : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildjobsLocation);
		}
		Expected_Result="Browse Jobs by Location - Search Jobs in State/City/International Locations - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Jobs By Location Link is Missing links Title is Not matching");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//Browse JobsBySkills Link
		parentMenuAction(jobsHead);
		
		WebElement jobsBySkillsLink= driver.findElement(By.xpath(menu_links_xpath_Skills));
		jobsBySkillsLink.click();
		Thread.sleep(3000);
		
		
		for (String ChildjobsBySkil : driver.getWindowHandles())
		{
			driver.switchTo().window(ChildjobsBySkil);
			
		}
		Expected_Result="Browse Jobs by IT/Non-IT Skills - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Jobs By Skills Menu links Title is Not matching");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		
		//Jobs By Designation Link
		parentMenuAction(jobsHead);
		
		WebElement jobsByDesignation=driver.findElement(By.xpath(menu_links_xpath_Designation));
		jobsByDesignation.click();
		Thread.sleep(3000);
		
		
		
		for (String Childjobbydesignation : driver.getWindowHandles()) 
		{
			driver.switchTo().window(Childjobbydesignation);
		}
		Expected_Result="Browse Jobs by Designation- Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Designation Link is Missing links Title is Not matching");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//Browse JobsByComapny Link
		parentMenuAction(jobsHead);
		
		WebElement JobsByComapnyLink= driver.findElement(By.xpath(menu_links_xpath_Company));
		JobsByComapnyLink.click();
		Thread.sleep(3000);
					
		for (String ChildjobsByComapny : driver.getWindowHandles())
		{
			driver.switchTo().window(ChildjobsByComapny);
			
		}
		Expected_Result="Browse Jobs by Company - Jobs in Top Companies - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Browse Menu links Title is Not matching");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		
		//Jobs By Category Link
		parentMenuAction(jobsHead);
		
		WebElement jobsByCategoryLink=driver.findElement(By.xpath(menu_links_xpath_Category));
		jobsByCategoryLink.click();
		Thread.sleep(3000);
		
				
		for (String ChildjobsbyCategory : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildjobsbyCategory);
		}
		Expected_Result="Browse Jobs by Functional Area/Industry - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Goto Naukri Link is Missing links Title is Not matching");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//Browse Advanced Search Link
	/*	parentMenuAction(jobsHead);
		
		WebElement jobsByAdvanceSearch= driver.findElement(By.xpath(menu_links_xpath_AdvanceSearch));
		Actual_Result=jobsByAdvanceSearch.getText();
		System.out.println(Actual_Result);
		jobsByAdvanceSearch.click();
		Thread.sleep(3000);
		
		Expected_Result="Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result.trim(), Expected_Result, "Advance Search Title is Not matching");
		System.out.println("Manju");
				
		WebElement closeimage= driver.findElement(By.xpath("//div/a[@class='ltGlobalCls']"));
		isDisplayed=closeimage.isDisplayed();
		Assert.assertTrue(isDisplayed, "Close  Image is Missing");	
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(Parent_window);
		*/
		
		//Post your Resume
		parentMenuAction(jobsHead);
		
		WebElement jobsByPostYourResume=driver.findElement(By.xpath(menu_links_xpath_PostyourResume));
		jobsByPostYourResume.click();
		
		
		for (String Childpost : driver.getWindowHandles()) 
		{
			driver.switchTo().window(Childpost);
		}
		Expected_Result="Register on Naukri.com and Apply to Millions of Jobs Online. Free Registration. Submit Your Resume Now.";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Goto Naukri Link is Missing links Title is Not matching");
		driver.close();
		driver.switchTo().window(Parent_window);
		
	}
	/*catch (Exception e) 
	{
		throw new Exception("jobsMenu Test Case Failed " +e.getLocalizedMessage());
	}*/
	
	catch (AssertionError e) 
	{
		Assert.fail();
		driver.close();
		driver.switchTo().window(Parent_window);
		System.out.println("jobsMenu Test Case Failed " +e.getLocalizedMessage());
	
}
}

//Services SubMenu

@Test
public void servicesResumeWriting() throws Exception
{
	try 
	{
		Parent_window=driver.getWindowHandle();
		
		//
		WebElement ServicesMenu=driver.findElement(By.xpath(menu_head_xpath_Services));
		isDisplayed=ServicesMenu.isDisplayed();
		Assert.assertTrue(isDisplayed, "Services Menu object Is Missing");
		
		//Resume Writing Heading
		parentMenuAction(ServicesMenu);
		
		WebElement ResumeWritingHead= driver.findElement(By.xpath(menu_subHead_services_xpath_ResumeWriting));
		Actual_Result=ResumeWritingHead.getText();
		Expected_Result="Resume Writing";
		Assert.assertEquals(Actual_Result, Expected_Result, "Resume Writing Heading is Missing");
		
		
		// TestResume Link	
		parentMenuAction(ServicesMenu);
		
		WebElement TextResumeLink= driver.findElement(By.xpath(menu_services_xpath_TextResume));
		TextResumeLink.click();
		Thread.sleep(3000);
	
		
		for (String ChildService2 : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildService2);
		}
		
		Expected_Result="Preparing CV for Freshers - Resume for Freshers/Entry Level - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Test Resume Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
	//Visual resume
		
		parentMenuAction(ServicesMenu);
		
		WebElement VisualResumeLink= driver.findElement(By.xpath(menu_services_xpath_visualResume));
		VisualResumeLink.click();
		Thread.sleep(3000);
	
		
		for (String ChildVisualResume : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildVisualResume);
		}
		
		Expected_Result="Visual Resume Writing for Experienced Professionals - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Visual Resume Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		
		//Resume Quality
		parentMenuAction(ServicesMenu);
		
		WebElement ResumeQualityLink= driver.findElement(By.xpath(menu_services_xpath_ResumeQuality));
		ResumeQualityLink.click();
		Thread.sleep(3000);
	
		
		for (String ChildResumeQuality : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildResumeQuality);
		}
		
		Expected_Result="Online Resume Screening - Resume Quality Score - Free Resume Feedback - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Resume Quality Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//Resume Samples
		
		parentMenuAction(ServicesMenu);
		
		WebElement ResumeSamplesLink= driver.findElement(By.xpath(menu_services_xpath_ResumeSamples));
		ResumeSamplesLink.click();
		Thread.sleep(4000);

		
		for (String ChildResumesamples : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildResumesamples);
		}
		
		Expected_Result="Resume Format for Freshers - Resume Samples for Freshers - CV Format for Freshers - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Resume Samples Title is not Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
			
		
	//	JObforyou Heading
	parentMenuAction(ServicesMenu);
		
		WebElement JobsforuHead= driver.findElement(By.xpath(menu_subHead_xpath_Jobsforyou));
		Actual_Result=JobsforuHead.getText();
		Expected_Result="Jobs For You";
		Assert.assertEquals(Actual_Result, Expected_Result,"Jobs For You Heading Is Missing");
		
		
		
		//JobforYou Link
		parentMenuAction(ServicesMenu);
		
		WebElement JobsforyouLink= driver.findElement(By.xpath(menu_services_xpath_jobs4you));
		JobsforyouLink.click();
		Thread.sleep(3000);
	
		
		for (String ChildJobsforYou : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildJobsforYou);
		}
		
		Expected_Result="Job Alerts - Job Alert on Mobile - Job Alert on Email - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Jobfor you Link is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
	//ELearing Heading
		parentMenuAction(ServicesMenu);
		
		WebElement ElearningHead= driver.findElement(By.xpath(menu_subHead_xpath_elearning));
		Actual_Result=ElearningHead.getText();
		Expected_Result="e-Learning";
		Assert.assertEquals(Actual_Result, Expected_Result, "Elearing Sub Head is Missing");
		
		
		//Ecources
		
		parentMenuAction(ServicesMenu);
		
		WebElement EcourcesLink= driver.findElement(By.xpath(menu_services_xpath_Ecourse));
		EcourcesLink.click();
		Thread.sleep(3000);
	
		
		for (String Childecources : driver.getWindowHandles()) 
		{
			driver.switchTo().window(Childecources);
		}
		
		Expected_Result="Online Certificate Courses - E-Learning Courses - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Ecources Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//Certification
		
		parentMenuAction(ServicesMenu);
		
		WebElement CertificationLink= driver.findElement(By.xpath(menu_services_xpath_Certifications));
		CertificationLink.click();
		Thread.sleep(3000);

		
		for (String ChildCertification : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildCertification);
		}
		
		Expected_Result="Online Certificate Courses - E-Learning Courses - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Certification Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//RecruiterSearch Heading
		parentMenuAction(ServicesMenu);
		
		WebElement RecruiterSearch = driver.findElement(By.xpath(menu_subHead_xpath_RecruiterSearch));
		Expected_Result=RecruiterSearch.getText();
		Actual_Result="Recruiter Reach";
		Assert.assertEquals(Actual_Result, Expected_Result, "RecruiterSearch SubHead is Matching");
		
		//ResumeDisplay
		parentMenuAction(ServicesMenu);
		
		WebElement ResumeDisplayLink= driver.findElement(By.xpath(menu_services_xpath_ResumeDisplay));
		ResumeDisplayLink.click();
		Thread.sleep(3000);
	
		
		for (String ChildResumeDisplayLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildResumeDisplayLink);
		}
		
		Expected_Result="Resume Display - Resume Spotlight - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Resume Display Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//Recruiterconnection
		
		parentMenuAction(ServicesMenu);
		
		WebElement RecruiterconnectionLink= driver.findElement(By.xpath(menu_services_xpath_RecruiterConnection));
		RecruiterconnectionLink.click();
		Thread.sleep(3000);
	
		
		for (String ChildRecruiterconnectionLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildRecruiterconnectionLink);
		}
		
		Expected_Result="Search Recruiters - Contact HR Recruiter - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Recruiterconnection Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//Priority Applicant Link
		
		parentMenuAction(ServicesMenu);
		
		WebElement PriorityApplicantLink= driver.findElement(By.xpath(menu_services_xapth_PriorityApplicant));
		PriorityApplicantLink.click();
		Thread.sleep(3000);
	
		
		for (String ChildPriorityApplicantLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildPriorityApplicantLink);
		}
		
		Expected_Result="Priority Applicant - Priority Job Application - Naukri.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Priorty Applicant Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		
		//OtherSubHeading
		
		parentMenuAction(ServicesMenu);
		
		WebElement OtherSubHeading= driver.findElement(By.xpath(menu_subHead_xpath_Other));
		Actual_Result=OtherSubHeading.getText();
		Expected_Result="Other";
		Assert.assertEquals(Actual_Result, Expected_Result, "OtherSubHeading Title is Matching");
		
		//Help
		parentMenuAction(ServicesMenu);
		
		WebElement HelpLink= driver.findElement(By.xpath(menu_services_xpath_HelpFaq));
		HelpLink.click();
		Thread.sleep(3000);

		
		for (String ChildHelpLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildHelpLink);
		}
		
		Expected_Result="FAQs - Frequently Asked-Questions - Naukri FastForward Services";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Help Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//CareerAdvise
parentMenuAction(ServicesMenu);
		
		WebElement CareerAdviseLink= driver.findElement(By.xpath(menu_services_xpath_CareerAdvise));
		CareerAdviseLink.click();
		Thread.sleep(3000);
	
		
		for (String ChildCareerAdviseLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildCareerAdviseLink);
		}
		
		Expected_Result="Interview Tips – Career Guidance – How to make a Resume";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "CareerAdvise Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//Contactus
parentMenuAction(ServicesMenu);
		
		WebElement ContactusLink= driver.findElement(By.xpath(menu_services_xpath_ContactUs));
		ContactusLink.click();
		Thread.sleep(3000);
	
		
		for (String ChildContactusLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildContactusLink);
		}
		
		Expected_Result="Contact Us - Naukri FastForward Services";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "ContactusLink Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
	} catch (Exception e)
	{

throw new Exception("servicesResumeWriting Test case Failed " +e.getLocalizedMessage());
	}
	
}
//Foot Information List
@Test
public void footInformation() throws Exception
{
	try 
	{
		Parent_window=driver.getWindowHandle();
		WebElement Footinfor= driver.findElement(By.xpath(Foot_lbl_xpath_information));
		isDisplayed=Footinfor.isDisplayed();
		Assert.assertTrue(isDisplayed, "Footer Information object is Missing");
		
		ArrayList<String>FootTitle= new ArrayList<>();
		//FootTitle.add("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com");
		FootTitle.add("Info Edge (India) Limited");
		FootTitle.add("My Naukri");
		FootTitle.add("My Naukri");
		FootTitle.add("My Naukri");
		FootTitle.add("Careers in Naukri.com - Jobs in Naukri.com - Current openings in Naukri.com");
		FootTitle.add("My Naukri");
		FootTitle.add("Naukri.com - Contact Us - Employers Contact - Job Seekers Contact");
		FootTitle.add("My Naukri");
		FootTitle.add("Summons/Notices");
		FootTitle.add("Grievance");
		FootTitle.add("India - Jobs, Careers, Recruitment, Employment, Hiring, Recruiting, portal for Indian Talent");
		

		List<WebElement> Foot_informationlinks = driver.findElements(By.xpath(Foot_lnk_xpath_informationList));
		
		for (int i = 0; i < Foot_informationlinks.size(); i++) 
		{
			
			Foot_informationlinks.get(i).click();
			
			for (String Childwindow_footinformation : driver.getWindowHandles())
			{
				driver.switchTo().window(Childwindow_footinformation);
													
			}
			Actual_Result=driver.getTitle();
			Expected_Result=FootTitle.get(i).toString();
			Assert.assertEquals(Actual_Result, Expected_Result, "Foot Informations Titles are not matching");
			driver.close();
			driver.switchTo().window(Parent_window);
			
		}
		
	} 
	catch (Exception e) 
	{
		throw new Exception("footInformation Test case Failed " +e.getLocalizedMessage());
	}
}

@Test
public void footBrowsejobs() throws Exception
{
	try
	{
		Parent_window=driver.getWindowHandle();
		
		WebElement browsejobfoot= driver.findElement(By.xpath(Foot_lbl_xpath_Browsejobs));
		isDisplayed= browsejobfoot.isDisplayed();
		Assert.assertTrue(isDisplayed, "Browse Job abject is Missing");
		
		ArrayList<String>BrowseTitle= new ArrayList<>();
		//FootTitle.add("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com");
		BrowseTitle.add("Browse Jobs by Company, Location, Skills, Designation & Industry - Naukri.com");
		BrowseTitle.add("IIM Jobs - Highest Paying MBA Jobs for IIM Graduates - Naukri.com");
		BrowseTitle.add("IIT Jobs – Top Engineering Jobs for IIT Graduates - Naukri.com");
		BrowseTitle.add("Sarkari Naukri - Govt. Jobs - Central Government Jobs in India - PSU Jobs - Naukri.com");
		BrowseTitle.add("Abroad Jobs - International Jobs - Jobs in Abroad - Naukri.com");
		BrowseTitle.add("Browse Jobs by Company - Jobs in Top Companies - Naukri.com");
		BrowseTitle.add("Browse Jobs by Functional Area/Industry - Naukri.com");
		BrowseTitle.add("Browse Jobs by Designation- Naukri.com");
		BrowseTitle.add("Browse Jobs by Location - Search Jobs in State/City/International Locations - Naukri.com");
		BrowseTitle.add("Browse Jobs by IT/Non-IT Skills - Naukri.com");
		
		
		List<WebElement> browselinks= driver.findElements(By.xpath(Foot_lnk_xpath_BrowseJobslist));
		for (int i = 0; i < browselinks.size(); i++) 
		{
			
			browselinks.get(i).click();
			for (String Browsechildname : driver.getWindowHandles())
			{
				driver.switchTo().window(Browsechildname);
				Thread.sleep(2000);
			}
			
			Actual_Result=driver.getTitle();
			Expected_Result= BrowseTitle.get(i).toString();
			Assert.assertEquals(Actual_Result, Expected_Result, "Brows Sub Links Title is Not Matching");
			driver.close();
			driver.switchTo().window(Parent_window);
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		throw new Exception("footBrowsejobs test case Failed " +e.getLocalizedMessage());
	}
}


@Test
public void footEmployee() throws Exception
{
	try 
	{
		WebElement recUSA= driver.findElement(By.xpath(Foot_lbl_xpath_Employer_FromUSA));
		isDisplayed=recUSA.isDisplayed();
		Assert.assertTrue(isDisplayed, "Recruiters From USA  is Missing ");
		
		WebElement tollFreeNumber=driver.findElement(By.xpath(Foot_lbl_xpath_Employer_TollFree));
		isDisplayed=tollFreeNumber.isDisplayed();
		Assert.assertTrue(isDisplayed, "Toll Number is Missing");
		if(tollFreeNumber.getText().contains("1866-557-3340"))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
		Parent_window=driver.getWindowHandle();
		WebElement employeefoot= driver.findElement(By.xpath(Foot_lbl_xpath_Employers));
		isDisplayed=employeefoot.isDisplayed();
		
		
		ArrayList<String> EmplArrList= new ArrayList<>();
		EmplArrList.add("Job Portals - Job Recruitment - Job Posting Site - Resume Search - Post Jobs - Naukri.com");
		EmplArrList.add("Resdex Naukri.com - Job Seekers Resume Search - Resume Database - Resumes Job Seekers");
		EmplArrList.add("Naukri.com");
		EmplArrList.add("Job Vacancies Packages - Naukri Resdex - Resume database - Job Classified - Naukri.com");
		EmplArrList.add("Feedback");
		
		List<WebElement> employeeList=driver.findElements(By.xpath(Foot_lnk_xpath_Employeelisst));
		
		for (int i = 0; i < employeeList.size(); i++) 
		{				
			employeeList.get(i).click();
			
			for (String employerchildname : driver.getWindowHandles()) 
			{
				driver.switchTo().window(employerchildname);
			}
			
			Actual_Result=driver.getTitle();
			Expected_Result=EmplArrList.get(i).toString();
			Assert.assertEquals(Actual_Result, Expected_Result,"Employers Sub List Titles are Not Matching");
			driver.close();
			driver.switchTo().window(Parent_window);
				
		}
	}
	catch (Exception e)
	{
		throw new Exception(" footEmployee Test case Failed " +e.getLocalizedMessage());
	}
}
@Test
public void footFollowus() throws Exception
{
	try 
	{
		WebElement follow= driver.findElement(By.xpath(Foot_lbl_xpth_followus));
		isDisplayed=follow.isDisplayed();
		Assert.assertTrue(isDisplayed, "Follow US Label Is Missing");
		
		Parent_window=driver.getWindowHandle();
		
		ArrayList<String> FollowArrayList= new ArrayList<>();
		FollowArrayList.add("Naukri.com | Facebook");
		FollowArrayList.add("Naukri (@Naukri) | Twitter");
		FollowArrayList.add("Naukri.com | LinkedIn");
		FollowArrayList.add("Naukri.com - Google+");
		
		List<WebElement> followuslinks= driver.findElements(By.xpath(Foot_lnk_xpath_followus));
		for (int i = 0; i < followuslinks.size(); i++) 
		{
			
			followuslinks.get(i).click();
			
			
			for (String Followchild : driver.getWindowHandles()) 
			{
				driver.switchTo().window(Followchild);
				Thread.sleep(4000);
			}
			
			
			Actual_Result=driver.getTitle();
			Expected_Result=FollowArrayList.get(i).toString();
			Assert.assertEquals(Actual_Result, Expected_Result, "FollowUs Titles are Not Matching");
			driver.close();
			driver.switchTo().window(Parent_window);
		}
	} 
	catch (Exception e) 
	{
		// TODO: handle exception
		throw new Exception("footFollowus Test case Failed" + e.getLocalizedMessage());
	}
}
	


@Test
public void partnersite() throws Exception
{
	try 
	{
		WebElement patnerlabel= driver.findElement(By.xpath(Partner_lbl_xpath));
		isDisplayed=patnerlabel.isDisplayed();
		Assert.assertTrue(isDisplayed, "Partnersite Label is misisng");
		
		WebElement backwardarr= driver.findElement(By.xpath(Partner_backarrow_xpath));
		isDisplayed=backwardarr.isDisplayed();
		Assert.assertTrue(isDisplayed, "Backward arrow is Msissing");
		
		WebElement forwardarr= driver.findElement(By.xpath(Partner_Forwardarrow_xpath));
		isDisplayed=forwardarr.isDisplayed();
		Assert.assertTrue(isDisplayed, "forwardarr arrow is Msissing");
		forwardarr.click();
	Thread.sleep(4000);
		
	backwardarr.click();
	Thread.sleep(4000);		
	} 
	catch (Exception e) 
	{
		throw new Exception("partnersite Test case failed " +e.getLocalizedMessage());
	}
}


@Test
public void footFastfarward() throws Exception
{
	
	try 
	{
		Parent_window=driver.getWindowHandle();
		
		WebElement Fastfarw= driver.findElement(By.xpath(Foot_lbl_xpath_FastFarward));
		isDisplayed= Fastfarw.isDisplayed();
		Assert.assertTrue(isDisplayed, "Jobseeker Heading is displayed");
		
		ArrayList<String> FFaarayList= new ArrayList<>();
		FFaarayList.add("Preparing CV for Freshers - Resume for Freshers/Entry Level - Naukri.com");
		FFaarayList.add("Online Certificate Courses - E-Learning Courses - Naukri.com");
		FFaarayList.add("Search Recruiters - Contact HR Recruiter - Naukri.com");
		FFaarayList.add("Job Alerts - Job Alert on Mobile - Job Alert on Email - Naukri.com");
		
		List<WebElement> Fastfarlist= driver.findElements(By.xpath(Foot_lnk_xpath_FastFarward));
		
		for (int i = 0; i < Fastfarlist.size(); i++) 
		
		{	
			Fastfarlist.get(i).click();
			
			
			for (String Childfastfarward : driver.getWindowHandles()) 
			{
				driver.switchTo().window(Childfastfarward);
				
			}
			
			Actual_Result=driver.getTitle();
			Expected_Result=FFaarayList.get(i).toString();
			Assert.assertEquals(Actual_Result, Expected_Result, "FastFarward Links Sub Titles are Missing");
			driver.close();
			
			driver.switchTo().window(Parent_window);
			
		}
	}
	catch (Exception e) 
	{
		throw new Exception("footFastfarward Testcase Failed " +e.getLocalizedMessage());
	}
}
//Last Not Run
@Test
public void topemployer() throws Exception
{
	try {
		WebElement topemp= driver.findElement(By.xpath(Top_lbl_xpath_Employers));
		isDisplayed=topemp.isDisplayed();
		Assert.assertTrue(isDisplayed, "Top Employers Header is Missing");
		
		Parent_window=driver.getWindowHandle();
		List<WebElement> topemplist= driver.findElements(By.xpath(Top_lnks_xpath_Employers));
		
		for (int i = 0; i < topemplist.size(); i++)
		{
		/*	String topnamelist= topemplist.get(i).getTagName();
			System.out.println(topemplist);*/
			int count=topemplist.size();
			System.out.println(count);
			topemplist.get(i).click();
			for (String childEmplst : driver.getWindowHandles())
			{
				driver.switchTo().window(childEmplst);
			}
			driver.close();
			driver.switchTo().window(Parent_window);
		}
		
		
	} catch 
	(Exception e) 
	{
		throw new Exception("topemployer Test case Failed " +e.getLocalizedMessage());
	}
}

// More Links Completed

@Test 
public void moreMenu() throws Exception
{
	try 
	{
		Parent_window=driver.getWindowHandle();
		
		WebElement MoreMenu=driver.findElement(By.xpath(menu_head_xpath_More));
		isDisplayed=MoreMenu.isDisplayed();
		Assert.assertTrue(isDisplayed, "More Menu object Is Missing");
		
		Actions mngaction= new Actions(driver);
		mngaction.moveToElement(MoreMenu);
		WebElement MangementandBusiness= driver.findElement(By.xpath(menu_subhead_More_xpath_MangAndBusiness));	
		mngaction.moveToElement(MangementandBusiness);
		mngaction.build().perform();
		isDisplayed=MangementandBusiness.isDisplayed();
		Assert.assertTrue(isDisplayed, "MangementandBusiness Header is Missing");	
		/*driver.close();
		driver.switchTo().window(Parent_window);*/
		
		// MBA Link	
		//parentMenuAction(MoreMenu);
		
		WebElement MBALink= driver.findElement(By.xpath(menu_More_xpath_MBA));
		MBALink.click();
		Thread.sleep(2000);
	
		for (String ChildMBA : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildMBA);
		}
		
		Expected_Result="MBA in India - MBA Courses - MBA Colleges - Shiksha.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "MBA Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
	//Distance MBA
		
		parentMenuAction(MoreMenu);
		
		WebElement DistanceMBALink= driver.findElement(By.xpath(menu_More_xpath_DistanceMBA));
		DistanceMBALink.click();
		Thread.sleep(2000);
	//ChildMenuAction(DistanceMBALink);
		
		for (String ChildDistanceMBA : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildDistanceMBA);
		}
		
		Expected_Result="Distance Learning MBA in India -  Distance Learning MBA Courses -  Distance Learning MBA Colleges - Shiksha.com";
		Actual_Result=driver.getTitle();
		//Assert.assertEquals(Actual_Result, Expected_Result, "Distance MBA Title is not Matching");
		if(Actual_Result.contains("Distance Learning MBA in India"))
		{
			System.out.println("Distance MBA Title is  Matching");
		}
		else
		{
			System.out.println("Distance MBA Title is not Matching");
		}
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		
		//PartTime MBA
		parentMenuAction(MoreMenu);
		
		WebElement PartTimeMBALink= driver.findElement(By.xpath(menu_More_xpath_PartMBA));
		PartTimeMBALink.click();
		Thread.sleep(2000);
	//ChildMenuAction(PartTimeMBALink);
		
		for (String ChildPartMBA : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildPartMBA);
		}
		
		Expected_Result="Part Time MBA in India - Part Time MBA Courses - Part Time MBA Colleges - Shiksha.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "PartTime Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		System.out.println("Management and Business Links Completed");
		
		Actions ITaction= new Actions(driver);
		ITaction.moveToElement(MoreMenu);
		WebElement InformationTechnologyHead= driver.findElement(By.xpath(menu_subhead_more_xpath_InformationTechnology));	
		ITaction.moveToElement(InformationTechnologyHead);
		ITaction.build().perform();
		isDisplayed=InformationTechnologyHead.isDisplayed();
		Assert.assertTrue(isDisplayed, "Information Technology Header is Missing");	
		
		//MCA
		
					
		WebElement MCALink= driver.findElement(By.xpath(menu_More_xpath_MCA));
		MCALink.click();
		Thread.sleep(2000);
	//ChildMenuAction(MCALink);
		
		for (String ChildMCA : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildMCA);
		}
		
		Expected_Result="MCA Colleges in India - MCA Courses in India - Shiksha.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "MCA Title is not Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//Distance MCA
		parentMenuAction(MoreMenu);
		
		WebElement DistanceMCAlink= driver.findElement(By.xpath(menu_More_xpath_DistanceMCA));
		DistanceMCAlink.click();
		Thread.sleep(2000);
	//ChildMenuAction(DistanceMCAlink);
		
		for (String ChildDistanceMca : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildDistanceMca);
		}
		
		Expected_Result="MCA Distance Education in India - MCA Distance Learning - Shiksha.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Distance MCA Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//SoftwareCources
		
		parentMenuAction(MoreMenu);
		
		WebElement SoftwareCourcesLink= driver.findElement(By.xpath(menu_More_xpath_SoftwareCources));
		SoftwareCourcesLink.click();
		Thread.sleep(2000);
	//ChildMenuAction(SoftwareCourcesLink);
		
		for (String ChildSoftwareCource : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildSoftwareCource);
		}
		
		Expected_Result="Computer Programming Language Courses in India - Programming Courses - shiksha.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "SoftwareCources Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//HardwareCource
		
		parentMenuAction(MoreMenu);
		
		WebElement HardwareCourceLink= driver.findElement(By.xpath(menu_More_xpath_HardwareCourse));
		HardwareCourceLink.click();
		Thread.sleep(2000);
	//ChildMenuAction(HardwareCourceLink);
		
		for (String ChildHardwareCource : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildHardwareCource);
		}
		
		Expected_Result="Cisco Certification Courses in India - Cisco Courses - Shiksha.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "HardwareCource Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		
		
		
		System.out.println("Information Technology Links Completed");
		
		Actions Animationaction= new Actions(driver);
		Animationaction.moveToElement(MoreMenu);
		WebElement AnimationHead= driver.findElement(By.xpath(menu_subhead_more_xpath_AnimationMultimedia));	
		Animationaction.moveToElement(AnimationHead);
		Animationaction.build().perform();
		isDisplayed=AnimationHead.isDisplayed();
		Assert.assertTrue(isDisplayed, "Animation Technology Header is Missing");	
		
		//Animation
		//parentMenuAction(MoreMenu);
		
		WebElement AnimationLink= driver.findElement(By.xpath(menu_More_xpath_Animation));
		AnimationLink.click();
		Thread.sleep(3000);
		//ChildMenuAction(AnimationLink);
		
		for (String ChildAnimationLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildAnimationLink);
		}
		
		Expected_Result="Animation courses in India - Best animation institutes in India";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Animation Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//GraphicDesign
		
		parentMenuAction(MoreMenu);
		
		WebElement GraphicDesignLink= driver.findElement(By.xpath(menu_More_xpath_GraphicDesign));
		GraphicDesignLink.click();
		Thread.sleep(2000);
	//ChildMenuAction(GraphicDesignLink);
		
		for (String ChildGraphicDesignLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildGraphicDesignLink);
		}
		
		Expected_Result="Graphic Designing courses in India - Best graphic designing institutes in India";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "GraphicDesign Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//WebDesigining
		
		parentMenuAction(MoreMenu);
		
		WebElement WebDesiginingLink= driver.findElement(By.xpath(menu_More_xpath_WebDesigning));
		WebDesiginingLink.click();
		Thread.sleep(2000);
	//ChildMenuAction(WebDesiginingLink);
		
		for (String ChildWebDesiginingLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildWebDesiginingLink);
		}
		
		Expected_Result="Web Designing courses in India - Best web designing institutes in India";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "WebDesigining Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
System.out.println("Animation Links Links Completed");
		
		Actions studyaction= new Actions(driver);
		studyaction.moveToElement(MoreMenu);
		WebElement StudyHead= driver.findElement(By.xpath(menu_subHead_xpath_Studyabroad));	
		studyaction.moveToElement(AnimationHead);
		studyaction.build().perform();
		isDisplayed=StudyHead.isDisplayed();
		Assert.assertTrue(isDisplayed, "Animation Header is Missing");	
		
		//MBAStudy
		//parentMenuAction(MoreMenu);
		
		WebElement MBAStudy= driver.findElement(By.xpath(menu_More_xpath_StudyMBA));
		MBAStudy.click();
		Thread.sleep(2000);
	//ChildMenuAction(MBAStudy);
		
		for (String ChildMBAStudy : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildMBAStudy);
		}
		
		Expected_Result="MBA in abroad - MBA Colleges in abroad - Shiksha.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "MBAStudy Title is not Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//MSStudy
parentMenuAction(MoreMenu);
		
		WebElement MSStudyLink= driver.findElement(By.xpath(menu_More_xpath_StudyMS));
		MSStudyLink.click();
		Thread.sleep(2000);
	//ChildMenuAction(MSStudyLink);
		
		for (String ChildMSStudyLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildMSStudyLink);
		}
		
		Expected_Result="MS in abroad - MS Colleges in abroad - Shiksha.com";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "MSStudy Title is not Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		//BEBTECH
parentMenuAction(MoreMenu);
		
		WebElement BEBTECHLink= driver.findElement(By.xpath(menu_More_xpath_StudyBEBtech));
		BEBTECHLink.click();
		Thread.sleep(2000);
	//ChildMenuAction(BEBTECHLink);
		
		for (String ChildBEBTECHLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildBEBTECHLink);
		}
		
		Expected_Result="Bachelor of Engineering Colleges in abroad - Study Abroad";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "BEBTECH Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		System.out.println("StayAborad Links Links Completed");
		
		Actions moreaction= new Actions(driver);
		moreaction.moveToElement(MoreMenu);
		WebElement morelastHead= driver.findElement(By.xpath(menu_subHead_xpath_Studyabroad));	
		moreaction.moveToElement(AnimationHead);
		moreaction.build().perform();
		isDisplayed=morelastHead.isDisplayed();
		Assert.assertTrue(isDisplayed, "More Last Head Header is Missing");	
		

		//PayCheck
		//parentMenuAction(MoreMenu);
		
		WebElement PayCheckLink= driver.findElement(By.xpath(menu_More_xpath_PayCheck));
		PayCheckLink.click();
		Thread.sleep(2000);
	//ChildMenuAction(PayCheckLink);
		
		for (String ChildPayCheckLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildPayCheckLink);
		}
		
		Expected_Result="Company Salaries - Average Salary Graph of Top Companies";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "PayCheck Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		//NaukrionMobile
parentMenuAction(MoreMenu);
		
		WebElement NaukrionMobileLink= driver.findElement(By.xpath(menu_more_xpath_NaukrionMobile));
		NaukrionMobileLink.click();
		Thread.sleep(2000);
	//ChildMenuAction(NaukrionMobileLink);
		
		for (String ChildNaukrionMobileLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildNaukrionMobileLink);
		}
		
		Expected_Result="Naukri on Mobile";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "NaukrionMobile Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
		//Blog
parentMenuAction(MoreMenu);
		
		WebElement BlogLink= driver.findElement(By.xpath(menu_More_xpath_Blog));
		BlogLink.click();
		Thread.sleep(2000);
	//ChildMenuAction(BlogLink);
		//Thread.sleep(5000);
		for (String ChildBlogLink : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildBlogLink);
		}
		
		Expected_Result="The Case of Duplicate Mobile Numbers | The Official Naukri.com Blog: Find the best jobs faster";
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, Expected_Result, "Blog Title is Matching");
		
		driver.close();
		driver.switchTo().window(Parent_window);
	} 
	catch (Exception e)
	{

throw new Exception("More Menu Test case Failed " +e.getLocalizedMessage());
	}
}

@Test
public void componetdisplayedfornotloggedin() throws Exception
{
	try {
		WebElement alljobs= driver.findElement(By.xpath(lnkxpathalljobs));
		String xyz=alljobs.getAttribute("class");
		//if(xyz.))
		{
			
		}
		isDisplayed=alljobs.isDisplayed();
		Assert.assertTrue(isDisplayed, "All Jobs link is missing");
		
		
		WebElement iitjobs= driver.findElement(By.xpath(lnkxpathIITIIMjobs));
		isDisplayed=iitjobs.isDisplayed();
		
		Assert.assertTrue(isDisplayed, "IIT Jobs Link is Missing");
		
		WebElement Govtjobs= driver.findElement(By.xpath(lnkxpathgovtjobs));
		isDisplayed=Govtjobs.isDisplayed();
		Assert.assertTrue(isDisplayed, "Govt jobs Link is Missing");
		
		WebElement international= driver.findElement(By.xpath(lnkxpathinternationalgobs));
		isDisplayed= international.isDisplayed();
		
		Assert.assertTrue(isDisplayed, "INternational Job is missing");
		System.out.println("All Links are Displayed");
	} 
	catch (Exception e) {
		throw new Exception("componetdisplayedfornotloggedin Test case Failed:  " +e.getLocalizedMessage());
	}
	
}
@Test
public void JobsearchItemsdisplayed() throws Exception
{
	try {
		WebElement skills= driver.findElement(By.xpath(txtxpathskills));
		isDisplayed= skills.isDisplayed();
		Assert.assertTrue(isDisplayed, "Skills Textbox Object Missed");
		Actual_Result=skills.getAttribute("placeholder");
		System.out.println(Actual_Result);
		
		WebElement location= driver.findElement(By.xpath(txtxpathlocation));
		isDisplayed= location.isDisplayed();
		Assert.assertTrue(isDisplayed, "Location textbox is missing");
		Actual_Result=location.getAttribute("placeholder");
		System.out.println(Actual_Result);
		
		WebElement Experience= driver.findElement(By.xpath(txtxpathExperiance));
		isDisplayed= Experience.isDisplayed();
		Assert.assertTrue(isDisplayed, "Experiance Dropdown is Missing");
		Actual_Result= Experience.getAttribute("placeholder");
		System.out.println(Actual_Result);
		
		WebElement Salary= driver.findElement(By.xpath(txtxpathsalary));
		isDisplayed= Salary.isDisplayed();
		Assert.assertTrue(isDisplayed, "Salary Dropdown Is Missing");
		
		WebElement Search= driver.findElement(By.id(btnidsearch));
		isDisplayed= Search.isDisplayed();
		Assert.assertTrue(isDisplayed,"Search Button IS Missing");
		
		WebElement advancesearch= driver.findElement(By.partialLinkText(partlinkadvancedsearch));
		isDisplayed=advancesearch.isDisplayed();
		Assert.assertTrue(isDisplayed, "Advanced Search Link is Missing");
		System.out.println("All Links of Search is displayed Manjunath");
		
	} 
	catch (Exception e) 
	{
	throw new Exception("JobsearchItemsdisplayed TestCase Filed  : " +e.getLocalizedMessage());
	}
	
}

@Test
public void postyourcv() throws Exception
{
	try
	{
		
		WebElement enteremailtext= driver.findElement(By.id(txtidEmailtoRegister));
		isDisplayed=enteremailtext.isDisplayed();
		Assert.assertTrue(isDisplayed, "EnterEmail or Regiter Text box is missing");
		
		enteremailtext.sendKeys("manjuec.ole@gmail.com");
		
		WebElement password= driver.findElement(By.id(txtpasswordcreatepassword));
		isDisplayed=password.isDisplayed();
		Assert.assertTrue(isDisplayed, "Password Textbox is Missing");
		password.sendKeys("olemanju");
		
		WebElement iagreelink= driver.findElement(By.xpath(headexpathiagreeterma));
		isDisplayed= iagreelink.isDisplayed();
		Expected_Result="I agree to the";
		
		if(iagreelink.getText().contains(Expected_Result))
		{
		System.out.println("I agree text is Present");
		}
		else
		{
			System.out.println("I agree Text is Missing or Not matching");
		}
		
		String Parentwindow= driver.getWindowHandle();
		
		WebElement termaslink= driver.findElement(By.xpath(lnkxpathtermsandconditions));
		isDisplayed= termaslink.isDisplayed();
		termaslink.click();
		Thread.sleep(3000);
		
		for (String childwindows : driver.getWindowHandles()) 
		{
			driver.switchTo().window(childwindows);
		}
		
		WebElement jobseekerheader= driver.findElement(By.xpath(headxpathjobseekerwindow));
		isDisplayed= jobseekerheader.isDisplayed();
		Expected_Result="Job Seekers";
		Thread.sleep(4000);
		
		if (jobseekerheader.getText().contains(Expected_Result)) 
		{
			System.out.println("Jobseeker Header is displayed on Next Page");
		} else {
			System.out.println("Jobseeker Header is Missing");
		}
		
		driver.close();
		driver.switchTo().window(Parentwindow);
		
		WebElement submityourcv= driver.findElement(By.id(btnidsubmityourCV));
		isDisplayed= submityourcv.isDisplayed();
		submityourcv.click();
		
		Thread.sleep(5000);
		
		WebElement headeremailregistered= driver.findElement(By.xpath(headerxpathemailidalreadyregistered));
		isDisplayed= headeremailregistered.isDisplayed();
		
		Actual_Result=headeremailregistered.getText();
		Expected_Result="This Email ID is already registered, please enter your password";
		
		Assert.assertEquals(Actual_Result, Expected_Result,"Header Email Registered is Not Matching");
		
		WebElement closeimage= driver.findElement(By.id(headeidemailcloseimage));
		isDisplayed= closeimage.isDisplayed();
		Assert.assertTrue(isDisplayed, "Close Image is not displayed");
		closeimage.click();
		Thread.sleep(4000);
		
	} 
	
	catch (Exception e) 
	
	{
		throw new Exception("postyourcv Test Case Failed  : "  + e.getLocalizedMessage());
	}
}
@Test
public void browsejobs() throws Exception
{
	try 
	{
		WebElement browsejobs= driver.findElement(By.xpath(lnkxpathbrowsejobs));
		isDisplayed= browsejobs.isDisplayed();
		Assert.assertTrue(isDisplayed, " Browse Link is missing in the screen");
		
		WebElement browsealljobs= driver.findElement(By.linkText(lnkbrowsetextalljobs));
		isDisplayed=browsealljobs.isDisplayed();
		Assert.assertTrue(isDisplayed, "All jobs link is Missing");
		
		WebElement jobsbycompany= driver.findElement(By.linkText(lnkbrowsejobsbycomplany));
		isDisplayed= jobsbycompany.isDisplayed();
		Assert.assertTrue(isDisplayed, "JobsbyComapany Link is missing");
		
		WebElement jobsbycategory= driver.findElement(By.linkText(lnkbrowsejobsbycategory));
		isDisplayed= jobsbycategory.isDisplayed();
		Assert.assertTrue(isDisplayed, "Jobsbycategory link is missing");
		
		WebElement jobsbylocation= driver.findElement(By.linkText(lnkbrowsejobsbylocation));
		isDisplayed= jobsbylocation.isDisplayed();
		Assert.assertTrue(isDisplayed, "JobsbyLocation link is Missing");
		
		WebElement JobsbyDesignation= driver.findElement(By.linkText(lnkbrowsejobsbydesignation));
		isDisplayed= JobsbyDesignation.isDisplayed();
		Assert.assertTrue(isDisplayed, "Jobs by designation Link is Missing");
		
		WebElement jobsbySkills= driver.findElement(By.linkText(lnkbrowsejobsbySkill));
		isDisplayed=jobsbySkills.isDisplayed();
		Assert.assertTrue(isDisplayed, "JobsbySkills Link is missing");
		System.out.println("Browse Test case Complated");
		
	} catch (Exception e) 
	{
		throw new Exception("Browsejobs Testcase Failed " + e.getLocalizedMessage());
	}
	
}

@Test
public void createJobAlert() throws Exception
{
	try 
	{
		
		WebElement getbestmatched= driver.findElement(By.xpath(headerxpathgetbetterjobparagraph));
		Actual_Result= getbestmatched.getText();
		System.out.println(Actual_Result);
		isDisplayed= getbestmatched.isDisplayed();
		Assert.assertTrue(Actual_Result.contains("jobs on your email. No registration needed"), "Both are not Matching");
		System.out.println("Jobson Email Text is displayed");
		
		WebElement createjob= driver.findElement(By.id(btnidcreatejobalert));
		isDisplayed= createjob.isDisplayed();
		createjob.click();
		Thread.sleep(5000);
		
		System.out.println("Create button is displayed");
		
		WebElement tellusheader= driver.findElement(By.xpath(headerxpathTelluswhatkindofjob));
		Actual_Result= tellusheader.getText();
		System.out.println(Actual_Result);
		Assert.assertEquals(Actual_Result, "Tell us what kind of jobs you want","Tell us Text is not Matching");
		
		System.out.println("1 Next Page visited");
		WebElement closetelluswindow= driver.findElement(By.xpath(lnkxpathclosetelluswhat));
		closetelluswindow.click();
		System.out.println("2 close button clicked");
	} 
	catch (Exception e) {
		// TODO: handle exception
		throw new Exception(" CreateJobalert Text case is failed:  " +e.getLocalizedMessage());
	}
}


@Test
public void bestPlaceToWork() throws Exception
{
	try 
	{
		
		WebElement bestplace= driver.findElement(By.xpath(lblxpathbestplacetowork));
		Actual_Result=bestplace.getText();
		Expected_Result="Best Places to Work";
		Assert.assertEquals(Actual_Result, Expected_Result,"BestPlace to work Object is Missing on the Screen");
		
		WebElement allserv= driver.findElement(By.xpath(lblxpathallsectors));
		isDisplayed= allserv.isDisplayed();
		Assert.assertTrue(isDisplayed, "Allservice object is Missing");
		
		WebElement informationtech= driver.findElement(By.xpath(lblxpathinformationTechnology));
		isDisplayed=informationtech.isDisplayed();
		Assert.assertTrue(isDisplayed, "Information Technology Object is Missing");
		informationtech.click();
		
		WebElement informationtechnologychild= driver.findElement(By.xpath(lblxpathinformtechtext));
		//isDisplayed=informationtechnologychild.isDisplayed();
		Actual_Result=informationtechnologychild.getText();
		Expected_Result="Information Technology";
		Assert.assertEquals(Actual_Result, Expected_Result, "Information Technology Child window is Missing");
		
		WebElement manufrat= driver.findElement(By.xpath(lblxpathmanufraturing));
		isDisplayed=manufrat.isDisplayed();
		Assert.assertTrue(isDisplayed, "Manufraturing Object is Missing");
		manufrat.click();
		
		WebElement manuchild= driver.findElement(By.xpath(lblxpathmanufratext));
		Expected_Result="Manufacturing";
		Actual_Result=manuchild.getText();
		Assert.assertEquals(Actual_Result, Expected_Result, "Manufracture Child link is Missing");
		
		WebElement Servi= driver.findElement(By.xpath(lblxpathservice));
		isDisplayed= Servi.isDisplayed();
		Assert.assertTrue(isDisplayed, "Service object is missing");
		Servi.click();
		
		WebElement servicechild= driver.findElement(By.xpath(lblxpathservicetext));
		Expected_Result="Services";
		Actual_Result=servicechild.getText();
		Assert.assertEquals(Actual_Result, Expected_Result,"Service Child Element is missing");
		
	} 
	catch (AssertionError e) 
	{
Assert.fail();
driver.close();
driver.switchTo().window(Parent_window);
		//throw new Exception("bestPlaceToWork Testcase Failed :  " +e.getLocalizedMessage());
		
		
	}
}
@Test
public void jobGallery() throws Exception
	{
try 
{
	WebElement JobGal= driver.findElement(By.xpath(gal_headxpathjobgallary));
	isDisplayed=JobGal.isDisplayed();
	Actual_Result=JobGal.getText();
	Assert.assertEquals(Actual_Result, "Job Gallery", "Job Gallery object is missing");
	
	
	
	WebElement allsect= driver.findElement(By.xpath(gal_lnkxpathAllsectors));
	isDisplayed=allsect.isDisplayed();
	Assert.assertEquals(allsect.getText(), "All Sectors", "All service object is Missing");
	
	
	WebElement informationtech= driver.findElement(By.xpath(gal_lnkxpathinformationTechnology));
	isDisplayed=informationtech.isDisplayed();
	Assert.assertEquals(informationtech.getText(), "Information Technology", "Information Technology Header is Missing");
	informationtech.click();
	
	WebElement headinformationtech= driver.findElement(By.xpath(gal_HeadXpathInformationTechnology));
	isDisplayed= headinformationtech.isDisplayed();
	Assert.assertEquals(headinformationtech.getText(), "Information Technology", "Information Technology Header is Missing");
	
	
	WebElement gal_manufract= driver.findElement(By.xpath(gal_lnkxpathManufractureing));
	isDisplayed=gal_manufract.isDisplayed();
	Assert.assertEquals(gal_manufract.getText(), "Manufacturing", "Manufracture object is Missing");
	gal_manufract.click();
	
	WebElement gal_headmanufrat= driver.findElement(By.xpath(gal_HeadxpathManufractureing));
	isDisplayed=gal_headmanufrat.isDisplayed();
	Assert.assertEquals(gal_headmanufrat.getText(), "Manufacturing", "Manufracturing Header is Missing");
	
	WebElement gal_services= driver.findElement(By.xpath(gal_lnkxpathServices));
	isDisplayed=gal_services.isDisplayed();
	Assert.assertEquals(gal_services.getText(), "Services", "Services object is Missing" );
	gal_services.click();
	
	System.out.println("manjunath");
	WebElement gal_headservice= driver.findElement(By.xpath(gal_Headxpathservices));
	isDisplayed=gal_headservice.isDisplayed();
	Assert.assertEquals(gal_headservice.getText(), "Services", "Services Header is missing");
	
} 
catch (Exception e)
{
	throw new Exception("Job Gallary Test case Failed  " +e.getLocalizedMessage());
}	
}

@Test
public void fastFarward() throws Exception
	{
	try 
	{
		
		String parent_window=driver.getWindowHandle();
		WebElement Fast_logo = driver.findElement(By.xpath(ff_logo_xpath_Services));
		Fast_logo.click();
		
		for (String Childwindows : driver.getWindowHandles()) 
		{
		
			driver.switchTo().window(Childwindows);
		}
		
		Actual_Result=driver.getTitle();
		Assert.assertEquals(Actual_Result, "Resume Writing Services - CV - Bio data - Naukri.com", "Fast Farward Page is not Displayed");
		driver.close();
		driver.switchTo().window(parent_window);
		
		String a = "12";
		
		
		
	} 
	catch (Exception e) 
	{
		// TODO: handle exception
		throw new Exception("fastFarward Test case Failed "  + e.getLocalizedMessage());
	}
	
}


/// THis one needs to be
@Test
public void walkinjobs() throws Exception
{
	try 
	{
		WebElement walkin_paragraph= driver.findElement(By.xpath(walk_para_xpath_paragraph));
		isDisplayed=walkin_paragraph.isDisplayed();
	Assert.assertTrue(walkin_paragraph.getText().contains("walk-in jobs"), "Paragrapraph is Missing");
	
	WebElement Search_walkinjobs= driver.findElement(By.xpath(walk_btnxpathwalkinjobs));
	isDisplayed= Search_walkinjobs.isDisplayed();
			Search_walkinjobs.click();
	
	Parent_window= driver.getWindowHandle();
	
	for (String  ChildWindowss : driver.getWindowHandles()) 
	{
		driver.switchTo().window(ChildWindowss);
	}
	
	Actual_Result=driver.getTitle();
	Assert.assertEquals(Actual_Result, "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com","Walking Child Title is Not matching");
	driver.close();
	driver.switchTo().window(Parent_window);
	} 
	catch (Exception e)
	{
		// TODO: handle exception
		throw new Exception("walkinjobs Testcase Is failed " + e.getLocalizedMessage());
	}
}

@Test
public void naukriFastForward() throws Exception
{
	
	try 
	{
		WebElement NFastfarwardlogo= driver.findElement(By.xpath(fast_logo_xpath_fastfarward));
		isDisplayed=NFastfarwardlogo.isDisplayed();
		Assert.assertTrue(isDisplayed, "FastFarward Logo is Missing");
		NFastfarwardlogo.click();
		
		Parent_window=driver.getWindowHandle();
		for (String childWindows : driver.getWindowHandles()) 
		{
			driver.switchTo().window(childWindows);
			
		}
		Actual_Result= driver.getTitle();
		Expected_Result="Resume Writing Services - CV - Bio data - Naukri.com";
		Assert.assertEquals(Actual_Result, Expected_Result,"Tital is not Matching");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		WebElement knowresumelink= driver.findElement(By.xpath(fast_lnk_xpath_knowyourresumescore));
		isDisplayed=knowresumelink.isDisplayed();
		Assert.assertTrue(isDisplayed, "Know Your Resume Score Link is Missing");
		
		WebElement getyourfree= driver.findElement(By.xpath(fast_paragraph_xpath_getyour));
		isDisplayed= getyourfree.isDisplayed();
		Assert.assertTrue(isDisplayed, "Get your Free Resume Feedback Text is Missing");
		
		
		WebElement resumeFeedBackRpt= driver.findElement(By.xpath(fast_link_xpath_resumeFeedBackReport));
		isDisplayed=resumeFeedBackRpt.isDisplayed();
		Assert.assertTrue(isDisplayed, "Resume FeedBack Link is Missing");
		resumeFeedBackRpt.click();
		
		Parent_window=driver.getWindowHandle();
		
		for (String Resumechild : driver.getWindowHandles()) 
		{
			driver.switchTo().window(Resumechild);
		}
		
		WebElement textuploadyourResume= driver.findElement(By.xpath(fast1_lnk_xpath_resumefeedback));
isDisplayed=textuploadyourResume.isDisplayed();
Assert.assertTrue(isDisplayed, "Upload Your Resume Text is Missing");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		WebElement notgettingenough= driver.findElement(By.xpath(fast_lnk_xpath_notgettingenough));
		isDisplayed=notgettingenough.isDisplayed();
		Assert.assertTrue(isDisplayed, "Not getting Enough Profile views Link is Missing");
		notgettingenough.click();
		
		for (String viewchildwindow : driver.getWindowHandles()) 
		{
			driver.switchTo().window(viewchildwindow);
		}
		
		
		WebElement whyresumedisplaytext= driver.findElement(By.xpath(fast1_text_xpath_Resumedisplay));
		isDisplayed=whyresumedisplaytext.isDisplayed();
		Assert.assertTrue(isDisplayed, "Why resume Display is Not displaying In New window");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		WebElement get43timesmore= driver.findElement(By.xpath(fast_paragraph_xpath_get34));
		isDisplayed=get43timesmore.isDisplayed();
		Assert.assertTrue(isDisplayed, "Get 3-4 times more profile views by recruiters Text is Misisng");
		
		WebElement Tollfreenumber= driver.findElement(By.xpath(fast_text_xpath_toolfree));
		isDisplayed=Tollfreenumber.isDisplayed();
		Assert.assertTrue(isDisplayed, "Call 1800-102-5557 now! (Toll-Free)");
	} 
	catch (Exception e)
	{
	throw new Exception("naukriFastForward Test case is Failed" +e.getLocalizedMessage());
	}
			}

@Test
public void careerNavigator() throws Exception
{
	try 
	{
		WebElement careernavigatorlogo= driver.findElement(By.xpath(CN_xpath_Careerlogo));
		isDisplayed=careernavigatorlogo.isDisplayed();
		Assert.assertTrue(isDisplayed, "Career Navigator Logo is Missing");
		
		WebElement careerSaltrndsparagraph=driver.findElement(By.xpath(CN_Para_xpath_Salarytrends));
		Actual_Result=careerSaltrndsparagraph.getText();
		Expected_Result="Salary trends based on over 1 crore profiles";
		//Assert.assertEquals(Actual_Result, Expected_Result, "Salary Trend Paragraph is not Matching");
		if (Actual_Result.contains("Salary trends based on over")) 
		{
			System.out.println("CareerSalary Text Matching");
		} else 
		{
			System.out.println("CareerSalary Text  Not Matching");

		}
		
		WebElement viewSalaries= driver.findElement(By.xpath(CN_BTn_xpath_ViewSalary));
		isDisplayed=viewSalaries.isDisplayed();
		Assert.assertTrue(isDisplayed, "View Salaries button is Missing");
		viewSalaries.click();
		
		Parent_window=driver.getWindowHandle();
		for (String Childwindow : driver.getWindowHandles()) 
		{
			driver.switchTo().window(Childwindow);
		}
		
		WebElement topindustires= driver.findElement(By.xpath(CN1_lbl_xpath_TopIndustry));
		isDisplayed=topindustires.isDisplayed();
		Actual_Result=topindustires.getText();
		Expected_Result="Top Industries";
		Assert.assertEquals(Actual_Result, Expected_Result);
		
		driver.close();
		driver.switchTo().window(Parent_window);
		
		WebElement connecttoRecrutiersPara= driver.findElement(By.xpath(CN_Para_xpath_ViewRecruiters));
		isDisplayed=connecttoRecrutiersPara.isDisplayed();
		Actual_Result=connecttoRecrutiersPara.getText();
		
		/*if (electronics.getText().contains("Electronics"))
		{
			Assert.assertEquals(electronics.getText(), "Electronics", "Both elctronics are not Matching");
			electronics.click();
		} */
		
		if (Actual_Result.contains("Connect to recruiters directly"))
		{
			System.out.println("Connect to recruiters directly Text Displayed");
		}
		else
		{
			System.out.println("Connect to recruiters directly");
		}
		//Assert.assertEquals(connecttoRecrutiersPara.getText(), "Connect to recruiters directly. More than 20,000 Recruiter across Industries"," View Recruiters Paragraph is not Matching");
		//Assert.assertEquals(Actual_Result.contains("Connect to recruiters directly"), "View Recruiters Paragraph is not Matching");
		
		WebElement ViewRecruiters=driver.findElement(By.xpath(CN_Btn_xpath_viewRecruiters));
		isDisplayed=ViewRecruiters.isDisplayed();
		Assert.assertTrue(isDisplayed, "View Recruiters Button is Missing");
		ViewRecruiters.click();
		
		for (String ChildRecru : driver.getWindowHandles()) 
		{
			driver.switchTo().window(ChildRecru);
		}
		
		WebElement  toprecruiters =driver.findElement(By.xpath(CN1_lbl_xpath_Recrutdomine));
		Actual_Result=toprecruiters.getText();
		Expected_Result="Search, Follow and Connect with top recruiters in your domain";
		Assert.assertEquals(Actual_Result, Expected_Result, "Recruiters Text is not matching");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		Actual_Result=driver.getTitle();
		Expected_Result="Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
		Assert.assertEquals(Actual_Result, Expected_Result, "Home Title is not Matching");
		
	} 
	catch (Exception e) 
	{
		throw new Exception("careerNavigator Testcase Failed " +e.getLocalizedMessage());
	}
}


@Test
public void serviceForRecruiters() throws Exception
{
	try 
	{
		WebElement ServiceforRec= driver.findElement(By.xpath(Rec_lbl_xpath_ServiceForRecruiter));
		isDisplayed=ServiceforRec.isDisplayed();
		Assert.assertTrue(isDisplayed, "Service for location object is Missing");
		
		WebElement Naukricalls= driver.findElement(By.xpath(Rec_lnk_xpath_NaukriCalls));
		isDisplayed=Naukricalls.isDisplayed();
		Assert.assertTrue(isDisplayed, "naukricalls Link is mising");
		Naukricalls.click();
		Parent_window= driver.getWindowHandle();
		
		for (String Rec_Child_naukri : driver.getWindowHandles()) 
		{
			driver.switchTo().window(Rec_Child_naukri);
			
		}
		Actual_Result=driver.getTitle();
		Expected_Result="Job Vacancies Packages - Naukri Resdex - Resume database - Job Classified - Naukri.com";
		Assert.assertEquals(Actual_Result, Expected_Result,"Resdex Page is not displayed");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		WebElement fastestrec= driver.findElement(By.xpath(Rec_para_xpath_FastestRecru));
		Actual_Result=fastestrec.getText();
		Expected_Result="Fastest Recruiter Vehicle";
		Assert.assertEquals(Actual_Result, Expected_Result, "Fastest Recruiter Vehicle Paragraph is Missing");
		
		WebElement SearchCV= driver.findElement(By.xpath(Rec_lnk_xpath_SearchCV));
		isDisplayed=SearchCV.isDisplayed();
		Assert.assertTrue(isDisplayed, "SearchCV Link is mising");
		SearchCV.click();
		Thread.sleep(3000);
		Parent_window= driver.getWindowHandle();
		
		for (String Rec_Child_searchcv : driver.getWindowHandles()) 
		{
			driver.switchTo().window(Rec_Child_searchcv);
			
		}
		//WebElement basic= driver.findElement(By.xpath(Rec1_head_xpath_Basicdetails));
		//Actual_Result=basic.g
		
		Actual_Result=driver.getTitle();
		Expected_Result="Resdex";
		Assert.assertEquals(Actual_Result, Expected_Result,"Resdex Page is not displayed");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		WebElement right_Candidate= driver.findElement(By.xpath(Rec_para_xpath_FindRightCandidate));
		Actual_Result=right_Candidate.getText();
		Expected_Result="Find the right candidate";
		Assert.assertEquals(Actual_Result, Expected_Result, "Find the right candidate Paragraph is Missing");
		
		WebElement HRzone= driver.findElement(By.xpath(Rec_lnk_xpath_HRZone));
		isDisplayed=HRzone.isDisplayed();
		Assert.assertTrue(isDisplayed, "HRzone Link is mising");
		HRzone.click();
		Parent_window= driver.getWindowHandle();
		
		for (String Rec_Child_HRzone : driver.getWindowHandles()) 
		{
			driver.switchTo().window(Rec_Child_HRzone);
			
		}
		Actual_Result=driver.getTitle();
		Expected_Result="India - Jobs, Careers, Recruitment, Employment, Hiring, Recruiting, portal for Indian Talent";
		Assert.assertEquals(Actual_Result, Expected_Result,"HRZone Page is not displayed");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		WebElement updateLatest= driver.findElement(By.xpath(Rec_para_xpath_getUpdatedonthLatest));
		Actual_Result=updateLatest.getText();
		Expected_Result="Get updated on the latest HR news";
		Assert.assertEquals(Actual_Result, Expected_Result, "updateLatest Paragraph is Missing");
		
		WebElement campuseHire= driver.findElement(By.xpath(Rec_lnk_xpath_CampusHiring));
		isDisplayed=campuseHire.isDisplayed();
		Assert.assertTrue(isDisplayed, "campuseHire Link is mising");
		campuseHire.click();
		Parent_window= driver.getWindowHandle();
		
		for (String Rec_Child_campusehire : driver.getWindowHandles()) 
		{
			driver.switchTo().window(Rec_Child_campusehire);
			
		}
		Actual_Result=driver.getTitle();
		Expected_Result="Firstnaukri.com";
		Assert.assertEquals(Actual_Result, Expected_Result,"campuseHire Page is not displayed");
		driver.close();
		driver.switchTo().window(Parent_window);
		
		WebElement FreshersHiring= driver.findElement(By.xpath(Rec_para_xpth_optimizeyourFreshersHiring));
		Actual_Result=FreshersHiring.getText();
		Expected_Result="Optimize your Fresher Hiring";
		Assert.assertEquals(Actual_Result, Expected_Result, "FreshersHiring Paragraph is Missing");
		
		
	} 
	catch (Exception e) 
	{
		throw new Exception("serviceForRecruiters Test case Failed " +e.getLocalizedMessage());
	}
}

@Test
public void jobSpeak() throws Exception
{
	try 
	{
		WebElement jobspea= driver.findElement(By.xpath(job_lnk_xpath_jobSpeak));
		isDisplayed=jobspea.isDisplayed();
		Assert.assertTrue(isDisplayed, "JobSpeak Header Message Get displayed");
		
		WebElement MonthlyParagraph= driver.findElement(By.xpath(job_para_xpath_monthly));
		Actual_Result=MonthlyParagraph.getText();
		Expected_Result="A monthly Job Index that provides insight into hiring trends in your city, job function and industry.";
		
		Assert.assertEquals(Actual_Result, Expected_Result, "Job Speak Text is Missing");
		
		Parent_window= driver.getWindowHandle();
		WebElement latestedition= driver.findElement(By.xpath(job_lnk_xpath_viewLatestaddition));
		isDisplayed=latestedition.isDisplayed();
		latestedition.click();
		
		for (String ChildJob  : driver.getWindowHandles())
		{
			driver.switchTo().window(ChildJob);
		}
		
		WebElement subscribepara= driver.findElement(By.xpath(job1_header_xpath_subscribe));
		Actual_Result=subscribepara.getText();
		Expected_Result="For Subscribing to Naukri JobSpeak please enter your contact details (Email id and Name is compulsory)";
		Assert.assertEquals(Actual_Result, Expected_Result,"Both text are not matching");
		driver.close();
		driver.switchTo().window(Parent_window);
	} 
	catch (Exception e) 
	{
		throw new Exception("jobSpeak Testcase Failed:  " +e.getLocalizedMessage());
	}
}

@Test
public void jobBYLocation() throws Exception
{
	try
	{
		Parent_window= driver.getWindowHandle();
		
					
		List<WebElement> jobslist= driver.findElements(By.xpath(jobbyloc_byloc_xpath_Locationlist));
		
			for (int i = 0; i < jobslist.size(); i++) 
		
		{
				
			String Linksname=jobslist.get(i).getText();
			System.out.println("Location Name is : " + Linksname);
			Expected_Result=Linksname.substring(8);
			System.out.println(Expected_Result);
			
						
			jobslist.get(i).click();
			
			for (String Childwindow : driver.getWindowHandles()) 
			{
				
				driver.switchTo().window(Childwindow);
			}
							
			
		//	WebElement Locationtext= driver.findElement(By.xpath("//div[@class='inpWrap']/input[@class='sugInp w135']"));
			WebElement Locationtext=driver.findElement(By.xpath(txtxpathlocation));
			Actual_Result= Locationtext.getAttribute("value");
			System.out.println("What is your Name " + Actual_Result);
			Assert.assertEquals(Actual_Result.toUpperCase(), Expected_Result.toUpperCase(), "Both are not Matching");
			
			driver.close();
			driver.switchTo().window(Parent_window);
			
		}
		
		
	} 
	catch (Exception e) 
	{
		// TODO: handle exception
		throw new Exception(e.getLocalizedMessage());
	}
}

@Test
public void jobBYCategory() throws Exception
{
	try 
	{
		Parent_window=driver.getWindowHandle();
		
		WebElement Job_category= driver.findElement(By.xpath(Job_cat_head_xpath_jobsbyLoacation));
		isDisplayed=Job_category.isDisplayed();
		Assert.assertTrue(isDisplayed, "JobsCategory Object is Missing");
		
		List<WebElement> jobsCategorylinks= driver.findElements(By.xpath(job_cat_lnks_XpathList));
		
		for (int i = 0; i < jobsCategorylinks.size(); i++) 
		{
			String Catlinkname=jobsCategorylinks.get(i).getText();
			//System.out.println(Catlinkname);
			Expected_Result=Catlinkname.substring(0,Catlinkname.lastIndexOf(" "));
			System.out.println(Expected_Result);
			
			jobsCategorylinks.get(i).click();
			
			for (String categoryChildwindows : driver.getWindowHandles()) 
			{
				driver.switchTo().window(categoryChildwindows);
				
				}
			
			WebElement skillstext= driver.findElement(By.xpath("//div[@class='sWrap lftBrd']/div/input[@class='sugInp']"));
			Actual_Result=skillstext.getAttribute("value");
			System.out.println(Actual_Result);
			
			//Assert.assertEquals(Actual_Result, Expected_Result.trim(), "Bothe are not Matching in Category Test case");
			driver.close();
			driver.switchTo().window(Parent_window);
			
			
			
		}
				
		
	} 
	catch (Exception e) 
	{
		throw new Exception("jobBYCategory Test case Failed  " +e.getLocalizedMessage());
	}
}

}
