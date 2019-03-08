package utils;

import java.io.IOException;

public class excelDemo {

	public static void main(String[] args) throws IOException {
		
		excelutils obj = new excelutils("D:\\eclipse-workspace\\Selenium\\excel\\data.xlsx", "Sheet1");
		
		obj.getRowCount();
		obj.getCellDataNumber(1, 1);
		
		
		
		
	}
}
