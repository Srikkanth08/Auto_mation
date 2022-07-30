package TestingFrameWork;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyFeature 
{
	@Test(priority = 2)
	public void transfer1()
	{
		Assert.fail();
		Reporter.log("Successfully Transferred", true);
	}
	
	@Test(priority = 2)
	public void transfer2()
	{
		//Assert.fail();
		Reporter.log("Successfully Deleted", true);
	}
	@Test(priority = 1, dependsOnMethods = {"transfer1","transfer2"}, alwaysRun = true)
	public void delete()
	{
		Reporter.log("Successfully Deleted", true);
	}
}
