package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='account-button']")
	private WebElement homePageButton;
	
	
	@FindBy(xpath="//span[@data-test-id='account-full-name']")
	private WebElement nameTextData;
	
	@FindBy(xpath="//span[@data-test-id='account-email']")
	private WebElement emailTextData;
	
	@FindBy(xpath="//div[text()='Add new']")
	private WebElement addNewButton;
	
	//getter method to get the value of private data members
	public WebElement gethomePageButton()
	{
		return homePageButton;
	}
	public WebElement getnameTextData()
	{
		return nameTextData;
	}
	public WebElement getemailTextData()
	{
		return emailTextData;
	}
	public WebElement getaddNewButton()
	{
		return addNewButton;
	}
	
	

}
