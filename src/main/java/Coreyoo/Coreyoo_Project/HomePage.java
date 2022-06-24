package Coreyoo.Coreyoo_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver = null;
	
	@FindBy(xpath="//span[text()='Login | Signup']")
	private static WebElement signUpBtn1;
	
	//@FindBy(xpath="//*[text()='Signup']")
	@FindBy(xpath="//button[text()='Sign up']")
	private static WebElement signUpBtn2;
	
	@FindBy(xpath="//*[text()='First Name']")
	private static WebElement firstNameField;
	
	@FindBy(xpath="//*[text()='Last Name']")
	private static WebElement lastNameField;
	
	@FindBy(xpath="//*[text()='Email Address']")
	private static WebElement emailAddressField;
	
	@FindBy(xpath="//*[text()='Mobile No.']")
	private static WebElement mobileNoField ;
	
	@FindBy(xpath="//*[text()='Password']")
	private static WebElement passwordField ;
	
	@FindBy(xpath="//*[text()='Register']")
	private static WebElement registerBtn ;
	
	@FindBy(xpath="//button[text()='Login with email']")
	private static WebElement loginWithEmailLink ;
	
	@FindBy(xpath="*[text()='Email Address']")
	private static WebElement emailIdForLogin ;
	
	@FindBy(xpath="Password")
	private static WebElement passwordForLogin ;
	
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
		wait.until(ExpectedConditions.elementToBeClickable(loginWithEmailLink));
	}
	
	public HomePage signUpDetails() {
		firstNameField.sendKeys("sudipa");
		lastNameField.sendKeys("bhunia");
		emailAddressField.sendKeys("test@123");
		mobileNoField.sendKeys("1234567853");
		passwordField.sendKeys("test123456");
		registerBtn.click();
		return new HomePage(driver);
		
	}
	
	
}
