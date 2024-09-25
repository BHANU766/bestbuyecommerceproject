package bbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchforaddanitemtocartPage {

	By searchField = By.xpath("//*[@id='gh-search-input']");
	By searchclickButton = By.xpath("//span[@class='header-search-icon']//*[name()='svg']");
//	By addtocartButton = By.xpath("(//button[@type='button'][normalize-space()='Add to Cart'])[1]");
	By addtocartButton = By.xpath("(//button[contains(@type,'button')][normalize-space()='Add to Cart'])[2]");
	By gotocartButton = By.xpath("//a[normalize-space()='Go to Cart']");
//	By closeButton = By.xpath("//button[normalize-space()='Close']");
	By checkoutButton = By.xpath("//button[normalize-space()='Checkout']");
	
	WebDriver driver;
	WebDriverWait wait;
	
	public SearchforaddanitemtocartPage(WebDriver driver) { // create a constructor and pass the driver instance
		this.driver=driver; 
		//wait = new WebDriverWait(driver, 10);
	}
	
	public void typeSearch(String search) { //pass a parameter so we don't hardcode values in the object class.
		driver.findElement(searchField).clear();
		driver.findElement(searchField).sendKeys(search);		
	}
	
	public void clickSearchclick() {
		driver.findElement(searchclickButton).click();
	}
	
	public void clickAddtocart() {
		driver.findElement(addtocartButton).click();
	}
	
	public void clickGotocart() {
		driver.findElement(gotocartButton).click();
	}
	
//	public void clickClose() {
//		driver.findElement(closeButton).click();
//	}
	
	public void clickCheckout() {
		driver.findElement(checkoutButton).click();
	}
}
