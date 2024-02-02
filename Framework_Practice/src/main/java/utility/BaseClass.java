package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import PomClasses.HomePage;
import PomClasses.MenuPage;
import PomClasses.PumaLoginPage;

public class BaseClass {
	public static WebDriver driver;
	public JavascriptExecutorUtility jse=new JavascriptExecutorUtility();
	public ExcelFileUtility excel = new ExcelFileUtility();
	public PropertiesFileUtility pr = new PropertiesFileUtility();
	public HomePage hp = new HomePage(driver);
	//@Parameters("browser")
	@BeforeClass(groups= {"RegressionTest","SmokeTest"})
	public void LanuchingBrowser()
	{
		String BROWSER="chrome";
		if(BROWSER.equals("chrome")) {
		System.out.println("------Launching Browser----------");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		}
		else if(BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod(groups= {"RegressionTest","SmokeTest"})
	public void Login() throws Throwable
	{
		System.out.println("------login page--------");
		Thread.sleep(4000);
		driver.get("https://in.puma.com/in/en/account/login?action=login_with_email");
		PumaLoginPage plg = new PumaLoginPage(driver);// object creation statement of Pom Classes package of class pumalogin page and pass the constructor argument
		plg.getEmailTextField().sendKeys("singhsahendar@gmail.com");
		plg.getPasswordTextField().sendKeys("Sahen@57");
		WebElement loginbutton = plg.getLoginButton();
		jse.JavascriptClick(loginbutton, driver);
	}
	@AfterMethod(groups= {"RegressionTest","SmokeTest"})
	public void logout()
	{
		System.out.println("-------Logout Page-------");
		HomePage hp = new HomePage(driver);
		hp.gethomePageButton();
		MenuPage mp = new MenuPage(driver);
		WebElement logoutLinkButton = mp.getlogoutButton();
		jse.JavascriptClick(logoutLinkButton, driver);
	}
	@AfterClass(groups= {"RegressionTest","SmokeTest"})
	public void QuittingBrowser()
	{
		System.out.println("--------Exit Browser-------");
		driver.quit();
	}

}
