package First;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseAndKeyBoardActions 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		//Handling Mouse Hover Action
//		System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Automation\\Drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(2000);
//		WebElement moreAddr = driver.findElement(By.xpath("//div[@id='nav-tools']"));
//		Thread.sleep(2000);
//		Actions ac = new Actions(driver);
//		ac.moveToElement(moreAddr).perform();
		
		
		//Perform Double Click
//		System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Automation\\Drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demo.actitime.com/login.do");
//		WebElement untb = driver.findElement(By.id("username"));
//		untb.sendKeys("admin");
//		Thread.sleep(2000);
//		Actions ac = new Actions(driver);
//		ac.doubleClick(untb).perform();
		
		
		//Perform Drag & Drop
//		System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Automation\\Drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		Thread.sleep(3000);
//		WebElement src = driver.findElement(By.id("box7"));
//		WebElement dest = driver.findElement(By.id("box107"));
//		Actions ac= new Actions(driver);
//		ac.dragAndDrop(src, dest).perform();
		
		
		//Perform Right Click
		//Handling Right Clicked Options By Robot Class
		System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		Actions ac = new Actions(driver);
		ac.contextClick(link).perform();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		driver.close();
	}
}
