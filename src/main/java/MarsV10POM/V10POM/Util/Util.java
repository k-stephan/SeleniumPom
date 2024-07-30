package MarsV10POM.V10POM.Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import MarsV10POM.V10POM.BASE.MarsBase;

public class Util extends MarsBase
{

	public static long PAGE_LOAD_TIMEOUT = 10;
	public static long IMPLICIT_WAIT = 10;
	public static long Explicit_WAIT = 10;
	public static WebDriverWait wait;
	
	public Util()
	{
		 wait = new WebDriverWait(driver, Explicit_WAIT);

	}
	
	
		public static void takeScreenshotAtEndOfTest() throws IOException 
		{
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String currentDir = System.getProperty("user.dir");
			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		}
		
		public static String datageneration()
		{
			String data = null;
			
			return data;
		}
		
		
	
	
}
