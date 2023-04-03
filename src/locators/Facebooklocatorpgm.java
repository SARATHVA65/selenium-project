package locators;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklocatorpgm {

	ChromeDriver driver;
	
	  @Before
	    public void setup()
	    {
	    	driver=new ChromeDriver();
	    	driver.get("https://www.facebook.com");
	    }
	@Test
	public void textverify()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("qwerty");
		driver.findElement(By.name("login")).click();
	}
	
	
	
}
