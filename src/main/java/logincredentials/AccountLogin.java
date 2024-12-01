package logincredentials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccountLogin {
	public WebDriver driver;
	public AccountLogin(WebDriver driver){
		this.driver=driver;
		
	}
	public void entertheEmailID(String Emailid) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(Emailid);
	}
	public void enterpassword(String Password) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Password);
	}
	public void clickonLogin() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	public void successtext() {
		String text=driver.findElement(By.xpath("//a[text()='Edit your account information']")).getText();
		Assert.assertTrue(text.contains("Edit your account"));
	}

}
