package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverification {

	public static void main(String[] args) {
	
		String exp="Google";
     ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");	
		
		String actualtitle=driver.getTitle();
		System.out.println("actualtitle="+actualtitle);
		
		if(actualtitle.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.quit();
	}
	

}
