package datadriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.expedia.com/");
	}
	
	@Test
	public void testlogin()
	{
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
	
	
	while(true)
	{
		WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
		
		String month1=month.getText();
		System.out.println(month1);
		if(month1.equals("March 2023"))
		{
			System.out.println(month1);
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
		}
	}

	List<WebElement> alldates1=driver.findElements(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr/td/button"));
	
	for(WebElement dateelement:alldates1)
	{
		String date=dateelement.getAttribute("data-day");
		System.out.println(date);
		
		if(date.equals("18"))
		{
			dateelement.click();
			System.out.println("date is selected");
		}
	}
}
}
