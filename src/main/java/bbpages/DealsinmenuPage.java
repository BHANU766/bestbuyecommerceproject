package bbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DealsinmenuPage {

	By dealsButton = By.xpath("//button[normalize-space()='Deals']");
	By topdealsButton = By.xpath("(//a[contains(@class,'')][normalize-space()='Top Deals'])[1]");
	By dealofthedayButton = By.xpath("//li[contains(@class,'liDropdownList')]//a[contains(@class,'')][normalize-space()='Deal of the Day']");
	By exclusivememberdealsButton = By.xpath("//a[normalize-space()='Exclusive Member Deals']");
	By bestbuyoutletButton = By.xpath("//li[contains(@class,'liDropdownList')]//a[contains(@class,'')][normalize-space()='Best Buy Outlet']");
	By clearancedealsButton = By.xpath("//a[normalize-space()='Clearance Deals']");
	By appleshoppingeventButton = By.xpath("//a[normalize-space()='Apple Shopping Event']");
	By tvandhometheaterButton = By.xpath("//a[normalize-space()='TV & Home Theater']");
	By computerstabletsButton= By.xpath("//a[normalize-space()='Computers & Tablets']");
	By videogamesButton = By.xpath("//a[normalize-space()='Video Games']");
	By audioButton = By.xpath("//a[normalize-space()='Audio']");
	By cellphonesButton = By.xpath("//a[normalize-space()='Cell Phones']");
	By smarthomesecuritywifiButton = By.xpath("//a[normalize-space()='Smart Home, Security & Wi-Fi']");
	By toysgamescollectiblesButton= By.xpath("//a[normalize-space()='Toys, Games & Collectibles']");
	By camerascamcordersdronesButton = By.xpath("//a[normalize-space()='Cameras, Camcorders & Drones']");
	By wearabletechnologyButton = By.xpath("//a[normalize-space()='Wearable Technology']");
	By appliancesButton = By.xpath("//a[normalize-space()='Appliances']");
	By homefurnitureofficeButton = By.xpath("//a[normalize-space()='Home, Furniture & Office']");
	By outdoorlivingButton = By.xpath("//a[normalize-space()='Outdoor Living']");
	By carelectronicsButton = By.xpath("//a[normalize-space()='Car Electronics']");
	By electrictransportationButton = By.xpath("//a[normalize-space()='Car Electronics']");
	By healthwellnessfitnessButton = By.xpath("//a[normalize-space()='Health, Wellness & Fitness']");
	By salespromotionsButton = By.xpath("//a[normalize-space()='Sales & Promotions']");
	By closeButton = By.xpath("//button[contains(@class,'c-button-unstyled close-button-sidecar')]");
					
	WebDriver driver;
	WebDriverWait wait;
	
	public DealsinmenuPage(WebDriver driver) { 
	    this.driver=driver; 
		//wait = new WebDriverWait(driver, 10);
	}
	
	public void clickDeals() {
		driver.findElement(dealsButton).click();
	}
	
	public void clickTopdeals() {
		driver.findElement(topdealsButton).click();
	}
	
	public void clickDealoftheday() {
		driver.findElement(dealofthedayButton).click();
	}
	
	public void clickExclusivememberdeals() {
		driver.findElement(exclusivememberdealsButton).click();
	}
	
	public void clickBestbuyoutlet() {
		driver.findElement(bestbuyoutletButton).click();
	}
	
	public void clickClearancedeals() {
		driver.findElement(clearancedealsButton).click();
	}
	
	public void clickAppleshoppingevent() {
		driver.findElement(appleshoppingeventButton).click();
	}
	
	public void clickTvandhometheater() {
		driver.findElement(tvandhometheaterButton).click();
	}
	
	public void clickComputerstablets() {
		driver.findElement(computerstabletsButton).click();
	}
	
	public void clickVideogames() {
		driver.findElement(videogamesButton).click();
	}
	
	public void clickAudio() {
		driver.findElement(audioButton).click();
	}
	
	public void clickCellphones() {
		driver.findElement(cellphonesButton).click();
	}
	
	public void clickSmarthomesecuritywifi() {
		driver.findElement(smarthomesecuritywifiButton).click();
	}
	
	public void clicktoysgamescollectibles() {
		driver.findElement(toysgamescollectiblesButton).click();
	}
			
	public void clickCamerascamcordersdrones () {
		driver.findElement(camerascamcordersdronesButton).click();
	}
	
	public void clickWearabletechnology() {
		driver.findElement(wearabletechnologyButton).click();
	}
	
	public void clickAppliances() {
		driver.findElement(appliancesButton).click();
	}
	
	public void clickHomefurnitureoffice() {
		driver.findElement(homefurnitureofficeButton).click();
	}
	
	public void clickOutdoorliving() {
		driver.findElement(outdoorlivingButton).click();
	}
	
	public void clickCarelectronics() {
		driver.findElement(carelectronicsButton).click();
	}
	
	public void clickelectrictransportation() {
		driver.findElement(electrictransportationButton).click();
	}
	
	public void clickHealtwellnessfitness() {
		driver.findElement(healthwellnessfitnessButton).click();
	}
	
	public void clickSalespromotions() {
		driver.findElement(salespromotionsButton).click();
	}
	
	public void clickClose() {
		driver.findElement(closeButton).click();
	}	
}
