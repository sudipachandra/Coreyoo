package Coreyoo.Coreyoo_Project;

import org.testng.annotations.Test;

public class DocumentTest extends Base{

	@Test
	public void chooseProvider() throws Exception {
		HomePage homePage = new HomePage(driver);
		homePage.clickLoginOrSignUpLink();
		homePage.clickLoginWithMail();
		homePage.login();
		homePage.documentDetails();
		ChooseProviderPage chooseProviderPage  = new ChooseProviderPage(driver);
		chooseProviderPage.clickSelectProviderBtn();
		CourierDetailsPage courierDetailsPage = new CourierDetailsPage(driver);
		courierDetailsPage.courierDetails();
	}
}
