package bbtests;

import org.testng.annotations.Test;

import bbpages.BasePage;
import bbpages.WelcomePage;
import bbpages.MenuPage;
import bbpages.AddanitemfromcomputerstabletsPage;
import bbpages.HomePagebottomlinks;

public class AddanitemfromcomputerstabletsPageTest extends BasePage {
@Test
	public void addanitemfromcomputerstabletstocart() throws InterruptedException {
	
	    WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.clickUnitedstates();    
	
		HomePagebottomlinks homePage = new HomePagebottomlinks(driver);
		homePage.clickMenu();
		
		MenuPage menuPage = new MenuPage(driver);
		menuPage.clickComputerstablets();
		
		AddanitemfromcomputerstabletsPage shopbydepartmentPage = new AddanitemfromcomputerstabletsPage(driver);
		shopbydepartmentPage.clickLaptopsdesktops();
		shopbydepartmentPage.clickLaptops();	
		shopbydepartmentPage.clickAlllaptops();				
		shopbydepartmentPage.clickAddtocart();
		shopbydepartmentPage.clickGotocart();
		shopbydepartmentPage.clickCheckout();
		
}
}