package FrameWorkAdvancedSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaleElementReferenceException
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Java Practice\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		WebElement untb = driver.findElement(By.id("username"));
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		untb.sendKeys("admin");
//		Thread.sleep(2000);
		
		LoginPageObjectModelClass lp = new LoginPageObjectModelClass(driver);
		driver.navigate().refresh();
		lp.getUntb().sendKeys("admin");
		Thread.sleep(2000);
		driver.quit();
	}
}
