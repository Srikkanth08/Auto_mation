package First;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollingDown
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Java Practice\\Automation\\Drivers\\geckodriver.exe");
		//1. Upcasting from firefox Driver class to WebDriver Interface
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		//2.Through Upcasting
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,2000)");
//		Thread.sleep(2000);
		
		//3.Through DownCasting
//		RemoteWebDriver rwd = (RemoteWebDriver)driver;
//		rwd.executeScript("window.scrollBy(0,2000)");
//		Thread.sleep(2000);
		
		//4.For Exact Location
		WebElement exactLoc= driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));
		Point loc = exactLoc.getLocation();
		System.out.println(loc);
		RemoteWebDriver rwd = (RemoteWebDriver)driver;
		rwd.executeScript("window.scrollBy"+loc);
		Thread.sleep(2000);
		driver.close();
	}
}
