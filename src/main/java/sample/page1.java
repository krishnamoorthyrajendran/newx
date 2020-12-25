package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page1  {
	public WebDriver driver;
	By openwindow=By.cssSelector("[id='openwindow']");
	
	public page1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement openwindow()
	{
		return driver.findElement(openwindow);
	}

}
