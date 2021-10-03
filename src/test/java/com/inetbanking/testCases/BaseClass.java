package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass
{
	ReadConfig readconfig= new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();

	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass	
	public void setUp(String br)
	{
		
		 logger=Logger.getLogger("inetBankingV1");
		 PropertyConfigurator.configure("Log4j.properties");
		 if(br.equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			 driver=new ChromeDriver();
		 }
		 else if(br.equals("edge"))
	 {
		 System.setProperty("webdriver.edge.driver",readconfig.getEdgePath());
			 driver=new EdgeDriver();
		 }
	 driver.get(baseURL);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	}
    @AfterClass
    public void tearDown()
    {
    	driver.quit();
    }
    
    public void captureScreen(WebDriver driver, String tname) throws IOException
    {
    	TakesScreenshot ts= (TakesScreenshot)driver;
    	File source=ts.getScreenshotAs(OutputType.FILE);
    	File target= new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
    	FileUtils.copyFile(source, target);
    	System.out.println("Screenshot Taken");
    }		
    public static String randomString() //for unique email 
    {
  	  String generateString=RandomStringUtils.randomAlphabetic(8);
  	  return generateString;
  	  
    }
    public static String randomNumber() //for unique pincode 
    {
  	  String generateNumber=RandomStringUtils.randomNumeric(6);
  	  return generateNumber;
  	  
    }
}

