package bbtests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import bbpages.BasePage;
import bbpages.WelcomePage;
import bbpages.SearchforaddanitemtocartPage;

public class SearchforaddanitemPageTest extends BasePage{		
@Test
	public void searchforaddanitemtocart() throws InterruptedException {
	    
	    WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.clickUnitedstates();
        
        SearchforaddanitemtocartPage searchforaddanitemPage = new SearchforaddanitemtocartPage(driver);
        searchforaddanitemPage.typeSearch("laptops");
        searchforaddanitemPage.clickSearchclick();
        searchforaddanitemPage.clickAddtocart();
        searchforaddanitemPage.clickGotocart();
      // searchforaddanitemPage.clickClose();
        searchforaddanitemPage.clickCheckout();
}

}