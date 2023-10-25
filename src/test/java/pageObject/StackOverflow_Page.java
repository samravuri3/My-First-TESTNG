

package pageObject;
import org.openqa.selenium.By;


public class StackOverflow_Page {


public By Stackoverflow_logo(){return By.xpath("//span[@class='-img _glyph']");}

public By AboutLink(){return By.xpath("//a[text()='About']]");}

public By Products_Link(){return By.xpath("//a[contains(.,'Products')]");}

public By ForTeams_Link(){return By.xpath("//a[text()='For Teams']");}

public By SearchTextBox(){return By.xpath("//input[@name='q']");}

public By Login_Link(){return By.xpath("//a[text()='Log in']");}

public By Signup_Link(){return By.xpath("//a[text()='Sign up']");}
		

}
