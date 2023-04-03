package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbcreatepage;

public class Fbcreatetest {

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test1()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.createpage();
		ob.getstarted();
	}
	
}
