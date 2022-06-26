package Coreyoo.Coreyoo_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	static WebDriver driver = null;
	
	@BeforeMethod
	public void startTest() {
		System.setProperty("webdriver.chrome.driver","/Users/sudipa/eclipse-workspace/Coreyoo_Project/drivers/chromedriver_latest");	
		driver = new ChromeDriver(); 
		driver.get("https://staging.coreyoo.com/");
     	driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void endTest() throws InterruptedException {
		Thread.sleep(4000);
    	driver.close();
	}
}
