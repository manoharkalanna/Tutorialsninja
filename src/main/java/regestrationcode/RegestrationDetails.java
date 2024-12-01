package regestrationcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegestrationDetails {
	
	WebDriver driver;
	public RegestrationDetails(WebDriver driver) {
		this.driver=driver;
	}
	public void enterfirstname(String firstname) {
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(firstname);
	}
	public void enterlastname(String lastname) {
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lastname);
	}
	public void entermailid(String mailid) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(mailid);
	}
	public void enterphonenum(String Phonenum) {
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(Phonenum);
	}
	public void enterpassword(String Password) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Password);
	}
	public void entercorrectpassword(String entercorrectpassword) {
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(entercorrectpassword);
	}
	public void selectcheckbox() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
	public void selectcontinue() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	public void regestrationtext() {
		String Text=driver.findElement(By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']")).getText();
		Assert.assertTrue(Text.contains("Congratulations! Your new"));
	}
}
