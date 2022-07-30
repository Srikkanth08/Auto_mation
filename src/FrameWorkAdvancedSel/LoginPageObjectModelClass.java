package FrameWorkAdvancedSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectModelClass//(POM class) 
{
		//@FindBy(LocatorName="locatorValue") accessSpecifier returnType elementName;
		@FindBy(id="username") private WebElement untb;
		
		public LoginPageObjectModelClass(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public WebElement getUntb()
		{
			return untb;
		}
}
