package practicequestion;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelinkwebelement {

	ChromeDriver driver;
	
	@Before
	public void begining()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test2()
	{
	 List<WebElement> linklist=driver.findElements(By.tagName("a"));
	 System.out.println("total no of links="+linklist.size());
	 
	}
}

