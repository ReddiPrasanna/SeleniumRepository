package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Exceldata {
	
	 @Test
	
	public void readdata() throws IOException
	{
		
		File src=new File("C:\\Users\\training_c2d.02.11\\Desktop\\Book1.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		
		
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("data from excel"+data0);
		
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
	
		System.out.println("data from excel"+data1);
		
		wb.close();
		
	}
	

}
