package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	
	WebDriver driver;
	public TakeScreenshot(WebDriver driver) {
		this.driver = driver;
	}
	
	// method to take screenshot
	public void takeScreenshot(WebDriver driver,String imgName) throws IOException {
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File trg = new File(System.getProperty("user.dir")+"\\Screenshots\\"+imgName+"");
		
		FileUtils.copyFile(src, trg);
		
	}
}
