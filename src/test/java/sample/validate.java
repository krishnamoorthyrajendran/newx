package sample;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class validate extends pagemodel1 {
	
	WebDriver driver;
	@Test
	public void rahul() {
		driver=basic();
	driver.get("http://www.qaclickacademy.com/");	
	page2 p2=new page2(driver);
   Assert.assertEquals(p2.title1().getText(), "FEATURED CO123URSES");
 
	
	
	}

}
