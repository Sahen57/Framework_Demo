package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
	public WebDriver driver;
	
	public MenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Logout']")
	private WebElement logoutButton;
	
	
	//getter method to get the value of private data member
	public WebElement getlogoutButton()
	{
		return logoutButton;
	}

}
