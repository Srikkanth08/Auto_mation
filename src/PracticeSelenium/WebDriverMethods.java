package PracticeSelenium;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Enter The URL
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "GOOGLE";
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Wrong");
		}
		
		//Get Current URL
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//setSize
		Dimension D = new Dimension(700, 500);
		driver.manage().window().setSize(D);
		Thread.sleep(2000);
		
		//setPosition
		Point P= new Point(700, 500);
		driver.manage().window().setPosition(P);
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//navigate to other Page
		driver.navigate().to("https://fb.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//close the Current WebPage
//		driver.close();
		
		//close All the Windows opened By Selenium
		driver.quit();
	}
}
