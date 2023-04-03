package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demositepgm {

ChromeDriver driver;
	
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test
	public void test1()
	{
		WebElement  right =driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions a=new Actions(driver);
		a.moveToElement(right);
		a.contextClick();
		a.perform();
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		edit.click();
		Alert s=driver.switchTo().alert();
		String alerttext=s.getText();
		s.accept();
		
	}
}
