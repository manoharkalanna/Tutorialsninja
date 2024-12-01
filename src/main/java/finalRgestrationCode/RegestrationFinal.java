package finalRgestrationCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegestrationFinal {
	
	WebDriver driver;
	
	public RegestrationFinal(WebDriver driver){
		this.driver=driver;	
	}
	public void enterfirstname(String firstname) {
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
	}
	public void enterlastname(String lastname) {
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
	}
	public void entermailid(String email) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	}
	public void enterphonenum(String num) {
		driver.findElement(By.id("input-telephone")).sendKeys(num);
	}
	public void enterpassword(String password) {
		driver.findElement(By.id("input-password")).sendKeys(password);
	}
	public void enterconfirmpassword(String confirmpassword) {
		driver.findElement(By.id("input-confirm")).sendKeys(confirmpassword);
	}
	public void choosecheckbox() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
	public void selectcontinue() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	public void sucesstext() {
	String Text=driver.findElement(By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']")).getText();
	Assert.assertTrue(Text.contains("Congratulations! Your new account has been successfully created!"));
	}

}
