package bbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {

	By brandsButton = By.xpath("(//button[normalize-space()='Brands'])[1]");
	By computerstabletsButton = By.xpath("//button[normalize-space()='Computers & Tablets']");
			
		
	WebDriver driver;
	WebDriverWait wait;
	
	public MenuPage(WebDriver driver) { 
	    this.driver=driver; 
		//wait = new WebDriverWait(driver, 10);
	}
	
	public void clickBrands() {
		driver.findElement(brandsButton).click();
	}
			
	public void clickComputerstablets() {
		driver.findElement(computerstabletsButton).click();
	}
		
}
