package bbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateaccountPage {
	
	By firstnameField = By.xpath("//*[@id='firstName']");
	By lastnameField = By.xpath("//*[@id='lastName']");
	By emailaddressField = By.xpath("//*[@id='email']");
	By passwordField = By.xpath("//*[@id='fld-p1']");
	By confirmpasswordField = By.xpath("//*[@id='reenterPassword']");
	By mobilephonenumberField = By.xpath("//*[@id='phone']");
	By checkboxButton = By.xpath("//*[@id='is-recovery-phone']");
	By createanaccount2Btn = By.xpath("/html/body/div[1]/div/section/main/div[2]/div/div/div[1]/div/div/div/div/div/form/div[8]/button");
		
	WebDriver driver;
	WebDriverWait wait;
	
	public CreateaccountPage(WebDriver driver) { // create a constructor and pass the driver instance
		this.driver=driver; 
		//wait = new WebDriverWait(driver, 10);
	}
		
	public void typeFirstname(String firstname) { 
		driver.findElement(firstnameField).clear();
		driver.findElement(firstnameField).sendKeys(firstname);
	}
	
	public void typeLastname(String lastname) { 
		driver.findElement(lastnameField).clear();
		driver.findElement(lastnameField).sendKeys(lastname);
	}

	public void typeEmailaddress(String emailaddress) { 
		driver.findElement(emailaddressField).clear();
		driver.findElement(emailaddressField).sendKeys(emailaddress);
	}
	
	public void typePassword(String password) { 
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void typeConfirmpassword(String confirmpassword) { 
		driver.findElement(confirmpasswordField).clear();
		driver.findElement(confirmpasswordField).sendKeys(confirmpassword);
	}
	
	public void typeMobilephonenumber(String mobilephonenumber) { 
		driver.findElement(mobilephonenumberField).clear();
		driver.findElement(mobilephonenumberField).sendKeys(mobilephonenumber);
	}
		
	public void clickCheckbox() {
		driver.findElement(checkboxButton).click();
	}
	
	public void clickCreateanaccount2() {
		driver.findElement(createanaccount2Btn).click();		
	}
	
	
	

}
