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

public class SearchClass {
WebDriver driver;

@BeforeMethod
public void setup() {
	String Browser ="Chrome";
	if(Browser.equals("Chrome")) {
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
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @AfterMethod
    public void Quit() {
	driver.quit();
    }
    @Test
    public void searchHP() {
	driver.findElement(By.xpath("//input[@name='search']")).sendKeys("hp");
	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	String Text=driver.findElement(By.xpath("//a[text()='HP LP3065']")).getText();
	Assert.assertTrue(Text.contains("HP LP3065"));
    }
    @Test
    public void searchbike() {
    	driver.findElement(By.xpath("//input[@name='search']")).sendKeys("bike");
    	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
    	String Text = driver.findElement(By.xpath("//p[text()='There is no product that matches the search criteria.']")).getText();
    	Assert.assertTrue(Text.contains("There is no product that matches"));
    }
    }
