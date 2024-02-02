package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PumaLoginPage {

//Declaration
	
	public WebDriver driver;
	
	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(id="password")
	private WebElement passwordTextField;
	
	@FindBy(id="login-submit")
	private WebElement loginButton;
	
	//Initialization
	public PumaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getEmailTextField()//create public get method to access private data member of like Email text field 
	{
		return emailTextField;
	}
	public WebElement getPasswordTextField()//create public get method to access private Members of passwordTextField
	{
		return passwordTextField;
	}
	public WebElement getLoginButton()//create public get method to access private data members like login button
	{
		return loginButton;
	}

}
