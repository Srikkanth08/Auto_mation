package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectionMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
//		driver.findElement(By.className("textField")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("username"));
		Thread.sleep(2000);
		driver.findElement(By.name("username"));
		Thread.sleep(2000);
		driver.quit();
	}		
}
