package newregestrationcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CreatRegestration {
	WebDriver driver;
	
	public CreatRegestration(WebDriver driver) {
		this.driver=driver;
	}
	public void enterfirstname(String firstname) {
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(firstname);
	}
	public void enterlastname(String lastname) {
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lastname);
	}
	public void enteremailid(String emailid) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(emailid);
	}
	public void entertelephonenum(String telephone) {
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(telephone);
	}
	public void enterpassword(String password) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
	}
	public void enterconfirmpassword(String confirmpassword) {
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(confirmpassword);
	}
	public void enablecheckbox() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
	public void clickoncontinue() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	public void successtext() {
		String Text = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		Assert.assertTrue(Text.contains("Your Account Has Been Created"));
	}
	

}
