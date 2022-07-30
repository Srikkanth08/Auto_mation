package hybridfw_datadriven_keyworddriven_methoddriven;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {

	public String getPageTitle()
	{
		String title = BaseTest.driver.getTitle();
		return title;
	}
	
	public void verify(String expected, String actual, String page)
	{
		if(actual.equals(expected))
		{
			System.out.println(page+" is Displayed, PASS");
		}
		else
		{
			System.out.println(page+" is not Displayed, FAIL");
		}
		
	}
	
	public void waitForPageTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(BaseTest.driver, 20);
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	
	
	
	
	
	
	
	
}
