package dbConnection;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import odoo.utilities.DataBaseLoader;

public class DBConnection {

	WebDriver driver;
	
	@Test
	public void dbconnections() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		DataBaseLoader dbloader = new DataBaseLoader();
		
		dbloader.returnValuesFromDB("SELECT * FROM products"); 
		
	}
	
}
