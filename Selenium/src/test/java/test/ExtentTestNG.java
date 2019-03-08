package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	
	@BeforeSuite
	public void setup() {
		
		 htmlReporter = new ExtentHtmlReporter("extenReport.html");
		
		 extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		
		
	}
	
	@Test
	public void test() {
		
		ExtentTest test = extent.createTest("Test1","google search test 1");
		
	}
	
	@AfterSuite
	public void teardown() {
		
	}
	
	
	

}
