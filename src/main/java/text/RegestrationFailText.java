package text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegestrationFailText {
	WebDriver driver;
	
	public RegestrationFailText(WebDriver driver){
		this.driver=driver;
	}
	public void RegestrationfailText() {
		String Text =driver.findElement(By.xpath("//div[text()='Warning: You must agree to the Privacy Policy!']")).getText();
		Assert.assertTrue(Text.contains("Warning: You must agree to the Privacy Policy!"));
	}

}
