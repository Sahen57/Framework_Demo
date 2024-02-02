package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Tc_003 {

	public static void main(String[] args) throws IOException {
		File file = new File("./Files/sahen.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pr = new Properties();
		pr.load(fis);
		String name = pr.getProperty("Name");
		System.out.println(name);
	}

}
