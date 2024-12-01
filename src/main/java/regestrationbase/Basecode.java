package regestrationbase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basecode {
	public WebDriver driver;
	public Properties prop;
	
	public Basecode() throws Throwable {
		String path ="C:\\Users\\Dell\\OneDrive\\Desktop\\AutomationSelenium\\New folder\\config.properties.txt";
		FileInputStream fis = new FileInputStream(path);
                       prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("Browser"));
	}
	public WebDriver  launchingbrowser() {
		String browser=prop.getProperty("Browser");
		
		if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("Edge")) {
			driver= new EdgeDriver();
		}
		else if(browser.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("browser is not valid");
		}
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}
	

}
