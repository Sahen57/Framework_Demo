package test;

import java.time.Duration;
//import static org.awaitility.Awaitility.*;
import static java.util.concurrent.TimeUnit.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PatentValidation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.wipo.int/patinformed/");
		driver.findElement(By.xpath("//input[@class='searchField']")).sendKeys("rilpivirine");
		//await().atMost(5,SECONDS).until(() -> driver.findElement(By.xpath("//button[text()='I have read and agree to the terms']")).isDisplayed());
		driver.findElement(By.xpath("//button[text()='I have read and agree to the terms']")).click();
		driver.findElement(By.xpath("//div[text()='HIV INHIBITING PYRIMIDINES DERIVATIVES (38)']")).click();
		WebElement text = driver.findElement(By.xpath("(//li[@class='result card container showButtonsOnHover'])[6]"));
		System.out.println(text.getText());
		WebElement link = driver.findElement(By.xpath("System.out.println(text.getText());"));
		Actions action = new Actions(driver);
		action.scrollToElement(link);
		link.click();
		
	}

}
