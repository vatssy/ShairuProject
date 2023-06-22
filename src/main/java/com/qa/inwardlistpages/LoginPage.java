package com.qa.inwardlistpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage  extends TestBase{
	
	@FindBy(xpath= "//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath= "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath= "//span[normalize-space()='Login']")
	WebElement login;
	
	@FindBy(xpath= "//b[normalize-space()='Welcome']")
	WebElement welcome_usertext;
	
	

	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ValidateLogin()
	{
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		login.click();
		
	}
	
	public boolean ValidateWelcome_Usertext()
	{
		return welcome_usertext.isDisplayed();
		
	}
}
