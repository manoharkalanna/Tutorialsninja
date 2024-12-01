package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestCase {
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		String Browser = "Chrome";
		if (Browser.equals("Chrome")) {
			driver= new ChromeDriver();
		}
		else if(Browser.equals("Edge")) {
			driver= new EdgeDriver();
		}
		else if(Browser.equals("Firefox")) {
			driver= new FirefoxDriver();
		}
		else {
			System.out.println("Browser is not found....!");
		}
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}
	@AfterMethod
	public void Quit() {
		driver.quit();
	}
	@Test
	public void LoginWithAllDetails() {
		driver.findElement(By.id("input-email")).sendKeys("manojkalanna@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    String Text=driver.findElement(By.xpath("//a[text()='Edit your account information']")).getText();
	    Assert.assertTrue(Text.contains("Edit your account information"));
	}
	@Test
	public void LoginWithOutDetails() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String Text=driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']")).getText();
		Assert.assertTrue(Text.contains("abs"));
	}
	@Test
	public void LoginWithWrongDetails() {
		driver.findElement(By.id("input-email")).sendKeys("manojkalana@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String Text=driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']")).getText();
		Assert.assertTrue(Text.contains("No match for E-Mail Address"));
	}
	
}
