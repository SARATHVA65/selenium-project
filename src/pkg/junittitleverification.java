package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junittitleverification {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	 driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	
	}
	
	@Test
	public void test1()
	{
		String exp="Google";
		String actualtitle=driver.getTitle();
		System.out.println("actualtitle="+actualtitle);
		if(exp.equals(actualtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	
}

