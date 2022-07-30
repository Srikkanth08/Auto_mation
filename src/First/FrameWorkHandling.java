package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWorkHandling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Saikr/OneDrive/Desktop/HandlingFrameWork.html");
//		driver.findElement(By.id("un")).sendKeys("admin");
//		Thread.sleep(2000);
//		driver.switchTo().frame(0);           //NoSuchFrameException
//		driver.switchTo().frame("frid");      //NoSuchFrameException
//		driver.switchTo().frame("frnm");     //NoSuchFrameException
//		driver.switchTo().frame("frcl");     //NoSuchFrameException
		
		//Switch To frame Child frame
		WebElement Frame = driver.findElement(By.id("frid"));
		driver.switchTo().frame(Frame);
		Thread.sleep(3000);
		driver.findElement(By.id("pwd")).sendKeys("manager");
		
		//Switch To Parent Frame
//		driver.switchTo().parentFrame();
		//Another way to Switch To Parent Frame
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("un")).sendKeys("admin");
		Thread.sleep(3000);
		driver.quit();

		
	}
}
