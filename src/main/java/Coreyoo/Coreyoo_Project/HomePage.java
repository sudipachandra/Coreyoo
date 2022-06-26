package Coreyoo.Coreyoo_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver = null;
	
	@FindBy(xpath="//span[text()='Login | Signup']")
	private WebElement signUpBtn1;
	
	@FindBy(xpath="//button[text()='Sign up']")
	private WebElement signUpBtn2;
	
	@FindBy(xpath="//*[text()='First Name']")
	private WebElement firstNameField;
	
	@FindBy(xpath="//*[text()='Last Name']")
	private WebElement lastNameField;
	
	@FindBy(xpath="//*[text()='Email Address']")
	private WebElement emailAddressField;
	
	@FindBy(xpath="//*[text()='Mobile No.']")
	private WebElement mobileNoField ;
	
	@FindBy(xpath="//*[text()='Password']")
	private WebElement passwordField ;
	
	@FindBy(xpath="//*[text()='Register']")
	private WebElement registerBtn ;
	
	@FindBy(xpath="//button[text()='Login with email']")
	private WebElement loginWithEmailLink ;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailIdForLogin ;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordForLogin ;
	
	@FindBy(xpath="//*[text()='Log in']/parent::button")
	private WebElement loginBtn ;
	
	@FindBy(xpath="//*[@name='pickupLocation']")
	private WebElement pickUpLocationField ;
	
	@FindBy(xpath="//*[@name='deliveryLocation']")
	private WebElement deliveryLocationField  ;
	
	@FindBy(xpath="//div[@id = 'headlessui-radiogroup-option-193']")
	//@FindBy(xpath="//*[@id='headlessui-radiogroup-option-32']")
	private WebElement documentRadioBtn ;
	
	@FindBy(xpath="//*[text()='parcel']/../../../div/div[2]/label/span")
	private WebElement  parcelRadioBtn;
	
	@FindBy(xpath="//input[@name='weight']")
	private WebElement weightField ;
	
	@FindBy(xpath="//input[@name='length']")
	private WebElement lengthField;
	
	@FindBy(xpath="//input[@name='width']")
	private WebElement widthField;
	
	@FindBy(xpath="//input[@name='height']")
	private WebElement heigthField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement findProviderBtn ;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickLoginOrSignUpLink() {
		signUpBtn1.click();
	}
	
	public void clickSignUp() {
		WebDriverWait wait = new WebDriverWait(this.driver, 10000);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(signUpBtn2));
		element.click();
	}
	
	public void clickLoginWithMail() {
		WebDriverWait wait = new WebDriverWait(this.driver, 10000);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(loginWithEmailLink));
		element.click();
	}
	
	public HomePage signUpDetails() {
		firstNameField.sendKeys("student");
		lastNameField.sendKeys("roy");
		emailAddressField.sendKeys("test@123");
		mobileNoField.sendKeys("1234567853");
		passwordField.sendKeys("test123456");
		registerBtn.click();
		return new HomePage(driver);
		
	}
	
	public HomePage login() {
		WebDriverWait wait = new WebDriverWait(this.driver, 10000);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(emailIdForLogin));
		element.sendKeys("sudipabhunia@gmail.com");
		passwordForLogin.sendKeys("12341234");
		loginBtn.click();
		return new HomePage(driver);
	}
	
	public void documentDetails() throws Exception{
		Thread.sleep(2000);
		pickUpLocationField.sendKeys("560102");
		deliveryLocationField.sendKeys("721101");
		weightField.sendKeys("100");
		findProviderBtn.click();
	}
	
	public void parcelDetails() throws Exception{
		Thread.sleep(2000);
		pickUpLocationField.sendKeys("560102");
		deliveryLocationField.sendKeys("721101");
		parcelRadioBtn.click();
		weightField.sendKeys("100");
		lengthField.sendKeys("10");
		widthField.sendKeys("11");
		heigthField.sendKeys("15");
		findProviderBtn.click();
	}
		
}
