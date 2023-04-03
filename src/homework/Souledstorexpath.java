package homework;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Souledstorexpath {

	ChromeDriver driver;
	
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://www.thesouledstore.com/login?redirect=%2Flogin%3Fredirect%3D%2Flogin%3Fredirect%3D%2Flogin%3Fredirect%3D%2F%3Futm_source%3Dgoogle&utm_medium=cpc&utm_campaign=TSS_Search_Brand_RM&utm_adgroup=Core_Brand&utm_term=souled%20store&utm_network=g&utm_matchtype=p&utm_device=c&gclid=Cj0KCQiA3eGfBhCeARIsACpJNU9gEfQ1b55bLuMyWbqPhbzYpPT0kL_MyIiovyUDdJoHc_hwUTaxvEMaAjsfEALw_wcB");
		
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/form/div/div/input")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/form/button")).click();
	}
}
