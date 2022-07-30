package First;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElement 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Saikr/OneDrive/Desktop/Disabled%20Element.html");
		Thread.sleep(2000);
		
		WebElement untb = driver.findElement(By.id("i1"));
		untb.sendKeys("admin");
		Thread.sleep(2000);
		
		WebElement pwtb = driver.findElement(By.id("i2"));
//		pwtb.sendKeys("manager");
//		Thread.sleep(2000);
		
		if(pwtb.isEnabled())
		{
			System.out.println("Password is Enabled");
			pwtb.sendKeys("manager");
		}
		else
		{
			System.out.println("Password is Disabled");
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.getElementById('i2').value='manager'");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
