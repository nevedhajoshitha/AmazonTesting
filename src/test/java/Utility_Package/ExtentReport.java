package Utility_Package;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport implements ITestListener{
	 private ExtentReports extent;
	 private ExtentTest test;
	 
	    public void onStart(ITestContext context) {
	        ExtentHtmlReporter report = new ExtentHtmlReporter("C:\\\\Users\\\\NEVEDHA\\\\eclipse-workspace\\\\ObsquraZone\\\\Reports\\\\AmazonReport.html");
	        extent = new ExtentReports();
	        extent.attachReporter(report);	      	
	    }

	    public void onFinish(ITestContext context) {
	        extent.flush();
	    }

	    public void onTestStart(ITestResult result) {
	        test = extent.createTest(result.getMethod().getMethodName());
	    }

	    public void onTestSuccess(ITestResult result) {
	        test.log(Status.PASS, "Test case passed");
	    }

	}

