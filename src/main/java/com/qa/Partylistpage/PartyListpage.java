package com.qa.Partylistpage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class PartyListpage extends TestBase{

	

	//Random String generated for : Document Number & all 
		String Common_No_random	= TestUtil.RandomStringGenerator();
	
	//Random String generated for : Document Number & all 
		String GSTIN	= TestUtil.RandomGSTINGenerator();	
		
	//Random Website 
		String Random_Website	= TestUtil.RandomWebsiteGenerator();
		
	//Random Phone No
		String Random_Phoneno	= TestUtil.RandomPhoneNumberGenerator();
		
	//Random Mobile no 
		String mobileNumber	= TestUtil.Randommobilenogenerator();
		
	//Random Emailaddress 
		String Random_EmailAddress	= TestUtil.RandomEmailGenerator();
	
	//Random Address
		String Random_Address	= TestUtil.RandomAddressGenerator();
				
	//File path 
		public String Commonpath_pdf = System.getProperty("user.dir")+ prop.getProperty("Commonpath_pdf");
		public String Commonpath_image = System.getProperty("user.dir")+ prop.getProperty("Commonpath_image");
		
	//Elements of click events
		
		@FindBy(xpath= "//span[text()='Master']")
		WebElement masterlist_menu;
		
		@FindBy(xpath= "(//span[normalize-space()='Party List'])[1]")
		WebElement Partylist_menu;
	
	//+Party button
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[2]/button")
		WebElement add_party_button;
	
	//Party information details
		@FindBy(xpath = ("//input[@name='name']"))
		WebElement party_name;
		
		@FindBy(xpath = ("//*[@id=\"root\"]/div/section/section/main/div/div/form/div[2]/div[2]/div/div/div[2]/div/div/input"))
		WebElement short_name;
		
		@FindBy(xpath = ("//*[@id=\"root\"]/div/section/section/main/div/div/form/div[2]/div[4]/div/div/div[2]/div/div/input"))
		WebElement party_gstno;
		
		@FindBy(xpath = ("//*[@id=\"root\"]/div/section/section/main/div/div/form/div[2]/div[5]/div/div/div[2]/div/div/textarea"))
		WebElement Register_Address;
		
		@FindBy(id = ("react-select-2-input"))
		WebElement Country;
		
		@FindBy(id = ("react-select-12-input"))
		WebElement State;
		
		@FindBy(xpath = ("/html/body/div[1]/div/section/section/main/div/div/form/div[2]/div[8]/div/div/div[2]/div/div/div/div/div[1]/div[2]/input"))
		WebElement City;
		
		@FindBy(xpath = ("//input[@name='party_pincode']"))
		WebElement Pincode;
		
		@FindBy(xpath = ("/html/body/div[1]/div/section/section/main/div/div/form/div[2]/div[10]/div/div/div[2]/div/div/input"))
		WebElement Website;
		
		@FindBy(xpath = ("//input[@name='party_phone_no']"))
		WebElement PhoneNo;
		
		@FindBy(xpath = ("//input[@name='party_mobile_no']"))
		WebElement MobileNo;
		
		@FindBy(xpath = ("//input[@name='party_email']"))
		WebElement EmailAddress;
		
	//Contect information
		@FindBy(xpath = ("//input[@name='common_address']"))
		WebElement Checkbox;
		
		@FindBy(xpath = ("//input[@name='contact_phone_no']"))
		WebElement PhoneNo2;
		
		@FindBy(xpath = ("//input[@name='contact_mobile_no']"))
		WebElement MobileNo2;
	
		@FindBy(xpath = ("//input[@name='contact_email']"))
		WebElement EmailAddress2;
		
	//Reference information
		@FindBy(xpath = ("//input[@name='reference_name']"))
		WebElement refname;
		
		@FindBy(xpath = ("/html/body/div/div/section/section/main/div/div/form/div[6]/div[2]/div/div/div[2]/div/div/div/div/div[1]/div[2]/input"))
		WebElement relationship;
		
		@FindBy(xpath = ("//*[@id=\"react-select-18-option-7\"]"))
		WebElement relationshipvalue;
		
		@FindBy(xpath = ("//input[@name='reference_phone_no']"))
		WebElement refphoneno;
		
		@FindBy(xpath = ("//textarea[@name='reference_address']"))
		WebElement refaddress;
		
		@FindBy(xpath = ("/html/body/div[1]/div/section/section/main/div/div/form/div[6]/div[5]/div/div/div[2]/div/div/div/div/div[1]/div[2]/input"))
		WebElement country;
		
		@FindBy(xpath = ("/html/body/div[1]/div/section/section/main/div/div/form/div[6]/div[6]/div/div/div[2]/div/div/div/div/div[1]/div[2]/input"))
		WebElement state;
		
		@FindBy(xpath = ("/html/body/div[1]/div/section/section/main/div/div/form/div[6]/div[7]/div/div/div[2]/div/div/div/div/div[1]/div[2]/input"))
		WebElement city;
		
		@FindBy(xpath = ("//*[@id=\"root\"]/div/section/section/main/div/div/form/div[6]/div[8]/div/div/div[2]/div/div/input"))
		WebElement pincode;
		
	//Save button element
		@FindBy(xpath = ("//button[@type='submit']"))
		WebElement save;
		
		@FindBy(xpath = ("/html/body/div[2]/div/div/div/div/div/span[2]"))
		WebElement save_message;
		
	//Category details
		@FindBy(xpath = ("(//span[text()='Record'])[1]"))
		WebElement add_record1;
		
		@FindBy(xpath = ("/html/body/div[1]/div/section/section/main/div/div/form/div[8]/div[1]/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div/div/div/div/div/div/div/div[1]/div[2]/input"))
		WebElement category;
		
		@FindBy(xpath = ("/html/body/div[1]/div/section/section/main/div/div/form/div[8]/div[1]/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[3]/div/div/div/div/div/div/div/div[1]/div[2]/input"))
		WebElement subcategory;
		
		@FindBy(xpath = ("/html/body/div[1]/div/section/section/main/div/div/form/div[8]/div[1]/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/div/div/div/div/div/div/div[1]/div[2]/input"))
		WebElement partytype;
		
		@FindBy(xpath = ("(//span[@aria-label='save'])[2]"))
		WebElement category_save_button;
		
		@FindBy(xpath = ("(//span[text()='Record'])[1]"))
		WebElement category_save_message;
		
	//Process details
		@FindBy(xpath = ("(//span[text()='Record'])[2]"))
		WebElement add_record2;
				
		@FindBy(xpath = ("/html/body/div[1]/div/section/section/main/div/div/form/div[8]/div[2]/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div/div/div/div/div/div/div/div[1]/div[2]"))
		WebElement purpose;
				
		@FindBy(xpath = ("/html/body/div[1]/div/section/section/main/div/div/form/div[8]/div[2]/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[3]/div/div/div/div/div/div/div/div[1]/div[2]"))
		WebElement process;
				
		@FindBy(xpath = ("(//span[@aria-label='save'])[2]"))
		WebElement process_save_button;
				
		@FindBy(xpath = ("/html/body/div[6]/div/div/div/div/div/span[2]"))
		WebElement process_save_message;
				
	//Edit the process details
		@FindBy(xpath = ("(//span[@aria-label='edit'])[1]"))
		WebElement editicon;
				
		@FindBy(xpath = ("/html/body/div[2]/div/div/div/div/div/span[2]"))
		WebElement retrivemesssge;
				
		@FindBy(xpath = ("//button[@class='ant-btn ant-btn-primary ant-btn-lg btn-reset']"))
		WebElement resetbutton;				
		
		@FindBy(xpath = ("//button[@type='submit']"))
		WebElement updatebutton;
		
		@FindBy(xpath = ("//span[text()='Update']"))
		WebElement updatemessage;
		
	
	//category details edits	
		@FindBy(xpath = ("(//span[@aria-label='edit'])[1]"))
		WebElement category_edit_button;
		
		@FindBy(xpath = ("(//span[@aria-label='close-circle'])[14]"))
		WebElement category_cancel_button;
		
		@FindBy(xpath = ("(//span[@class='anticon anticon-check'])[2]"))
		WebElement category_update_button;
		
		@FindBy(xpath = ("/html/body/div[8]/div/div/div/div/div/span[2]"))
		WebElement category_update_message;
	
	//category details edits	
		@FindBy(xpath = ("(//span[@aria-label='edit'])[2]"))
		WebElement process_edit_button;
				
		@FindBy(xpath = ("(//span[@aria-label='close-circle'])[13]"))
		WebElement process_cancel_button;
				
		@FindBy(xpath = ("(//span[@aria-label='check'])[2]"))
		WebElement process_update_button;
				
		@FindBy(xpath = ("/html/body/div[8]/div/div/div/div/div/span[2]"))
		WebElement process_update_message;
	
	//view page of party
		@FindBy(xpath = ("(//span[@aria-label='eye'])[1]"))
		WebElement viewicon;
		
		@FindBy(xpath = ("//span[@aria-label='close']"))
		WebElement cancelbutton;
		
		@FindBy(xpath = ("(//span[@aria-label='edit'])[1]"))
		WebElement editpage;
		
	//listpage elements
		@FindBy(xpath = ("(//button[@aria-checked='true'])[1]"))
		WebElement toggelinactive;
		
		@FindBy(xpath = ("/html/body/div[5]/div/div/div/div/div/span[2]"))
		WebElement inactivemessage;
		
		@FindBy(xpath = ("(//button[@aria-checked='false'])[1]"))
		WebElement toggelactive;
		
		@FindBy(xpath = ("/html/body/div[5]/div/div/div/div/div/span[2]"))
		WebElement activemessage;
		
		@FindBy(xpath = ("(//span[@class='ant-select-selection-item'])[2]"))
		WebElement paginationdropdown;
				
		@FindBy(xpath = ("(//div[@class='ant-select-item-option-content'])[2]"))
		WebElement paginationvalue;
		
		@FindBy(xpath = ("/html/body/div[4]/div/div/div/div/div/span[2]"))
		WebElement toastmessaage;
		
		@FindBy(xpath= "//li[@title='Next Page']//button[@type='button']")
		WebElement rightbutton;		
		
		@FindBy(xpath= "//li[@title='Previous Page']//button[@type='button']")
		WebElement leftbutton;
		
		@FindBy(xpath = ("//input[@type='input']"))
		WebElement searchbar;
		
		@FindBy(xpath = ("//span[@aria-label='close-circle']"))
		WebElement close;
		
		@FindBy(xpath = ("//div[@class='ant-table-expanded-row-fixed']"))
		WebElement nosearchdata;
		
		
		public PartyListpage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void Navigate_Partylist_menu() throws InterruptedException 
		{
			
			Thread.sleep(1000);	
			masterlist_menu.click();
		
			Thread.sleep(1000);
			Partylist_menu.click();
			System.out.println("Party List page Opened.");
		}
		
		public void Open_party_add()
		{
			((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			add_party_button.isDisplayed();
			add_party_button.click();
			System.out.println("Party module is open - user can enter data in it.");
			
		}
		
		public void add_partyinformation() throws InterruptedException
		{
			party_name.sendKeys(Common_No_random);
			Thread.sleep(2000);
			
			  short_name.sendKeys(Common_No_random);
			  party_gstno.sendKeys(GSTIN);
			  Register_Address.sendKeys(Common_No_random); Country.click();
			  Country.sendKeys(prop.getProperty("Country")); Thread.sleep(3000);
			  TestUtil.PressEnter();
			  
			  
			  State.click(); State.sendKeys(prop.getProperty("State")); Thread.sleep(3000);
			  TestUtil.PressEnter();
			  
			  City.click(); City.sendKeys(prop.getProperty("City")); Thread.sleep(3000);
			  TestUtil.PressEnter();
			  
			  Pincode.sendKeys(prop.getProperty("Pincode"));
			  
			  Website.sendKeys(Random_Website); Thread.sleep(1000);
			  PhoneNo.sendKeys(mobileNumber); 
			  Thread.sleep(1000); //
			  MobileNo.sendKeys(mobileNumber); 
			  Thread.sleep(1000);
			  EmailAddress.sendKeys(Random_EmailAddress); Thread.sleep(1000);
			  System.out.println("Party Infrmation added successfully.");
			 
		}
		
		public void add_contect_information() throws InterruptedException
		{
			Checkbox.click();
			
			PhoneNo2.sendKeys(mobileNumber);
			Thread.sleep(1000);
			MobileNo2.sendKeys(mobileNumber);
			Thread.sleep(1000);
			EmailAddress2.sendKeys(Random_EmailAddress);
			
			System.out.println("Contect Infrmation added successfully.");
		}
		
		public void add_reference_information() throws InterruptedException
		{
			refname.sendKeys(Common_No_random);
			Thread.sleep(1000);
			
			relationship.click();
			Thread.sleep(3000);
			TestUtil.PressEnter();
			refphoneno.sendKeys(prop.getProperty("Phoneno"));
			
			refaddress.sendKeys(Common_No_random);
			Thread.sleep(1000);
			country.sendKeys(prop.getProperty("Country"));
			Thread.sleep(3000);
			TestUtil.PressEnter();
			
			state.sendKeys(prop.getProperty("State"));
			Thread.sleep(3000);
			TestUtil.PressEnter();
		
			city.sendKeys(prop.getProperty("City"));
			Thread.sleep(3000);
			TestUtil.PressEnter();
			
			pincode.sendKeys(prop.getProperty("Pincode"));
			
			System.out.println("Reference information added successfully");
			
		}
		
		public void save_button()
		{
			save.click();
			
		//	Assert.assertTrue(save_message.isDisplayed());
			System.out.println("Party details save successfully");
		}
		
		
		public void add_category_details() throws InterruptedException 
		{
		   Thread.sleep(2000);
		  
		   add_record1.click(); 
		   Thread.sleep(1000);
		   category.sendKeys(prop.getProperty("Category"));
		   Thread.sleep(3000); 
		   TestUtil.PressEnter();
		 
		   subcategory.click();
		   Thread.sleep(3000);
		   subcategory.sendKeys(prop.getProperty("Subcategory")); 
		   Thread.sleep(5000);
		   TestUtil.PressEnter();
		  
		   partytype.click();
		   Thread.sleep(3000);
		   partytype.sendKeys(prop.getProperty("Partytype")); 
		   Thread.sleep(5000);
		   TestUtil.PressEnter();
		  
		   category_save_button.click();
		// Assert.assertTrue(category_save_message.isDisplayed());
		   System.out.println("Category details save successfully");
		  
		}
		 
		public void add_process_details() throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(add_record2));
			
			add_record2.click();
			purpose.click();
			Thread.sleep(3000);
			TestUtil.PressEnter();
			
			process.click();
			Thread.sleep(3000);
			TestUtil.PressEnter();
			
			process_save_button.click();
	//		Assert.assertTrue(process_save_message.isDisplayed());
			System.out.println("Process details save successfully");
			
			Thread.sleep(1000);
			save.click();
			Thread.sleep(500);
			save.click();
						
		}
		
		public void edit_party_details() throws InterruptedException 
		{	
			Thread.sleep(3000);
			editicon.click();
		//	Assert.assertTrue(retrivemesssge.isDisplayed());
			System.out.println("Process details retrive successfully");
		//	party_name.sendKeys(prop.getProperty(Common_No_random + Common_No_random));
			Thread.sleep(2000);
			
			TestUtil.scroll_bottom();
			Thread.sleep(3000);
			resetbutton.click();
			Thread.sleep(500);
			resetbutton.click();
			Thread.sleep(3000);
			
		//	Assert.assertTrue(resetbutton.isDisplayed());
			System.out.println("Process details reset successfully");
			
			updatebutton.click();
			Thread.sleep(3000);
					
		}

				
		public void edit_categoryprocess_details() throws InterruptedException
		{
			editicon.click();
			
			// Assert.assertTrue(retrivemesssge.isDisplayed());
			System.out.println("Process details retrive successfully");
			Thread.sleep(2000); TestUtil.scroll_bottom();
			  
			Thread.sleep(3000);
			category_edit_button.click(); Thread.sleep(2000);
			category_cancel_button.click(); Thread.sleep(2000);
			category_edit_button.click(); Thread.sleep(2000);
			category_update_button.click(); //
		//	Assert.assertTrue(category_update_message.isDisplayed()); Thread.sleep(500);
			 
			
			
			Thread.sleep(2000);
			process_edit_button.click();
			Thread.sleep(2000);
			process_cancel_button.click();
			Thread.sleep(2000);
			process_edit_button.click();
			Thread.sleep(2000);
			process_update_button.click();
		//	Assert.assertTrue(process_update_message.isDisplayed());
			Thread.sleep(2000);
			
			updatebutton.click();
			Thread.sleep(3000);
			
		}
		
		public void view_partypage() throws InterruptedException
		{
			viewicon.click();			
	//		Assert.assertTrue(retrivemesssge.isDisplayed());
			System.out.println("view details retrive successfully");
			Thread.sleep(3000); 
			TestUtil.scroll_bottom();
			List<WebElement> disable_fields = driver.findElements(By.xpath("//input[@disabled]"));
		      System.out.println("Total number of disable elements on page: " + disable_fields.size());
			Thread.sleep(3000);
			cancelbutton.click();
			
			viewicon.click();			
	//		Assert.assertTrue(retrivemesssge.isDisplayed());
			System.out.println("view details retrive successfully");
			Thread.sleep(3000); 
			TestUtil.scroll_bottom();
			editpage.click();
			Thread.sleep(3000);
			updatebutton.click();
						
		}
		
		public void listpage_toggel() throws InterruptedException
		{
			toggelinactive.click();
			Thread.sleep(2000);
		//	Assert.assertTrue(inactivemessage.isDisplayed());
			
			toggelactive.click();
			Thread.sleep(2000);
		//	Assert.assertTrue(activemessage.isDisplayed());
			
		}
		
		public void listpage_pagination() throws InterruptedException
		{
			paginationdropdown.click();Thread.sleep(2000);
			paginationvalue.click(); Thread.sleep(2000);
		//	Assert.assertTrue(toastmessaage.isDisplayed());
			
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			if(rightbutton.isEnabled())
			{
				rightbutton.click();
			}
			System.out.println("Right button is Disabled");
			Thread.sleep(2000);
			
			if(leftbutton.isEnabled())
			{
				leftbutton.click();
			}
			System.out.println("Left button is Disabled");
			Thread.sleep(2000);
		}
		
		public void listpage_searchbar() throws InterruptedException
		{
			searchbar.sendKeys(Common_No_random);
			Thread.sleep(2000);
			close.click();
			
			searchbar.sendKeys("Mydata");
			Thread.sleep(2000);
		//	Assert.assertTrue(nosearchdata.isDisplayed());
			
			driver.navigate().refresh();
		}
		
		
		
}
