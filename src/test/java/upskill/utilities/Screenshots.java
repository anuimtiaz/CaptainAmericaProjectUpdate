package upskill.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshots {

	public void screenshotMethod() throws IOException {
		
		String filename = "Ebay";
		
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy h-m-s");
		Date d = new Date();
		
		File sh = ((TakesScreenshot) SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sh, new File(System.getProperty
		("user.dir")+"/screenshots/"+filename+df.format(d)+".png"));
		
		System.out.println("Screenshot Taken");
			
		
	}
	
	
	
}
