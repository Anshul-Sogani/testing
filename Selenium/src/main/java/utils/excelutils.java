package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils {

	static String Path;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public excelutils(String excelPath, String sheetName) throws IOException {

		Path = System.getProperty("user.dir");

		workbook = new XSSFWorkbook(excelPath);

		sheet = workbook.getSheet(sheetName);

	}

	public static int getRowCount() throws IOException {

		/*Path = System.getProperty("user.dir");

		workbook = new XSSFWorkbook(Path + "\\excel\\data.xlsx");

		sheet = workbook.getSheet("Sheet1");*/

		int count = sheet.getPhysicalNumberOfRows();
		return count;
	}

	public static String getCellData(int r, int c) throws IOException {
		DataFormatter formatter = new DataFormatter(); //can use this formatter if values are not displayed!
		
		
		String celldata = null;
		/*Path = System.getProperty("user.dir");

		workbook = new XSSFWorkbook(Path + "\\excel\\data.xlsx");

		sheet = workbook.getSheet("Sheet1");*/
			
	 /*celldata = sheet.getRow(r).getCell(c).getStringCellValue();*/
		celldata =formatter.formatCellValue(sheet.getRow(r).getCell(c));
		
		return celldata;

	}

	public static double getCellDataNumber(int r, int c) throws IOException {
		Path = System.getProperty("user.dir");

		workbook = new XSSFWorkbook(Path + "\\excel\\data.xlsx");

		sheet = workbook.getSheet("Sheet1");

		double data = sheet.getRow(r).getCell(c).getNumericCellValue();
		System.out.println(data);
		return data;

	}

	public static void main(String[] args) throws IOException {

		getRowCount();
		getCellData(0, 0);
		getCellDataNumber(1, 1);

	}

	public int getColCount() {
		int count = 0 ;
		
		count = sheet.getRow(0).getPhysicalNumberOfCells();
		return count;
		
	}

	
}
