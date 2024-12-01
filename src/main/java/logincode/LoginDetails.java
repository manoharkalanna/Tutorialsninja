package logincode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginDetails {
	WebDriver driver;
	public LoginDetails(WebDriver driver){
		this.driver=driver;
		
	}
	public void enteremail(String mailid) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(mailid);
	}
	public void enterpassword(String Password) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Password);
	}
	public void clickonlogin() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	public void logintext() {
		String Text=driver.findElement(By.xpath("//a[text()='Edit your account information']")).getText();
		Assert.assertTrue(Text.contains("Edit your account"));
	}

}

