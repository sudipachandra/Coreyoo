package Coreyoo.Coreyoo_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CourierDetailsPage {
	
	public CourierDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	private WebDriver driver;
	
	@FindBy(xpath="//input[@name='itemDescription']")
	private WebElement itemDescriptionInputBox;
	
	@FindBy(xpath="//p[text()='SELECT ITEM CATEGORY']/../..")
	private WebElement itemCategoryDropDownField;
	
	@FindBy(xpath="//*[text()='Clothes']/../../../ul/li[2]")
	private WebElement selectItemCategoryField;
	
	@FindBy(xpath="//input[@name='estimatedValue']")
	private WebElement estimatedValueField;
	
	@FindBy(xpath="//p[text()='PICKUP ADDRESS']/../../../div[2]//button")
	private WebElement pickUpAddress;
	
	@FindBy(xpath = "//p[text()='PICKUP ADDRESS']/../../../div[2]//button/../../div[2]//button")
	private WebElement selectPickUp;
	
	@FindBy(xpath="//p[text()='DELIVERY ADDRESS']/../../../div[2]//button")
	private WebElement deliveryAddress;
	
	@FindBy(xpath ="//p[text()='DELIVERY ADDRESS']/../../../div[2]//button/../../div[2]//button")
	private WebElement selectDelivery;
	
	@FindBy(xpath="//p[text()='Secure my Shipment with ']/../input")
	private WebElement secureCheckBox;
	
	@FindBy(xpath="//span[text()='Proceed to Checkout']/parent::button")
	private WebElement checkOutBtn;
	
	@FindBy(xpath="//p[text()='I agree to the Coreyo']/../input")
	private WebElement consentCheckbox;
	
	public void courierDetails() throws InterruptedException {
		Thread.sleep(2000);
		itemDescriptionInputBox.sendKeys("test");
		itemCategoryDropDownField.click();
		selectItemCategoryField.click();
//		selectItemBox.click();
//		itemField.click();
//		Thread.sleep(2000);
		pickUpAddress.click();
		selectPickUp.click();
		deliveryAddress.click();
		selectDelivery.click();
		estimatedValueField.sendKeys("100");
		secureCheckBox.click();
		checkOutBtn.click();
		WebDriverWait wait = new WebDriverWait(this.driver, 10000);
		wait.until(ExpectedConditions.elementToBeClickable(consentCheckbox));
		consentCheckbox.click();
	}
}
