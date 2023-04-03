package homework;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffbuttonverification {

	ChromeDriver driver;
	
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void dropdown()
	{
		String buttontext=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
		String exp="Check availability";
		
		if(buttontext.equals(exp))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
	}
}
