package practicequestion;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodefb {
	
	
	ChromeDriver driver;
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@Test
	public void test2()
	{
	 List<WebElement> linklist=driver.findElements(By.tagName("a"));
	 System.out.println("total no of links="+linklist.size());
	 
	 for(WebElement li:linklist)
	 {
		String url= li.getAttribute("href");
		verify(url);
	 }
	 
	 
	}

	private void verify(String url) {
		
		try {
			
			URL u=new URL(url);
					HttpURLConnection con=(HttpURLConnection)u.openConnection();
					con.connect();
					con.setConnectTimeout(4000);
					
				if(con.getResponseCode()==200)
				{
					System.out.println("success:response code=200"+url);
				}
				
				else if(con.getResponseCode()==404)
				{
					System.out.println("broken link:response code=404"+url);
				}
				
		}
	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		
	
}
