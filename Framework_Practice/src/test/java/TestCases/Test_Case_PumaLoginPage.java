package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.PumaLoginPage;

public class Test_Case_PumaLoginPage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://in.puma.com/in/en/account/login?action=login_with_email");
		
		PumaLoginPage plg = new PumaLoginPage(driver);// object creation statement of Pom Classes package of class pumalogin page and pass the constructor argument
		plg.getEmailTextField().sendKeys("singhsahendar@gmail.com");
		plg.getPasswordTextField().sendKeys("Sahen@57");
		plg.getLoginButton().click();
		driver.quit();
	}

}
