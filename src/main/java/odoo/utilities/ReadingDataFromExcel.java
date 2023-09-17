package odoo.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {
	
	public static String readExcelValue(int rowNo, int cellNo) throws IOException  {
		
		File objFile = new File("/Users/rahulbashanapelli/Desktop/ScreenshotsSelenium/TestData11.xlsx");
		
		FileInputStream objfis = new FileInputStream(objFile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(objfis);
		
		String cellText=workbook.getSheet("Sheet2").getRow(rowNo).getCell(cellNo).toString();
		
		System.out.println(cellText);
		
		return cellText;

		
		//Workbook workbook = new XSSFWorkbook(objfis);
		
	}

}
