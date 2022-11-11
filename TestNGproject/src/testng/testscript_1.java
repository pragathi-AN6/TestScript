package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testscript_1 extends base_class{
	
	@Test
	public void facebook()
	{
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")))).sendKeys("abcd");
		Reporter.log("username entered", true);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("xyz");
		Reporter.log("password entered", true);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Reporter.log("all the data is entered", true);
	
	}

}
