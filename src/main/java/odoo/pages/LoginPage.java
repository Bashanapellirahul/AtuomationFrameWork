package odoo.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);		//page factory is a selenium class 
		

	}
	
	@FindBy(how=How.XPATH, using="//img[@src='/web/binary/company_logo']")
	private WebElement logoElement;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='login']")
	private WebElement email;

	@FindBy(how=How.XPATH, using="//input[@id='password']")
	private WebElement password;

	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	private WebElement loginButton;
	
	public boolean isLogoDisplayed(String logoElementFound) {
		System.out.println("the LogoElement is Found"+logoElement.getText());
		return logoElement.isDisplayed();
	}
	
	public void enterEmail(String emailString) throws IOException {
		
		email.sendKeys(emailString);
	}
	
	public void enterPassword(String passwordString) {
		password.sendKeys(passwordString);
	}
	public void clickLogin() {
		loginButton.click();
	}
	

}

