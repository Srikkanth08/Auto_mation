package TestingFrameWork;

import org.testng.Reporter;
import org.testng.annotations.Test;

//Test class - Any Class Which Contains @Test

public class Demo 
{
	@Test
	public void run1()
	{
		//System.out.println("Only Console");
		//Reporter.log("Only Report");
		//Reporter.log("Both Report+Console", true);
		Reporter.log("Demo Message", true);
	}
}
