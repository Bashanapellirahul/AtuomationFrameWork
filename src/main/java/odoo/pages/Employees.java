package odoo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Employees {
	WebDriver driver;
	public Employees(WebDriver driver) {
		
		PageFactory.initElements(driver, this);		//page factory is a selenium class 
	
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"result_app_3\"]/img")
	private WebElement empButton;
	
//	@FindBy(how=How.XPATH,using="")
//	private WebElement newButton;
	
	@FindAll(@FindBy(how=How.XPATH,using="//*[@class='o_kanban_record_title']"))
	private List<WebElement>employeeNames;
	//this will give the list of elements here i used this because to get the list of employees names
	
	public void empButton() {
		empButton.click();
	}
	
//	public void clickNew() {
//		newButton.click();
//	}
	
	public void empNames1() {
		System.out.println(employeeNames.get(0).getText());
	}
	
	public void empNames2() {
		System.out.println(employeeNames.get(1).getText());
	}
	
	public void empNames3() {
		System.out.println(employeeNames.get(2).getText());
	}
	
	public void empNames4() {
		System.out.println(employeeNames.get(3).getText());
	}

}
