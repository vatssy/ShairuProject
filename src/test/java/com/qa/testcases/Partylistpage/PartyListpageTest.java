package com.qa.testcases.Partylistpage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Partylistpage.PartyListpage;
import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class PartyListpageTest extends TestBase{
	
		PartyListpage partylistlistpage;
		
		public PartyListpageTest()	
		{
			super();
		}
		
		@BeforeClass
		public void setup()
		{
			initialization();
			partylistlistpage = new PartyListpage();
			TestUtil.ValidateUserLogin();
		}
		
		@Test(priority=1)
		public void Verify_partyNavigation() throws InterruptedException
		{
			partylistlistpage.Navigate_Partylist_menu();
		}
		
		@Test(priority=2)
		public void Verify_Open_partyadd_pate()
		{
			partylistlistpage.Open_party_add();
		}
		
		@Test(priority=3)
		public void Verify_fill_Partyinformation() throws InterruptedException
		{
			partylistlistpage.add_partyinformation();
		}
		
		@Test(priority=4)
		public void Verify_fill_contectinformation() throws InterruptedException
		{
			partylistlistpage.add_contect_information();
		}
		
		@Test(priority=5)
		public void Verify_fill_Refrenceinformation() throws InterruptedException
		{
			partylistlistpage.add_reference_information();
		}
		
		@Test(priority=6)
		public void Verify_Party_save_button()
		{
			partylistlistpage.save_button();
		}
		
		@Test(priority=7)
		public void Verify_Category_AddSection() throws InterruptedException 
		{
			partylistlistpage.add_category_details(); 
		}
		 
		
		@Test(priority=8) 
		public void Verify_Process_AddSection() throws InterruptedException 
		{ 
			partylistlistpage.add_process_details(); 
		}
		  
		@Test(priority=9) 
		public void Verify_edit_party_details() throws InterruptedException 
		{ 
			partylistlistpage.edit_party_details(); 
		}
		  
		@Test(priority=10) 
		public void Verify_edit_categoryprocess_details() throws InterruptedException 
		{ 
			partylistlistpage.edit_categoryprocess_details(); 
		}
		 
		@Test(priority=11) 
		public void Verify_listpage_toggel() throws InterruptedException
		{
			partylistlistpage.listpage_toggel();
		}
		
		@Test(priority=12) 
		public void Verify_listpage_pagination() throws InterruptedException
		{
			partylistlistpage.listpage_pagination();;
		}

		@Test(priority=13) 
		public void Verify_listpage_searchbar() throws InterruptedException
		{
			partylistlistpage.listpage_searchbar();;
		}

}
