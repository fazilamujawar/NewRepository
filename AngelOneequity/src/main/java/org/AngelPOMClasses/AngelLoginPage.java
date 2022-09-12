package org.AngelPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelLoginPage {
	
	/* This is a minor update*/
	
	@FindBy(xpath="//input[@id=\"email\"]")
	private WebElement username;
	@FindBy(xpath="//input[@id=\"pass\"]")
	private WebElement password;
	@FindBy(xpath="//button[@name=\"login\"]")
	private WebElement loginbutton;
	
	public void getusername(String a)
	{
		username.sendKeys(a);
	}
	public void getpassword(String b)
	{
		password.sendKeys(b);
	}
	public void login()
	{
		loginbutton.click();
	}
		public AngelLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
}
