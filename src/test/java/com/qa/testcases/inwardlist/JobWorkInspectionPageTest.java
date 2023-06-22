package com.qa.testcases.inwardlist;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.inwardlistpages.JobWorkInspectionPage;

import com.qa.utils.TestUtil;

public class JobWorkInspectionPageTest extends TestBase {

	JobWorkInspectionPage jobworkinspectionpage;




public JobWorkInspectionPageTest()	
{
	super();
}

@BeforeClass
public void setup()
{
	initialization();
	jobworkinspectionpage = new JobWorkInspectionPage();
	TestUtil.ValidateUserLogin();
}

//@AfterClass
//public void teardown()
//{
//	driver.quit();
//}

@Test(priority=1)
public void Verify_Navigation()
{	
	
	jobworkinspectionpage.Navigate_jobworkinspection_menu();
}

@Test(priority=2)
public void Verify_inwardbutton_click()
{
	jobworkinspectionpage.Open_inward_button();
}

@Test(priority=3)
public void Verify_filldata_DocumentDeatils()
{
	jobworkinspectionpage.fill_data_DocumentDetails();
	
	
}


@Test(priority=4)
public void  Verify_fill_data_DocumentLines() throws InterruptedException
{
	jobworkinspectionpage.fill_data_DocumentLines();
	
}

@Test(priority=5)
public void  Verify_fill_data_JangadExpenseDetails() throws InterruptedException
{
	jobworkinspectionpage.fill_data_JangadExpenseDetails();
	
}

@Test(priority=6)
public void  Verify_ValidateConfirmationRecord() throws InterruptedException
{
	jobworkinspectionpage.ValidateConfirmationRecord();
	
}

@Test(priority=7)
public void  Verify_ValidateDisableFields()
{
	jobworkinspectionpage.ValidateDisableFields();
	
}
@Test(priority=8)
public void  Verify_ValidateEditFunctionality()
{
	jobworkinspectionpage.ValidateEditFunctionality();
	
}
@Test(priority=9)
public void  Verify_search_functionality_test()
{
	jobworkinspectionpage.search_functionality_test();
	
}

@Test(priority=10)
public void  pagination_functionality() throws InterruptedException
{
	jobworkinspectionpage.pagination_functionality();
	
}

}
