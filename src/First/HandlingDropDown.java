package First;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("C:\\Users\\Saikr\\OneDrive\\Desktop\\SingleDropdown.html");
		driver.get("C:\\Users\\Saikr\\OneDrive\\Desktop\\MultiDropdown.html");
		Thread.sleep(2000);
		
		WebElement ddAddr=driver.findElement(By.name("Paradise"));
		Select sel=new Select(ddAddr);
		
//		sel.selectByVisibleText("DOSA");
//		sel.selectByValue("c");
//		sel.selectByIndex(2);
//		sel.selectByIndex(7);
//		ddAddr.click();
//		sel.selectByVisibleText("POORI");
//		sel.deselectByVisibleText("POORI");
		if(sel.isMultiple())
		{
			System.out.println("It is a Multi-Select Dropdown");
		}
		else
		{
			System.out.println("It is a Single-Select Dropdown");
		}
//		sel.selectByVisibleText("IDLI");
//		sel.selectByVisibleText("DOSA");
//		sel.selectByVisibleText("POORI");
//		sel.selectByVisibleText("BIRYANI");
//		Thread.sleep(2000);
//		sel.deselectByVisibleText("POORI");
//		sel.deselectAll();
		
		List<WebElement> allops=sel.getOptions();
		System.out.println(allops.size());
		
		//Formula is------get getText Print 
//		for(int i=0;i<=allops.size();i++)
//		{
//			System.out.println(allops.get(i).getText());
//		}
		
		WebElement firstSelOp = sel.getFirstSelectedOption();
		System.out.println(firstSelOp.getText());
		
		 WebElement wrapEle = sel.getWrappedElement();
		 System.out.println(wrapEle.getText());
		 
		 for(int i=0; i<=allops.size()-1; i++)
		 {
			 System.out.println(allops.get(i).getText());
		 }
		 driver.close();
	}
}
