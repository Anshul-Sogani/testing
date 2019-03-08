package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTestPOM2 {

	static WebDriver driver;

	/*
	 * public static void main(String[] args) {
	 * 
	 * setup();
	 * 
	 * }
	 */

	@BeforeTest
	public static void setup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("http://google.com");

	}

	@Test
	public static void test() {
		GoogleSearchPageObjects obj = new GoogleSearchPageObjects(driver);

		obj.setTextInSearchBox("anshul sogani");
		obj.clickSearchBtn();

	}

	@AfterTest
	public static void close() {
		driver.close();
	}

}
