package com.qa.testcases.masterpages.subpages_2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.masterpages.subpages_2.PartyCategoryPage;
import com.qa.utils.TestUtil;

public class PartyCategoryPageTest extends TestBase {

	PartyCategoryPage partycategorypage;
	
	
	
	
	public PartyCategoryPageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		partycategorypage = new PartyCategoryPage();
		TestUtil.ValidateUserLogin();
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//	}
	
	@Test(priority=1)
	public void Verify_Navigate_sub_menu()
	{	
		partycategorypage.Navigate_sub_menu(); 
	}
	
	@Test(priority=2)
	public void Verify_Clicking_on_record_btn()
	{	
		partycategorypage.Click_on_Record();
	}
	
	@Test(priority=3)
	public void Verify_Record_Add()
	{	
		partycategorypage.add_data_record();
	}
	
	@Test(priority=4)
	public void Verify_Record_Already_exists()
	{	
		partycategorypage.Record_already_exists();  //To check record is already exists.
	}
	
	@Test(priority=5)
	public void Verify_Validation_with_no_data()
	{	
		partycategorypage.validation_msg();  //To check by validation msg on add record without data
	}
	
	@Test(priority=6)
	public void Verify_Record_Edited()
	{	
		partycategorypage.edit_functionality(); //To check edit record 
	}
	
	@Test(priority=7)
	public void Verify_Record_ToggleStatus()
	{	
		partycategorypage.toggle_status();  //To check toggle status
	}
	
	@Test(priority=8)
	public void Verify_No_Record_found()
	{	
		partycategorypage.random_search();  //To check by entering random text & verify no result found.
	}
	
	@Test(priority=9)
	public void Verify_Pagination()
	{	
		partycategorypage.pagination();  //To check pagination.
	}
	
	
}
