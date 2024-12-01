package day4;

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

public class LoginTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		String browsername = "Chrome";
		if(browsername.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsername.equals("Edge")) {
			driver= new EdgeDriver();
		}
		else if(browsername.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Browse is not found");
		}
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
	@Test
	public void ValidCredentials() {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("admin3338@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("AmmaAppa@123");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		String Text= driver.findElement(By.xpath("//a[text()='Edit your account information']")).getText();
		Assert.assertTrue(Text.contains("account information"));
	}
	@Test
	public void Invalidcredentials() {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("gmail@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		String Textt= driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']")).getText();
		Assert.assertTrue(Textt.contains("No match for E-Mail Address and"));
	}

}
