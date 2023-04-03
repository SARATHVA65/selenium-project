package homework;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediffmaildropdowncount {

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
		WebElement day=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select s=new Select(day);
		s.selectByValue("03");
		 List<WebElement>dropcount=s.getOptions();
		 dropcount.size();
		 System.out.println("dropcount="+dropcount.size());
		 
		 
		WebElement month=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select m=new Select(month);
		m.selectByValue("04");
		List<WebElement>dropcount1=m.getOptions();
		dropcount1.size();
		System.out.println("dropcount1="+dropcount1.size());
	}
}
