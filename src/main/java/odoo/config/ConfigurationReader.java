package odoo.config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class ConfigurationReader {
	private static String PATH_LOCATION = "./src/main/java/odoo/config/Config.properties";
	//created a private variable with path_location and stored the path of the config.properties file
	Properties properties;
	private ConfigurationReader() throws Exception {		//created a constructor 
		BufferedReader reader;
		
		try {
			reader= new BufferedReader(new FileReader(PATH_LOCATION));	//BufferedReader is a class in java which is used to read a file. 
			//here we used it to read the config.properties file where we have the driver path, implicit wait and other things like urls etc
			properties = new Properties();
			properties.load(reader);
		}
		catch(Exception e) {
			e.printStackTrace(); //his method prints a stack trace for this Throwable object on the error output stream that is the value of the field System.err.
			throw new Exception("Configuration.properties file is not found in the location"+PATH_LOCATION);
		}
		
	}
	public static ConfigurationReader getConfigurationReader() throws Exception  {
		ConfigurationReader configurationReader = new ConfigurationReader();
		return configurationReader;
		
	}
	
	public String getDriverPath() throws Exception {		//this method is created to get the driver path
		
		String driverpathString = properties.getProperty("driverpath");
		
		if(driverpathString!=null) {
			return driverpathString;
		}
		
		else {
			throw new Exception("driver path not found in the location"+PATH_LOCATION);

		}
		
		
	}
	
	public String geturl() throws Exception {			//created to get the url
		
		String url = properties.getProperty("url");
		
		if(url!=null) {
			return url;
		}
		
		else {
			throw new Exception("url not found in the location"+PATH_LOCATION);

		}
		
		
	}
	
	public int ImplicitWait() throws Exception {		//created to get the Implicit wait
		
		String implicitwait = properties.getProperty("implicitwait");
		
		if(implicitwait!=null) {
			return Integer.parseInt(implicitwait);
		}
		else {
			throw new Exception("driver path not found in the location"+PATH_LOCATION);

		}
		
	}
	

		
	
	
	

}
