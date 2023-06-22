package com.qa.dummytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class Dummytest extends TestBase {
	
	
	
	
	@BeforeClass
	public void setup()
	{
		initialization();
		TestUtil.ValidateUserLogin();
	}

	
	
	@Test
	public void VerifySelectDropdown()
	{
		driver.get("https://www.google.com/");
	}
	
	
	
	

}
		

