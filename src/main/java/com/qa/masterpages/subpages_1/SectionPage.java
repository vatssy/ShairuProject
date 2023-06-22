package com.qa.masterpages.subpages_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class SectionPage extends TestBase {
	
	//Random String generated for : Document Number & all 
		String Common_No_random	= TestUtil.RandomStringGenerator();

	//-----Page Factory ----//
	
	//Navigation Elements
	@FindBy(xpath= "(//span[normalize-space()='Master'])[1]")
	WebElement Master_menu;
	
	@FindBy(xpath= "//a[normalize-space()='Section']")
	WebElement Section_menu;
	
	//Plus Record Button
	@FindBy(xpath= "//button[@class='ant-btn ant-btn-default ant-btn-lg btn-orange btn-table-top']")
	WebElement plus_record_btn;
	
	//Add record -data fields
	@FindBy(xpath= "//input[@class='ant-input ant-input-sm']")
	WebElement data_inputfield;
	
	@FindBy(xpath= "//textarea[@type='textArea']")
	WebElement sectionaddress_inputfield;
	
	@FindBy(xpath= "(//div[@class=' css-13z0ixq'])[1]")
	WebElement select1_type;
	@FindBy(xpath= "//div[@id='react-select-2-option-1']")
	WebElement select1_select;
	@FindBy(xpath= "(//div[@class=' css-13z0ixq'])[2]")
	WebElement select2_type;
	@FindBy(xpath= "//div[@id='react-select-3-option-1']")
	WebElement select2_select;
	@FindBy(xpath= "(//div[@class=' css-13z0ixq'])[3]")
	WebElement select3_type;
	@FindBy(xpath= "//div[@id='react-select-4-option-1']")
	WebElement select3_select;
	@FindBy(xpath= "(//div[@class=' css-13z0ixq'])[4]")
	WebElement select4_type;
	@FindBy(xpath= "//div[@id='react-select-5-option-1']")
	WebElement select4_select;
	
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
	@FindBy(xpath= "(//button[@role='switch'])[1]")
	WebElement status_button;
	
	
	
	@FindBy(xpath= "//span[@aria-label='delete']")
	WebElement record_delete_button;
	@FindBy(xpath= "//button[@class='ant-btn ant-btn-default ant-btn-dangerous']")
	WebElement record_delete_yes_button;
	
	@FindBy(xpath= "//span[normalize-space()='Record deactivated!']")
	WebElement toggle_status_msg;
	
	@FindBy(xpath= "(//button[@aria-checked='false'])[1]")
	WebElement status_false;
	
	//Search_no_result
	@FindBy(xpath= "//div[@class='ant-table-expanded-row-fixed']")
	WebElement search_noresult_text;
	
	//Validation msg
	@FindBy(xpath= "//div[contains(text(),'Section name is Required')]")
	WebElement validation_msg1_text;
	@FindBy(xpath= "//div[contains(text(),'Section Category is Required')]")
	WebElement validation_msg2_text;
	@FindBy(xpath= "//div[contains(text(),'Section Process is Required')]")
	WebElement validation_msg3_text;
	@FindBy(xpath= "//div[contains(text(),'BU Name is Required')]")
	WebElement validation_msg4_text;
	@FindBy(xpath= "//div[contains(text(),'Box number is Required')]")
	WebElement validation_msg5_text;
	
	@FindBy(xpath= "//a[@class='ant-typography']//span[@aria-label='close-circle']")
	WebElement close_button;
	
	//Record Already exists
	@FindBy(xpath= "//div[@class='ant-message']//span[1]")
	WebElement record_exists_text;
	
	
	//pagination elements
	@FindBy(xpath= "//li[@title='Next Page']//button[@type='button']")
	WebElement rightArrow_button;
	@FindBy(xpath= "//li[@title='Previous Page']//button[@type='button']")
	WebElement leftArrow_button;
	
	
	
	
	
	
	
	
	
	
	
	public SectionPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Navigate_occupation_menu() 
	{
		try {
			//TestUtil.navigate_to_option1(Master_menu,Occupation_menu);
			Thread.sleep(3000);
			Section_menu.click();
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
		
		try {
			TestUtil.navigate_to_option1(select1_type,select1_select);	
			TestUtil.navigate_to_option1(select2_type,select2_select);
			TestUtil.navigate_to_option1(select3_type,select3_select);
			TestUtil.navigate_to_option1(select4_type,select4_select);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		sectionaddress_inputfield.sendKeys(Common_No_random);
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
			sectionaddress_inputfield.sendKeys(Common_No_random);
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
		status_button.click();
		
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
		Assert.assertTrue(validation_msg1_text.isDisplayed());
		Assert.assertTrue(validation_msg2_text.isDisplayed());
		Assert.assertTrue(validation_msg3_text.isDisplayed());
		Assert.assertTrue(validation_msg4_text.isDisplayed());
		Assert.assertTrue(validation_msg5_text.isDisplayed());
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
			TestUtil.navigate_to_option1(select2_type,select2_select);
			TestUtil.navigate_to_option1(select3_type,select3_select);
			TestUtil.navigate_to_option1(select4_type,select4_select);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		sectionaddress_inputfield.sendKeys(Common_No_random);
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
		// Click the right arrow button until it is disabled or 5 clicks have been made
		int countRight = 0;
		while (rightArrow_button.isEnabled() && countRight < 5) {
		    try {
		        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		        Thread.sleep(5000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		    rightArrow_button.click();
		    countRight++;
		}
		if (countRight == 5) {
		    System.out.println("Maximum count of clicks on rightArrow_button reached!");
		} else {
		    System.out.println("Right arrow button is disabled!");
		}

		// Click the left arrow button until it is disabled or 5 clicks have been made
		int countLeft = 0;
		while (leftArrow_button.isEnabled() && countLeft < 5) {
		    try {
		        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		        Thread.sleep(5000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		    leftArrow_button.click();
		    countLeft++;
		}
		if (countLeft == 5) {
		    System.out.println("Maximum count of clicks on leftArrow_button reached!");
		} else {
		    System.out.println("Left arrow button is disabled!");
		}

	}
}
