package First;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_Flip_1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement Fkart=driver.findElement(By.name("q"));
		Fkart.sendKeys("Laptops");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		
		List<WebElement> dd=driver.findElements(By.xpath("//select[@class='_2YxCDZ']"));
//		Print the Count of elements
		System.out.println(dd.size());
		
		Select sel = new Select(driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]")));
		sel.selectByIndex(3);
	
		List <WebElement> Options = sel.getOptions();
	     int Size = Options.size();
	     for(int i=0; i<Size; i++) 
	     {
	    	 System.out.println(Options.get(i).getText());
	     }
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='Core i3']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='Brand']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='DELL']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='Operating System']")).click();
         Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
	     Thread.sleep(2000);

	   //li[@class='rgWa7D']/following-sibling::li[contains(text(),'RAM')]
		
		driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	}

}
