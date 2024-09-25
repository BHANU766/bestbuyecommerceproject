package bbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SupportservicesinmenuPage {
	
    By supportservicesButton = By.xpath("//button[normalize-space()='Support & Services']");
	By visitoursupportcenterButton = By.xpath("//li[contains(@class,'liDropdownList')]//a[contains(@class,'')][normalize-space()='Visit our Support Center']");
	By repairtechservicesButton = By.xpath("//a[normalize-space()='Repair & Tech Services']");
	By remotesupportButton = By.xpath("//a[normalize-space()='Remote Support']");
	By manageanappointmentButton = By.xpath("//a[contains(@href,'/dossier/service/appointmentmanager')]");
	By treadeinyourdeviceButton = By.xpath("//a[normalize-space()='Trade In Your Device']");
	By connectwithanexpertButton = By.xpath("//li[contains(@class,'liDropdownList')]//a[contains(@class,'')][normalize-space()='Connect with an Expert']");
	By checkrepairstatusButton = By.xpath("//a[normalize-space()='Check Repair Status']");
	By bestbuybrandssupportButton = By.xpath("//a[normalize-space()='Best Buy Brands Support']");
	By computertabletservicsButton =  By.xpath("//a[normalize-space()='Computer & Tablet Services']");
	By tvhomethaterservicsButton = By.xpath("//a[normalize-space()='TV & Home Theater Services']");
	By applianceservicesButton = By.xpath("//a[normalize-space()='Appliance Services']");
	By cellphoneservicesButton = By.xpath("//a[normalize-space()='Cell Phone Services']");
	By appleauthorizedrepairButton = By.xpath("//a[normalize-space()='Apple Authorized Repair']");
	By smarthomeservicesButton=  By.xpath("//a[normalize-space()='Smart Home Services']");
	By carelectronicsprofessionalinstallationButton = By.xpath("//a[normalize-space()='Car Electronics Professional Installation']");
	By fitnessequipmentButton = By.xpath("//a[normalize-space()='Fitness Equipment Services']");
	By evchargerinstallationButton = By.xpath("//a[normalize-space()='EV Charger Installation']");
	By allservicesButton = By.xpath("//a[normalize-space()='All Services']");
	By mybestbuytotalmembershipButton = By.xpath("//a[normalize-space()='My Best Buy Total Membership']");
	By geeksquadprotectionButton = By.xpath("//a[normalize-space()='Geek Squad Protection']");
	By applecareButton = By.xpath("//a[normalize-space()='AppleCare+']");
	By bestbuyprotectionButton = By.xpath("//a[normalize-space()='Best Buy Protection']");
	By haulawayrecyclingButton = By.xpath("//li[contains(@class,'liDropdownList')]//a[contains(@class,'')][normalize-space()='Haul Away & Recycling']");
	By findreplacementpartsButton = By.xpath("//a[normalize-space()='Find Replacement Parts']");
	By subscriptionsButton = By.xpath("//a[normalize-space()='Subscriptions']");
	By closeButton = By.xpath("//button[contains(@class,'c-button-unstyled close-button-sidecar')]");
		
    WebDriver driver;
    WebDriverWait wait;
    
    public SupportservicesinmenuPage(WebDriver driver) { 
	    this.driver=driver; 
		//wait = new WebDriverWait(driver, 10);
	}
    
    public void clickSupportservices() {
		driver.findElement(supportservicesButton).click();
	}
    
    public void clickVisitoursupportcenter() {
		driver.findElement( visitoursupportcenterButton).click();
	}
	
	public void clickRepairtechservices() {
		driver.findElement(repairtechservicesButton).click();
	}
	
	public void clickRemotesupport() {
		driver.findElement(remotesupportButton).click();
	}
	
	public void clickManageanappointment() {
		driver.findElement(manageanappointmentButton).click();
	}
	
	public void clickTreadeinyourdevice() {
		driver.findElement(treadeinyourdeviceButton).click();
	}
	
	public void clickConnectwithanexpert() {
		driver.findElement(connectwithanexpertButton).click();
	}
	
	public void clickCheckrepairstatus() {
		driver.findElement(checkrepairstatusButton).click();
	}
	
	public void clickBestbuybrandssupport() {
		driver.findElement(bestbuybrandssupportButton).click();
	}
	
	public void clickComputertabletservics() {
		driver.findElement(computertabletservicsButton).click();
	}
	
	public void clickTvhomethaterservics() {
		driver.findElement(tvhomethaterservicsButton).click();
	}
	
	public void clickApplianceservices() {
		driver.findElement(applianceservicesButton).click();
	}
	
	public void clickCellphoneservices() {
		driver.findElement(cellphoneservicesButton).click();
	}
	
	public void clickAppleauthorizedrepair() {
		driver.findElement(appleauthorizedrepairButton).click();
	}
	
	public void clickSmarthomeservices() {
		driver.findElement(smarthomeservicesButton).click();
	}
	
	public void clickCarelectronicsprofessionalinstallation() {
		driver.findElement(carelectronicsprofessionalinstallationButton).click();
	}
	
	public void clickFitnessequipment() {
		driver.findElement(fitnessequipmentButton).click();
	}
	
	public void clickEvchargerinstallation() {
		driver.findElement(evchargerinstallationButton).click();
	}
	
	public void clickAllservices() {
		driver.findElement(allservicesButton).click();
	}
	
	public void clickMybestbuytotalmembership() {
		driver.findElement(mybestbuytotalmembershipButton).click();
	}
	
	public void clickGeeksquadprotection() {
		driver.findElement(geeksquadprotectionButton).click();
	}
	
	public void clickApplecare() {
		driver.findElement(applecareButton).click();
	}
	
	public void clickBestbuyprotection() {
		driver.findElement(bestbuyprotectionButton).click();
	}
	
	public void clickHaulawayrecycling() {
		driver.findElement(haulawayrecyclingButton).click();
	}
	
	public void clickFindreplacementparts() {
		driver.findElement(findreplacementpartsButton).click();
	}
	
	public void clickSubscriptions() {
		driver.findElement(subscriptionsButton).click();
	}
	
	public void clickClose() {
		driver.findElement(closeButton).click();
	}
	
	
					
}
