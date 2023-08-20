package integration;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(groups = "smoke")
	public void upDate()
	{
		//System.out.println("updated successfully");
		Reporter.log("better",true);
	}

}
