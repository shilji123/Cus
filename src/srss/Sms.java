package srss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sms {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@BeforeTest
	public void url()
	{
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		
	}

}
