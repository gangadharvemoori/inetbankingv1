package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver idriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
	idriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[2]/a")	
	WebElement linkNewCustomer;
	
	@CacheLookup
	@FindBy(how=How.CSS, using="body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]")	
	WebElement textname;
	
	@CacheLookup
	@FindBy(how=How.CSS, using="body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)")
	WebElement rdgender;
	
	@CacheLookup
	@FindBy(how=How.CSS, using="#dob")
	WebElement txtdob;
	
	@CacheLookup
	@FindBy(how=How.CSS, using="body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea")
	WebElement txtAddress;

	@CacheLookup
	@FindBy(how=How.CSS, using="body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]")
	WebElement txtCity;
	
	@CacheLookup
	@FindBy(how=How.CSS, using="body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]")
	WebElement txtState;
	
	@CacheLookup
	@FindBy(how=How.CSS, using="body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]")
	WebElement txtPincode;

	@CacheLookup
	@FindBy(how=How.CSS, using="body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]")
	WebElement txtmobile;
	
	@CacheLookup
	@FindBy(how=How.CSS, using="body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]")
	WebElement txtemilid;
	
	@CacheLookup
	@FindBy(how=How.CSS, using="body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]")
	WebElement txtpassword;
	
	@CacheLookup
	@FindBy(how=How.CSS, using="body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)")
	WebElement btnSubmit;
	
	public void clickAddNewCustomer()
	{
		linkNewCustomer.click();
	}
	
	public void custName(String cname)
	{
		textname.sendKeys(cname);
	}
	
	public void custGender(String gender)
	{
		rdgender.click();
	}
	
	public void custdob(String mm, String dd, String yyyy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yyyy);
	}
	
	public void custaddress(String caddress)
	{
		txtAddress.sendKeys(caddress);
	}
	
	public void custCity(String ccity)
	{
		txtCity.sendKeys(ccity);
	}
	
	public void custState(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	
	public void custPincode(int ccpin)
	{
		txtPincode.sendKeys(String.valueOf(ccpin));
	}
	public void custMobile(String ccell)
	{
		txtmobile.sendKeys(ccell);
	}
	public void custEmail(String cemail)
	{
		txtemilid.sendKeys(cemail);
	}
	public void custPassword(String cpassword)
	{
		txtpassword.sendKeys(cpassword);
	}
	public void custCreate()
	{
		btnSubmit.click();
	}
	
}
