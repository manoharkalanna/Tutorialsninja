package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHome {
	WebDriver driver;
	public LoginHome(WebDriver driver){
		this.driver=driver;
	}
	public void clickonmyaccount() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
	}
	public void clickonlogin() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}
	

}
