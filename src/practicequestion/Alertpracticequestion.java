package practicequestion;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alertpracticequestion {

ChromeDriver driver;
	
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("file:///E:/Selenium/alert.html");
	}	
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		if(alerttext.equals("hello iam an alert box"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("sarath");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("va");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}
	
}
