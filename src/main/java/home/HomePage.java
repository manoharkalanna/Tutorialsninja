package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver){//in "regestrationfrombase" we don't have driver so to send driver to there we use
		
		this.driver=driver;            // this method(creating constructor of HomePage)&we call this driver along the obj
										//in the "regestrationfrombase";
	}
	public void clickonMyAccount() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();	
	}
	public void clickonRegister() {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	}

}
