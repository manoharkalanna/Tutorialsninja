package login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basecodeforlogin.LoginCode;
import failtext.Loginfailtext;
import logincredentials.AccountLogin;
import loginhomepage.HomePage;

public class Callinglogincode extends LoginCode {
	WebDriver driver;

	Callinglogincode() throws Throwable {
		super();
	}
	@BeforeMethod
	public void setup() {
		driver=callingbrowserandlaunchingapplication();
		HomePage hp= new HomePage(driver);
		hp.clickonmyaccount();
		hp.clickonlogin();
		
	}
	@AfterMethod
	public void quit() {
		driver.quit();
		
	}
	@Test
	public void ValidCredentials() {
		AccountLogin al= new AccountLogin(driver);
		al.entertheEmailID(prop.getProperty("loginmail"));
		al.enterpassword(prop.getProperty("loginpassword"));
		al.clickonLogin();
		al.successtext();
		
	}
	@Test
	public void InvalidCredentials() {
		AccountLogin al = new AccountLogin(driver);
		al.entertheEmailID("loginmail");
		al.clickonLogin();
		Loginfailtext LF = new Loginfailtext(driver);
		LF.failText();
	}
	@Test(dependsOnMethods="InvalidCredentials")
	public void clickoncontinue() {
		AccountLogin al = new AccountLogin(driver);
		al.clickonLogin();
		Loginfailtext LF= new Loginfailtext(driver);
		LF.failText();
	}
	

}
