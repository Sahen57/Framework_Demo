package LoginTestCase;

import org.testng.annotations.Test;

import utility.BaseClass;

public class LoginPuma extends BaseClass {
	@Test(priority=1)
	public void Tc_001_Login_Puma() throws Throwable
	{
		System.out.println("first Test case");
		String value = excel.readExcelData("MySheet1", 1, 1);
		System.out.println(value);
		String value1 = pr.readPropertiesFileData("name");
		System.out.println(value1);
		
		
	}
	@Test(priority=2)
	public void TC_002()
	{
		System.out.println("Second Test Case");
	}

}
