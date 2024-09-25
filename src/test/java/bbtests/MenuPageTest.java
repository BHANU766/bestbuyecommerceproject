package bbtests;

import org.testng.annotations.Test;

import bbpages.BasePage;
import bbpages.WelcomePage;
import bbpages.MenuPage;
import bbpages.HomePagebottomlinks;

public class MenuPageTest extends BasePage {	
@Test
	public void selectcategory() throws InterruptedException {
	
	    WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.clickUnitedstates();
        
		HomePagebottomlinks homePage = new HomePagebottomlinks(driver);
		homePage.clickMenu();
		
		MenuPage menuPage = new MenuPage(driver);
		menuPage.clickBrands();		
		Thread.sleep(2000);
		menuPage.clickComputerstablets();
}

}