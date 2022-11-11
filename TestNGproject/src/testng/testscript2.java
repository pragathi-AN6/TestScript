package testng;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class testscript2 extends base_class {
	@Test
	public void signup() throws EncryptedDocumentException, IOException
	{
		String firstname = Generic_Excel.getData("Sheet1", 0, 0);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userName")))).sendKeys(firstname);
		
		String email = Generic_Excel.getData("Sheet1", 1, 0);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		String curentadres = Generic_Excel.getData("Sheet1", 2, 0);
		driver.findElement(By.id("currentAddress")).sendKeys(curentadres);
		
		String permnentadres=Generic_Excel.getData("Sheet1", 3, 0);
		driver.findElement(By.id("permanentAddress")).sendKeys(permnentadres);
		
		driver.findElement(By.id("submit")).submit();
	}

}
