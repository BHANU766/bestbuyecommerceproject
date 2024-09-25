package bbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage {
  
	By unitedstatesButton = By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/h4");
	
	   WebDriver driver;
	   WebDriverWait wait;
	   
	public WelcomePage(WebDriver driver) { 
		this.driver=driver; 
		//wait = new WebDriverWait(driver, 10);
		} 
	
	public void clickUnitedstates() {
		driver.findElement(unitedstatesButton).click();		
	}	
}
