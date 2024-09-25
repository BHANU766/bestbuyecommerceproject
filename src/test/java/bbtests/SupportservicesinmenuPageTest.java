package bbtests;

import org.testng.Assert;
import org.testng.annotations.Test;

import bbpages.BasePage;
import bbpages.WelcomePage;
import bbpages.SupportservicesinmenuPage;
import bbpages.HomePagebottomlinks;

public class SupportservicesinmenuPageTest  extends BasePage {	
@Test
	public void supportservicesvalidationoftitle() throws InterruptedException {
	    WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.clickUnitedstates();
        
        HomePagebottomlinks homePage = new HomePagebottomlinks(driver);
		homePage.clickMenu();
		
		SupportservicesinmenuPage menuPage = new SupportservicesinmenuPage(driver);
		menuPage.clickSupportservices();
		
		menuPage.clickVisitoursupportcenter();      //1
		String url1=driver.getTitle();
		Assert.assertEquals(url1, "Best Buy Support & Customer Service");
		homePage.clickMenu();
		menuPage.clickSupportservices();
				
		menuPage.clickRepairtechservices();    //2
		String url2=driver.getTitle();  
		Assert.assertEquals(url2, "Schedule a Service - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickRemotesupport();   //3
		String url3=driver.getTitle();
		Assert.assertEquals(url3, "Remote Support: Geek Squad - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickManageanappointment();    //4
		String url4=driver.getTitle();
		Assert.assertEquals(url4, "Appointment Finder - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickTreadeinyourdevice();  //5
		String url5=driver.getTitle();
		Assert.assertEquals(url5, "Trade-In - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickConnectwithanexpert();   //6
		String url6=driver.getTitle();
		Assert.assertEquals(url6,"Shop with an Expert - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickCheckrepairstatus();     //7
		String url7=driver.getTitle();
		Assert.assertEquals(url7, "Track Your Repair - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickBestbuybrandssupport();     //8
		String url8=driver.getTitle();
		Assert.assertEquals(url8, "Best Buy Brands Support");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickComputertabletservics();    //9
		String url9=driver.getTitle();
		Assert.assertEquals(url9, "Computer, Laptop & Tablet Repairs & Services by Geek Squad - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickTvhomethaterservics();    //10
		String url10=driver.getTitle();
		Assert.assertEquals(url10, "TV & Home Theater Services: Geek Squad - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickApplianceservices();  //11
		String url11=driver.getTitle();
		Assert.assertEquals(url11, "Appliance Services: Geek Squad - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickCellphoneservices(); //12
		String url12=driver.getTitle();
		Assert.assertEquals(url12, "Cell Phone Services and Repair – Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickAppleauthorizedrepair();  //13 
		String url13=driver.getTitle();
		Assert.assertEquals(url13, "Apple Repair Services: Apple Authorized Service Provider - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickSmarthomeservices();
		String url14=driver.getTitle();
		Assert.assertEquals(url14, "Smart Home Services: Installation, Set Up & Support - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickCarelectronicsprofessionalinstallation();    //15
		String url15=driver.getTitle();
		Assert.assertEquals(url15, "Car Electronics Professional Installation - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickFitnessequipment();    //16
		String url16=driver.getTitle();
		Assert.assertEquals(url16, "Fitness Equipment Services - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickEvchargerinstallation(); //17
		String url17=driver.getTitle();
		Assert.assertEquals(url17, "EV Charger Installation - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickAllservices();   //18
		String url18=driver.getTitle();
		Assert.assertEquals(url18, "Services - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickMybestbuytotalmembership();  //19
		String url19=driver.getTitle();
		Assert.assertEquals(url19, "Best Buy Total™ – Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickGeeksquadprotection();  //20
		String url20=driver.getTitle();
		Assert.assertEquals(url20, "Geek Squad Protection - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickApplecare();   //21
		String url21=driver.getTitle();
		Assert.assertEquals(url21, "AppleCare & AppleCare+ - Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickBestbuyprotection(); //22
		String url22=driver.getTitle();
		Assert.assertEquals(url22, "Product Protection with Total- Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickHaulawayrecycling();  //23
		String url23=driver.getTitle();
		Assert.assertEquals(url23, "Electronics and Appliances Recycling at Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickFindreplacementparts();  //24
		String url24=driver.getTitle();
		Assert.assertEquals(url24, "PartStore.com Parts and Accessories");
		driver.navigate().back();
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickSubscriptions(); //25
		String url25=driver.getTitle();
		Assert.assertEquals(url25, "Streaming Services: Subscriptions – Best Buy");
		homePage.clickMenu();
		menuPage.clickSupportservices();
		
		menuPage.clickClose();  //26
		
}
}