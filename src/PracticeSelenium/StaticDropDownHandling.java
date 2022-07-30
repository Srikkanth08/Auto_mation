package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownHandling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Saikr/OneDrive/Desktop/SingleDropdown.html");
		Thread.sleep(2000);
		
		WebElement SingleSelectDropDown = driver.findElement(By.name("Paradise"));
		Thread.sleep(2000);
		SingleSelectDropDown.click();
		
		//Create Select Class Object
		Select sel = new Select(SingleSelectDropDown);
//		Thread.sleep(2000);
//		sel.selectByVisibleText("BIRYANI");
//		sel.selectByValue("i");
//		sel.selectByIndex(0);
//		Thread.sleep(2000);
//		sel.selectByIndex(3);
//		sel.selectByVisibleText("DOSA");
//		Thread.sleep(2000);
//		sel.deselectByVisibleText("DOSA");
//		Thread.sleep(2000);
//		sel.deselectAll();
//		Thread.sleep(2000);
//		sel.selectByIndex(5);
		if(sel.isMultiple())
		{
			System.out.println("It Is A Multi-Select DropDown");
		}
		else
		{
			System.out.println("It Is A Single-Select DropDown");
		}
		Thread.sleep(2000);
		List<WebElement>  AllSelectedOpts = sel.getAllSelectedOptions();
//		for(int i=0; i<=AllSelectedOpts.size()-1; i++)
//		{
//			System.out.println(AllSelectedOpts.get(i).getText());
//		}
		
//		WebElement FirstSelecteedOptn = sel.getFirstSelectedOption();
//		System.out.println(FirstSelecteedOptn.getText());
		
		for(int i=0; i<=AllSelectedOpts.size()-1; i++)
		{
			System.out.println(AllSelectedOpts.get(i).getText());
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
