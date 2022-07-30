package TestingFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTestNG 
{
	@Test
	public void verify() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Java Practice\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
//		Assert.assertEquals(driver.getTitle(), "actiTIME - Lo");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "actiTIME - Log");
		driver.findElement(By.id("username")).sendKeys("admin");
		sa.assertAll();
		
		
	}
	
}
