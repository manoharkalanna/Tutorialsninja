package basecodeforlogin;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginCode {
	 public WebDriver driver;
	 public Properties prop;
	protected LoginCode() throws Throwable{
		String path="C:\\Users\\Dell\\eclipse-workspace\\MavenFrameworksSelenium\\testdata\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("Browser"));
	}
	
	public WebDriver callingbrowserandlaunchingapplication() {
		String browser = prop.getProperty("Browser");
		
		if(browser.equals("Chrome")) {
			driver= new ChromeDriver();
		}
		else if(browser.equals("Edge")) {
			driver= new EdgeDriver();
		}
		else if(browser.equals("Firefox")) {
			driver= new FirefoxDriver();
		}
		else {
			System.out.println("driver is not found");
		}
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		return driver;
	}

}
