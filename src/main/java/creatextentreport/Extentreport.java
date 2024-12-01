package creatextentreport;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreport {
	
	public static ExtentReports buildextentreport() {
		 
		ExtentReports ER = new ExtentReports();
		
		File ERpath = new File("C:\\Users\\Dell\\eclipse-workspace\\MavenFrameworksSelenium\\test-output\\ExtentReport\\extentreport.html");
		
		ExtentSparkReporter ESR = new ExtentSparkReporter(ERpath);
		
		ESR.config().setTheme(Theme.DARK);
		ESR.config().setDocumentTitle("AutomationReport");
		ESR.config().setReportName("Selenium project");
		ESR.config().setTimeStampFormat("dd/mm/yy/hh:mm:ss");
		ER.attachReporter(ESR);
		
		ER.setSystemInfo("URL", "https://tutorialsninja.com/demo/");
		ER.setSystemInfo("Browser", "Chrome");
		ER.setSystemInfo("environment used", "QA3");
		ER.setSystemInfo("operating system", System.getProperty("os"));
		ER.setSystemInfo("javaVersion", System.getProperty("java.version"));
		return ER;
		
	}

}
