package com.qa.testcases.masterpages.subpages_1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.masterpages.subpages_1.SectionPage;
import com.qa.utils.TestUtil;

public class SectionPageTest extends TestBase {

	SectionPage sectionpage;
	
	
	
	
	public SectionPageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		sectionpage = new SectionPage();
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
		sectionpage.Navigate_occupation_menu();
	}
	
	@Test(priority=2)
	public void Verify_Clicking_on_record_btn()
	{	
		sectionpage.Click_on_Record();
	}
	
	@Test(priority=3)
	public void Verify_Record_Add()
	{	
		sectionpage.add_data_record();
	}
	
	
	@Test(priority=4)
	public void Verify_Record_Already_exists()
	{	
		sectionpage.Record_already_exists();  //To check record is already exists.
	}
	
	@Test(priority=5)
	public void Verify_Validation_with_no_data()
	{	
		sectionpage.validation_msg();  //To check by validation msg on add record without data
	}
	
	@Test(priority=6)
	public void Verify_Record_Edited()
	{	
		sectionpage.edit_functionality(); //To check edit record 
	}
	
	@Test(priority=7)
	public void Verify_Record_ToggleStatus()
	{	
		sectionpage.toggle_status();  //To check toggle status
	}
	
	@Test(priority=8)
	public void Verify_No_Record_found()
	{	
		sectionpage.random_search();  //To check by entering random text & verify no result found.
	}
	
	@Test(priority=9)
	public void Verify_Pagination()
	{	
		sectionpage.pagination();  //To check pagination.
	}
	
}
