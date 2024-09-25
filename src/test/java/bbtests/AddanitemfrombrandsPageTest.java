package bbtests;

import org.testng.annotations.Test;

import bbpages.BasePage;
import bbpages.AddanitemfrombrandsPage;
import bbpages.WelcomePage;
import bbpages.MenuPage;
import bbpages.HomePagebottomlinks;

public class AddanitemfrombrandsPageTest extends BasePage {
 
@Test
	public void addanitemfrombrandstocart() throws InterruptedException {
	
	    WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.clickUnitedstates();
	
		HomePagebottomlinks homePage = new HomePagebottomlinks(driver);
		homePage.clickMenu();
		
		MenuPage menuPage = new MenuPage(driver);
		menuPage.clickBrands();
		
		AddanitemfrombrandsPage brandsPage = new AddanitemfrombrandsPage(driver);
		brandsPage.clickApple();
		brandsPage.clickMac();
		brandsPage.clickMacbookair();
		brandsPage.clickAddtocart();
		brandsPage.clickGotocart();
		brandsPage.clickClose();
		brandsPage.clickCheckout();
}
}