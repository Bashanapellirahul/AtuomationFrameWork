package oodoWebsite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import odoo.config.ConfigurationReader;

public class TestBaseClass {
	
	//
	
	public static WebDriver driver;
	
	private final static String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	
	
	public static WebDriver getWebDriver() throws Exception {
		
		if(driver==null) {
			driver= CreateLocalDriver(); //as createlocaldriver is a private method and  we need to use it in
											//other classes too so in order to  use it in other classes we created another function and used that createlocalfunction in this function.
										//this function can be used in other class.
										//used if statement because if the driver is null we will call the driver path which is in createlocaldriver
		}
		
		return driver;
		
	}
	
	
	private static  WebDriver CreateLocalDriver() throws Exception {
		
		System.setProperty(CHROME_DRIVER_PROPERTY, ConfigurationReader.getConfigurationReader().getDriverPath());
		//System.setProperty(CHROME_DRIVER_PROPERTY, "/Users/rahulbashanapelli/Desktop/seleniumJAR/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigurationReader.getConfigurationReader().ImplicitWait()));
		//Thread.sleep(2000);
		//driver.close();
		return driver;		
		
		//in this method we will keep all the methods which we use repetitively. these should not be changed at any time
	}

}


