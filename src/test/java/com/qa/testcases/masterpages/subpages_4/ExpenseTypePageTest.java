package com.qa.testcases.masterpages.subpages_4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.masterpages.subpages_4.ExpenseTypePage;
import com.qa.utils.TestUtil;

public class ExpenseTypePageTest extends TestBase {

	ExpenseTypePage expensetypepage;
	
	
	
	
	public ExpenseTypePageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		expensetypepage = new ExpenseTypePage();
		TestUtil.ValidateUserLogin();
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//	}
	
	@Test(priority=1)
	public void Verify_Navigation_to_menupage()   // To check navigation to sub menu
	{	
		expensetypepage.Navigate_sub_menu();
	}
	
	@Test(priority=2)
	public void Verify_Clicking_on_record_btn()   // To check click on Record button
	{	 
		expensetypepage.Click_on_Record();
	}
	
	@Test(priority=3)
	public void Verify_Record_Add()   // To check by adding record & verifying it is created or not.
	{	
		expensetypepage.add_data_record();
	}
	
	@Test(priority=4)
	public void Verify_Record_Already_exists()
	{	
		expensetypepage.Record_already_exists();  //To check record is already exists.
	}
	
	@Test(priority=5)
	public void Verify_Validation_with_no_data()
	{	
		expensetypepage.validation_msg();  //To check by validation msg on add record without data
	}
	
	@Test(priority=6)
	public void Verify_Record_Edited()
	{	
		expensetypepage.edit_functionality(); //To check edit record 
	}
	
	@Test(priority=7)
	public void Verify_Record_ToggleStatus()
	{	
		expensetypepage.toggle_status();  //To check toggle status
	}
	
	@Test(priority=8)
	public void Verify_No_Record_found()
	{	
		expensetypepage.random_search();  //To check by entering random text & verify no result found.
	}
	
	@Test(priority=9)
	public void Verify_Pagination()
	{	
		expensetypepage.pagination();  //To check pagination.
	}
	
}
