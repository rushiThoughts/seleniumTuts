package excelDataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 
		 * to read the data from excel
		 * FILE --> WORKBOOK ----> SHEET---> ROW----> CELLS 
		 * 
		 *  To open file in reading mode --> FilelInputStream
		 *  To get control over excel workbook ---> XSSFWorkbook 
		 *  To get the control over sheet ---> XSSFSheet
		 *  To get the control over the Rows ---> XSSFRows 
		 *  To get the control over the cell ----> XSSFCell
		 *  Above all theses classes are useful to get data from the excel 
		 *  
		 */
		
		//To open file in reading mode --> FilelInputStream
		
		FileInputStream fis=new FileInputStream ("C:\\Users\\Rushi\\Downloads\\alied.xlsx");
		
		// To get control over excel workbook ---> XSSFWorkbook

		XSSFWorkbook workbook =new XSSFWorkbook (fis);
		
		// now get the control over the excel sheet
		XSSFSheet sheet = workbook.getSheet("alied.xlsx");
		
		// get the row count of the sheet 
		
		int rowCount =sheet.getLastRowNum();
		int cellCount=sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowCount;i++) {
			XSSFRow currentRow=sheet.getRow(i);
			
			// to iterate the columns 
			for(int j=0;j<cellCount;j++) {
				String values =currentRow.getCell(j).toString();
				System.out.println(values);
				
			}
		}
		//
		
	}

}
