package MarsV10POM.V10POM;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MarsV10POM.V10POM.BASE.MarsBase;
import MarsV10POM.V10POM.Pages.RepLookUp;

public class RepLookUpTest extends MarsBase
{
	
	RepLookUp RepLookUp;
	
	public RepLookUpTest()
	{
		super();
		
	}
	
	@BeforeClass
	public void setUp()
	{
		
		RepLookUp = new RepLookUp();	
	}
	
	@Test(priority=1,groups="Rep",dependsOnGroups="login")
	public void replookuplogin()
	{
	
		RepLookUp.clickrep();
	}
	
	@Test(priority=2,groups="Rep",dependsOnGroups="login")
	public void repnameseacrh()
	{
	
		RepLookUp.repname_search();
	}
	
	@Test(priority=3,groups="Rep",dependsOnGroups="login")
	public void repmaintab()
	{
	
		RepLookUp.click_maintab();
	}
	
/*	@Test(priority=4)
	public void PrimaryDetails()
	{
		RepLookUp.click_PrimaryDetails();
	}*/

	 @Test(priority=5,groups="Rep",dependsOnGroups="login")
	 public void MiddleName()
	 {
		 RepLookUp.clear_Type_MiddleName();
	 }
	 @Test(priority=6,groups="Rep",dependsOnGroups="login")
	 public void Fax()
	 {
		 RepLookUp.clear_Type_Fax();
	 }
	 @Test(priority=7,groups="Rep",dependsOnGroups="login")
	 public void Website()
	 {
		 RepLookUp.clear_Type_Website();
	 }
	 @Test(priority=8,groups="Rep",dependsOnGroups="login")
	 public void Title()
	 {
		 RepLookUp.clear_Type_RepTitle();
	 }
	 @Test(priority=9,groups="Rep",dependsOnGroups="login")
	 public void FirmSourceID()
	 {
		 RepLookUp.clear_Type_FirmSourceID();
	 }
	 @Test(priority=10,groups="Rep",dependsOnGroups="login")
	 public void RepNickName()
	 {
		 RepLookUp.clear_Type_RepNickName();
	 }
	 @Test(priority=11,groups="Rep",dependsOnGroups="login")
	 public void RepCRD()
	 {
		 RepLookUp.clear_Type_RepCRD();
	 }
	 @Test(priority=12,groups="Rep",dependsOnGroups="login")
	 public void RepFirstName()
	 {
		 RepLookUp.clear_Type_RepFirstName();
	 }
	 @Test(priority=13,groups="Rep",dependsOnGroups="login")
	 public void RepLastName()
	 {
		 RepLookUp.clear_Type_RepLastName();
	 }
	 @Test(priority=14,groups="Rep",dependsOnGroups="login")
	 public void RepPhone()
	 {
		 RepLookUp.clear_Type_RepPhone();
	 }
	 @Test(priority=15,groups="Rep",dependsOnGroups="login")
	 public void RepEmailID2()
	 {
		 RepLookUp.clear_Type_RepEmailID2();
	 }
	@Test(priority=16,groups="Rep",dependsOnGroups="login")
	public void RepMobile()
	{
		RepLookUp.clear_Type_RepMobile();
	}
	
	@Test(priority=17,groups="Rep",dependsOnGroups="login")
	public void PhoneExt()
	{
		RepLookUp.clear_Type_PhoneExt();
	}
	@Test(priority=18,groups="Rep",dependsOnGroups="login")
	public void RepComments()
	{
		RepLookUp.clear_Type_RepComments();
	}
	@Test(priority=19,groups="Rep",dependsOnGroups="login")
	public void PersonalInfo()
	{
		RepLookUp.clear_Type_PersonalInfo();
	}
	@Test(priority=20,groups="Rep",dependsOnGroups="login")
	public void RepSourceID()
	{
		RepLookUp.clear_Type_RepSourceID();
	}
	@Test(priority=21,groups="Rep",dependsOnGroups="login")
	public void Broker()
	{
		RepLookUp.clear_Type_Broker();
	}
	
	@Test(priority=22,groups="Rep",dependsOnGroups="login")
	public void AlternateName()
	{
		RepLookUp.clear_Type_AlternateName();
	}
	
	@Test(priority=23,groups="Rep",dependsOnGroups="login")
	public void Birthday()
	{
		RepLookUp.clear_Type_Birthday();
	}
	
	@Test(priority=24,groups="Rep",dependsOnGroups="login")
	public void AUM()
	{
		RepLookUp.clear_Type_AUM();
	}
}

 	
