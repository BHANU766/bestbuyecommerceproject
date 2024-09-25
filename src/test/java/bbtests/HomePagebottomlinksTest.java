package bbtests;

import org.testng.Assert;
import org.testng.annotations.Test;

import bbpages.BasePage;
import bbpages.WelcomePage;
import bbpages.HomePagebottomlinks;

public class HomePagebottomlinksTest extends BasePage {    	
@Test
	public void verifyhomepagebottomlinks() throws InterruptedException {
	
	       WelcomePage welcomePage = new WelcomePage(driver);
	       welcomePage.clickUnitedstates();
	       
		   HomePagebottomlinks homePage = new HomePagebottomlinks(driver);
		   homePage.clickAccessibility();		   
		   String url1=driver.getTitle();
		   System.out.println("title of website "+url1);
		   Assert.assertEquals(url1, "Accessibility - Best Buy");
		   driver.navigate().back();
		   
		   homePage.clickTermsconditions();
		   String url2=driver.getTitle();
		   System.out.println("title of website "+url2);
		   Assert.assertEquals(url2, "BestBuy.com Terms and Conditions");
		   driver.navigate().back();
		   
		   homePage.clickPrivacy();
		   String url3=driver.getTitle();
		   System.out.println("title of website "+url3);
		   Assert.assertEquals(url3, "Privacy Policy Hub - Best Buy");
		   driver.navigate().back();
		   
		   homePage.clickInterestbasedads();
		   String url4=driver.getTitle();
		   System.out.println("title of website "+url4);
		   Assert.assertEquals(url4, "Interest-Based Ads - Best Buy");
		   driver.navigate().back();
		   
		   homePage.clickStateprivacyrights();
		   String url5=driver.getTitle();
		   System.out.println("title of website "+url5);
		   Assert.assertEquals(url5, "State Privacy Rights - Best Buy");
		   driver.navigate().back();
		   
		   homePage.clickHealthdataprivacy();
		   String url6=driver.getTitle();
		   System.out.println("title of website "+url6);
		   Assert.assertEquals(url6,"Health Data Privacy Information - Best Buy");
		   driver.navigate().back();
		   
		   homePage.clickDonotsell();
		   String url7=driver.getTitle();
		   System.out.println("title of website "+url7);
		   Assert.assertEquals(url7, "Start Request - Best Buy");
		   driver.navigate().back();
		   		  
	       homePage.clickLimituse();
		   String url8=driver.getTitle();
	 	   System.out.println("title of website "+url8);
	 	   Assert.assertEquals(url8, "Best Buy");
	 	   driver.navigate().back();
		   
		   homePage.clickTargetedadvertising();
		   String url9=driver.getTitle();
		   System.out.println("title of website "+url9);
		   Assert.assertEquals(url9, "Start Request - Best Buy");
		   driver.navigate().back();
		   
		   homePage.clickCasupplychain();
		   String url10=driver.getTitle().trim();
		   System.out.println("title of website "+url10);
		   Assert.assertEquals(url10, "California Supply Chain Transparency Act - Best Buy");
		   
}
}