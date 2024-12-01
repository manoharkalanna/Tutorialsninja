package failtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Loginfailtext {
	public WebDriver driver;
	public Loginfailtext(WebDriver driver){
		this.driver=driver;
		
	}
	public void failText() {
		String Text=driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']")).getText();
		Assert.assertTrue(Text.contains("Warning: No match for E-Mail"));
	}

}
