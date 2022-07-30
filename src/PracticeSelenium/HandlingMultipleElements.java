package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v96.page.Page.GetAppIdResponse;

public class HandlingMultipleElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Saikr/OneDrive/Desktop/Elements.html");
		Thread.sleep(2000);
		
		WebElement fb = driver.findElement(By.linkText("FB"));
//		fb.click();
		System.out.println(fb.getText());
		
	
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		//Print The Count Of Elements
		System.out.println(allLink.size());
		
		//Print All The Text Of All The Elements
		for(int i=0; i<=allLink.size()-1; i++)
		{
			//Formula:-  get  getText print
//			WebElement OneLink = allLink.get(i);
//			String text = OneLink.getText();
//			System.out.println(text);
//			        (OR)
			System.out.println(allLink.get(i).getText());
		}	
		
		//Click On the Last Link
		allLink.get(allLink.size()-3).click();
		driver.quit();
	}			
}
