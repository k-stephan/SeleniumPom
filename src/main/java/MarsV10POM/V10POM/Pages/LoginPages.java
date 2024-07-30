package MarsV10POM.V10POM.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import MarsV10POM.V10POM.BASE.MarsBase;
import MarsV10POM.V10POM.Util.Util;



public class LoginPages extends MarsBase
{
	
	@FindBy(id="txtuserId")
	WebElement username;
	
	@FindBy(id="txtpassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	
	
	@FindBy(xpath="//img[contains(@id,'MarsLogo')]")
	WebElement MarsLoginLogo;
	
	//Initializing the Page Objects:
		public LoginPages(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle()
		{
			System.out.println(driver.getTitle());
			return driver.getTitle();
			
		}
		
		
		
		public boolean validateMarsLoginImage(){
			System.out.println("Entered Login Logo");
			return MarsLoginLogo.isDisplayed();
		}
		
		public  Util  login(String un, String pwd) throws InterruptedException{
			

			username.sendKeys(un);
			System.out.println("Enter User Name");
			password.sendKeys(pwd);
			System.out.println("Enter User Pwd");

			loginBtn.click();
			    	//JavascriptExecutor js = (JavascriptExecutor)driver;
			    	//js.executeScript("arguments[0].click();", loginBtn);
			System.out.println("Logged in ");
		    	
			return new Util();
		}
		
		public String validatePageHomeTitle()
		{
					
			System.out.println(driver.getTitle());
			return driver.getTitle();
			
		}
		

}
