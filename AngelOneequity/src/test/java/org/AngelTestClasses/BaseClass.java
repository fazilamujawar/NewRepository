package org.AngelTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;
	public void Setproperty1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Soft stuff\\chromedriver_win32\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
	}
}

