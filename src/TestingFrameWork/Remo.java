package TestingFrameWork;

import org.testng.Reporter;
import org.testng.annotations.Test;

//Test Class - Any Class Which Contains @Test

public class Remo 
{
	@Test
	public void run2()
	{
		Reporter.log("Remo Message", true);
	}
}
