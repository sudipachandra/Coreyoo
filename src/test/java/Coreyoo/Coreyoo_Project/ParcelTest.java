package Coreyoo.Coreyoo_Project;

import org.testng.annotations.Test;

public class ParcelTest extends Base{

	@Test
	public void selectParcel() throws Exception{
		HomePage homePage = new HomePage(driver);
		homePage.clickLoginOrSignUpLink();
		homePage.clickLoginWithMail();
		homePage.login();
		homePage.parcelDetails();
		ChooseProviderPage chooseProviderPage  = new ChooseProviderPage(driver);
		chooseProviderPage.clickSelectProviderBtn();
		CourierDetailsPage courierDetailsPage = new CourierDetailsPage(driver);
		courierDetailsPage.courierDetails();
		
	}
}
