package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUtility extends BaseClass implements ITestListener {
	public void onTestFailure(ITestResult result)
	{
		String failedMethod = result.getMethod().getMethodName().toString();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		String timeSpam = LocalDateTime.now().toString().replace(':', '-');
		File fileLoc = new File("./src/test/resources/Screenshot/"+failedMethod+timeSpam+".png");
		try 
		{
			FileHandler.copy(tempFile, fileLoc);
		} 
		catch (IOException e) 
		{
			System.out.println("Not been Executed");
			e.printStackTrace();
		}
	}

}
