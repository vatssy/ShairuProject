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

public class JobWorkRoughListPage extends TestBase{
	
	//Random String generated for : Document Number & all 
	String Common_No_random	= TestUtil.RandomStringGenerator();

	
	//File path 
	public String Commonpath_pdf = System.getProperty("user.dir")+ prop.getProperty("Commonpath_pdf");
	public String Commonpath_image = System.getProperty("user.dir")+ prop.getProperty("Commonpath_image");
	
	//Document Info section 
	

	
		@FindBy(xpath= "(//span[normalize-space()='Inward List'])[1]")
		WebElement inwardlist_menu;
		
		@FindBy(xpath= "(//a[normalize-space()='Job Work Rough List'])[1]")
		WebElement jobworkroughlist_menu;
		
		@FindBy(xpath= "(//span[@class='btn-text'])[1]")
		WebElement inward_button;
		
		@FindBy(xpath= "//div[contains(text(),'Job Work Rough')]")
		WebElement InwardType_text;
		
		@FindBy(xpath= "//input[@placeholder = 'Select date']")
		WebElement Inwarddate;
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[2]")
		WebElement DocumentDate;
		
		@FindBy(xpath= "(//input[@id='react-select-3-input'])[1]")
		WebElement DocumentType;
		
		@FindBy(xpath= "(//div[@id='react-select-3-option-0'])[1]")
		WebElement DocumentType_select;
		
		
		
		@FindBy(xpath= "(//input[@type='text'])[3]")
		WebElement DocumentNo;
		
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[1]/form/div[1]/div[6]/div/div/div[2]/div/div/div/div/div[1]/div[2]/input")
		WebElement SenderName;
		
		@FindBy(xpath= "(//div[@id='react-select-4-option-0'])[1]")
		WebElement SenderName_select;
		
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[1]/form/div[1]/div[7]/div/div/div[2]/div/div/div/div/div[1]/div[2]/input")
		WebElement ReceivedFrom;
		
		@FindBy(xpath= "(//div[@id='react-select-5-option-1'])[1]")
		WebElement ReceivedFrom_select;

		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[1]/form/div[1]/div[8]/div/div/div[2]/div/div/div/div/div[1]/div[2]/input")
		WebElement TransactionType;
		
		@FindBy(xpath= "(//div[@id='react-select-6-option-1'])[1]")
		WebElement TransactionType_select;
		
		@FindBy(xpath= "(//input[@type='text'])[7]")
		WebElement TotalPieces;
		
		@FindBy(xpath= "(//input[@type='number'])[1]")
		WebElement TotalCarats;
		
		@FindBy(xpath= "(//input[@type='text'])[8]")
		WebElement InwardPieces;
		
		@FindBy(xpath= "(//input[@type='number'])[2]")
		WebElement InwardCarats;
		
		@FindBy(xpath= "//input[@name='total_packets']")
		WebElement TotalPackets;
		
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
		
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[1]/form/div[1]/div[15]/div/div/div[2]/div/div/div/div/div[1]/div[2]/input")
		WebElement ExchangeType;
		
		@FindBy(xpath= "(//div[@id='react-select-7-option-1'])[1]")
		WebElement ExchangeType_select;
		
		
		@FindBy(xpath= "//input[@name='exchange_rate_boe']")
		WebElement ExchangeRate_BOE;
		
		@FindBy(xpath= "(//input[@name='number'])[1]")
		WebElement ExchangeRate_RBI;
		
		@FindBy(xpath= "(//input[@accept='image/jpg, image/jpeg, image/png'])[1]")
		WebElement RoughImages;
		
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
		@FindBy(xpath= "//span[normalize-space()='Inward Document updated successfully.']")
		WebElement success_msg;
		
		
		//KP Certificate Details section 
		
		@FindBy(xpath= "//input[@name='certificate_no']")
		WebElement CertificateNo;
		
		@FindBy(xpath= "(//div[@class=' css-18w4uv4'])[6]")
		WebElement Origin;
		
		@FindBy(xpath= "(//div[@id='react-select-8-option-4'])[1]")
		WebElement Origin_select;
		
		@FindBy(xpath= "(//input[@name='issue_date'])[1]")
		WebElement IssueDate;
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[4]")
		WebElement ExpiryDate;
		
		@FindBy(xpath= "(//input[@type='file'])[3]")
		WebElement Certificate;
		
		//Bill of Entry Details
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[5]")
		WebElement BOE_Date;
		
		@FindBy(xpath= "//input[@name='boe_no']")
		WebElement BOE_No;
		
		@FindBy(xpath= "//input[@name='mawb_no']")
		WebElement MAWB_No;
		
		@FindBy(xpath= "//input[@name='hawb_no']")
		WebElement HAWB_No;
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[6]")
		WebElement Source_InwardDate;
		
		@FindBy(xpath= "(//input[@type='file'])[4]")
		WebElement BillofEntry_upload;
		
		@FindBy(xpath= "(//input[@type='file'])[5]")
		WebElement Airwaybill_upload;
		
		@FindBy(xpath= "(//button[@type='submit'])[2]")
		WebElement Save_button2;
		
		
		// Corresponding Invoice & KP Information
		
		@FindBy(xpath= "(//input[@type='text'])[16]")
		WebElement Invoice_No;
		
		@FindBy(xpath= "(//input[@type='number'])[11]")
		WebElement Invoice_Weight;
		
		@FindBy(xpath= "(//input[@type='file'])[6]")
		WebElement Invoice;
		
		@FindBy(xpath= "(//input[@accept='application/pdf, application/excel, application/vnd.ms-excel, application/x-excel, application/x-msexcel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, text/csv'])[1]")
		WebElement Packing_List;
		
		@FindBy(xpath= "(//input[@type='text'])[17]")
		WebElement KP_Certificate_No;
		
		@FindBy(xpath= "(//div[@class=' css-18w4uv4'])[2]")
		WebElement Origin_invoicesection;
		
		@FindBy(xpath= "(//div[@id='react-select-9-option-3'])[1]")
		WebElement Origin_invoicesection_select;
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[7]")
		WebElement IssueDate_invoicesection;
		
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[3]/form/div[1]/form/div[2]/div[4]/div/div/div[2]/div/div/div/div/input")
		WebElement ExpiryDate_invoicesection;
		
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[3]/form/div[1]/form/div[2]/div[5]/div/div/div[2]/div/div/span/div[1]/span/input")
		WebElement Certificate__invoicesection;
		
		//Mining Information Elements
		
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[3]/form/div[1]/form/div[4]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div[2]/input")
		WebElement MiningName;
		
		@FindBy(id= "react-select-10-option-1")
		WebElement MiningName_select;
		
		@FindBy(xpath= "(//button//span[contains(text(),'Row')])[1]")
		WebElement row_button1;

		
		//Document line section
		
		@FindBy(xpath= "(//input[@type='text'])[22]")
		WebElement KapanNo;
		
		
		@FindBy(xpath= "(//input[@type='text'])[23]")
		WebElement Pieces;
		
		@FindBy(xpath= "(//input[@type='number'])[12]")
		WebElement Carats;
		
		@FindBy(xpath= "(//input[@type='number'])[13]")
		WebElement Rate;
		
		//Document line1 Proper data
		
				@FindBy(xpath= "(//input[@type='text'])[22]")
				WebElement KapanNo1;
				
				@FindBy(xpath= "(//input[@type='text'])[23]")
				WebElement Pieces1;
				
				@FindBy(xpath= "(//input[@type='number'])[12]")
				WebElement Carats1;
				
				@FindBy(xpath= "(//input[@type='number'])[13]")
				WebElement Rate1;
				
		//Document line2 
				
				@FindBy(xpath= "(//input[@type='text'])[25]")
				WebElement KapanNo2;
				
				@FindBy(xpath= "(//input[@type='text'])[26]")
				WebElement Pieces2;
				
				@FindBy(xpath= "(//input[@type='number'])[14]")
				WebElement Carats2;
				
				@FindBy(xpath= "(//input[@type='number'])[15]")
				WebElement Rate2;
		//Document line3 
				
				@FindBy(xpath= "(//input[@type='text'])[28]")
				WebElement KapanNo3;		
		
		@FindBy(xpath= "(//button[@type='submit'])[3]")
		WebElement Save_button3;
		
		//Jangad Expense Details
		
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[4]/div[1]/div/div[2]/button")
		WebElement row_button_Jangad;
		
		@FindBy(xpath= "//input[@name='jangad_no_0']")
		WebElement JangadNo;
		
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[4]/form/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/div/div/div/div/div/div/div[1]/div[2]/input")
		WebElement CourierPartyName;
		
		@FindBy(xpath= "(//div[@id='react-select-15-option-2'])[1]")
		WebElement CourierPartyName_select;
		
		@FindBy(xpath= "(//input[@type='text'])[33]")
		WebElement CourierNo;
		
		@FindBy(xpath= "(//input[@type='file'])[9]")
		WebElement CourierDocument;
		
		//1
		
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[4]/form/div/div/div/div/div/div/table/tbody/tr[2]/td[7]/div[1]/div/div/div/div/div/div/div[1]/div[2]/input")
		WebElement Expense1;
		
		@FindBy(xpath= "(//div[@id='react-select-16-option-0'])[1]")
		WebElement Expense1_select;
		
		@FindBy(xpath= "(//input[@type='number'])[18]")
		WebElement Expense1_value;
		
		//2
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[4]/form/div/div/div/div/div/div/table/tbody/tr[2]/td[8]/div[1]/div/div/div/div/div/div/div[1]/div[2]/input")
		WebElement Expense22;
		
		@FindBy(xpath= "(//div[@id='react-select-17-option-0'])[1]")
		WebElement Expense2_select;
		
		@FindBy(xpath= "(//input[@type='number'])[19]")
		WebElement Expense2_value;
		
		//3
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[4]/form/div/div/div/div/div/div/table/tbody/tr[2]/td[9]/div[1]/div/div/div/div/div/div/div[1]/div[2]/input")
		WebElement Expense3;
		
		@FindBy(xpath= "(//div[@id='react-select-18-option-0'])[1]")
		WebElement Expense3_select;
		
		@FindBy(xpath= "(//input[@type='number'])[20]")
		WebElement Expense3_value;
		
		//4
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[4]/form/div/div/div/div/div/div/table/tbody/tr[2]/td[10]/div[1]/div/div/div/div/div/div/div[1]/div[2]/input")
		WebElement Expense4;
		
		@FindBy(xpath= "(//div[@id='react-select-19-option-0'])[1]")
		WebElement Expense4_select;
		
		@FindBy(xpath= "(//input[@type='number'])[21]")
		WebElement Expense4_value;
		
		@FindBy(xpath= "(//input[@class='ant-select-selection-search-input'])[2]")
		WebElement appliedfield;
		
		@FindBy(xpath= "(//input[@class='ant-select-selection-search-input'])[2]")
		WebElement dropdownoverflow;
		
		@FindBy(xpath= "(//div[@class='ant-select-item-option-content'])[1]")
		WebElement appliedfield_select;
		
		
		
		//navigation to Hide_button
		@FindBy(xpath= "(//span[@aria-label='left'])[1]")
		WebElement navigation_hidebutton;
		
		
		
		
		
		@FindBy(xpath= "(//span[normalize-space()='Save'])[1]")
		WebElement Save_finalbutton;
		
		//Confirmation Record - record added successfully
		@FindBy(xpath= "//td[normalize-space()='+text_record+']")
		WebElement Record_added;
		
		//View button
		@FindBy(xpath= "(//*[name()='svg'])[35]")
		WebElement view_button;
		
		
		//Edit Functionality 
		
		@FindBy(xpath= "(//*[name()='svg'])[36]")
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
		
		
		
		
		
		
		
		
		public JobWorkRoughListPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void Navigate_jobworkrough_menu() 
		{
			try {
				TestUtil.navigate_to_option1(inwardlist_menu,jobworkroughlist_menu);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void Open_inward_button()
		{
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
			 
			 try {
				TestUtil.navigate_to_option1(SenderName,SenderName_select);
				TestUtil.navigate_to_option1(ReceivedFrom,ReceivedFrom_select);
				TestUtil.navigate_to_option1(TransactionType,TransactionType_select);
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 			
/*			 
			TotalPieces.sendKeys(prop.getProperty("TotalPieces"));
				
			TotalCarats.sendKeys(prop.getProperty("TotalCarats"));
				
			InwardPieces.sendKeys(prop.getProperty("InwardPieces"));
				
			InwardCarats.sendKeys(prop.getProperty("InwardCarats"));
			
			TotalPackets.sendKeys(prop.getProperty("TotalPackets"));
*/
			 		 
			 TotalPieces2.sendKeys(prop.getProperty("TotalPieces2"));
					
			 TotalCarats2.sendKeys(prop.getProperty("TotalCarats2"));
					
			 InwardPieces2.sendKeys(prop.getProperty("InwardPieces2"));
					
			 InwardCarats2.sendKeys(prop.getProperty("InwardCarats2"));
			
			 TotalPackets2.sendKeys(prop.getProperty("TotalPackets2"));
			
			TestUtil.upload_file(DocumentFile,Commonpath_pdf);
			try {
				TestUtil.navigate_to_option1(ExchangeType,ExchangeType_select);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			ExchangeRate_BOE.sendKeys(prop.getProperty("ExchangeRate_BOE"));
			ExchangeRate_RBI.sendKeys(prop.getProperty("ExchangeRate_RBI"));
			TestUtil.upload_file(RoughImages,Commonpath_image);
			
			
			GrossValue.sendKeys(prop.getProperty("GrossValue2"));
			Expense.sendKeys(prop.getProperty("Expense2"));
			
			
			
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
									
			try {
				CertificateNo.sendKeys(Common_No_random);
				Origin.click(); Thread.sleep(2000);
				TestUtil.PressEnter();
				
				IssueDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
				IssueDate.sendKeys(Keys.RETURN); Thread.sleep(1000);
				
				
				ExpiryDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
				ExpiryDate.sendKeys(Keys.RETURN); Thread.sleep(1000);
				
				TestUtil.upload_file(Certificate,Commonpath_pdf);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
		}
		
		
		public void fill_data_BillEntryDetails()
		{
			try {
				
			BOE_Date.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			BOE_Date.sendKeys(Keys.RETURN);
			
			 BOE_No.sendKeys(Common_No_random);
			
			 MAWB_No.sendKeys(Common_No_random);
			
			 HAWB_No.sendKeys(Common_No_random); Thread.sleep(1000);
			
			 Source_InwardDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			 Source_InwardDate.sendKeys(Keys.RETURN);
			 
			 TestUtil.upload_file(BillofEntry_upload,Commonpath_pdf); Thread.sleep(2000);
			 
			 TestUtil.upload_file(Airwaybill_upload,Commonpath_pdf); Thread.sleep(2000);
			
			 Save_button2.click();
			 
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		public void fill_data_CorrespondingInvoice()
		{
			
			try {
				
				Thread.sleep(1000);
				jobworkroughlist_menu.click();
				Thread.sleep(2000);
				edit_button.click();
				
			Invoice_No.sendKeys(Common_No_random); Thread.sleep(1000);
			
			Invoice_Weight.sendKeys(prop.getProperty("Invoice_Weight")); Thread.sleep(1000);
			
			TestUtil.upload_file(Invoice,Commonpath_pdf); Thread.sleep(2000);
			
			TestUtil.upload_file(Packing_List,Commonpath_pdf); Thread.sleep(2000);
						
			KP_Certificate_No.sendKeys(Common_No_random); Thread.sleep(2000);
			
			Origin_invoicesection.click(); Thread.sleep(3000);
			TestUtil.PressEnter();
			
			IssueDate_invoicesection.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy")); 
			IssueDate_invoicesection.sendKeys(Keys.RETURN); Thread.sleep(3000);
			
			ExpiryDate_invoicesection.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			ExpiryDate_invoicesection.sendKeys(Keys.RETURN); Thread.sleep(3000);
			
			TestUtil.upload_file(Certificate__invoicesection,Commonpath_pdf); Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		public void fill_data_MiningInformation()
		{
			
			try {
				MiningName.click();Thread.sleep(3000);
				TestUtil.PressEnter();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		public void fill_data_DocumentLines() throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(row_button1));
			
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
			Thread.sleep(2000);
			  
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
		//	navigation_hidebutton.click();
			
			
			
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
			 Invoice_No.clear();
			 Invoice_No.sendKeys(Common_No_random);
			 
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
