package newhomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickonmyaccount() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
	}
	public void clickonregestration() {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	}
}
