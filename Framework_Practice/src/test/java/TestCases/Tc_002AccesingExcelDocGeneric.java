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

public class Tc_002AccesingExcelDocGeneric {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("./Files/MyData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet("MySheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(2);
		DataFormatter formatter = new DataFormatter();
		String value = formatter.formatCellValue(cell);
		System.out.println(value);
	}

}
