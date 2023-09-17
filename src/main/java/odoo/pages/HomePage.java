package odoo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);		//page factory is a selenium class 
	
}
	@FindBy(how=How.XPATH,using="//img[@alt='User']")
	private WebElement user; 


public boolean isDisplayed(String userLogo) {
	System.out.println("the userLogo is found"+user.getText());
	
	return user.isDisplayed();
	
	
	
}
}

