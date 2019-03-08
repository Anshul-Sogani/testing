package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentAventReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentKlovReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {
	
	public static void main(String[] args) {
		
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extenReport.html");
	
	ExtentReports extent = new ExtentReports();
	
	extent.attachReporter(htmlReporter);
	
	ExtentTest test = extent.createTest("Test1","google search test 1");
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	
	test.log(Status.INFO, "Starting Test Case");
	driver.get("http://google.com");
	test.pass("google.com");
	
	
	test.pass("enter value in check box");
	
	driver.findElement(By.name("q")).sendKeys("ANshul");
	
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	test.pass("complerted test submit value");
	driver.close();
	
	test.pass("browser closed");
	
	test.info("completes");
	extent.flush();


}
}