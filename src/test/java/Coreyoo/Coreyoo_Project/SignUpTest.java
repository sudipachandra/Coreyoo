package Coreyoo.Coreyoo_Project;

import org.testng.annotations.Test;

public class SignUpTest extends Base{
    
	@Test
	public void signUp() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.clickLoginOrSignUpLink();
		Thread.sleep(3000);
		homePage.clickSignUp();
		homePage.signUpDetails();
	}
	
	public void login() {
		HomePage homePage = new HomePage(driver);
		homePage.clickLoginOrSignUpLink();
		
	}
	
}
