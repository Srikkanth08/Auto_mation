package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptActiTimeLoginTest
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String ExpectedTitle = "actiTIME - Login";
		String ActualTitle = driver.getTitle();
		
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Absolutely Magnificient");
		}
		else
		{
			System.out.println("Utter Flop");
		}
		Thread.sleep(2000);
		
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		
		WebElement Login = driver.findElement(By.xpath("//div[text()='Login ']"));
		Login.click();
		Thread.sleep(2000);
		
		String Title = "actiTIME -  Enter Time-Track";
		String ExTitle = driver.getTitle();
		if(Title.equals(ExTitle))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
