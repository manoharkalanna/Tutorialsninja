package creatregestration;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import creataregestrationaccount.Regestration;
import regestrationbase.Basecode;
import regestrationhome.Homepage;

public class DivyaRegestration extends Basecode{

	public DivyaRegestration() throws Throwable {
		super();
		
	}
	@BeforeMethod
	public void setup() {
		driver=launchingbrowser();
		Homepage hp = new Homepage(driver);
		hp.clickonmyaccount();
		hp.clickonregestration();
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	@Test
	public void Regestrationstart() {
		Regestration rg= new Regestration(driver);
		rg.clickonfirstname(prop.getProperty("firstname"));
		rg.clickonlastname(prop.getProperty("lastname"));
		rg.clickonemail(prop.getProperty("mailid"));
		rg.clickontelephone(prop.getProperty("phone"));
		rg.clickonpassword(prop.getProperty("password"));
		rg.clickonconfirmpassword(prop.getProperty("confirmpassword"));
		rg.clickoncheckbox();
		rg.clickoncontinue();
		//rg.successtext();
	}

}
