package MarsV10POM.V10POM.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import MarsV10POM.V10POM.BASE.MarsBase;
import MarsV10POM.V10POM.Util.Util;

public class RepLookUp extends MarsBase
{
	
	@FindBy(xpath="//*[normalize-space(text())='Rep' and @id='navbarDropdown']")
	WebElement RepLookup;
	
	
	@FindBy(xpath="//*[@class='dropdown-item' and contains(text(),'Rep Profile')]")
	WebElement RepProfile;
	
	@FindBy(xpath = "//*[@data-field-name='Rep Full Name']")
	WebElement Repnameseacrh;

	@FindBy(xpath = "//*[@class='btn btn-primary btn-sm' and contains(text(),'Find')]")
	WebElement findwithrepname;
	
	@FindBy(xpath = "//*[@aria-selected='false']//span[contains(text(),'Sid')]")
	WebElement clickrep;
	
	
	@FindBy(xpath = "//*[@class='nav-item mx-3 active']//span[contains(text(),'Main')]")
	WebElement repmaintab;
	
	
	//Primary Details OR:
	
	@FindBy(xpath ="//*[contains(text(),' Primary Details ')]")
	WebElement PrimaryDetails;
	    
	@FindBy(xpath ="//*[normalize-space(text())='Middle Name']//following::div[@class='ValueText'][1]")
	WebElement MiddleName;
	
	@FindBy(xpath="//*[normalize-space(text())='Middle Name']//following::input[@id=\"txtTextBox\"]")
	WebElement MiddleName_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='First Name']//following::div[@class='ValueText'][1]")
	WebElement RepFirstName;
	
	@FindBy(xpath="//*[normalize-space(text())='First Name']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepFirstName_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Last Name']//following::div[@class='ValueText'][1]")
	WebElement  RepLastName;
	
	@FindBy(xpath="//*[normalize-space(text())='Last Name']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepLastName_CT;
	
	@FindBy(xpath ="//input[contains(@class, 'floating-label-field')]//following::i[@id='saveImg'][1]")
	WebElement SaveImage;
	 
	@FindBy(xpath="//*[normalize-space(text())='Fax']//following::div[@class='ValueText'][1]")
	WebElement Fax;
	
	@FindBy(xpath="//*[normalize-space(text())='Fax']//following::input[contains(@class, 'floating-label')][1]")
	WebElement Fax_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Website']//following::div[@class='ValueText'][1]")
	WebElement Website;
	
	@FindBy(xpath="//*[normalize-space(text())='Website']//following::input[contains(@class, 'floating-label')][1]")
	WebElement Website_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Title']//following::div[@class='ValueText'][1]")
	WebElement Title;
	
	@FindBy(xpath="//*[normalize-space(text())='Title']//following::input[contains(@class, 'floating-label')][1]")
	WebElement Title_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Firm Source ID']//following::div[@class='ValueText'][1]")
	WebElement FirmSourceID;
	
	@FindBy(xpath="//*[normalize-space(text())='Firm Source ID']//following::input[contains(@class, 'floating-label')][1]")
	WebElement FirmSourceID_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep Nick Name']//following::div[@class='ValueText'][1]")
	WebElement RepNickName;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep Nick Name']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepNickName_CT;
	
	
	@FindBy(xpath="//*[normalize-space(text())='Rep CRD']//following::div[@class='ValueText'][1]")
	WebElement  RepCRD;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep CRD']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepCRD_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep Phone']//following::div[@class='ValueText'][1]")
	WebElement  RepPhone;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep Phone']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepPhone_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Email Id 2']//following::div[@class='ValueText'][1]")
	WebElement  RepEmailID2;
	
	@FindBy(xpath="//*[normalize-space(text())='Email Id 2']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepEmailID2_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Mobile']//following::div[@class='ValueText'][1]")
	WebElement  RepMobile;
	@FindBy(xpath="//*[normalize-space(text())='Mobile']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepMobile_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Phone Ext.']//following::div[@class='ValueText'][1]")
	WebElement  PhoneExt;
	@FindBy(xpath="//*[normalize-space(text())='Phone Ext.']//following::input[contains(@class, 'floating-label')][1]")
	WebElement PhoneExt_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep Comments']//following::div[@class='ValueText'][1]")
	WebElement  RepComments;
	@FindBy(xpath="//*[normalize-space(text())='Rep Comments']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepComments_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep Source ID']//following::div[@class='ValueText'][1]")
	WebElement  RepSourceID;
	@FindBy(xpath="//*[normalize-space(text())='Rep Source ID']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepSourceID_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Personal Info']//following::div[@class='ValueText'][1]")
	WebElement  PersonalInfo;
	@FindBy(xpath="//*[normalize-space(text())='Personal Info']//following::input[contains(@class, 'floating-label')][1]")
	WebElement PersonalInfo_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='# of Years as Broker']//following::div[@class='ValueText'][1]")
	WebElement  Broker;
	@FindBy(xpath="//*[normalize-space(text())='# of Years as Broker']//following::input[contains(@class, 'floating-label')][1]")
	WebElement Broker_CT;
	
	
	@FindBy(xpath="//*[normalize-space(text())='Alternate Name']//following::div[@class='ValueText'][1]")
	WebElement  AlternateName;
	@FindBy(xpath="//*[normalize-space(text())='Alternate Name']//following::input[contains(@class, 'floating-label')][1]")
	WebElement AlternateName_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Birthday(MM/DD/YYYY)']//following::div[@class='ValueText'][1]")
	WebElement Birthday;
	@FindBy(xpath="//*[normalize-space(text())='Birthday(MM/DD/YYYY)']//following::input[contains(@class, 'floating-label')][1]")
	WebElement Birthday_CT;
	@FindBy(xpath="//*[normalize-space(text())='Birthday(MM/DD/YYYY)']//following::input[contains(@class, 'floating-label')][1]//following::input[1]")
	WebElement Birthday_CTY;
	
	@FindBy(xpath="//*[normalize-space(text())='Total AUM (Self Reported)']//following::div[@class='ValueText'][1]")
	WebElement AUM;
	@FindBy(xpath="//*[normalize-space(text())='Total AUM (Self Reported)']//following::input[contains(@class, 'floating-label')][1]")
	WebElement AUM_CT;
	
	//Util util;
	
	
	// Initializing the Page Objects:
		public RepLookUp() 
		{
			
			System.out.println("Entered the Rep Lookup Page");

			PageFactory.initElements(driver, this);
		}
		
		
		public void clickrep() 
		{
			//click on rep
	    	RepLookup.click();
	    	
	    	System.out.println("clicked on rep lookup");
	    	
	    	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	    	js1.executeScript("arguments[0].click();", RepProfile);
	    	
			System.out.println("clicked on rep profile");
			
		}
		
		public Util  repname_search()
		{
			Repnameseacrh.sendKeys("Sid");
			System.out.println("Enter Rep Name");
			findwithrepname.click();
			clickrep.click();
			Util.wait.until(ExpectedConditions.titleContains("Sid"));	
			return new Util();
		}
		
		
		public Util click_maintab()
		{
			//WebDriverWait wait = new WebDriverWait(driver, Util.Explicit_WAIT);
		    Util.wait.until(ExpectedConditions.elementToBeClickable(repmaintab));		
		
			repmaintab.click();
			System.out.println("Clicked Rep Main Tab");
			
			return new Util();

		}
		
	/*	public void click_PrimaryDetails()
		{
			PrimaryDetails.click();
			System.out.println("Clicked PrimaryDetails Tab");
			
		}*/
		public void clear_Type_MiddleName()
 {
			MiddleName.click();
			MiddleName_CT.clear();
			MiddleName.click();
			WebElement VerifyMiddleName = MiddleName;
			MiddleName_CT.sendKeys("MiddleName");
			SaveImage.click();
			String Verification1 =VerifyMiddleName.getText();
			System.out.println("Should be a MiddleName: "  + Verification1);
			
 }
		public void clear_Type_Fax()
		{
			Fax.click();
			Fax_CT.clear();
			Fax.click();
			WebElement VerifyFax=Fax;
			Fax_CT.sendKeys("452652");
			SaveImage.click();
			String Verification =VerifyFax.getText();
			System.out.println("There should be an FaxNum: " + Verification);
		}
		
		public void clear_Type_Website()
		{
			Website.click();	
			Website_CT.clear();
			WebElement VerifyWebsite=Website;
			Website_CT.sendKeys("www.marsV10.com");
			SaveImage.click();
			String Verification =VerifyWebsite.getText();
			System.out.println("There should be an Website:" + Verification);
			
		}
		 public void clear_Type_RepTitle()
		 {
			 Title.click();
			 Title_CT.clear();
			WebElement VerifyTitle =Title;
			Title_CT.sendKeys("Mr");
			 SaveImage.click();
			 String Verification =VerifyTitle.getText();
			 System.out.println("There should be an RepTitle:" + Verification);
		 }
		
		public void clear_Type_FirmSourceID()
		{
			FirmSourceID.click();
			FirmSourceID_CT.clear();
			WebElement VerifyFirmSourceID =FirmSourceID;
			FirmSourceID_CT.sendKeys("145263");
			SaveImage.click();
			String Verification =VerifyFirmSourceID.getText();
			 System.out.println("There should be an FirmSourceID:" + Verification);
			
		}
		public void clear_Type_RepNickName()
		{
			RepNickName.click();
			RepNickName_CT.clear();
			WebElement VerifyRepNickName = RepNickName;
			RepNickName_CT.sendKeys("Phx");
			SaveImage.click();
			String Verification =VerifyRepNickName.getText();
			System.out.println("There should be an RepNickName:" + Verification);
			
		}
		public void clear_Type_RepCRD()
		{
			RepCRD.click();
			RepCRD_CT.clear();
			WebElement VerifyRepCRD = RepCRD;
			RepCRD_CT.sendKeys("65245");
			SaveImage.click();
			String Verification =VerifyRepCRD.getText();
			System.out.println("There should be an RepCRD:" + Verification);
		}
		public void clear_Type_RepFirstName()
		{
			RepFirstName.click();
			RepFirstName_CT.clear();
			WebElement VerifyFirstName =RepFirstName;
			RepFirstName_CT.sendKeys("mars");
			SaveImage.click();
			String Verification =VerifyFirstName.getText();
			System.out.println("There should be an RepFirstName:" + Verification);
			
		}
		public void clear_Type_RepLastName()
		{
			RepLastName.click();
			RepLastName_CT.clear();
			WebElement VerifyLastName = RepLastName;
			RepLastName_CT.sendKeys("V10");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			System.out.println("There should be an RepLastName:" + Verification);
			
		}
		public void clear_Type_RepPhone()
		{
			RepPhone.click();
			RepPhone_CT.clear();
			WebElement VerifyLastName = RepPhone;
			RepPhone_CT.sendKeys("123456");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			System.out.println("There should be an RepPhone:" + Verification);
		}
		public void clear_Type_RepEmailID2()
		{
			RepEmailID2.click();
			RepEmailID2_CT.clear();
			WebElement VerifyLastName = RepEmailID2;
			RepEmailID2_CT.sendKeys("marsID2@sfs.com");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			System.out.println("There should be an RepEmailID2:" + Verification);
		}
		public void clear_Type_RepMobile()
		{
			RepMobile.click();
			RepMobile_CT.clear();
			WebElement VerifyLastName = RepMobile;
			RepMobile_CT.sendKeys("7854755685");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			System.out.println("There should be an RepMobile:" + Verification);
		}
		public void clear_Type_PhoneExt()
		{
		PhoneExt.click();
		PhoneExt_CT.clear();
		WebElement VerifyLastName = PhoneExt;
		PhoneExt_CT.sendKeys("+44");
		SaveImage.click();
		String Verification =VerifyLastName.getText();
		System.out.println("There should be an PhoneExt:" + Verification);	
		}
		public void clear_Type_RepComments()
		{
		RepComments.click();
		RepComments_CT.clear();
		WebElement VerifyLastName = RepComments;
		RepComments_CT.sendKeys("Updated the Rep Comments ");
		SaveImage.click();
		String Verification =VerifyLastName.getText();
		System.out.println("There should be an RepComments:" + Verification);
		}
		public void clear_Type_RepSourceID()
		{
			RepSourceID.click();
			RepSourceID_CT.clear();
			WebElement VerifyLastName = RepSourceID;
			RepSourceID_CT.sendKeys("RSID_541256 ");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			System.out.println("There should be an RepSourceID:" + Verification);
		}
		public void clear_Type_PersonalInfo()
		{
			PersonalInfo.click();
			PersonalInfo_CT.clear();
			WebElement VerifyLastName = PersonalInfo;
			PersonalInfo_CT.sendKeys("Rep_PersonalInfo ");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			System.out.println("There should be an PersonalInfo:" + Verification);
		}
		public void clear_Type_Broker()
		{
			Broker.click();
			Broker_CT.clear();
			WebElement VerifyLastName = PersonalInfo;
			Broker_CT.sendKeys("5Years ");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			System.out.println("There should be an PersonalInfo:" + Verification);
		}
		
		public void clear_Type_AlternateName()
		{
			AlternateName.click();
			AlternateName_CT.clear();
			WebElement VerifyLastName = AlternateName;
			AlternateName_CT.sendKeys("Rep_AlternateName");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			System.out.println(" AlternateName :" + Verification);
			
		}
		public void clear_Type_Birthday()
		{
			Birthday.click();
			Birthday_CT.clear();
			WebElement VerifyLastName = Birthday;
			Birthday_CT.sendKeys("03/08");
			Birthday_CTY.sendKeys("1847");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			System.out.println(" Birthday :" + Verification);
		}
		public void clear_Type_AUM()
		{
			AUM.click();
			AUM_CT.clear();
			WebElement VerifyLastName = AUM;
			AUM_CT.sendKeys("5245");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			System.out.println(" Total AUM :" + Verification);
			
		}
		
}
