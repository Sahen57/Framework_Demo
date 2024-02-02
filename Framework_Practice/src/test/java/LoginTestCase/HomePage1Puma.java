package LoginTestCase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PomClasses.HomePage;
import utility.BaseClass;

public class HomePage1Puma extends BaseClass {
	
	@Test(groups= {"RegressionTest","SmokeTest"})
	
	public void Tc_HomePage_002()
	{
		HomePage hp = new HomePage(driver);
		WebElement emailText = hp.getemailTextData();
		if(emailText.getText().equals("singhsahendar@gmail.com"))
		{
			System.out.println("Verified Email Text");
		}
	}
    @Test(groups="SmokeTest")
	public void Tc_HomePage_003() throws Throwable 
	{
		HomePage hp = new HomePage(driver);
		WebElement addNewButtonLink = hp.getaddNewButton();
		jse.JavascriptClick(addNewButtonLink, driver);
		Thread.sleep(3000);
		String urlName = driver.getCurrentUrl();
		if(urlName.equals("https://in.puma.com/in/en/account/addresses/add-address"))
		{
			System.out.println("Verified URL Of page");
		}
	}

}
