package newTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import newbrowser.BrowserCode;
import newhomepage.HomePage;
import newregestration.NewRegestrationCode;

public class NewRegestration extends BrowserCode {
	
	public NewRegestration() throws Exception {
		super();
		
	}

	@BeforeMethod
	public void setup() {
		driver=launchingapplicationwithbrowser();
		HomePage HP= new HomePage(driver);
		HP.clickonmyaccount();
		HP.clickonregestration();
	}
	@AfterMethod
	public void QuitBrowser() {
		driver.quit();
	}
	@Test
	public void loginsuccessful() {
		NewRegestrationCode NRC = new NewRegestrationCode(driver);
		NRC.clickonfirstname(prop.getProperty("firstname"));
		NRC.clickonlastname(prop.getProperty("lastname"));
		NRC.clickonmailid(prop.getProperty("mailid"));
		NRC.clickonphonenum(prop.getProperty("phonenum"));
		NRC.clickonpassword(prop.getProperty("password"));
		NRC.clickonconfirmpassowrd(prop.getProperty("confirmpassword"));
		NRC.clickoncheckbox();
		NRC.clickoncontinue();
	}

}
