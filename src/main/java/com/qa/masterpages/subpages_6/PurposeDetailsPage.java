package com.qa.masterpages.subpages_6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class PurposeDetailsPage extends TestBase {
	
	//Random String generated for : Document Number & all 
		String Common_No_random	= TestUtil.RandomStringGenerator();

	//-----Page Factory ----//
	
	//Navigation Elements
	@FindBy(xpath= "(//span[normalize-space()='Master'])[1]")
	WebElement Master_menu;
	
	@FindBy(xpath= "//a[normalize-space()='Purpose Details']")
	WebElement PurposeDetails_menu;
	
	//Plus Record Button
	@FindBy(xpath= "//button[@class='ant-btn ant-btn-default ant-btn-lg btn-orange btn-table-top']")
	WebElement plus_record_btn;
	
	//Add record -data fields
	@FindBy(xpath= "//input[@type='text']")
	WebElement data_inputfield;
	
	@FindBy(xpath= "//textarea[@type='textArea']")
	WebElement description_inputfield;
	
	@FindBy(xpath= "(//div[@class=' css-13z0ixq'])[1]")
	WebElement select1_type;
	@FindBy(xpath= "//div[@id='react-select-2-option-1']")
	WebElement select1_select;
	
	@FindBy(xpath= "//span[@aria-label='save']")
	WebElement save_button;
	
	//Search field
	@FindBy(xpath= "//input[@placeholder='Search...']")
	WebElement search_field;
	
	//Edit elements
	@FindBy(xpath= "//span[@aria-label='edit']")
	WebElement edit_button;
	
	@FindBy(xpath= "//span[normalize-space()='Record updated!']")
	WebElement record_updated_msg;
	
	@FindBy(xpath= "//span[@aria-label='check']")
	WebElement check_button;  //only coming in edit 
	
	//Toggle status - check tick 
	@FindBy(xpath= "(//input[@type='checkbox'])[2]")
	WebElement checkeded1_button;
	@FindBy(xpath= "(//input[@type='checkbox'])[3]")
	WebElement checkeded2_button;
	@FindBy(xpath= "(//input[@type='checkbox'])[4]")
	WebElement checkeded3_button;
	
	
	@FindBy(xpath= "//span[@aria-label='delete']")
	WebElement record_delete_button;
	@FindBy(xpath= "//button[@class='ant-btn ant-btn-default ant-btn-dangerous']")
	WebElement record_delete_yes_button;
	
	@FindBy(xpath= "//span[normalize-space()='Records deactivated successfully.']")
	WebElement toggle_status_msg;
	
	@FindBy(xpath= "(//button[@aria-checked='false'])[1]")
	WebElement status_false;
	
	//Search_no_result
	@FindBy(xpath= "//div[@class='ant-table-expanded-row-fixed']")
	WebElement search_noresult_text;
	
	//Validation msg
	@FindBy(xpath= "//div[@role='alert']")
	WebElement validation_msg_text;
	
	@FindBy(xpath= "//a[@class='ant-typography']//span[@aria-label='close-circle']")
	WebElement close_button;
	
	//Record Already exists
	@FindBy(xpath= "//span[normalize-space()='Purpose Name already exists']")
	WebElement record_exists_text;
	
	
	//pagination elements
	@FindBy(xpath= "//li[@title='Next Page']//button[@type='button']")
	WebElement rightArrow_button;
	@FindBy(xpath= "//li[@title='Previous Page']//button[@type='button']")
	WebElement leftArrow_button;
	
	
	
	
	
	
	
	
	
	
	
	public PurposeDetailsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Navigate_sub_menu() 
	{
		try {
			//TestUtil.navigate_to_option1(Master_menu,Occupation_menu);
			Thread.sleep(3000);
			PurposeDetails_menu.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Click_on_Record()
	{
		try {
			Thread.sleep(2000);
			plus_record_btn.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void add_data_record()
	{
		data_inputfield.sendKeys(Common_No_random);
		//description_inputfield.sendKeys(Common_No_random);
		try {
			TestUtil.navigate_to_option1(select1_type,select1_select);			
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		save_button.click();
		
		try {
			Thread.sleep(3000);
			search_field.sendKeys(Common_No_random);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String actual_text = driver.findElement(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 editable-row']//td[3]")).getText();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(actual_text, Common_No_random);
		
	}
	
	public void edit_functionality()
	{
		edit_button.click();
		try {
			Thread.sleep(3000);
			data_inputfield.sendKeys(Common_No_random);
			//description_inputfield.sendKeys(Common_No_random);
			check_button.click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue(record_updated_msg.isDisplayed());
		
	}
	
	public void toggle_status()
	{
		driver.navigate().refresh();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		checkeded1_button.click();
		checkeded2_button.click();
		checkeded3_button.click();
		try {
			Thread.sleep(2000);
			record_delete_button.click();
			Thread.sleep(2000);
			record_delete_yes_button.click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue(toggle_status_msg.isDisplayed());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(status_false.isDisplayed());
	}
	
	public void random_search()
	{
		search_field.sendKeys("TntraTest_NoResultFound");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(search_noresult_text.isDisplayed());;
	}
	
	public void validation_msg()
	{
		Click_on_Record();
		save_button.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(validation_msg_text.isDisplayed());
		close_button.click();
	}
	
	public void Record_already_exists()
	{
		driver.navigate().refresh();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Click_on_Record();
		data_inputfield.sendKeys(Common_No_random);
		try {
			TestUtil.navigate_to_option1(select1_type,select1_select);			
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//description_inputfield.sendKeys(Common_No_random);
		save_button.click();
		
		try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue(record_exists_text.isDisplayed());
		close_button.click();
	}
	
	public void pagination()
	{
		driver.navigate().refresh();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Click the right arrow button until it is disabled
        while (rightArrow_button.isEnabled()) {
        	try {
        		 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	rightArrow_button.click();
        }
        System.out.println("Right arrow button is disabled!");
        
        // Click the left arrow button until it is disabled
        while (leftArrow_button.isEnabled()) {
        	try {
        		 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	leftArrow_button.click();
        }
        System.out.println("Left arrow button is disabled!");
        System.out.println("Pagination functionality is working");
	}
}
