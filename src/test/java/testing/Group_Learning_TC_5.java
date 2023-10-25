package testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Group_Learning_TC_5 {

	WebDriver driver;
	
	@BeforeSuite
public void launch_application()
{
		
		System.out.println("launch the application");
		
		
}
	
	@Test(groups={"regression"})
	public void homepage_validation()
	
	{
		System.out.println("testing home page");	
		
	}
	
	@Test(groups={"regression"})
	public void Signin_page_validation()
	
	{
		System.out.println("signin Pagevalidation");	
		
	}
	
	
	@Test(groups={"smoke"})	
	
	public void signup_page__validation()
	
	{
		System.out.println("signup pagevalidation");	
		
	}
	
	
	@Test(groups= {"e2e"})
	public void cart_pagevalidation()
	
	{
		System.out.println("cart pagevalidation");	
		
	}
	
	
	
	@AfterSuite 
	
	public void close_application()
	
	{
		System.out.println("closing the application");
		
	}
	
	
	

	

}
