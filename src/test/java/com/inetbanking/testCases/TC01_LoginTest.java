package com.inetbanking.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC01_LoginTest extends BaseClass
{
	
	@Test
	public void loginTest() throws IOException
	{
		
		logger.info("URL is open on browser");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
//		lp.signIn();
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		logger.info("Logged in to application");
		
		System.out.println(driver.getTitle());
		/* String stirngTitle = driver.getTitle(); */
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("LoginTest Passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	
		
		;
	}
	

}
