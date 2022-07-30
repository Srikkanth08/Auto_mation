package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDownHandling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Saikr/OneDrive/Desktop/MultiDropdown.html");
		Thread.sleep(2000);
		WebElement MultiDD = driver.findElement(By.name("Paradise"));
//		MultiDD.click();
		
		//Creating Select class Object
		Select sel = new Select(MultiDD);
		
//		sel.selectByIndex(5);
//		sel.selectByIndex(7);
//		sel.selectByVisibleText("DOSA");
//		sel.selectByValue("g");
//		sel.selectByValue("j");
//		
//		Thread.sleep(2000);
//		sel.deselectByValue("j");
//		sel.deselectAll();
//		Thread.sleep(2000);
		
		if(sel.isMultiple())
		{
			System.out.println("It is a Multi-Select DropDown");
		}
		else
		{
			System.out.println("It is a Single-Select DropDown");
		}
		
		//get getText size  (Print All the text Present in Dropdown
//		List<WebElement> AllOptn = sel.getOptions();
//		System.out.println(AllOptn.size());        //To get The size (or) Count of Dropdown
//		for(int i=0; i<=AllOptn.size()-1; i++)
//		{
//			System.out.println(AllOptn.get(i).getText());
//		}
		
		sel.selectByVisibleText("IDLI");
		sel.selectByIndex(9);
		sel.selectByVisibleText("DOSA");
		sel.selectByValue("e");
		
		//get All Selected Options
//		List<WebElement> AllSel = sel.getAllSelectedOptions();
//		for(int i=0; i<=AllSel.size()-1; i++)
//		{
//			System.out.println(AllSel.get(i).getText());
//		}
		 
		//get Wrapped Element
//		WebElement WrapEle = sel.getWrappedElement();
//		System.out.println(WrapEle.getText());
		
		//get First Selected Option
		WebElement FirstSel = sel.getFirstSelectedOption();
		System.out.println(FirstSel.getText());
		
		Thread.sleep(2000);
		driver.quit();
	}
}
