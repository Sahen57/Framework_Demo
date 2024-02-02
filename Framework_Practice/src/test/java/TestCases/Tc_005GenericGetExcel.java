package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tc_005GenericGetExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("./Files/MyData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet("MySheet1");
		int lastRow = sheet.getLastRowNum()+1;
		System.out.println(lastRow);

	}

}
