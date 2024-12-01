package text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchFailText {
	WebDriver driver;
	public SearchFailText(WebDriver driver) {
		this.driver=driver;
	}
	public void SearchText() {
		String Text=driver.findElement(By.xpath("//p[text()='There is no product that matches the search criteria.']")).getText();
		Assert.assertTrue(Text.contains("There is no product that"));
	}

}
