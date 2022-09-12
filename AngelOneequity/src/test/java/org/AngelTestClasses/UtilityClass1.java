package org.AngelTestClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass1 {

	public void Screenshot(WebDriver driver) throws IOException
	{
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		LocalDateTime now = LocalDateTime.now(); 
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Soft stuff\\snap\\"+dt.format(now)+".jpg");
		FileUtils.copyFile(source, dest);
	}
	public static String getData(int row, int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Soft stuff\\Book1.xlsx");
		String data=WorkbookFactory.create(file).getSheet("Sheet2").getRow(row).getCell(col).getStringCellValue();
		return data;
	}
}
