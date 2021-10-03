package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver Idriver;
	
	public LoginPage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
//	@FindBy(css="#QuickLinkItem5393 > a > span.t-quick-link-text")
//	@CacheLookup
//	WebElement signIn;
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(css="body > div:nth-child(7) > div > ul > li:nth-child(15) > a")
	@CacheLookup
	WebElement logoutbtn;
	
//	public void signIn()
//	{
//		signIn.click();
//		
//	}
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
		
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
		
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
		
	}
	public void logoutButton()
	{
		logoutbtn.click();
		
	}
		
	
	
}
