package bbtests;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import bbpages.AccountPage;
import bbpages.BasePage;
import bbpages.WelcomePage;
import bbpages.CreateaccountPage;
import bbpages.SigninPage;
import bbpages.HomePagebottomlinks;

public class SigninPageTest extends BasePage {	
@Test
	public void signin() throws InterruptedException, AWTException {
	
	    WelcomePage welcomePage = new WelcomePage(driver);
	    welcomePage.clickUnitedstates();
	    
		HomePagebottomlinks homePage = new HomePagebottomlinks(driver);
		homePage.clickAccount();
		
		AccountPage accountPage = new AccountPage(driver);
		accountPage.clickSignin1();
		
		SigninPage signinPage = new SigninPage(driver);
		signinPage.typeEmailaddress("admin123@gmail.com");
		signinPage.typePassword("Admin@123654");
		signinPage.clickSignin2();
}

}