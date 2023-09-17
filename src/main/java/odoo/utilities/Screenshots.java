package odoo.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshots {
	public static void capturescreenshotW(WebDriver driver, String fileName) throws IOException {
	//WebDriver driver;
	TakesScreenshot scrnshot = (TakesScreenshot) driver;
	
	File objsrcfile = scrnshot.getScreenshotAs(OutputType.FILE);
	
	File objTargetFile = new File("/Users/rahulbashanapelli/Desktop/ScreenshotsSelenium/"+fileName+".png");
	
	Files.copy(objsrcfile, objTargetFile);
	
	//driver.close();
	
	

}
}
