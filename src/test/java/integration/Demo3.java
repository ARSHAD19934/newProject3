package integration;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	
	@Test(groups = "smoke")
	public void deleteProject()
	
	{
		//System.out.println("deleted");
		Reporter.log("well",true);
	}
	@Test(groups = "smoke")
	public void editProject()
	{
		//System.out.println("edited");
		Reporter.log("done",true);
	}

}
