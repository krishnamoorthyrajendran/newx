package sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class test {

	public String screenshotpath(String testcasename,WebDriver driver ) throws IOException
	{
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		String des=System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		FileUtils.copyFile(src, new File(des));
		return des;
	}
}
