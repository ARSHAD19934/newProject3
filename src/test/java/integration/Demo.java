package integration;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test(groups ="regression")
	
	public void createDemo()
	{
		//System.out.println("done");
		Reporter.log("good",true);
	}
	
	@Test
	public void createDemo1()
	{
		//System.out.println("done");
		Reporter.log("Very Good ",true);

	}
	
	@Test
	public void createDemo3()
	{
		Reporter.log("excellent", true);
	}

}
