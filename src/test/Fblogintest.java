package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;

public class Fblogintest {

WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void testlogin()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("by0e45we5@gmail.com", "abcd");
		ob.login();
	}
}
