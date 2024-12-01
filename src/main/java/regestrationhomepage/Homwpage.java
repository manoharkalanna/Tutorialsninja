package regestrationhomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homwpage {
	WebDriver driver;
	public Homwpage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void clickonmyaccount() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
	}
	public void clickonregister() {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	}

}
