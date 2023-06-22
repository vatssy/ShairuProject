package com.qa.testcases.inwardlist;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.inwardlistpages.ConsignmentListPage;
import com.qa.utils.TestUtil;

public class ConsignmentListPageTest extends TestBase {
	
	ConsignmentListPage consignmentlistpage;
	
	
	
	
	public ConsignmentListPageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		consignmentlistpage = new ConsignmentListPage();
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
		
		consignmentlistpage.Navigate_consignmentlist_menu();
	}
	
	@Test(priority=2)
	public void Verify_inwardbutton_click()
	{
		consignmentlistpage.Open_inward_button();
	}
	
	@Test(priority=3)
	public void Verify_filldata_DocumentDeatils()
	{
		consignmentlistpage.fill_data_DocumentDetails();
		
		
	}
	
	@Test(priority=4)
	public void  Verify_fill_data_KPCertificateDetails()
	{
		consignmentlistpage.fill_data_KPCertificateDetails();
		
	}
	
	
	@Test(priority=5)
	public void  Verify_fill_data_BillEntryDetails()
	{
		consignmentlistpage.fill_data_BillEntryDetails();
		
	}
	
	@Test(priority=6)
	public void  Verify_fill_data_DocumentLines()
	{
		consignmentlistpage.fill_data_DocumentLines();
		
	}
	
	@Test(priority=7)
	public void  Verify_fill_data_JangadExpenseDetails()
	{
		consignmentlistpage.fill_data_JangadExpenseDetails();
		
	}
	
	@Test(priority=8)
	public void  Verify_ValidateConfirmationRecord() throws InterruptedException
	{
		consignmentlistpage.ValidateConfirmationRecord();
		
	}
	
	@Test(priority=9)
	public void  Verify_ValidateDisableFields()
	{
		consignmentlistpage.ValidateDisableFields();
		
	}
	
	
	@Test(priority=10)
	public void  Verify_ValidateEditFunctionality()
	{
		consignmentlistpage.ValidateEditFunctionality();
		
	}
	
	@Test(priority=11)
	public void  Verify_search_functionality_test()
	{
		consignmentlistpage.search_functionality_test();
		
	}
	
	@Test(priority=10)
	public void  pagination_functionality() throws InterruptedException
	{
		consignmentlistpage.pagination_functionality();
		
	}
	
	
}
