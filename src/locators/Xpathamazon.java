package locators;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathamazon {
	
	ChromeDriver driver;
	
	  @Before
	    public void setup()
	    {
	    	driver=new ChromeDriver();
	    	driver.get("https://www.amazon.in");
	    }
	  @Test
	  public void test1()
	  {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("qwer123ty@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
	  }

}
