package bbtests;

import org.testng.Assert;
import org.testng.annotations.Test;

import bbpages.BasePage;
import bbpages.WelcomePage;
import bbpages.DealsinmenuPage;
import bbpages.HomePagebottomlinks;

public class DealsinmenuPageTest extends BasePage {	
@Test
	public void dealsvalidationoftitle() throws InterruptedException {
	
	    WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.clickUnitedstates();
        
        HomePagebottomlinks homePage = new HomePagebottomlinks(driver);
		homePage.clickMenu();
		
		DealsinmenuPage menuPage = new DealsinmenuPage(driver);
		menuPage.clickDeals();
		
		menuPage.clickTopdeals();       //1
		String url1=driver.getTitle();
		Assert.assertEquals(url1, "Best Buy Top Deals");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickDealoftheday();    //2
		String url2=driver.getTitle();  
		Assert.assertEquals(url2, "Deal of the Day: Electronics Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickExclusivememberdeals();   //3
		String url3=driver.getTitle();
		Assert.assertEquals(url3, "Member Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickBestbuyoutlet();    //4
		String url4=driver.getTitle();
		Assert.assertEquals(url4, "Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickClearancedeals();   //5
		String url5=driver.getTitle();
		Assert.assertEquals(url5, "Clearance Electronics Outlet - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickAppleshoppingevent();   //6
		String url6=driver.getTitle();
		Assert.assertEquals(url6,"Apple Shopping Event – Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickTvandhometheater();     //7
		String url7=driver.getTitle();
		Assert.assertEquals(url7, "All TV & Home Theater Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickComputerstablets();     //8
		String url8=driver.getTitle();
		Assert.assertEquals(url8, "Computer & Tablet Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();	
		
		menuPage.clickVideogames();    //9
		String url9=driver.getTitle();
		Assert.assertEquals(url9, "All Video Game Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();	
		
		menuPage.clickAudio();     //10
		String url10=driver.getTitle();
		Assert.assertEquals(url10, "All Audio Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickCellphones();  //11
		String url11=driver.getTitle();
		Assert.assertEquals(url11, "Cell Phone Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickSmarthomesecuritywifi();   //12
		String url12=driver.getTitle();
		Assert.assertEquals(url12, "All Smart Home, Security & Wi-Fi Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clicktoysgamescollectibles();   //13 
		String url13=driver.getTitle();
		Assert.assertEquals(url13, "Toy, Game & Collectible Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickCamerascamcordersdrones(); //14 
		String url14=driver.getTitle();
		Assert.assertEquals(url14, "Camera, Camcorder & Drone Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickWearabletechnology();      //15
		String url15=driver.getTitle();
		Assert.assertEquals(url15, "All Wearable Technology Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickAppliances();    //16
		String url16=driver.getTitle();
		Assert.assertEquals(url16, "All Appliance Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickHomefurnitureoffice();  //17
		String url17=driver.getTitle();
		Assert.assertEquals(url17, "All Home, Furniture & Office Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickOutdoorliving();   //18
		String url18=driver.getTitle();
		Assert.assertEquals(url18, "All Outdoor Living Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickCarelectronics();  //19
		String url19=driver.getTitle();
		Assert.assertEquals(url19, "All Car Electronics Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickelectrictransportation();  //20
		String url20=driver.getTitle();
		Assert.assertEquals(url20, "All Car Electronics Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickHealtwellnessfitness();   //21
		String url21=driver.getTitle();
		Assert.assertEquals(url21, "All Health, Wellness & Fitness Deals - Best Buy");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickSalespromotions(); //22
		String url22=driver.getTitle();
		Assert.assertEquals(url22, "Sales and Promotions at Best Buy: On Sale Electronics, Coupons and Promo Codes");
		homePage.clickMenu();
		menuPage.clickDeals();
		
		menuPage.clickClose();  //23
}
}