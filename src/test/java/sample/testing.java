package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

;

public class testing extends pagemodel1 {

	WebDriver driver;
	@Test
	public void rahul() {
		driver=basic();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");	
	page1 p=new page1(driver);
	p.openwindow().click();

	
	}


}
