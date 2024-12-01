package day5;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingDataFromProp {
	
	@Test
	public void Readingdatafromproperties()throws Throwable {
		
		String path ="C:\\Users\\Dell\\OneDrive\\Desktop\\AutomationSelenium\\New folder\\config.properties.txt";
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("Browser"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		
		
	}

}
