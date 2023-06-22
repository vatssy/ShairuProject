package com.qa.dummytest;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class QR_Code {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("http://qrcode.meetheed.com/qrcode_examples.php");
	}

	@Test(priority=1)
	public void  Validate_QR_code_text1() throws IOException, NotFoundException 
	{
		//Get Image path  src link as URL - storing as string
		String qr_code_text = driver.findElement(By.xpath("//img[@alt='QR Contact Example']")).getAttribute("src");
		
		//Create an object of URL class
		URL url = new URL(qr_code_text); 
		
		// If you have Image file path then remove above line of code & add File() -path to it
		//File file = new File("path of QR code image");
		
		//pass URL class object to store the file as image
		
		BufferedImage bufferedimage = ImageIO.read(url);
		
		//Process the image
		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedimage);
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
		
		//To Extract information from QR code;
		Result result = new MultiFormatReader().decode(binaryBitmap);
		
		String decodedText =  result.getText();
		System.out.println(decodedText);
		
		
		//Assertion 
		Assert.assertEquals(decodedText, "MECARD:N:Joe;EMAIL:Joe@bloggs.com;;");
		
	}
	
	
	@Test(priority=2)
	public void  Validate_QR_code_text2() throws IOException, NotFoundException 
	{
		//Get Image src link as URL - storing as string
		String qr_code_text = driver.findElement(By.xpath("//img[@alt='QR Phone Number Example']")).getAttribute("src");
		
		//Create an object of URL class
		URL url = new URL(qr_code_text);
		
		//pass URL class object to store the file as image
		
		BufferedImage bufferedimage = ImageIO.read(url);
		
		//Process the image
		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedimage);
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
		
		//To Extract information from QR code;
		Result result = new MultiFormatReader().decode(binaryBitmap);
		String decodedText =  result.getText();
		System.out.println(decodedText);
		
		
		//Assertion 
		Assert.assertEquals(decodedText, "tel:07777777777");
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
}
