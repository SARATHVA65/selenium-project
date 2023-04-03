package practicequestion;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Googlescreenshot {

ChromeDriver driver;
	
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Google.com");
	}
	@Test
	public void work() throws IOException
	{
		//full screenshot
		
	File src=	    ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(src,new File("E://error1.png"));
		 //webelement screenshot
	
	  WebElement search=driver.findElement(By.name("q"));
	  
	  File Src1  = search.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(Src1,new File("./ScreenShot//error.png"));
	}
}
