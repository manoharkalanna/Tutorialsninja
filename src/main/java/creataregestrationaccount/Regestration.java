package creataregestrationaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Regestration {
	WebDriver driver;
	public Regestration(WebDriver driver) {
		this.driver= driver;
	}
	public void clickonfirstname(String firstname) {
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(firstname);
	}
	public void clickonlastname(String lastname) {
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lastname);
	}
	public void clickonemail(String mailid) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(mailid);
	}
	public void clickontelephone(String phone) {
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(phone);
	}
	public void clickonpassword(String password) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
	}
	public void clickonconfirmpassword(String confirmpassword) {
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(confirmpassword);
	}
	public void clickoncheckbox() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
	public void clickoncontinue() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	


}
