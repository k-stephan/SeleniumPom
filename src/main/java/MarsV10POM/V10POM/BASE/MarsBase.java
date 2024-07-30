package MarsV10POM.V10POM.BASE;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import MarsV10POM.V10POM.Util.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class MarsBase
{
	public static WebDriver driver;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	//public static Properties prop;
	public static JSONObject repdataobj;
	public static String filepath="D:\\Workspace\\V10POM\\src\\main\\java\\MarsV10POM\\V10POM\\CONFIG\\testdata.json";
	
	public MarsBase()
	{
		try 
		{
			JSONParser jsonparser=new JSONParser();
			FileReader reader=new FileReader(filepath);
			
			Object obj=jsonparser.parse(reader);
			repdataobj=(JSONObject) obj;
		} 
		
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
	}
			
	public static void initialization(){
		String browserName = (String) repdataobj.get("Browser");
		System.out.println(browserName);
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Mars10Automation\\drivers\\chromedriver_win32_2.41.exe");	
			driver = new ChromeDriver();
			//driver.manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT, TimeUnit.SECONDS);

		}
			else if(browserName.equals("FF"))
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Workspace\\Mars10Automation\\drivers\\geckodriver_win32_0.24.exe");	
				driver = new FirefoxDriver(); 
			}
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get((String) repdataobj.get("url"));
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
	}
	


}
