package com.utilities_package;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_reports implements ITestListener {
	
	//create global variables
			public ExtentSparkReporter reporter;// it is provide the basic info about the documnet
			//document title,report name,theme(colour of the report)
			public ExtentReports extent;//it is provide the basic info about the user
			//username,hostname,browser name,operating systems
			public ExtentTest test;//it provide the basic status of the testcases(pass,fail,skip)
			public void onStart(ITestContext context)
			{
				
				String timestamp = new SimpleDateFormat("yyyy.dd.mm.hh.mm.ss").format(new Date());
				String repname = "Luma_testreport"+timestamp+".html";
				
				reporter = new ExtentSparkReporter("C:\\Users\\sailo\\eclipse-workspace\\Hybridframework\\Reports"+repname);
				//provide the basic info about the document
				reporter.config().setDocumentTitle("Luma application");
				reporter.config().setReportName("Registration functionality"); 
				reporter.config().setTheme(Theme.DARK);
				//provide the basic info about the user
				extent= new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("user", "sailokesh");
				extent.setSystemInfo("host", "localhost");
				extent.setSystemInfo("os", "windows10");
				extent.setSystemInfo("Environment", "QA");
				extent.setSystemInfo("browser", "chrome,edge");
				
				
			}
			//related info about testcases
		public void onTestSuccess(ITestResult tr) {
				
				test=extent.createTest(tr.getName());
				
				test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));	
			}
			
			public void onTestFailure(ITestResult tr) {
				
				test=extent.createTest(tr.getName());
				
				test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));	
			}
			public void onTestSkipped(ITestResult tr) {
				
				test=extent.createTest(tr.getName());
				
				test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.YELLOW));	
			}
			
			public void onFinish(ITestContext context) {
				
				extent.flush(); // ==> it will remove un-nessecary data
			
			}

}
