package bbpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.spicejet.Spicejet;

public class HomePagebottomlinks {

	By menuButton = By.cssSelector("button[aria-label='Menu']");
	By searchField = By.xpath("//*[@id='gh-search-input']");
	By accountButton = By.xpath("//*[@id='account-menu-account-button']/span");
	By accessibilityButton = By.xpath("//*[@id='footer']/div[2]/div[2]/a[1]");
	By termsconditionsButton = By.xpath("//*[@id='footer']/div[2]/div[2]/a[2]");
	By privacyButton = By.xpath("//*[@id='footer']/div[2]/div[2]/a[3]");
	By interestbasedadsButton = By.xpath("//*[@id='footer']/div[2]/div[2]/a[4]");
	By stateprivacyrightsButton = By.xpath("//*[@id='footer']/div[2]/div[2]/a[5]");
	By healthdataprivacyButton = By.xpath("//*[@id='footer']/div[2]/div[2]/a[6]");
	By donotsellButton = By.xpath("//*[@id='footer']/div[2]/div[2]/a[7]");
	By limituseButton = By.xpath("//*[@id='footer']/div[2]/div[2]/a[8]");
	By targetedadvertisingButton = By.xpath("//a[normalize-space()='Targeted Advertising Opt Out']");
	By casupplychainButton = By.xpath("//*[@id=\"footer\"]/div[2]/div[2]/a[10]");
	
		WebDriver driver;
		WebDriverWait wait;
	
	
	public HomePagebottomlinks(WebDriver driver) { // create a constructor and pass the driver instance
		this.driver=driver; 
		//wait = new WebDriverWait(driver, 10);
	}
	
	public void clickMenu() {
		driver.findElement(menuButton).click();		
	}
	
	public void typeSearch(String search) { //pass a parameter so we don't hardcode values in the object class.
		driver.findElement(searchField).clear();
		driver.findElement(searchField).sendKeys(search);
	}
	
	public void clickAccount() {
		driver.findElement(accountButton).click();		
	}
		
	public void clickAccessibility() {
		driver.findElement(accessibilityButton).click();		
	}		
	
	public void clickTermsconditions() {
		driver.findElement(termsconditionsButton).click();		
	}
	
	public void clickPrivacy() {
		driver.findElement(privacyButton).click();		
	}
	
	public void clickInterestbasedads() {
		driver.findElement(interestbasedadsButton).click();		
	}
	
	public void clickStateprivacyrights() {
		driver.findElement(stateprivacyrightsButton).click();		
	}
	
	public void clickHealthdataprivacy() {
		driver.findElement(healthdataprivacyButton).click();		
	}
	
	public void clickDonotsell() {
		driver.findElement(donotsellButton).click();		
	}
	 
	public void clickLimituse() {
		driver.findElement(limituseButton).click();		
	}
	
	public void clickTargetedadvertising() {
		driver.findElement(targetedadvertisingButton).click();		
	}
	
	public void clickCasupplychain() {
		driver.findElement(casupplychainButton).click();		
	}
	
				

}
