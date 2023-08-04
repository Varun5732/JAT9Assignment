package com.util;
import java.io.FileInputStream;

import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcelOperation obj = new ExcelOperation();
		obj.readExcelData();
	}
	
	
	public void readExcelData() {
		
		try {
		
		
		String inputPath = System.getProperty("user.dir") + "/ExcelBook1.xlsx";
		
		System.out.println(inputPath);
		
			FileInputStream instream = new FileInputStream(inputPath);  // open a file
			
			XSSFWorkbook book = new XSSFWorkbook(instream); //open the file in excel format
			
			XSSFSheet sheet = book.getSheet("Sheet1"); 
			
			Row row;
			Cell cell;
			
			for (int i= 0 ; i<=4 ; i++) { // row 0-4
				row = sheet.getRow(i);
				for (int j=0 ; j<=2 ; j++) {  // col 0-2
					cell = row.getCell(j);
					System.out.print(cell + "   ");
				}
				System.out.println();
			}
			
 
			book.close();
			instream.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}