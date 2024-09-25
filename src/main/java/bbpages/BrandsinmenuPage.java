package bbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrandsinmenuPage {
	
    By brandsButton = By.xpath("(//button[normalize-space()='Brands'])[1]");
	By appleButton = By.xpath("//a[normalize-space()='Apple']");
	By samsungButton = By.xpath("//a[normalize-space()='Samsung']");
	By playstationButton = By.xpath("//a[normalize-space()='PlayStation']");
	By sonyButton = By.xpath("//a[normalize-space()='Sony']");
	By lgButton = By.xpath("//a[normalize-space()='LG']");
	By microsoftButton = By.xpath("//a[normalize-space()='Microsoft']");
	By hpButton = By.xpath("//a[normalize-space()='HP']");
	By nintendoButton = By.xpath("//a[normalize-space()='Nintendo']");
	By lenovoButton = By.xpath("//a[normalize-space()='Lenovo']");	
	By asusButton = By.xpath("//a[normalize-space()='ASUS']");
	By dellButton = By.xpath("//a[normalize-space()='Dell']");
	By teslaButton = By.xpath("//a[normalize-space()='Tesla']");
	By allbrandsButton =  By.xpath("//a[normalize-space()='All Brands']");
	By bestbuyessentialsButton = By.xpath("//a[normalize-space()='Best Buy essentials']");
	By insigniaButton = By.xpath("//a[normalize-space()='Insignia']");
	By pacificsalesButton = By.xpath("//a[normalize-space()='Pacific Sales']");
	By rocketfishButton = By.xpath("//a[normalize-space()='Rocketfish']");
	By yardbirdButton = By.xpath("//li[contains(@class,'liDropdownList')]//a[contains(@class,'')][normalize-space()='Yardbird']");	
	By closeButton = By.xpath("//button[@class='c-button-unstyled close-button-sidecar']");
	
	WebDriver driver;
	WebDriverWait wait;
	
	public BrandsinmenuPage(WebDriver driver) { 
	    this.driver=driver; 
		//wait = new WebDriverWait(driver, 10);
	}
	
	public void clickBrands() {
		driver.findElement(brandsButton).click();
	}
	
	public void clickApple() {
		driver.findElement(appleButton).click();
	}
	
	public void clickSamsung() {
		driver.findElement(samsungButton).click();
	}
	
	public void clickPlaystation() {
		driver.findElement(playstationButton).click();
	}
	
	public void clickSony() {
		driver.findElement(sonyButton).click();
	}
	
	public void clickLg() {
		driver.findElement(lgButton).click();
	}
	
	public void clickMicrosoft() {
		driver.findElement(microsoftButton).click();
	}
	
	public void clickHp() {
		driver.findElement(hpButton).click();
	}
	
	public void clickNintendo() {
		driver.findElement(nintendoButton).click();
	}
			
	public void clickLenovo() {
		driver.findElement(lenovoButton).click();
	}
	
	public void clickAsus() {
		driver.findElement(asusButton).click();
	}
	
	public void clickDell() {
		driver.findElement(dellButton).click();
	}
	
	public void clickTesla() {
		driver.findElement(teslaButton).click();
	}
	
	public void clickAllbrands() {
		driver.findElement(allbrandsButton).click();
	}
	
	public void clickBestbuyessentials() {
		driver.findElement(bestbuyessentialsButton).click();
	}
	
	public void clickInsignia() {
		driver.findElement(insigniaButton).click();
	}
	
	public void clickPacificsales() {
		driver.findElement(pacificsalesButton).click();
	}
	
	public void clickRocketfish() {
		driver.findElement(rocketfishButton).click();
	}
	
	public void clickYardbird() {
		driver.findElement(yardbirdButton).click();
	}
	
	public void clickClose() {
		driver.findElement(closeButton).click();
	}






					
}
