package First;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakingScreenShotInSelenium 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Java Practice\\Automation\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		
		//1.Through TypeCasting
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		// Formula = Path+FileName+Extension(i.e, in jpg,png etc..)
//		File dest = new File("D:\\ScreenShotWithSelenium\\GoogleImg.jpg");
//		Files.copy(src, dest);
		
		//2.Through DownCasting
//		RemoteWebDriver rwd = (RemoteWebDriver)driver;
//		File F = rwd.getScreenshotAs(OutputType.FILE);
//		File f = new File("D:\\ScreenShotWithSelenium\\GoogleDImg.jpg");
//		Files.copy(F, f);
		
		//3.Through EventFiringWebDriver Class
//		EventFiringWebDriver EF = new EventFiringWebDriver(driver);
//		File EFW = EF.getScreenshotAs(OutputType.FILE);
//		File Dest = new File("D:\\ScreenShotWithSelenium\\GoogleEImg.jpg"); 
//		Files.copy(EFW, Dest);
		
		//4.Taking ScreenShot Of A Perticular Element
		WebElement GoogleLogo = driver.findElement(By.xpath("//img[@alt='Google']"));
		File src = GoogleLogo.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\ScreenShotWithSelenium\\GoogleLogo.jpg");
		Files.copy(src, dest);
		Thread.sleep(2000);
		driver.close();
	}
}
