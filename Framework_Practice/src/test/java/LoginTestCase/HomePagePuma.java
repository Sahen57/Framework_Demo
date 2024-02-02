package LoginTestCase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PomClasses.HomePage;
import utility.BaseClass;
@Listeners(utility.ListenersUtility.class)
public class HomePagePuma extends BaseClass{
	@Test(groups="RegressionTest")
	public void Tc_HomePage_001()
	{
		HomePage hp = new HomePage(driver);
		WebElement accountNameText = hp.getnameTextData();
		if(accountNameText.getText().equals("Sahendra Singh"))
		{
			System.out.println("Verified Account Name");
		}
	}
	

}
