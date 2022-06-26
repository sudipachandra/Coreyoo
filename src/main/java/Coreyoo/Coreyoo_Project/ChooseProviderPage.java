package Coreyoo.Coreyoo_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChooseProviderPage {

	WebDriver driver = null;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/main/div/div[2]/div/table/tbody/tr[2]/td[5]/button")
	private static WebElement selectProviderBtn;
	
	
	
	public ChooseProviderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickSelectProviderBtn() {
		WebDriverWait wait = new WebDriverWait(this.driver, 10000);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selectProviderBtn));
		element.click();
	}
	
	
}
