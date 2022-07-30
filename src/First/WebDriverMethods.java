package First;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Enter The URL and Get The Page Title And Current Page URL
		
		driver.get("https://www.facebook.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Google Page is Displayed, PASS");
		}
		else
		{
			System.out.println("Google Page is Not Displayed, FAIL");
		}
		System.out.println(driver.getCurrentUrl());
//    	System.out.println(driver.getPageSource());

    	//Maximize & Minimize The Browser Window
		driver.manage().window().maximize();
		Thread.sleep(3000);
    	driver.manage().window().minimize();
//    	Thread.sleep(3000);
    	
    	//setSize of a Page
    	Dimension d = new Dimension(700,500);
    	driver.manage().window().setSize(d);
    	Thread.sleep(3000);
    	
    	//setPosition of a Page
    	Point p = new Point(700, 500);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//Navigate To Another Page
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		//Go to Previous Page
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Go to Next Page
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//Refresh The Current Page 
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
	}

}

