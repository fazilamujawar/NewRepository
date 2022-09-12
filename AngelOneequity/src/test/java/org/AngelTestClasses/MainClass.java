package org.AngelTestClasses;

import java.io.IOException;

import org.AngelPOMClasses.AngelLoginPage;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class MainClass extends BaseClass {
	
	
	@BeforeTest
	@Parameters("Browser")
	public void setproperty() throws InterruptedException 
	{
			Setproperty1();
	}
	@BeforeMethod
	public void OpenLoginPage() throws InterruptedException, EncryptedDocumentException, IOException
	{
		AngelLoginPage ap=new AngelLoginPage(driver);
		ap.getusername(UtilityClass1.getData(1,0));
		ap.getpassword(UtilityClass1.getData(1,1));
		ap.login();
		System.out.println("Login");
		Thread.sleep(4000);
	}
	@Test()
	public void Verify() throws IOException, InterruptedException
	{
		UtilityClass1 uc=new UtilityClass1();
		System.out.println("Verify1");
		uc.Screenshot(driver);
	}
	@AfterMethod
	public void resetproperty()
	{
		System.out.println("resetproperty Test");
	}
	
}
