package com.qa.testcases.inwardlist;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.inwardlistpages.JobWorkRepairListPage;
import com.qa.utils.TestUtil;

public class JobWorkRepairListPageTest extends TestBase {
	
	JobWorkRepairListPage jobworkrepairlistpage;
	
	
	
	
	public JobWorkRepairListPageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		jobworkrepairlistpage = new JobWorkRepairListPage();
		TestUtil.ValidateUserLogin();
	}
	
	@Test(priority=1)
	public void Verify_Navigation()
	{	
		
		jobworkrepairlistpage.Navigate_jobworkrepair_menu();
	}
	
	@Test(priority=2)
	public void Verify_inwardbutton_click()
	{
		jobworkrepairlistpage.Open_inward_button();
	}
	
	@Test(priority=3)
	public void Verify_filldata_DocumentDeatils()
	{
		jobworkrepairlistpage.fill_data_DocumentDetails();
		
		
	}

	
	@Test(priority=4)
	public void  Verify_fill_data_DocumentLines() throws InterruptedException
	{
		jobworkrepairlistpage.fill_data_DocumentLines();
		
	}
	
	
	@Test(priority=5)
	public void  Verify_fill_data_JangadExpenseDetails() throws InterruptedException
	{
		jobworkrepairlistpage.fill_data_JangadExpenseDetails();
		
	}

	@Test(priority=6)
	public void  Verify_ValidateConfirmationRecord() throws InterruptedException
	{
		jobworkrepairlistpage.ValidateConfirmationRecord();
		
	}

	@Test(priority=7)
	public void  Verify_ValidateDisableFields()
	{
		jobworkrepairlistpage.ValidateDisableFields();
		
	}
	@Test(priority=8)
	public void  Verify_ValidateEditFunctionality()
	{
		jobworkrepairlistpage.ValidateEditFunctionality();
		
	}
	
	@Test(priority=9)
	public void  Verify_search_functionality_test()
	{
		jobworkrepairlistpage.search_functionality_test();
		
	}
	
	@Test(priority=10)
	public void  pagination_functionality() throws InterruptedException
	{
		jobworkrepairlistpage.pagination_functionality();
		
	}
	
	@AfterClass
	public void quit()
	{
		browserclose();
	}
	
	
	
}
