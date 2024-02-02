package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorUtility {
	
	public void JavascriptClick(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
	}
	public void javascriptSendData(WebDriver driver,WebElement ele,String data)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].values=arguments[1];", ele,data);
	}
	public void javascriptScrollByCoordinates(WebDriver driver,int xco,int yco)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy("+xco+" ,"+yco+");");
	}
	public void javascriptScrollTillElement(WebDriver driver,WebElement ele )
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",ele);
	}

}
