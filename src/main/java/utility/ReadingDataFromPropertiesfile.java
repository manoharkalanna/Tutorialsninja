package utility;

import java.io.FileInputStream;
import java.util.Properties;

//import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

public class ReadingDataFromPropertiesfile {
	
	public static void main(String[] args)throws Throwable {
		String path = "C:\\Users\\Dell\\OneDrive\\Desktop\\Selenium\\maven\\config.properties.txt";
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("Browser"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("Password"));
	}

}
