package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page2 {
	
	public WebDriver driver;
By title=	By.cssSelector(".text-center>h2");



public page2(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement title1()
{
	return driver.findElement(title);
}

}
