package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_001 {
	WebDriver driver;
	@BeforeClass
	public void launch_application()
	{
		
		System.out.println("I am launching google chrome browser");
		driver=new ChromeDriver();//this driver is creating chromeDriver driver instance and storing it into driver variable

		//Give url into the browser

		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//maximize the browser window
		driver.manage().window().maximize();
	}



	@Test
	public void do_some_testing()
	{

		//System.out.println("My first Testng test script");
	
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed());
    
   
	}


	@Test
	public void do_some_testing_1()
	{

		System.out.println("My Second Testng test script");



	}

	@AfterClass

	public void close_appliation()
	{

		System.out.println("I am closing google chrome");
		
		driver.quit();
	}


}
