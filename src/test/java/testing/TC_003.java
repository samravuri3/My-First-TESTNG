package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TC_003 {
	
	
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"url"})
	
	public void launch_application(String url)
	{

		System.out.println("I am launching google chrome browser");
		driver=new ChromeDriver();//this driver is creating chromeDriver driver instance and storing it into driver variable

		//Give url into the browser

		driver.get("https://childsupport.ca.gov//");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//maximize the browser window
		driver.manage().window().maximize();
	}

   @Test
   @Parameters({"title","url"})
   public void test_homepage_1(String title, String url)
   {
       driver.navigate().to(url);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   String runtime_title= driver.getTitle();
	   Assert.assertEquals(title, runtime_title);
	   
	   //Validate ContactUs page
	   
	   test_contact();
	   test_do_some_testing_3();
	   
   }
	//@Test
	public void test_contact()
	{

		driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to get online case information. ']")).isDisplayed());

		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to get online case information. ']")).isDisplayed());


	}


	//@Test
	public void test_do_some_testing_3()
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





