package bbtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import bbpages.AccountPage;
import bbpages.BasePage;
import bbpages.WelcomePage;
import bbpages.CreateaccountPage;
import bbpages.HomePagebottomlinks;

public class CreateaccountPageTest extends BasePage{
@Test
	public void createaccount() throws InterruptedException {
	
	    WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.clickUnitedstates(); 
	
		HomePagebottomlinks homePage = new HomePagebottomlinks(driver);
		homePage.clickAccount();
		
		AccountPage accountPage = new AccountPage(driver);
		accountPage.clickCreateaccount1();
		
		CreateaccountPage loginPage = new CreateaccountPage(driver);
	    loginPage.typeFirstname("admin");
	    loginPage.typeLastname("reddy");
	    loginPage.typeEmailaddress("admin123@gmail.com");
	    loginPage.typePassword("Admin@123654");
	    loginPage.typeConfirmpassword("Admin@123654");
	    loginPage.typeMobilephonenumber("9876543210");
	    loginPage.clickCheckbox();
	    Thread.sleep(3000);
	    loginPage.clickCreateanaccount2();
	    
		
	}


}	
