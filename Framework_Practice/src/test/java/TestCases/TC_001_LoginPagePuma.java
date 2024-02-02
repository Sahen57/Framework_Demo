package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PomClasses.LoginPagePuma;

public class TC_001_LoginPagePuma {
	@Test(dataProvider="dataProviderMethod")
	public void Tc_001_Login(String email,String pass)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://in.puma.com/in/en/account/login?action=login_with_email");
		LoginPagePuma lpp = new LoginPagePuma(driver);
		lpp.getEmailTextField().sendKeys(email);
		lpp.getPasswordTextField().sendKeys(pass);
		lpp.getLoginButton().click();
	}
	
	@DataProvider
	public Object[][] dataProviderMethod()
	{
		Object[][] ref=new Object[3][2];
		ref[0][0]="sahen@gmail.com";  ref[0][1]="1234";
		ref[1][0]="mahen@gmaipl.com"; ref[1][1]="12345";
		ref[2][0]="upen@gmail.com";   ref[2][1]="0987";
		return ref;
	}

}
