package text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginFailText {
	WebDriver driver;
	
	public LoginFailText(WebDriver driver) {
		this.driver=driver;
	}
	public void Loginfail() {
		String Text=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		Assert.assertTrue(Text.contains("Warning: No match for E-Mail Address and/or Password."));
	}
	

}
