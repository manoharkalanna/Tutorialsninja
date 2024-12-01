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


public class RegestrationTest {

	WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		String Browser="Chrome";
		if(Browser.equals("Chrome")) {
			driver= new ChromeDriver();
		}
		else if(Browser.equals("Edge")) {
			driver= new EdgeDriver();
		}
		else if (Browser.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		else {
			System.out.println("Browser is not find");
		}
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	}
	@AfterMethod
	public void Quit() {
		driver.quit();
	}
	
	//TC1
	@Test
	public void RegisterWithAllDetails() {
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("basavaraju");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("k");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("basavarajuk@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("998877665");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    String Text =driver.findElement(By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']")).getText();
		Assert.assertTrue(Text.contains("Congratulations! Your new account"));
	}
	@Test
	public void RegestrationWithOutAnyDetails() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    String Text =driver.findElement(By.xpath("//div[text()='Warning: You must agree to the Privacy Policy!']")).getText();
	    Assert.assertTrue(Text.contains("Warning: You must agree to the"));
	}
	@Test
	public void RegesterWithOutAcceptingPrivecyAndPolicy() {
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("basavaa");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("k");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("basavaak@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("998877665");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String Text =driver.findElement(By.xpath("//div[text()='Warning: You must agree to the Privacy Policy!']")).getText();
	    Assert.assertTrue(Text.contains("Warning: You must agree to the"));
	}
}
