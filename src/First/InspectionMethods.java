package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectionMethods
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Give The HTML File Location
		driver.get("file:///C:/Users/Saikr/OneDrive/Desktop/Googly.html");
		
		//Using Inspection Methods
//		 WebElement linkAddress = driver.findElement(By.tagName("a"));
//		 linkAddress.click();
		 
//		 driver.findElement(By.id("i1")).click();
//		 driver.findElement(By.name("n1")).click();
//		 driver.findElement(By.className("c1"));
//		driver.findElement(By.linkText("GOOGLY")).click();
		driver.findElement(By.partialLinkText("GLY")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}

