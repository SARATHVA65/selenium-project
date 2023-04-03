package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragemedropmepgm {

	ChromeDriver driver;
	
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void setup()
	{
		driver.get("https://demoqa.com/droppable/");
	}
	
	@Test
	public void test1()
	{
		WebElement dragme=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dropme=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragme, dropme);
		act.perform();
		String exp="Dropped!";
		String text=dropme.getText();
		if(exp.equals(text))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}
	
	
}
