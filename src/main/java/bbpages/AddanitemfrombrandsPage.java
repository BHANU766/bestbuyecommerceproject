package bbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddanitemfrombrandsPage {
	
	By appleButton = By.xpath("//a[normalize-space()='Apple']");
	By macButton = By.xpath("//*[@id='widget-37f3e5b8-3247-40f6-96bf-5ecc5afa4492']/div/div[2]/div/nav/div/ul/li[1]/a");
	By macbookairButton = By.xpath("//a[normalize-space()='MacBook Air']");
	By addtocartButton = By.xpath("(//button[@type='button'][normalize-space()='Add to Cart'])[1]");
	By gotocartButton = By.xpath("//*[@id='attach-modal-drawer-overlay-backdrop']/div/div[3]/div/div[1]/a");
	By closeButton = By.xpath("//*[@id='integrated-membership-platform-components']/div[2]/div/div[1]/div/div/div/div/div/div[2]/div[2]/div[1]/div[2]/button");
	By checkoutButton = By.xpath("//button[normalize-space()='Checkout']");
	
	WebDriver driver;
	WebDriverWait wait;
	
	public AddanitemfrombrandsPage(WebDriver driver) { 
	    this.driver=driver; 
		//wait = new WebDriverWait(driver, 10);
	}
	
	public void clickApple() {
		driver.findElement(appleButton).click();
	}
	
	public void clickMac() {
		driver.findElement(macButton).click();
	}
	
	public void clickMacbookair() {
		driver.findElement(macbookairButton).click();
	}
	
	public void clickAddtocart() {
		driver.findElement(addtocartButton).click();
	}
	
	public void clickGotocart() {
		driver.findElement(gotocartButton).click();
	}
	
	public void clickClose() {
		driver.findElement(closeButton).click();
	}
	
	public void clickCheckout() {
		driver.findElement(checkoutButton).click();
	}
	
}
