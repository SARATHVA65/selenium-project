package practicequestion;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffregxpath {

	String reg="register";
	ChromeDriver driver;
	
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test1()
	{
	     String actualtitle=driver.getTitle();
	     System.out.println("actualtitle="+actualtitle);
	     
	     if(actualtitle.equals(reg))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		
		
		WebElement day=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select s=new Select(day);
		s.selectByValue("02");
		
		WebElement month=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select m=new Select(month);
		m.selectByValue("03");
		
		WebElement year=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select y=new Select(year);
		y.selectByValue("2001");
	
}
}