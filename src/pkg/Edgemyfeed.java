package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgemyfeed {
    EdgeDriver driver;
	@Before
	public void title()
	{
		driver=new EdgeDriver();
		driver.get("https://luminar.azurewebsites.net");
	}
	
	@Test
	public void test1()
	{
		String src=driver.getPageSource();
		if(src.contains("Welcome Back"))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not present");
		}
		
	}
	
	@After
	public void ending()
	{
		//driver.quit();
	}
	
}

