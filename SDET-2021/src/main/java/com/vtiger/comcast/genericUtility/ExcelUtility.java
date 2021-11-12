package com.vtiger.comcast.genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelUtility {
	
	public String getCellValue(String Sheet,int row,int cell) throws Throwable  {
		FileInputStream FIS= new FileInputStream(".\\src\\test\\CommonData.xlsx");
		Workbook wb = WorkbookFactory.create(FIS);
		 	String data=wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
			
			return data;
		}
	public void SetCellValue(String sheet,int row,int cell,String value) throws Exception {
		FileInputStream fis=new FileInputStream(".\\src\\test\\CommonData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\CommonData.xlsx");
		wb.write(fos);
		wb.close();
	}

}
