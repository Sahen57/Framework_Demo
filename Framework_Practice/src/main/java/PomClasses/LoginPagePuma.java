package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePuma {
	public WebDriver driver;
	
	public LoginPagePuma(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(id="password")
	private WebElement passwordTextField;
	
	@FindBy(id="login-submit")
	private WebElement loginButton;
	
	//getter method to get the private data members
	
	public WebElement getEmailTextField()
	{
		return emailTextField;
	}
	public WebElement getPasswordTextField()
	{
		return passwordTextField;
	}
	public WebElement getLoginButton()
	{
		return loginButton;
	}
	
	

}
