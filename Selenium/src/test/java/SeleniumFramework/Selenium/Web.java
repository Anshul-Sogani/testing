package SeleniumFramework.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Web {
	
	public static void main(String[] args) throws InterruptedException {
	
	/*
System.setProperty("webdriver.chrome.driver","D:\\eclipse-workspace\\Selenium\\lib\\googledriver\\chromedriver.exe");*/
		
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("http://google.com");
	
	Thread.sleep(3000);
	
	driver.close();
	
	
	}
	
}
