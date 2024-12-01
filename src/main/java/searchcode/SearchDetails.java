package searchcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchDetails {
	WebDriver driver;
	public SearchDetails(WebDriver driver){
		this.driver=driver;	
	}
	public void clickonsearchbox(String Search) {
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(Search);
	}
	public void clickonsearchsymbol() {
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	}
	public void expetedtext() {
		String Text = driver.findElement(By.xpath("//a[text()='HP LP3065']")).getText();
		Assert.assertTrue(Text.contains("HP LP3065"));
	}
	

}
