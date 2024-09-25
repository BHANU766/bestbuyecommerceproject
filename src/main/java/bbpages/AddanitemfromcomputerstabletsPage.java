package bbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddanitemfromcomputerstabletsPage {

	By laptopsdesktopsButton = By.xpath("//button[normalize-space()='Laptops & Desktops']");
	By laptopsButton = By.xpath("//a[normalize-space()='Laptops']");
	By alllaptopsButton = By.cssSelector("a[href='/site/laptop-computers/all-laptops/pcmcat138500050001.c?id=pcmcat138500050001']");
	By addtocartButton = By.cssSelector("body > div:nth-child(6) > main:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(5) > ol:nth-child(2) > li:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(2)");
	By gotocartButton = By.xpath("(//a[normalize-space()='Go to Cart'])[1]");
	By checkoutButton = By.xpath("//button[normalize-space()='Checkout']");
	
	WebDriver driver;
	WebDriverWait wait;
	
	public AddanitemfromcomputerstabletsPage (WebDriver driver) { 
	    this.driver=driver; 
		//wait = new WebDriverWait(driver, 10);
	}
	
	public void clickLaptopsdesktops() {
		driver.findElement(laptopsdesktopsButton).click();
	}
	
	public void clickLaptops() {
		driver.findElement(laptopsButton).click();
	}
	
	public void clickAlllaptops() {
		driver.findElement(alllaptopsButton).click();
	}
	
	public void clickAddtocart() {
		driver.findElement(addtocartButton).click();
	}
	
	public void clickGotocart() {
		driver.findElement(gotocartButton).click();
	}
	
	public void clickCheckout() {
		driver.findElement(checkoutButton).click();
	}
	
	
}
