package utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	
	public static ExtentReports generatereport() {
		 
		ExtentReports ER = new ExtentReports();
		File path= new File("C:\\Users\\Dell\\eclipse-workspace\\MavenFrameworksSelenium\\test-output\\ExtentReport\\extentReport.html");
		ExtentSparkReporter SR= new ExtentSparkReporter(path);
		
		SR.config().setTheme(Theme.DARK);
		SR.config().setReportName("selenium project report");
		SR.config().setDocumentTitle("Automation Report");
		SR.config().setTimeStampFormat("dd/mm/yy hh/mm/ss");
		
		ER.attachReporter(SR);
		
		ER.setSystemInfo("Application URL","https://tutorialsninja.com/demo/");
		ER.setSystemInfo("Browse", "Chrome");
		ER.setSystemInfo("Environment", "QA2");
		ER.setSystemInfo("operation system", System.getProperty("os.name"));
		ER.setSystemInfo("java version",System.getProperty("java.version"));
		
		return ER;
	}
	// then go MyListenetrs call this class to there;
	
	

}
