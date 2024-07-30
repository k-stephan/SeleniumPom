package MarsV10POM.V10POM;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import MarsV10POM.V10POM.BASE.MarsBase;
import MarsV10POM.V10POM.Pages.LoginPages;
import MarsV10POM.V10POM.Util.Util;

public class LoginPagesTest extends MarsBase
{
	
	LoginPages LoginPages;
	
	
	
	public LoginPagesTest() 
	{
		super();
	
	}
	
	@BeforeClass
	public void setUp()
	{
		initialization();
		LoginPages = new LoginPages();	

		

	}
	
	
	@Test(priority=1, groups="login")
	public void loginPageTitleTest(){
		String title = LoginPages.validateLoginPageTitle();
		Assert.assertEquals(title, "MARSWeb [marsqa1.phxa.com]");
		System.out.println("Title Success");
	}
	
	@Test(priority=2,groups="login")
	   public void MarsLogoImageTest(){ 
		boolean flag =LoginPages.validateMarsLoginImage(); 
		Assert.assertTrue(flag);
	  }
	 
	
	@Test(priority=3,groups="login")
	public void loginTest() throws InterruptedException{
		  LoginPages.login((String) repdataobj.get("usrnm"), (String) repdataobj.get("pwd"));
	}
	
	@Test(priority=4,groups="login")
	public void loginHomePageTitleTest()
	{
		Util.wait.until(ExpectedConditions.titleContains("Dashboard For"));		
		
		String title = LoginPages.validatePageHomeTitle();
		assertTrue(title, title.contains("Dashboard For Stephen"));
		System.out.println("Home Page Title Success");
	}
	
		
	@AfterSuite
	public void tearDown()
	{
		
		driver.quit();
	}
	
	
	
}
