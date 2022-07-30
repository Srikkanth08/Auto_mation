package First;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class YoutubeTry
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
        WebElement yt= driver.findElement(By.xpath("//input[@id='search']"));
		yt.sendKeys("arabic kuthu video song");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy' and @class='style-scope ytd-searchbox']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer' and text()='Arabic Kuthu | Halamithi Habibo -Lyric Video| Beast| Thalapathy Vijay| Sun Pictures| Nelson| Anirudh']")).click();
//		Thread.sleep(5000);
//		driver.close();
		Robot r= new Robot();
        r.keyPress(KeyEvent.VK_F);
        r.keyRelease(KeyEvent.VK_F);
		
	}

}
