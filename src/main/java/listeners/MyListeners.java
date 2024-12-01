package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utility.ExtentReport;

public class MyListeners implements ITestListener{
	ExtentReports ER;
	ExtentTest extentTest;
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Case Start Execution");
		ER= ExtentReport.generatereport();  
	}

	@Override
	public void onTestStart(ITestResult result) {
		String testCaseName= result.getName();
		//System.out.println(testCaseName+"started Execution");
		extentTest= ER.createTest(testCaseName);
		extentTest.log(Status.INFO,testCaseName+"started Execution"); 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testCaseName= result.getName();
		//System.out.println(testCaseName+"execution successful");
		extentTest.log(Status.PASS,testCaseName+"execution successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testCaseName= result.getName();
		//System.out.println(testCaseName+"execution fail");
		//System.out.println("log is"+result.getThrowable());
		extentTest.log(Status.FAIL,testCaseName+"execution fail");
		extentTest.log(Status.FAIL,"log is"+ result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testCaseName= result.getName();
		//System.out.println(testCaseName+"Execution skipped");
		extentTest.log(Status.SKIP,testCaseName+"Execution Skipped");
	
	}
	
	@Override
	public void onFinish(ITestContext context) {
		//System.out.println("Execution Ends");
		extentTest.log(Status.INFO,"Execution Ends");
		ER.flush();
	}
	// this is STEP1
	
	// here we add the methods from "source"-->override/implemented methods-->choose the methods that are needed;
	//this my listeners are used run the the all the test cases at once and find out the passes,fails,skipped test cases
	// in the project;
	// add this class to the "testng.xml"
	
	//STEP2
	// we have to EXTENT REPORT to this class, before that we have to create class on Extent Report in utility package,
	// after that create the folder with name of "EXTENT REPORT" in "test-Output"       

}
 