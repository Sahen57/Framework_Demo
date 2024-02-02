package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Tc_004 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("./Files/MyData.xlsx");  
		FileInputStream fis = new FileInputStream(file); 
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet("MySheet1");
		int lastRow = sheet.getLastRowNum()+1;
		System.out.println(lastRow);
		Row row = sheet.getRow(1);
		short lastCell = row.getLastCellNum();
		System.out.println(lastCell);
		
		for(int i=0;i<lastRow;i++)
		{
			for(int j=0;j<lastCell;j++)
			{
				Row rw = sheet.getRow(i);
				Cell cl = rw.getCell(j);
				DataFormatter format = new DataFormatter();
				String value = format.formatCellValue(cl);
				System.out.println(value);
				
			}
		}

	}

}
