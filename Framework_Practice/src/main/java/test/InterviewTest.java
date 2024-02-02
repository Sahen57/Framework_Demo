package test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import static org.awaitility.Awaitility.*;
//import java.util.concurrent.TimeUnit;

public class InterviewTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.wipo.int/patinformed/");
//		await("Wake up call").atMost(1, TimeUnit.MINUTES).until();
		driver.findElement(By.xpath("//input[@class='searchField']")).sendKeys("rilpivirine");
		driver.findElement(By.xpath("//button[text()='I have read and agree to the terms']")).click();
		driver.findElement(By.xpath("//div[text()='HIV INHIBITING PYRIMIDINES DERIVATIVES (38)']")).click();
		WebElement text = driver.findElement(By.xpath("(//li[@class='result card container showButtonsOnHover'])[6]"));
		System.out.println(text.getText());
		driver.findElement(By.xpath("//table[@class='patentDetails noBorder']//td[contains(text(),'Switzerland')]/../../..//a")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		for(String window:windows)
		{
			itr.next();
			driver.switchTo().window(window);
		}
		System.out.println(driver.getCurrentUrl());
//		wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='detailMainForm:MyTabViewId:j_idt3393:j_idt3449']//span[2]"))));
		WebElement applicationDate=driver.findElement(By.xpath("//span[text()='Application Date']/parent::span/following-sibling::span"));
		
		System.out.println(applicationDate.getText());
		Assert.assertEquals("09.08.2002",applicationDate.getText());
		
		WebElement publicationDate=driver.findElement(By.xpath("//span[text()='Publication Date']/parent::span/following-sibling::span"));
		System.out.println(publicationDate.getText());
		Assert.assertEquals("19.05.2004",publicationDate.getText());
		driver.quit();

	}

}

