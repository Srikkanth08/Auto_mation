package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginTest
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		For Maximize the Browser
		driver.manage().window().maximize();
//		To get the Test URL
		driver.get("https://demo.actitime.com/login.do");
		/*
		 * String actualTitle=driver.getTitle(); 
		 * StringexpectedTitle="actiTIME - Login"; 
		 * if(actualTitle.equals(expectedTitle)) 
		 *  {
		 * System.out.println("Login Page is Displayed,PASS"); 
		 *  } 
		 * else
		 *  {
		 * System.out.println("Login Page is Not Displayed,FAIL");
		 *  }
		 */
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		
		String actualTitle="actiTIME -  Enter Time-Track";
		String expectedTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Home Page is Displayed,PASS");
		}
		else
		{
			System.out.println("Home Page is Not Displayed,FAIL");
		}
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}

