package bbtests;

import org.testng.Assert;
import org.testng.annotations.Test;

import bbpages.BasePage;
import bbpages.BrandsinmenuPage;
import bbpages.WelcomePage;
import bbpages.HomePagebottomlinks;

public class BrandsinmenuPageTest extends BasePage {	
@Test
	public void brandsvalidationoftitle() throws InterruptedException {
	    WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.clickUnitedstates();
        
        HomePagebottomlinks homePage = new HomePagebottomlinks(driver);
		homePage.clickMenu();
		
		BrandsinmenuPage menuPage = new BrandsinmenuPage(driver);
    	menuPage.clickBrands();
    	
    	menuPage.clickApple();       //1
		String url1=driver.getTitle();
		Assert.assertEquals(url1, "Apple – Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickSamsung();    //2
		String url2=driver.getTitle();  
		Assert.assertEquals(url2, "Samsung Store – Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickPlaystation();   //3
		String url3=driver.getTitle();
		Assert.assertEquals(url3, "Sony PlayStation 5: PS5 - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickSony();    //4
		String url4=driver.getTitle();
		Assert.assertEquals(url4, "Sony Store: Sony Electronics & Entertainment - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickLg();   //5
		String url5=driver.getTitle();
		Assert.assertEquals(url5, "LG Store - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickMicrosoft();   //6
		String url6=driver.getTitle();
		Assert.assertEquals(url6,"Microsoft Brand Store - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickHp();     //7
		String url7=driver.getTitle();
		Assert.assertEquals(url7, "HP - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickNintendo();     //8
		String url8=driver.getTitle();
		Assert.assertEquals(url8, "Nintendo Switch: Console, Games & Accessories - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickLenovo();    //9
		String url9=driver.getTitle();
		Assert.assertEquals(url9, "Lenovo Computers - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();	
		
		
						
		menuPage.clickAsus();     //10
		String url10=driver.getTitle();
		Assert.assertEquals(url10, "ASUS Computers: Gaming Laptops, VivoBook, Zenbook - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickDell();  //11
		String url11=driver.getTitle();
		Assert.assertEquals(url11, "Dell Computers - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickTesla();   //12
		String url12=driver.getTitle();
		Assert.assertEquals(url12, "Tesla - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickAllbrands();   //13 
		String url13=driver.getTitle();
		Assert.assertEquals(url13, "Name Brands - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickBestbuyessentials(); //14 
		String url14=driver.getTitle();
		Assert.assertEquals(url14, "Best Buy Essentials - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickInsignia();      //15
		String url15=driver.getTitle();
		Assert.assertEquals(url15, "Insignia - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickPacificsales();    //16
		String url16=driver.getTitle();
		Assert.assertEquals(url16, "Pacific Sales Premium Appliances – Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickRocketfish();  //17
		String url17=driver.getTitle();
		Assert.assertEquals(url17, "Rocketfish - Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickYardbird();   //18
		String url18=driver.getTitle();
		Assert.assertEquals(url18, "Yardbird – Best Buy");
		homePage.clickMenu();
		menuPage.clickBrands();
		
		menuPage.clickClose();  //19
		
		
		

		
		
}
}