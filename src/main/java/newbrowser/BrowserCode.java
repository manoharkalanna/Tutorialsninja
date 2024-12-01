package newbrowser;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCode {
	public WebDriver driver;
	public Properties prop;
	public BrowserCode()throws Exception{//After creating class first create constructor;
		
		String path="C:\\Users\\Dell\\eclipse-workspace\\MavenFrameworksSelenium\\testdata\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("Browser"));
		
	}
	public WebDriver launchingapplicationwithbrowser() {
		String Browser= prop.getProperty("Browser");
		if(Browser.equals("Chrome")) {
			driver= new ChromeDriver();
		}
		else if(Browser.equals("Edge")){
			driver= new EdgeDriver();
		}
		else if (Browser.equals("Firefox")) {
			driver= new FirefoxDriver();
		}
		else {
			System.out.println("Browser is not found");
		}
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}
	
}

