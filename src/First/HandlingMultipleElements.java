package First;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Java Practice\\Automation\\Drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/Saikr/OneDrive/Desktop/Elements.html");
//        WebElement fblink=driver.findElement(By.linkText("FB"));
//        fblink.click();
//	    System.out.println(fblink.getText());
	    
		List<WebElement>allLinks=driver.findElements(By.tagName("a"));
//		1.Print The Count Of Elements
		System.out.println(allLinks.size());
//		2.Print The Text of All Elements
		for(int i=0;i<=allLinks.size()-1;i++) 
		{
//			get getText() Print
			WebElement oneLink=allLinks.get(i);
			String text=oneLink.getText();
			System.out.println(text);
		}
//		3.Click on the Last Link
//		allLinks.get(allLinks.size()-1).click();
//		Thread.sleep(3000);
//		driver.close();
		
//		4.Click on the Fist Link
		allLinks.get(allLinks.size()-2).click();
		Thread.sleep(3000);
		driver.close();
	}
	

}
