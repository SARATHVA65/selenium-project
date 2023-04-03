package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Materializecssradiologo {

	ChromeDriver driver;
	
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://materializecss.com/radio-buttons.html");
	}
	
	@Test
	public void radio()
	{
		WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\"radio\"]/form/p[1]/label/input"));
		boolean r=radiobutton.isSelected();
		if(r) {
			
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("not selected");
		}
	}
	
	@Test
	public void logo()
	{
		WebElement logobutton=driver.findElement(By.xpath("//*[@id=\"logo-container\"]"));
		boolean l=logobutton.isDisplayed();
		if(l)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
	}
}
