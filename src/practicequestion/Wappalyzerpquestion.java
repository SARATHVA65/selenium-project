package practicequestion;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Wappalyzerpquestion {
	
	EdgeDriver driver;
	
	@Before
	public void start()
	{
		driver=new EdgeDriver();
		driver.get("https://www.wappalyzer.com");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Shopify')]")).click();
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[@id='app']/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		
	}

}
