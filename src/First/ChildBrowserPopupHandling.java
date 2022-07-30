package First;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopupHandling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		For Maximize the Browser
		driver.manage().window().maximize();
//		To get the Test URL
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("laptops", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(2000);
		
		//Window Handling
		Set<String> AllWinHandles = driver.getWindowHandles();
		for(String OneWinHand :AllWinHandles)
		{
			String Title = driver.switchTo().window(OneWinHand).getTitle();
			if(Title.contains("DELL Ryzen 7 Octa"))
			{
				String Price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
				System.out.println(Price);
				break;
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
