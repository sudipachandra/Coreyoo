package Coreyoo.Coreyoo_Project;

import org.testng.annotations.Test;

public class LoginTest extends Base{

	@Test
	public void login() throws InterruptedException { 
		HomePage homePage = new HomePage(driver);
		homePage.clickLoginOrSignUpLink();
		Thread.sleep(3000);
		homePage.clickLoginWithMail();
		homePage.login();
	}
}
