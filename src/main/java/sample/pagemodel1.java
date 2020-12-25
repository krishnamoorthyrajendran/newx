package sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagemodel1 {
	WebDriver driver;
	public WebDriver basic()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishnamoorthy\\Documents\\chromedriver.exe");
		 driver=new ChromeDriver();
		 return driver;
	}
	
	
	public String screenshotpath(String testcasename,WebDriver driver ) throws IOException
	{
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		String des=System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		FileUtils.copyFile(src, new File(des));
		return des;
	}
	
	public String screenshotpathdf(String testcasename,WebDriver driver ) throws IOException
	{
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		String des=System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		FileUtils.copyFile(src, new File(des));
		return des;
	}
	
}
