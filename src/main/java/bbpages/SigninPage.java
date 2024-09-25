package bbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SigninPage {
	
	
	By emailaddressField = By.xpath("//*[@id='fld-e']");
	By passwordField = By.xpath("//*[@id='fld-p1']");	
	By signin2Btn = By.xpath("/html/body/div[1]/div/section/main/div[2]/div/div/div[1]/div/div/div/div/div/form/div[3]/button");
				
		
	WebDriver driver;
	WebDriverWait wait;
	
	public SigninPage(WebDriver driver) { // create a constructor and pass the driver instance
		this.driver=driver; 
		//wait = new WebDriverWait(driver, 10);
	}
	
	public void typeEmailaddress(String emailaddress ) { 
		driver.findElement(emailaddressField).clear();
		driver.findElement(emailaddressField).sendKeys(emailaddress);
	}
	
	public void typePassword(String password ) { 
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickSignin2() {
		driver.findElement(signin2Btn).click();		
	}
					
	
}
