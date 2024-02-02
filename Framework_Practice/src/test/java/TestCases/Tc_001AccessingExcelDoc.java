package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_001AccessingExcelDoc {
	public static WebDriver driver;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("C:\\Users\\singh\\OneDrive\\Documents\\TestDoc.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet("Sheet1");
		
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String email = cell.getStringCellValue();
		System.out.println(email);
		
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		int Password = (int)cell1.getNumericCellValue();
		System.out.println(Password);
		
		Row row2 = sheet.getRow(1);
		Cell cell2= row2.getCell(3);
		boolean status = cell2.getBooleanCellValue();
		System.out.println(status);
		driver=new ChromeDriver();

	}

}
