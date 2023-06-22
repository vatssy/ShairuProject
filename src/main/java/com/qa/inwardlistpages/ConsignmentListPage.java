package com.qa.inwardlistpages;

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

public class ConsignmentListPage extends TestBase{
	
	//Random String generated for : Document Number & all 
			String Common_No_random	= TestUtil.RandomStringGenerator();
	
	//File path 
		public String Commonpath_pdf = System.getProperty("user.dir")+ prop.getProperty("Commonpath_pdf");
		public String Commonpath_image = System.getProperty("user.dir")+ prop.getProperty("Commonpath_image");
	
	//Document Info section 
	

	
		@FindBy(xpath= "(//span[normalize-space()='Inward List'])[1]")
		WebElement inwardlist_menu;
		
		@FindBy(xpath= "(//a[normalize-space()='Consignment List'])[1]")
		WebElement consignmentlist_menu;
		
		@FindBy(xpath= "(//button[@class='ant-btn ant-btn-default ant-btn-lg btn-orange btn-table-top'])[1]")
		WebElement inward_button;
		

		@FindBy(xpath= "//div[contains(text(),'Consignment')]")
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
		
		@FindBy(xpath= "(//input[@type='text'])[4]")
		WebElement Duration_field;
		
		@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[2]")
		WebElement SenderName;
		
		@FindBy(xpath= "(//div[@id='react-select-4-option-0'])[1]")
		WebElement SenderName_select;
		
		@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[3]")
		WebElement ReceivedFrom;
		
		@FindBy(id= "react-select-5-option-1")
		WebElement ReceivedFrom_select;
		
		
		@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[4]")
		WebElement TransactionType;
		
		@FindBy(id="react-select-6-option-1")
		WebElement TransactionType_select;
		

		
		
		@FindBy(xpath= "//input[@name='total_pieces']")
		WebElement TotalPieces;
		
		@FindBy(xpath= "//input[@name='total_carats']")
		WebElement TotalCarats;
		
		@FindBy(xpath= "//input[@name='inward_pieces']")
		WebElement InwardPieces;
		
		@FindBy(xpath= "//input[@name='inward_carats']")
		WebElement InwardCarats;
		
		@FindBy(xpath= "//input[@name='total_packets']")
		WebElement TotalPackets;
		
		
		@FindBy(xpath= "(//input[@type='file'])[1]")
		WebElement DocumentFile;
		
		@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[5]")
		WebElement ExchangeType;
		
		@FindBy(id="react-select-7-option-0")
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
		
		// Save buttons of page 
		
		@FindBy(xpath= "(//button[@type='submit'])[1]")
		WebElement save_button1;
		
		//KP Certificate Details section 
		
				@FindBy(xpath= "(//input[@type='text'])[12]")
				WebElement CertificateNo;
				
				@FindBy(xpath= "(//div[@class=' css-1d8n9bt'])[7]")
				WebElement Origin;
				
				@FindBy(id= "react-select-8-option-3")
				WebElement Origin_select;
				
				@FindBy(xpath= "(//input[@placeholder='Select date'])[4]")
				WebElement IssueDate;
				
				@FindBy(xpath= "(//input[@placeholder='Select date'])[5]")
				WebElement ExpiryDate;
				
				@FindBy(xpath= "(//input[@type='file'])[2]")
				WebElement Certificate;
				
				//Bill of Entry Details
				
				@FindBy(xpath= "(//input[@placeholder='Select date'])[6]")
				WebElement BOE_Date;
				
				@FindBy(xpath= "//input[@name='boe_no']")
				WebElement BOE_No;
				
				@FindBy(xpath= "//input[@name='mawb_no']")
				WebElement MAWB_No;
				
				@FindBy(xpath= "//input[@name='hawb_no']")
				WebElement HAWB_No;
				
				@FindBy(xpath= "(//input[@placeholder='Select date'])[7]")
				WebElement Source_InwardDate;
				
				@FindBy(xpath= "(//input[@type='file'])[3]")
				WebElement BillofEntry_upload;
				
				@FindBy(xpath= "(//input[@type='file'])[4]")
				WebElement Airwaybill_upload;
				
				@FindBy(xpath= "(//button[@type='submit'])[2]")
				WebElement Save_button2;
				
				
				@FindBy(xpath= "(//button[@type='button'])[45]")
				WebElement row_button1;

				
				//Document line section
				
				@FindBy(xpath= "(//input[@type='text'])[17]")
				WebElement KapanNo;
				
				
				@FindBy(xpath= "(//input[@type='text'])[17]")
				WebElement Pieces;
				
				@FindBy(xpath= "(//input[@type='number'])[12]")
				WebElement Carats;
				
				@FindBy(xpath= "(//input[@type='number'])[13]")
				WebElement Rate;
				
				@FindBy(xpath= "(//button[@type='submit'])[3]")
				WebElement Save_button3;
				
				//Jangad Expense Details
				
				@FindBy(xpath= "(//button[@type='button'])[47]")
				WebElement row_button_Jangad;
				
				@FindBy(xpath= "(//input[@type='text'])[20]")
				WebElement JangadNo;
				
				@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
				WebElement CourierPartyName;
				
				@FindBy(xpath="(//div[@id='react-select-10-option-1'])[1]")
				WebElement CourierPartyName_select;
				
				@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
				WebElement CourierNo;
				
				@FindBy(xpath= "(//input[@type='file'])[5]")
				WebElement CourierDocument;
				
				//1
				
				@FindBy(xpath= "(//div[contains(@class,'css-zq61zj-control')])[9]")
				WebElement Expense1;
				
				@FindBy(xpath= "(//div[@id='react-select-11-option-0'])[1]")
				WebElement Expense1_select;
				
				@FindBy(xpath= "(//input[@type='number'])[13]")
				WebElement Expense1_value;
				
				//2
				@FindBy(xpath= "(//div[contains(@class,'css-zq61zj-control')])[10]")
				WebElement Expense2;
				
				@FindBy(xpath= "(//div[@id='react-select-12-option-0'])[1]")
				WebElement Expense2_select;
				
				@FindBy(xpath= "(//input[@type='number'])[14]")
				WebElement Expense2_value;
				
				//3
				@FindBy(xpath= "(//div[contains(@class,'css-zq61zj-control')])[11]")
				WebElement Expense3;
				
				@FindBy(xpath= "(//div[@id='react-select-13-option-0'])[1]")
				WebElement Expense3_select;
				
				@FindBy(xpath= "(//input[@type='number'])[15]")
				WebElement Expense3_value;
				
				//4
				@FindBy(xpath= "(//div[contains(@class,'css-zq61zj-control')])[12]")
				WebElement Expense4;
				
				@FindBy(xpath= "(//div[@id='react-select-14-option-0'])[1]")
				WebElement Expense4_select;
				
				@FindBy(xpath= "(//input[@type='number'])[16]")
				WebElement Expense4_value;
				
				
				@FindBy(xpath= "(//div//div//div[@class='ant-select-selection-overflow'])[1]")
				WebElement appliedfield;
				
				
				@FindBy(xpath= "(//div[@class='ant-select-item-option-content'])[1]")
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
				
				@FindBy(xpath= "(//*[name()='svg'])[30]")
				WebElement edit_button;
				
				
				// Success msg edit page
				
				@FindBy(xpath= "//span[normalize-space()='Record added successfully']")
				WebElement success_edit_msg;
				
				//Completed Icon - green tick 
				
				@FindBy(xpath= "(//*[name()='svg'])[34]")
				WebElement green_icon;
				
				// Search Functionality & pagination Test // 
				
				@FindBy(xpath= "(//input[@placeholder='Search...'])[1]")
				WebElement search_field;
				
				@FindBy(xpath= "//div[contains(text(),'No search data')]")
				WebElement No_search_data;
				
				//pagination Elements
				@FindBy(xpath= "(//button[@type='button'])[2]")
				WebElement previous_pagination_button;
				
				@FindBy(xpath= "(//button[@type='button'])[3]")
				WebElement next_pagination_button;
				
				
		
		public ConsignmentListPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void Navigate_consignmentlist_menu() 
		{
			try {
				TestUtil.navigate_to_option1(inwardlist_menu,consignmentlist_menu);
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
						TestUtil.navigate_to_option1(ReceivedFrom,ReceivedFrom_select);
						Thread.sleep(1000);
						TestUtil.navigate_to_option1(TransactionType,TransactionType_select);
						Thread.sleep(1000);
					 } catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 
			 TotalPackets.sendKeys(prop.getProperty("TotalPackets"));
			 
			TotalPieces.sendKeys(prop.getProperty("TotalPieces"));
				
			TotalCarats.sendKeys(prop.getProperty("TotalCarats"));
				
			InwardPieces.sendKeys(prop.getProperty("InwardPieces"));
				
			InwardCarats.sendKeys(prop.getProperty("InwardCarats"));
				
				
			
			TestUtil.upload_file(DocumentFile,Commonpath_pdf);
			try {
				TestUtil.navigate_to_option1(ExchangeType,ExchangeType_select);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			ExchangeRate_BOE.sendKeys(prop.getProperty("ExchangeRate_BOE"));
			ExchangeRate_RBI.sendKeys(prop.getProperty("ExchangeRate_RBI"));
			
			
			
			GrossValue.sendKeys(prop.getProperty("GrossValue"));
			Expense.sendKeys(prop.getProperty("Expense"));
			
			
			
			save_button1.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public void fill_data_KPCertificateDetails()
		{
			
			
			CertificateNo.sendKeys(Common_No_random);
			
			
			
			
			
			 
			
			try {
				TestUtil.navigate_to_option1(Origin,Origin_select);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			IssueDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			IssueDate.sendKeys(Keys.RETURN);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ExpiryDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			ExpiryDate.sendKeys(Keys.RETURN);
			
			TestUtil.upload_file(Certificate,Commonpath_pdf);
			
		}
		
		
		public void fill_data_BillEntryDetails()
		{
			BOE_Date.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			BOE_Date.sendKeys(Keys.RETURN);
			
			 BOE_No.sendKeys(Common_No_random);
			
			 MAWB_No.sendKeys(Common_No_random);
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 HAWB_No.sendKeys(Common_No_random);
			
			 Source_InwardDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			 Source_InwardDate.sendKeys(Keys.RETURN);
			 
			 TestUtil.upload_file(BillofEntry_upload,Commonpath_pdf);
			 
			 TestUtil.upload_file(Airwaybill_upload,Commonpath_pdf);
			
			 Save_button2.click();
			
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(row_button1));
				

				
				row_button1.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		public void fill_data_DocumentLines()
		{
			KapanNo.sendKeys(Common_No_random);
			
			//Pieces.sendKeys(prop.getProperty("Pieces"));
			
			//Carats.sendKeys(prop.getProperty("Carats"));
			
			//Rate.sendKeys(prop.getProperty("Rate"));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(Save_button3));
			
			Save_button3.click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			navigation_hidebutton.click();
			
			
			
		}
		
		public void fill_data_JangadExpenseDetails()
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
			
			
			try {
				TestUtil.navigate_to_option1(CourierPartyName,CourierPartyName_select);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			CourierNo.sendKeys(Common_No_random);
			
			
			 TestUtil.upload_file(CourierDocument,Commonpath_pdf);
			 
			 

			 try {
					TestUtil.navigate_to_option1(Expense1,Expense1_select);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			 
				Expense1_value.sendKeys(prop.getProperty("Expense"));
				
				appliedfield.click();
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					TestUtil.navigate_to_option1(appliedfield,appliedfield_select);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
				}
				
				try {
					Thread.sleep(2000);
					TestUtil.navigate_to_option1(Expense2,Expense2_select);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					
				
				
			
			 
				Expense2_value.sendKeys(prop.getProperty("Expense"));
				
				try {
					Thread.sleep(2000);
					TestUtil.navigate_to_option1(Expense3,Expense3_select);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			 
				Expense3_value.sendKeys(prop.getProperty("Expense"));
				
				try {
					Thread.sleep(2000);
					TestUtil.navigate_to_option1(Expense4,Expense4_select);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			 
				Expense4_value.sendKeys(prop.getProperty("Expense"));
				
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
		
		public void ValidateConfirmationRecord() throws InterruptedException //taken from top Init
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
				Thread.sleep(3000);
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
			CertificateNo.clear();
			CertificateNo.sendKeys(Common_No_random);
			
			 BOE_No.clear();
			 BOE_No.sendKeys(Common_No_random);
			 
			 MAWB_No.clear();	
			 MAWB_No.sendKeys(Common_No_random);
			
			 HAWB_No.clear();
			 HAWB_No.sendKeys(Common_No_random);
			 
			 Save_button2.click();
			 
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			 
			
			 
			 Save_button3.click();
			 
			 try {
					Thread.sleep(2000);
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
			 
			 
			 Assert.assertTrue(success_edit_msg.isDisplayed());
			 
			 
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
