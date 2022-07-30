package PracticeSelenium;

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

public class DuplicatesHandlingInDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Saikr/OneDrive/Desktop/MultiDropdown.html");
		Thread.sleep(2000);
		WebElement MultiDD = driver.findElement(By.name("Paradise"));
	    
		Select sel = new Select(MultiDD);
		
		List<WebElement> AllOptn= sel.getOptions();
//		for(WebElement oneOption:AllOptn)
//		{
//			String text = oneOption.getText();
//			System.out.println(text);
//		}
//		for(int i=0; i<=AllOptn.size()-1; i++)
//		{
//			System.out.println(AllOptn.get(i).getText());
//		}
		
		//set Interface (NoDuplicates allowed)
		//1.HashSet
//		Set<String> s = new HashSet<String>();
//		for(WebElement oneOption :AllOptn)
//		{
//			String text = oneOption.getText();
//			s.add(text);
//		}
//		for(String oneText: s)
//		{
//			System.out.println(oneText);
//		}
		
		//2.LinkedHashSet
//		Set<String> L = new LinkedHashSet<String>();
//		for(WebElement oneOption : AllOptn)
//		{
//			String text = oneOption.getText();
//			L.add(text);
//		}
//		for(String oneText:L)
//		{
//			System.out.println(oneText);
//		}
		
		//3.TreeSet
		Set<String> T = new TreeSet<String>();
		for(WebElement oneOption:AllOptn)
		{
			String text = oneOption.getText();
			T.add(text);
		}
		for(String oneText:T)
		{
			System.out.println(oneText);
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
