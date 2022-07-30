package First;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDuplicates
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Saikr\\OneDrive\\Desktop\\MultiDropdown.html");
		WebElement ddAddr=driver.findElement(By.name("Paradise"));
		Select sel=new Select(ddAddr);
		List<WebElement> allOps=sel.getOptions();
		for(WebElement oneOption:allOps)
		{
			String text = oneOption.getText();
			System.out.println(text);	
		}
		
//		//For HashSet Class      (No Duplicates ,  Random Order)
//		Set<String> s = new HashSet<String>();
//		for(WebElement oneOption:allOps)
//		{
//		String text = oneOption.getText();
//		s.add(text);
//		}
//		for(String oneText:s)
//		{
//			System.out.println(oneText);
//		}
		
		
//		//For LinkedHashSet   (No Duplicates , Insertion Order maintained)
//		Set<String> s= new LinkedHashSet<String>();
//		for(WebElement oneOption:allOps)
//			{
//			String text = oneOption.getText();
//			s.add(text);
//			}
//			for(String oneText:s)
//			{
//				System.out.println(oneText);
//			}
		
		
		//For TreeSet      (No Duplicates ,    Sorted Order)
		 Set<String> s = new TreeSet<>();
		 for(WebElement oneOption:allOps)
		 {
			String text = oneOption.getText();
			s.add(text);
	     }
		for(String oneText:s)
		{
			System.out.println(oneText);
		}
		Thread.sleep(3000);
		driver.close();
	}
}
