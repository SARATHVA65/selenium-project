package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Souledstoreisenebledcopy {

	ChromeDriver driver;
	
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.thesouledstore.com/register?redirect=%2Fmen");
	}
	
	@Test
	public void enabled()
	{
		WebElement enabled=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/form/button"));
		boolean e=enabled.isEnabled();
		if(e)
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is not enabled");
		}
	}
	
     @Test
     public void test1()
     {
    	WebElement firstname= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/form/div[1]/div[1]/input"));
    	WebElement lastname= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/form/div[1]/div[2]/input"));
    	  firstname.sendKeys("sarath");
    	Actions act=new Actions(driver);
        act.keyDown(firstname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        act.keyDown(firstname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
        act.keyDown(lastname,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
        act.perform();
     }
	            
}

