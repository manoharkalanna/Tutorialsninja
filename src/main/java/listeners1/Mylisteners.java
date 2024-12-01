package listeners1;

import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utility.ExtentReport;

public class Mylisteners implements ITestListener {
	ExtentReports ERS;
	ExtentTest ET;

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test case start execution");
		 ERS = ExtentReport.generatereport();
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		String testcasename=result.getName();
		//System.out.println(testcasename+"startexecution");
		ET = ERS.createTest(testcasename);
		ET.log(Status.INFO, testcasename+"startexecution");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testcasename=result.getName();
		//System.out.println(testcasename+"got success");
		ET.log(Status.PASS, testcasename+"got success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String testcasename=result.getName();
		//System.out.println(testcasename+"got fail");
		//System.out.println("log is"+result.getThrowable());
		ET.log(Status.FAIL,testcasename+"got fail" );
		ET.log(Status.INFO,result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testcasename=result.getName();
		//System.out.println(testcasename+"got skipped");
		ET.log(Status.SKIP, testcasename+"got skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		//System.out.println("execution complet");
		ET.log(Status.INFO,"execution complet" );
		ERS.flush();
	}


	
}
