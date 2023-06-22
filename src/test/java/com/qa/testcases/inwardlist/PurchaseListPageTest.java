package com.qa.testcases.inwardlist;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.inwardlistpages.PurchaseListPage;
import com.qa.utils.TestUtil;

public class PurchaseListPageTest extends TestBase {
	
	PurchaseListPage purchaselistpage;
	
	
	
	
	public PurchaseListPageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		purchaselistpage = new PurchaseListPage();
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
		
		purchaselistpage.Navigate_purchaselist_menu();
	}
	
	@Test(priority=2)
	public void Verify_inwardbutton_click()
	{
		purchaselistpage.Open_inward_button();
	}
	
	@Test(priority=3)
	public void Verify_filldata_DocumentDeatils()
	{
		purchaselistpage.fill_data_DocumentDetails();
		
		
	}
	
	
	  
	 
	@Test(priority=4)
	public void  Verify_fill_data_KPCertificateDetails()
	{
		purchaselistpage.fill_data_KPCertificateDetails();
		
	}
	
	
	@Test(priority=5)
	public void  Verify_fill_data_BillEntryDetails()
	{
		purchaselistpage.fill_data_BillEntryDetails();
		
	}
	
	
	@Test(priority=6)
	public void  Verify_fill_data_CorrespondingInvoice()
	{
		purchaselistpage.fill_data_CorrespondingInvoice();
		
	}
	
	
	@Test(priority=7)
	public void  Verify_fill_data_MiningInformation()
	{
		purchaselistpage.fill_data_MiningInformation();
		
	}
	
	
	
	@Test(priority=8)
	public void  Verify_fill_data_DocumentLines() throws InterruptedException
	{
		purchaselistpage.fill_data_DocumentLines();
		
	}
	
	@Test(priority=9)
	public void  Verify_fill_data_JangadExpenseDetails() throws InterruptedException
	{
		purchaselistpage.fill_data_JangadExpenseDetails();
		
	}
	
	@Test(priority=10)
	public void  Verify_ValidateConfirmationRecord() throws InterruptedException
	{
		purchaselistpage.ValidateConfirmationRecord();
		
	}
	
	@Test(priority=11)
	public void  Verify_ValidateDisableFields()
	{
		purchaselistpage.ValidateDisableFields();
		
	}
	
	
	@Test(priority=12)
	public void  Verify_ValidateEditFunctionality()
	{
		purchaselistpage.ValidateEditFunctionality();
		
	}
	

	@Test(priority=13)
	public void  Verify_search_functionality_test()
	{
		purchaselistpage.search_functionality_test();
		
	}
	
	@Test(priority=14)
	public void  pagination_functionality() throws InterruptedException
	{
		purchaselistpage.pagination_functionality();
		
	}

	
}

	
