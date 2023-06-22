package com.qa.testcases.inwardlist;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.inwardlistpages.JobWorkRoughListPage;
import com.qa.utils.TestUtil;

public class JobWorkRoughListPageTest extends TestBase {
	
	JobWorkRoughListPage jobworkroughlistpage;
	
	
	
	
	public JobWorkRoughListPageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		jobworkroughlistpage = new JobWorkRoughListPage();
		TestUtil.ValidateUserLogin();
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//	}
	
	@Test(priority=1)
	public void Verify_Navigation()
	{	
		
		jobworkroughlistpage.Navigate_jobworkrough_menu();
	}
	
	@Test(priority=2)
	public void Verify_inwardbutton_click()
	{
		jobworkroughlistpage.Open_inward_button();
	}
	
	@Test(priority=3)
	public void Verify_filldata_DocumentDeatils()
	{
		jobworkroughlistpage.fill_data_DocumentDetails();
		
		
	}
	
	
	  
	 
	@Test(priority=4)
	public void  Verify_fill_data_KPCertificateDetails()
	{
		jobworkroughlistpage.fill_data_KPCertificateDetails();
		
	}
	
	
	@Test(priority=5)
	public void  Verify_fill_data_BillEntryDetails()
	{
		jobworkroughlistpage.fill_data_BillEntryDetails();
		
	}
	
	
	@Test(priority=6)
	public void  Verify_fill_data_CorrespondingInvoice()
	{
		jobworkroughlistpage.fill_data_CorrespondingInvoice();
		
	}
	
	
	@Test(priority=7)
	public void  Verify_fill_data_MiningInformation()
	{
		jobworkroughlistpage.fill_data_MiningInformation();
		
	}
	
	
	
	@Test(priority=8)
	public void  Verify_fill_data_DocumentLines() throws InterruptedException
	{
		jobworkroughlistpage.fill_data_DocumentLines();
		
	}
	
	
	@Test(priority=9)
	public void  Verify_fill_data_JangadExpenseDetails() throws InterruptedException
	{
		jobworkroughlistpage.fill_data_JangadExpenseDetails();
		
	}
	
	
	 
	@Test(priority=10)
	public void  Verify_ValidateConfirmationRecord() throws InterruptedException
	{
		jobworkroughlistpage.ValidateConfirmationRecord();
		
	}
	
	@Test(priority=11)
	public void  Verify_ValidateDisableFields()
	{
		jobworkroughlistpage.ValidateDisableFields();
		
	}
	
	
	@Test(priority=12)
	public void  Verify_ValidateEditFunctionality()
	{
		jobworkroughlistpage.ValidateEditFunctionality();
		
	}
	

	@Test(priority=13)
	public void  Verify_search_functionality_test()
	{
		jobworkroughlistpage.search_functionality_test();
		
	}
	
	@Test(priority=14)
	public void  pagination_functionality() throws InterruptedException
	{
		jobworkroughlistpage.pagination_functionality();
		
	}
	
	
	
	
	
	
	

	
	
}

	