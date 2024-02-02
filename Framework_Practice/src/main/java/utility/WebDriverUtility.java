package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	//Wait Utility
	public void explicitlyWaitForElementClickable(By locator,WebDriver driver,int timeInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public void explicitlyWaitForAlertTobePresent(WebDriver driver,int timeInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public void explicitlyWaitForUrlToBePresent(WebDriver driver,int timeInSeconds,String completeUrl)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		wait.until(ExpectedConditions.urlToBe(completeUrl));
	}
	public void explicitlyWaitForVisibilityOfElement(WebDriver driver,int timeInSeconds,WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	//Dropdown Utility
	public void selectDropdownByText(WebElement selectTag,String textValue)
	{
		Select select = new Select(selectTag);
		select.selectByVisibleText(textValue);
	}
	public void selectDropdownByValueOfAttribute(WebElement selectTag,String attributeValue)
	{
		Select select = new Select(selectTag);
		select.selectByValue(attributeValue);
	}
	public void deselectDropdownByText(WebElement selectTag,String textValue)
	{
		Select select = new Select(selectTag);
		select.deselectByVisibleText(textValue);
	}
	public void deselectDropdownByValueOfAttribute(WebElement selectTag,String attributeValue)
	{
		Select select = new Select(selectTag);
		select.deselectByValue(attributeValue);
	}
	
	//Action Utility
	public void mouseHoverAction(WebDriver driver,WebElement ele)
	{
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}
	public void doubleClickAction(WebDriver driver,WebElement ele)
	{
		Actions action = new Actions(driver);
		action.doubleClick(ele).perform();
	}
	public void rightClickAction(WebDriver driver,WebElement ele)
	{
		Actions action = new Actions(driver);
		action.contextClick(ele).perform();
	}
	public void dragAndDropAction(WebDriver driver,WebElement draggingElement,WebElement droppingElement)
	{
		Actions action = new Actions(driver);
		action.dragAndDrop(draggingElement, droppingElement).perform();
	}
	

}
