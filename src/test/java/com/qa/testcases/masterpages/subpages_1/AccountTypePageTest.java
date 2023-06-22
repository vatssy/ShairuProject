package com.qa.testcases.masterpages.subpages_1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.masterpages.subpages_1.AccountTypePage;
import com.qa.utils.TestUtil;

public class AccountTypePageTest extends TestBase {

	AccountTypePage accounttypepage;
	
	
	
	
	public AccountTypePageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		accounttypepage = new AccountTypePage();
		TestUtil.ValidateUserLogin();
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//	}
	
	@Test(priority=1)
	public void Verify_Navigation_to_menupage()
	{	
		accounttypepage.Navigate_occupation_menu();
	}
	
	@Test(priority=2)
	public void Verify_Clicking_on_record_btn()
	{	
		accounttypepage.Click_on_Record();
	}
	
	@Test(priority=3)
	public void Verify_Record_Add()
	{	
		accounttypepage.add_data_record();
	}
	
	@Test(priority=4)
	public void Verify_Record_Already_exists()
	{	
		accounttypepage.Record_already_exists();  //To check record is already exists.
	}
	
	@Test(priority=5)
	public void Verify_Validation_with_no_data()
	{	
		accounttypepage.validation_msg();  //To check by validation msg on add record without data
	}
	
	@Test(priority=6)
	public void Verify_Record_Edited()
	{	
		accounttypepage.edit_functionality(); //To check edit record 
	}
	
	@Test(priority=7)
	public void Verify_Record_ToggleStatus()
	{	
		accounttypepage.toggle_status();  //To check toggle status
	}
	
	@Test(priority=8)
	public void Verify_No_Record_found()
	{	
		accounttypepage.random_search();  //To check by entering random text & verify no result found.
	}
	
	@Test(priority=9)
	public void Verify_Pagination()
	{	
		accounttypepage.pagination();  //To check pagination.
	}
	
	
	
}
