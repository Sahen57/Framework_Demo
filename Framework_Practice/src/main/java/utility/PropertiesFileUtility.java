package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileUtility {
	public String readPropertiesFileData(String name) throws Throwable
	{
		File file = new File("./Files/sahen.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pr = new Properties();
		pr.load(fis);
		String value = pr.getProperty(name);
		return value;
	}

}
