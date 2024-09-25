package bbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {
     
	By signin1Button = By.cssSelector(".c-button.c-button-secondary.c-button-sm.sign-in-btn");
	By createaccount1Button = By.cssSelector(".c-button.c-button-outline.c-button-sm.create-account-btn");
	   
	   WebDriver driver;
	   WebDriverWait wait;
	   
    public AccountPage(WebDriver driver) { // create a constructor and pass the driver instance
		this.driver=driver; 
		//wait = new WebDriverWait(driver, 10);
	}  
    
    public void clickSignin1() {
		driver.findElement(signin1Button).click();		
	}
	
	public void clickCreateaccount1() {
		driver.findElement(createaccount1Button).click();		
	}
	
}
