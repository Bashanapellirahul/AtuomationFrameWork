package oodo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import odoo.config.ConfigurationReader;
import odoo.pages.Employees;
import odoo.pages.HomePage;
import odoo.pages.LoginPage;
import odoo.utilities.ReadingDataFromExcel;
import odoo.utilities.Screenshots;
import oodoWebsite.TestBaseClass;

public class OodoLogin {
	
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	Employees emp;
	//ReadingDataFromExcel readingDataFromExcel;
	

	@Test
	public void logintest() throws Exception {
		
		
//		DataBaseLoader dbloader = new DataBaseLoader();
//		dbloader.returnValuesFromDB("SELECT * FROM temp.products"); 
		
		driver=TestBaseClass.getWebDriver();
		driver.get(ConfigurationReader.getConfigurationReader().geturl());	
		//driver.get("https://gigaelements.odoo.com/web/login");
		//driver.findElement(By.xpath("//img[@src='/web/binary/company_logo']"));
		
		//driver.findElement(By.xpath(""));
		Screenshots.capturescreenshotW(driver, "step1_launchPage");
		
		loginpage = new LoginPage(driver);
		Thread.sleep(2000);
		Screenshots.capturescreenshotW(driver, "step2_LogoElementFound");
		Assert.assertEquals(true, loginpage.isLogoDisplayed("logoElementFound"));
		
		Thread.sleep(2000);
		loginpage.enterEmail(ReadingDataFromExcel.readExcelValue(1, 0));
		Screenshots.capturescreenshotW(driver, "step3_entered_Email");
		Thread.sleep(2000);
		loginpage.enterPassword(ReadingDataFromExcel.readExcelValue(1,1));
		Screenshots.capturescreenshotW(driver, "step4_entered_password");
		Thread.sleep(2000);
		
		loginpage.clickLogin();
		Screenshots.capturescreenshotW(driver, "step5_Clicked_On_LoginButton");
		
		homepage = new HomePage(driver);
		Assert.assertEquals(true, homepage.isDisplayed("userLogo found"));
		Screenshots.capturescreenshotW(driver, "step6_UserLogo_Found");
		//Assert.assertEquals("true", homepage.isDisplayed("checked"));
		Thread.sleep(2000);
		
//		emp = new Employees(driver);
//		emp.empButton();
//		//emp.clickNew();
//		emp.empNames1();
//		emp.empNames2();
//		emp.empNames3();
//		emp.empNames4();
		
		
		driver.quit();
	}

}
