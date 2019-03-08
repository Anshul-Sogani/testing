package utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	
	static WebDriver driver;
	
	@BeforeTest
	public static void setup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("http://google.com");

	}
	
	

	public static Object[][] TestData(String Path, String SheetName) throws IOException {

		excelutils obj = new excelutils(Path, SheetName);

		int rowCount = excelutils.getRowCount();
		int colCount = obj.getColCount();

		System.out.println("row: " + rowCount);
		System.out.println("col: " + colCount);

		Object data[][] = new Object[rowCount - 1][colCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {

				String celldata = excelutils.getCellData(i, j);

				//System.out.print(celldata + "|");
				data[i - 1][j] = celldata;

			}
		}

		return data;

	}

	@DataProvider(name = "test1data")
	public static Object[][] getData() throws IOException {

		Object data[][] = TestData("D:\\eclipse-workspace\\Selenium\\excel\\data.xlsx", "Sheet1");
		return data;
	}
	
	@Test(dataProvider ="test1data")
	public void test1(String username , String password) throws InterruptedException {	
		 System.out.println(username + "|" + password);
		 
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.id("email")).sendKeys(username);
		 driver.findElement(By.id("pass")).sendKeys(password);
		 
		 Thread.sleep(2000);
		
	}
	
	

	/*
	 * public static void main(String[] args) throws IOException {
	 * 
	 * TestData("D:\\eclipse-workspace\\Selenium\\excel\\data.xlsx", "Sheet1"); }
	 */

}
