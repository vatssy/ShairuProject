package com.qa.inwardlistpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class MemoListPage extends TestBase{
	

	//Random String generated for : Document Number & all 
	String Common_No_random	= TestUtil.RandomStringGenerator();
	
	//File path 
		public String Commonpath_pdf = System.getProperty("user.dir")+ prop.getProperty("Commonpath_pdf");
		public String Commonpath_image = System.getProperty("user.dir")+ prop.getProperty("Commonpath_image");
	
	//Document Info section 
	

	
		@FindBy(xpath= "(//span[normalize-space()='Inward List'])[1]")
		WebElement inwardlist_menu;
		
		@FindBy(xpath= "(//a[normalize-space()='Memo List'])[1]")
		WebElement memolist_menu;
		
		@FindBy(xpath= "(//button[@class='ant-btn ant-btn-default ant-btn-lg btn-orange btn-table-top'])[1]")
		WebElement inward_button;
		

		@FindBy(xpath= "//div[contains(text(),'Memo')]")
		WebElement InwardType_text;
		
		@FindBy(xpath= "//input[@placeholder = 'Select date']")
		WebElement Inwarddate;
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[2]")
		WebElement DocumentDate;
		
		@FindBy(xpath= "(//input[@id='react-select-3-input'])[1]")
		WebElement DocumentType;
		
		@FindBy(xpath= "(//div[@id='react-select-3-option-0'])[1]")
		WebElement DocumentType_select;
		
		
		
		@FindBy(xpath= "//input[@name='document_no']")
		WebElement DocumentNo;
		
		@FindBy(xpath= "//input[@name='duration']")
		WebElement Duration_field;
		
		@FindBy(xpath= "//*[@id=\"root\"]/div/section/section/main/div[1]/form/div[1]/div[8]/div/div/div[2]/div/div/div/div")
		WebElement SenderName;
		
		@FindBy(xpath= "(//div[@id='react-select-4-option-0'])[1]")
		WebElement SenderName_select;
		
		
		@FindBy(xpath= "//*[@id=\"root\"]/div/section/section/main/div[1]/form/div[1]/div[9]/div/div/div[2]/div/div/div/div/div[1]/div[2]")
		WebElement TransactionType;
		
		@FindBy(id= "react-select-5-option-1")
		WebElement TransactionType_select;
		
//Dummy data
		@FindBy(xpath= "//input[@name='total_packets']")
		WebElement TotalPackets;
		
		@FindBy(xpath= "//input[@name='total_pieces']")
		WebElement TotalPieces;
		
		@FindBy(xpath= "//input[@name='total_carats']")
		WebElement TotalCarats;
		
		@FindBy(xpath= "//input[@name='inward_pieces']")
		WebElement InwardPieces;
		
		@FindBy(xpath= "//input[@name='inward_carats']")
		WebElement InwardCarats;
//Proper data
		@FindBy(xpath= "//input[@name='total_packets']")
		WebElement TotalPackets2;
		
		@FindBy(xpath= "//input[@name='total_pieces']")
		WebElement TotalPieces2;
		
		@FindBy(xpath= "//input[@name='total_carats']")
		WebElement TotalCarats2;
		
		@FindBy(xpath= "//input[@name='inward_pieces']")
		WebElement InwardPieces2;
		
		@FindBy(xpath= "//input[@name='inward_carats']")
		WebElement InwardCarats2;
		
		@FindBy(xpath= "(//input[@type='file'])[1]")
		WebElement DocumentFile;
		
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[1]/form/div[1]/div[16]/div/div/div[2]/div/div/div/div/div[1]/div[2]")
		WebElement ExchangeType;
		
		@FindBy(id= "react-select-6-option-1")
		WebElement ExchangeType_select;
		
		
		@FindBy(xpath= "//input[@name='exchange_rate_boe']")
		WebElement ExchangeRate_BOE;
		
		@FindBy(xpath= "//input[@name='exchange_rate_rbi']")
		WebElement ExchangeRate_RBI;
		
		// Total Invoice value in $
		
		@FindBy(xpath= "//input[@name='gross_value_forex']")
		WebElement GrossValue;
		@FindBy(xpath= "//input[@name='expense_forex']")
		WebElement Expense;
//Proper data
		@FindBy(xpath= "//input[@name='gross_value_forex']")
		WebElement GrossValue2;
		@FindBy(xpath= "//input[@name='expense_forex']")
		WebElement Expense2;
		
		// Save buttons of page 
		
		@FindBy(xpath= "(//button[@type='submit'])[1]")
		WebElement save_button1;
		
		//Success message 
		@FindBy(xpath= "//span[normalize-space()='Inward Document created successfully.']")
		WebElement success_msg;
		
		
		@FindBy(xpath= "//*[@id=\"root\"]/div/section/section/main/div[2]/form/div[1]/div/div[2]/button")
		WebElement row_button1;

		
		//Document line section
		
		@FindBy(xpath= "(//input[@type='text'])[11]")
		WebElement KapanNo;
		
		
		@FindBy(css= ".ant-table-cell:nth-child(3) .ant-input")
		WebElement Pieces;
		
		@FindBy(xpath= "(//input[@type='number'])[11]")
		WebElement Carats;
		
		@FindBy(xpath= "(//input[@type='number'])[12]")
		WebElement Rate;
		
		@FindBy(xpath= "(//button[@type='submit'])[2]")
		WebElement Save_button3; 
		
		//Document line1 Proper data
		
				@FindBy(xpath= "(//input[@type='text'])[11]")
				WebElement KapanNo1;
				
				@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[2]/form/form/div/div/div/div/div/div/table/tbody/tr[2]/td[3]/div/div/div/div/div/input")
				WebElement Pieces1;
				
				@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[2]/form/form/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/div/div/div/div/input")
				WebElement Carats1;
				
				@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[2]/form/form/div/div/div/div/div/div/table/tbody/tr[2]/td[5]/div/div/div/div/div/input")
				WebElement Rate1;
				
		//Document line2 
				
				@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[2]/form/form/div/div/div/div/div/div/table/tbody/tr[3]/td[2]/div/div/div/div/div/input")
				WebElement KapanNo2;
				
				@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[2]/form/form/div/div/div/div/div/div/table/tbody/tr[3]/td[3]/div/div/div/div/div/input")
				WebElement Pieces2;
				
				@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[2]/form/form/div/div/div/div/div/div/table/tbody/tr[3]/td[4]/div/div/div/div/div/input")
				WebElement Carats2;
				
				@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[2]/form/form/div/div/div/div/div/div/table/tbody/tr[3]/td[5]/div/div/div/div/div/input")
				WebElement Rate2;
		//Document line3 
				
				@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[2]/form/form/div/div/div/div/div/div/table/tbody/tr[4]/td[2]/div/div/div/div/div/input")
				WebElement KapanNo3;	
				
		
		//Jangad Expense Details
		
		@FindBy(xpath= "//*[@id=\"root\"]/div/section/section/main/div[3]/div[1]/div/div[2]/button")
		WebElement row_button_Jangad;
		
		@FindBy(xpath= "(//input[@name='jangad_no_0'])[1]")
		WebElement JangadNo;
		
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[3]/form/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/div/div/div/div/div/div/div[1]/div[2]/input")
		WebElement CourierPartyName;
		
		@FindBy(id= "react-select-8-option-1")
		WebElement CourierPartyName_select;
		
		
		@FindBy(xpath= "(//input[@name='courier_no_0'])")
		WebElement CourierNo;
		
		@FindBy(xpath= "(//input[@type='file'])[2]")
		WebElement CourierDocument; 
		
		//1
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[3]/form/div/div/div/div/div/div/table/tbody/tr[2]/td[7]/div[1]/div/div/div/div/div/div/div[1]/div[2]/input")
		WebElement Expense1;
		
		@FindBy(id= "react-select-9-option-1")
		WebElement Expense1_select;
		
		@FindBy(xpath= "//input[@name='expense_value_1_0']")
		WebElement Expense1_value;
	//2
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[3]/form/div/div/div/div/div/div/table/tbody/tr[2]/td[8]/div[1]/div/div/div/div/div/div/div[1]/div[2]/input")
		WebElement Expense22;
				
		@FindBy(xpath= "(//div[@id='react-select-10-option-0'])[1]")
		WebElement Expense2_select;
				
		@FindBy(xpath= "//input[@name='expense_value_2_0']")
		WebElement Expense2_value;
	//3
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[3]/form/div/div/div/div/div/div/table/tbody/tr[2]/td[9]/div[1]/div/div/div/div/div/div/div[1]/div[2]/input")
		WebElement Expense3;
				
		@FindBy(xpath= "(//div[@id='react-select-11-option-0'])[1]")
		WebElement Expense3_select;
				
		@FindBy(xpath= "//input[@name='expense_value_3_0']")
		WebElement Expense3_value;
				
	//4
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[3]/form/div/div/div/div/div/div/table/tbody/tr[2]/td[10]/div[1]/div/div/div/div/div/div/div[1]/div[2]/input")
		WebElement Expense4;
				
		@FindBy(xpath= "(//div[@id='react-select-12-option-0'])[1]")
		WebElement Expense4_select;
				
		@FindBy(xpath= "//input[@name='expense_value_4_0']")
		WebElement Expense4_value;
				
		@FindBy(xpath= "(//input[@class='ant-select-selection-search-input'])[2]")
		WebElement appliedfield;
		
		@FindBy(xpath= "(//input[@class='ant-select-selection-search-input'])[2]")
		WebElement dropdownoverflow;
		
		@FindBy(xpath= "(//div[@class='ant-select-selection-overflow-item ant-select-selection-overflow-item-suffix'])")
		WebElement appliedfield_select;
		
		
		
		//navigation to Hide_button
		@FindBy(xpath= "(//span[@aria-label='left'])[1]")
		WebElement navigation_hidebutton;
		
		
		
		@FindBy(xpath= "//button[@type='button']//span[@aria-label='save']")
		WebElement Save_finalbutton;
		
		
		//Confirmation Record - record added successfully
		@FindBy(xpath= "//td[normalize-space()='+text_record+']")
		WebElement Record_added;
		
		//View button
		@FindBy(xpath= "(//*[name()='svg'])[35]")
		WebElement view_button;
		
		//Edit Functionality 
		
		@FindBy(xpath= "(//span[@aria-label='edit'])[1]")
		WebElement edit_button;
		
		//Completed Icon - green tick 
		
				@FindBy(xpath= "(//*[name()='svg'])[34]")
				WebElement green_icon;
				
				
				// Search Functionality 
				
				@FindBy(xpath= "(//input[@placeholder='Search...'])[1]")
				WebElement search_field;
				
				@FindBy(xpath= "//div[contains(text(),'No search data')]")
				WebElement No_search_data;
				
				//pagination Elements
				@FindBy(xpath= "(//button[@type='button'])[2]")
				WebElement previous_pagination_button;
				
				@FindBy(xpath= "(//button[@type='button'])[3]")
				WebElement next_pagination_button;
				
		
		
		//Success message after edit
		@FindBy(xpath= "(//span[normalize-space()='Record added successfully'])[1]")
		WebElement success_msg_edit;
		
		@FindBy(xpath= "//div[@class='ant-table ant-table-bordered ant-table-empty ant-table-ping-left ant-table-ping-right ant-table-fixed-column ant-table-scroll-horizontal ant-table-has-fix-right']")
		WebElement Scroll;
		
		public MemoListPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void Navigate_memolist_menu() 
		{
			try {
				TestUtil.navigate_to_option1(inwardlist_menu,memolist_menu);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void Open_inward_button()
		{
			((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			inward_button.isDisplayed();
			inward_button.click();
			System.out.println("Inward module is open - user can enter data in it.");
			
			
		}
		
		public void fill_data_DocumentDetails() 
		{
			InwardType_text.isDisplayed();
			
			Inwarddate.getText();
			
		
	   
			 DocumentDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 DocumentDate.sendKeys(Keys.RETURN);
			
			 try {
				TestUtil.navigate_to_option1(DocumentType,DocumentType_select);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 DocumentNo.sendKeys(Common_No_random);
			 Duration_field.sendKeys(prop.getProperty("Duration_field"));
			 
			 try {
				TestUtil.navigate_to_option1(SenderName,SenderName_select);
				Thread.sleep(1000);
				TestUtil.navigate_to_option1(TransactionType,TransactionType_select);
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	/*		 
			 TotalPackets.sendKeys(prop.getProperty("TotalPackets"));
			 
			TotalPieces.sendKeys(prop.getProperty("TotalPieces"));
				
			TotalCarats.sendKeys(prop.getProperty("TotalCarats"));
				
			InwardPieces.sendKeys(prop.getProperty("InwardPieces"));
				
			InwardCarats.sendKeys(prop.getProperty("InwardCarats"));
	*/		
	//Proper data		 
			 TotalPackets2.sendKeys(prop.getProperty("TotalPackets2"));
			 
			 TotalPieces2.sendKeys(prop.getProperty("TotalPieces2"));
					
			 TotalCarats2.sendKeys(prop.getProperty("TotalCarats2"));
					
			 InwardPieces2.sendKeys(prop.getProperty("InwardPieces2"));
					
			 InwardCarats2.sendKeys(prop.getProperty("InwardCarats2"));	
			
			TestUtil.upload_file(DocumentFile,Commonpath_pdf);
			try {
				
				
				
				TestUtil.navigate_to_option1(ExchangeType,ExchangeType_select);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			ExchangeRate_BOE.sendKeys(prop.getProperty("ExchangeRate_BOE"));
			ExchangeRate_RBI.sendKeys(prop.getProperty("ExchangeRate_RBI"));
			
			
/*			
			GrossValue.sendKeys(prop.getProperty("GrossValue"));
			Expense.sendKeys(prop.getProperty("Expense"));
*/			
//Proper data	
			
			GrossValue2.sendKeys(prop.getProperty("GrossValue2"));
			Expense2.sendKeys(prop.getProperty("Expense2"));
			
			save_button1.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public void fill_data_DocumentLines() throws InterruptedException, AWTException  
		{
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(row_button1));
			
			Thread.sleep(1000);
			memolist_menu.click();
			Thread.sleep(2000);
			edit_button.click();
			
			Thread.sleep(2000);
			row_button1.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(3000);
			
			KapanNo1.sendKeys(Common_No_random+"java1");
									
			Pieces1.sendKeys(prop.getProperty("Pieces1"));
			  
			Carats1.sendKeys(prop.getProperty("Carats1"));
			  
			Rate1.sendKeys(prop.getProperty("Rate1"));
			  
			row_button1.click();
			  
			KapanNo2.sendKeys(Common_No_random+"java2");
			  
			Pieces2.sendKeys(prop.getProperty("Pieces2"));
			  
			Carats2.sendKeys(prop.getProperty("Carats2"));
			  
			Rate2.sendKeys(prop.getProperty("Rate2"));
			  			  
			Thread.sleep(2000); 
			  
			row_button1.click(); 
			  
			Thread.sleep(2000);
			  
			KapanNo3.sendKeys(Common_No_random+"java3"); 
			  
			Thread.sleep(2000);
			 
			
			WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait1.until(ExpectedConditions.elementToBeClickable(Save_button3));
			
			Save_button3.click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			navigation_hidebutton.click();
			
			
			
		}
		
		public void fill_data_JangadExpenseDetails() throws InterruptedException
		{
			
			TestUtil.scroll_until();
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(row_button_Jangad));
						
			row_button_Jangad.click();
						
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
			JangadNo.sendKeys(Common_No_random);
					
			CourierPartyName.click(); Thread.sleep(3000);
			TestUtil.PressEnter();
			CourierNo.sendKeys(Common_No_random);
			TestUtil.upload_file(CourierDocument,Commonpath_pdf);
				
			Expense1.click(); Thread.sleep(3000);
			TestUtil.PressEnter();
							
			Expense1_value.sendKeys(prop.getProperty("Expense"));
			TestUtil.PressTab();
				
			Expense22.click(); Thread.sleep(3000);
			TestUtil.PressEnter();
							
			Expense2_value.sendKeys(prop.getProperty("Expense"));
			TestUtil.PressTab();
				
			Expense3.click(); Thread.sleep(3000);
			TestUtil.PressEnter();
							
			Expense3_value.sendKeys(prop.getProperty("Expense"));
			TestUtil.PressTab();
				
			Expense4.click(); Thread.sleep(3000);
			TestUtil.PressEnter();
							
			Expense4_value.sendKeys(prop.getProperty("Expense"));
			TestUtil.PressTab();TestUtil.PressTab();
				
				do
				{
				appliedfield.click();TestUtil.PressEnter();
				Thread.sleep(1000);
				}while (!dropdownoverflow.isDisplayed());
																
				JavascriptExecutor js = (JavascriptExecutor) driver;
				//Scroll down till the bottom of the page
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
								
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Save_finalbutton.click();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}								
		}
		
		//After record added 
		
		public void ValidateConfirmationRecord() throws InterruptedException 
		{
			String text_record = Common_No_random;
			
			
			WebElement Record_added = driver.findElement(By.xpath("//*[contains(text(),'"+text_record+"')]"));
			Assert.assertEquals(Record_added.getText(),text_record);
			
			Thread.sleep(1000);
			Assert.assertTrue(green_icon.isDisplayed());
		}
		
		public void ValidateDisableFields()
		{
			view_button.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List<WebElement> disable_fields = driver.findElements(By.xpath("//input[@disabled]"));
		      System.out.println("Total number of disable elements on page: " + disable_fields.size());
			
		}
		
		public void ValidateEditFunctionality()
		{
			driver.navigate().back();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			edit_button.click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			save_button1.click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 
			
			 
			Save_button3.click();
			 
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			 Save_finalbutton.click();
			 
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			 
			 Assert.assertTrue(success_msg_edit.isDisplayed());
			 
			 
		}
		
		public void search_functionality_test()
		{
			search_field.isDisplayed();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			search_field.sendKeys(prop.getProperty("Random_text"));
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Assert.assertEquals(No_search_data.getText(),"No search data");    
			
		}
		
		public void pagination_functionality() throws InterruptedException
		{
			driver.navigate().refresh();
			
			if(previous_pagination_button.isEnabled()== false)
			{
				
				Thread.sleep(1000);
				next_pagination_button.click();
				Thread.sleep(2000);
				next_pagination_button.click();
				Thread.sleep(2000);
				previous_pagination_button.click();
			}
			else
			{
				System.out.println("Pagination functionality is not working..");
			}
			
			
			
		}
		
		
}
