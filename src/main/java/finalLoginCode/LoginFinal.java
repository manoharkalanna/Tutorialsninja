package finalLoginCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFinal {
	WebDriver driver;
	public LoginFinal(WebDriver driver) {
		this.driver=driver;
	}
	public void entermailid(String mailid) {
		driver.findElement(By.id("input-email")).sendKeys(mailid);
	}
	public void enterpassword(String password) {
		driver.findElement(By.id("input-password")).sendKeys(password);
	}
	public void clickonlogin() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
