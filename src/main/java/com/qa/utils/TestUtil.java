package com.qa.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.Random;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;
import com.qa.base.TestBase;

public class TestUtil<switchToFrame> extends TestBase {
	
	//Here TestUtils class extends some properties from TestBase class;
	
	public static final long PAGE_LOAD_TIMEOUT = 30;
	public static final long IMPLICIT_WAIT = 30;
	private static final String GSTIN = null;
	
	public static String TESTDATA_SHEET_PATH = " write path of excel sheet";

	static Workbook book;
	static Sheet sheet;
	
	public TestUtil()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public static void ValidateUserLogin() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
	}
	
// It is used for 2nd level menu navigation
	
	public static void navigate_to_option2(WebElement menu,WebElement submenu,WebElement submenu2) throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		Thread.sleep(2000);
		action.moveToElement(submenu).perform();
		Thread.sleep(2000);
		action.moveToElement(submenu2).click().perform();
		Thread.sleep(3000);
	}
	
	
	// It is used for 1st level menu navigation
	
		public static void navigate_to_option1(WebElement menu,WebElement submenu) throws InterruptedException
		{
			Actions action = new Actions(driver);
			action.moveToElement(menu).click().perform();
			Thread.sleep(3000);
			action.moveToElement(submenu).click().perform();
			Thread.sleep(2000);
		}
	
	// It is used for navigation and click
		
		public static void navigate_to_option(WebElement menu) throws InterruptedException
		{
			Actions action = new Actions(driver);
			action.moveToElement(menu).click().perform();
			Thread.sleep(3000);
			
		}
		
	//press enter with element
		public static void PressEnter(WebElement menu) throws InterruptedException
		{
			Actions action = new Actions(driver);
			action.moveToElement(menu).sendKeys(Keys.ENTER).perform();
			Thread.sleep(3000);
		}
	
	//press enter 
		public static void PressEnter() throws InterruptedException
		{
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).perform();
			Thread.sleep(3000);
		}
	
	//Press Tab Key
		public static void PressTab() throws InterruptedException
		{
			Actions action = new Actions(driver);
			action.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
		}
		// It is used forhorizontal scroll
		public static void horizontalbar(WebElement E1) throws InterruptedException
		{
			
			Actions action = new Actions(driver);
			Actions moveToElement = action.moveToElement(E1);
			for (int i = 0; i < 5; i++) {
			    moveToElement.sendKeys(Keys.RIGHT).build().perform();
			}
		}
		// It is used for 3st level menu navigation
		public static void navigate_to_option3(WebElement menu,WebElement submenu,WebElement submenu2,WebElement submenu3) throws InterruptedException
		{
			Actions action = new Actions(driver);
			action.moveToElement(menu).perform();
			Thread.sleep(2000);
			action.moveToElement(submenu).perform();
			Thread.sleep(2000);
			action.moveToElement(submenu2).click().perform();
			Thread.sleep(3000);
			action.moveToElement(submenu3).click().perform();
			Thread.sleep(3000);
		}
			
		
		// It is used for dropdown selection
		
		public static void Dropdown_select(WebElement dropdown_element,String dropdown_text)
		{
			Select dropdown_option = new Select(dropdown_element);
			dropdown_option.selectByVisibleText(dropdown_text); 
			//You can change it to index if required
		}
		
		
		// It is used for click on element
		public static void ElementOnClick(WebElement click_element)
		{
			click_element.click();
		}
		
		
		// It is used for checking is element present
		public static boolean IsElementPresent(WebElement present_element)
		{
			return present_element.isDisplayed();
		}
		
		// It is used for handling window tabs
		public static void Window_handler() 
		{
			String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator();

	        // Here we will check if child window has other child windows and will fetch the heading of the child window
	        while (iterator.hasNext()) 
	        {
	            String ChildWindow = iterator.next();
	                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) 
	                {
	                driver.switchTo().window(ChildWindow);
		               }
	        }
		}
		
		public static void hori(WebElement myElement) 
		{
		//	myElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ngscroll-scrollbar")));
            myElement.click();
            Actions move = new Actions(driver);
            move.moveToElement(myElement).clickAndHold();
            move.moveByOffset(125,0);
            move.release();
            move.perform();
		}
		
		//Scrolling to specific x & y coordinates
		public static void scroll_until() 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,600)");
		}
		
		//Alert handling 
		public static void alert_handle()
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 driver.switchTo().alert().accept();
		     
		}
		
		//Double Click on element
		public static void  double_click(WebElement element)
		{
			Actions act = new Actions(driver);
			act.doubleClick(element).perform();
		}
		
		//scrolling top section of page
		public static void scroll_top() 
		{
			((JavascriptExecutor) driver)
			.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
		}
		
		//Scrolling bottom of the page
		public static void scroll_bottom() 
		{
			((JavascriptExecutor) driver)
			.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		}
		
		
		//Scrolling to particular element
		public void Scroll_to_element(WebElement element)
		{
			((JavascriptExecutor) driver)
			.executeScript("arguments[0].scrollIntoView();", element);
		}
		
		//Click multiple times on element
		
		public static void click_on_element_multiple(WebElement element,int Count_of_click)
		{
			for (int i = 0; i < Count_of_click; i++) {
				element.click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		//Click on element until target element is not displayed
		public void clickUntilDisplayed(WebDriver driver, By clickLocator, By targetLocator) {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    while (true) {
		        try {
		            WebElement clickElement = driver.findElement(clickLocator);
		            clickElement.click();
		            wait.until(ExpectedConditions.presenceOfElementLocated(targetLocator));
		            return;
		        } catch (Exception e) {
		            // Exception will be thrown if the target element is not found after clicking on the click element
		            // In this case, the loop continues and clicks on the click element again
		        }
		    }
		}
			
		
		
		
		// It is used for uploading file only when type = "file"
		public static void upload_file(WebElement upload_element,String file_path) 
		{
			upload_element.sendKeys(file_path);
		}
		
		// It is used for Horizontal scroll clicking on count of click
		public static void Horizontal_Scroll(WebElement element,int ClickCount) {

			for (int i = 1; i <= ClickCount; i++) {
				element.click();
			}
		}
		
		
		
		// It is used for taking screenshots
		public static void takeScreenshotAtEndOfTest() throws IOException 
		{
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String currentDir = System.getProperty("user.dir");
			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		}

		// It is used for switching to iframe
		public void switchToFrame() 
		{
			driver.switchTo().frame("mainpanel");
		}
		
		
		//This will returns the current date for date module
		public static  String GetCurrentDate(String Date_format)
		{
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat(Date_format);
		    return formatter.format(date);
		  
		}
		
		
		// It is used for taking data from excel sheets
		public static Object[][] getTestData(String sheetName) {
			FileInputStream file = null;
			try {
				file = new FileInputStream(TESTDATA_SHEET_PATH);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				book = WorkbookFactory.create(file);
			} catch (InvalidFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			sheet = book.getSheet(sheetName);
			Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			// System.out.println(sheet.getLastRowNum() + "--------" +
			// sheet.getRow(0).getLastCellNum());
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
					data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
					// System.out.println(data[i][k]);
				}
			}
			return data;
		}
		
		public static String Randommobilenogenerator()
		{
			Random rand = new Random();
	        int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
	        int num2 = rand.nextInt(743);
	        int num3 = rand.nextInt(10000);

	        DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
	        DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

	        String mobileNumber = df3.format(num1) + df3.format(num2) + df4.format(num3);

			return mobileNumber;
			
		}
		
		public static String RandomGSTINGenerator()
		{
			Random rand = new Random();
			int num1 = 29;
			String s1 = new String("Z");
			   
			int rand_int1 = rand.nextInt(10000);
			int rand_int2 = rand.nextInt(10);
			DecimalFormat df3 = new DecimalFormat("0000"); // 3 zeros
			DecimalFormat df4 = new DecimalFormat("0"); // 4 zeros

			int leftLimit = 97; // letter 'a'
			int rightLimit = 122; // letter 'z'
			int targetStringLength = 5;
			  
			String generatedString = rand.ints(leftLimit, rightLimit + 1)
					 .limit(targetStringLength)
				      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				      .toString();
			String S2= num1+generatedString+df3.format(rand_int1)+s1+df4.format(rand_int2);
			String GSTIN = new String(S2.toUpperCase());
			    
			return GSTIN;
			
		}
		
		public static String RandomStringGenerator() 
		{
		    int leftLimit = 48; // numeral '0'
		    int rightLimit = 122; // letter 'z'
		    int targetStringLength = 5;
		    Random random = new Random();

		    String generatedString = random.ints(leftLimit, rightLimit + 1)
		      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
		      .limit(targetStringLength)
		      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		      .toString();

		    return generatedString;
		    
		}
		
		public static String RandomEmailGenerator()
		{
			Faker faker = new Faker();
			String random_email =  faker.internet().emailAddress(); 
			return random_email;
		}
		
		public static String RandomNameGenerator()
		{
			Faker faker = new Faker();
			String random_name =  faker.name().fullName(); 
			return random_name;
		}
		
		public static String RandomCompanyGenerator()
		{
			Faker faker = new Faker();
			String random_company =  faker.company().name(); 
			return random_company;
		}
		
		public static String RandomAddressGenerator()
		{
			Faker faker = new Faker();
			String random_address =  faker.name().fullName()+","
					+ "\n" + faker.address().streetAddress()+","
					+"\n" + faker.address().cityName()+","
					+"\n" + faker.address().zipCode(); 
			
			return random_address; 
		}
		
		public static String RandomPhoneNumberGenerator()
		{
			Faker faker = new Faker();
			String random_number =  faker.phoneNumber().phoneNumber(); 
			return random_number;
		}
		
		public static String RandomMobileNumberGenerator()
		{
			Faker faker = new Faker();
			String random_number =  faker.phoneNumber().cellPhone(); 
			return random_number;
		}
		
		public static String RandomWebsiteGenerator()
		{
			Faker faker = new Faker();
			String random_website =  "https://www."+faker.internet().domainName();  
			return random_website;
		}
		
		public static String RandomUserIDGenerator()
		{
			Faker faker = new Faker();
			String random_id = "@"+faker.name().username();  
			return random_id;
		}
		
		
}

