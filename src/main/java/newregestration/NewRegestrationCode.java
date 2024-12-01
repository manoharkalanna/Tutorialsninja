package newregestration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewRegestrationCode {
	WebDriver driver;
	public NewRegestrationCode(WebDriver driver){
		this.driver=driver;
	}
	public void clickonfirstname(String firstname) {
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(firstname);
	}
	public void clickonlastname(String lastname) {
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lastname);
	}
	public void clickonmailid(String mailid) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(mailid);
	}
	public void clickonphonenum(String phonenum) {
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(phonenum);
	}
	public void clickonpassword(String password) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
	}
	public void clickonconfirmpassowrd(String confirmpassword) {
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(confirmpassword);
	}
	public void clickoncheckbox() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
	public void clickoncontinue() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	

}
