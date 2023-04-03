package locators;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfacebook {

	ChromeDriver driver;
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void testing()
	{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("qwerty");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
}
}