package testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class test_suite {
	
	

	@BeforeSuite
public void launch_application()
{
		
		System.out.println("launch the application");
		
		
}
@AfterSuite 
	
	public void close_application()
	
	{
		System.out.println("closing the application");
		
	}
	
}
