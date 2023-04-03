package windowswitching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99tabswitching {

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("/html/body/p/a")).click();
	}
}
