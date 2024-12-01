package day5;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {
	
	public static void main(String[] args) throws Throwable{
		XSSFWorkbook wb=null;
		String path = "C:\\Users\\Dell\\OneDrive\\Desktop\\AutomationSelenium\\New folder\\Selenium.xlsx.xlsx";
		
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wbs = new XSSFWorkbook(fis);
		XSSFSheet sheet= wbs.getSheet("Login");
		int rowcount = sheet.getLastRowNum();
		int coulcount = sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rowcount;i++) {
			XSSFRow row= sheet.getRow(i+1);
			for(int j=0;j<coulcount;j++) {
				XSSFCell cell= row.getCell(j);
				
				switch(cell.getCellType()) {
				case STRING: System.out.print(cell.getStringCellValue());
				         break;
				         
				case NUMERIC: System.out.print(cell.getNumericCellValue());
				         break;
				}
				System.out.print("|");
			}
			System.out.println();
		}
	}

}
