package com.inetbanking.testCases;


import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC03_AddNewCustomer extends BaseClass
{
  @Test
  public void addNewCustomer() throws InterruptedException
  {
	  LoginPage lp=new LoginPage(driver);
	  lp.setUserName(username);
	  lp.setPassword(password);
	  lp.clickSubmit();
	  Thread.sleep(3000);
	  
	  AddCustomerPage addcust= new AddCustomerPage(driver);
	  addcust.clickAddNewCustomer();
	  addcust.custName("Ganga");
	  addcust.custGender("male");
	  addcust.custdob("11", "12", "1988");
	  addcust.custaddress("Bommanahalli");
	  addcust.custCity("Bangalore");
	  addcust.custPincode(560068);
	  addcust.custMobile("8903333333");
	  String email=randomString()+"@gmail.com";
	  addcust.custEmail(email);
	  addcust.custPassword("Test@123");
	  addcust.custCreate();
	  Thread.sleep(3000);
	  String alertmessage=driver.switchTo().alert().getText();
	  System.out.println(alertmessage);
	  driver.switchTo().alert().accept();

  }
  
}
