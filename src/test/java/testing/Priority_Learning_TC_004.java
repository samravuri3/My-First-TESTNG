package testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class Priority_Learning_TC_004 {

	WebDriver driver;
	
	@BeforeClass
public void launch_application()
{
		
		System.out.println("launch the application");
		
		
}
	
	@Test(priority=2)
	public void homepage_validation()
	
	{
		System.out.println("testing home page");	
		
	}
	
	@Test(priority=1)
	public void Signin_page_validation()
	
	{
		System.out.println("signin Pagevalidation");	
		
	}
	
	
	@Test(priority=0)
	public void signup_page__validation()
	
	{
		System.out.println("signup pagevalidation");	
		
	}
	
	
	@Test
	public void cart_pagevalidation()
	
	{
		System.out.println("cart pagevalidation");	
		
	}
	
	
	
	@AfterClass 
	
	public void close_application()
	
	{
		System.out.println("closing the application");
		
	}
	
	
	

	

}
