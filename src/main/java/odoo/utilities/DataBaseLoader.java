 package odoo.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseLoader {
	
	static Connection connection = null;
	
	
	public void returnValuesFromDB(String querry ) throws SQLException {
		
		Statement statement = DataBaseLoader.createConnections();
		ResultSet resultset;
		
		resultset= statement.executeQuery(querry);
		
		int code ;
		String title;
		
		while(resultset.next()) {
			title = resultset.getString("product_name".trim());
			System.out.println("Title : ******"+title);
		}
		resultset.close();
		statement.close();
		connection.close();
		
	}
	
	
	
	private static Statement createConnections() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//first i will load the mysql class jdbc drivers for that we will use class.forname
													
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/temp","rahul","R1302984@r"); 
			//here connected the mysql database using the url, database name, username and password
			
			Statement statement = connection.createStatement(); //creating the statement using the connections we have created to pass the querries 
			
			return statement;
			//root@127.0.0.1:3306
		}
		
		catch(Exception e ){
			
			e.printStackTrace();
			
		}
		
		return null;
		
	}
	

}
