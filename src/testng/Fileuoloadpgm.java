package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuoloadpgm {

	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/upload/");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\HP\\Downloads");
		
		WebElement Checkbox=driver.findElement(By.xpath("//*[@id='terms']"));
		System.out.println("check box is selected:"+ Checkbox.isSelected());
		
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
}
